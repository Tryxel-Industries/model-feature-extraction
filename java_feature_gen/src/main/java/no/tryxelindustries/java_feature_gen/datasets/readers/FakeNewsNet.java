package no.tryxelindustries.java_feature_gen.datasets.readers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import no.tryxelindustries.java_feature_gen.datasets.DatasetReader;
import no.tryxelindustries.java_feature_gen.entitys.NewsEntry;
import org.apache.commons.lang3.math.NumberUtils;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class FakeNewsNet extends DatasetReader {

    @Override
    public String getDatasetName() {
        return "fnn";
    }


    private String stripSurroundingQuotes(String inp) {
        if (inp.startsWith("\"")) {
            return inp.substring(1, inp.length() - 1);
        } else {
            return inp;
        }
    }

    private File getPolitifactDir() {
        return new File(this.getDatasetInDir(), "politifact");
    }


    @Data
    @AllArgsConstructor
    private static class FNNPolitifactEntry {
        int id;
        public String url;
        public String text;
        public String title;
        public int    publish_date;

        public NewsEntry get_as_news_entry(int label) {
            return new NewsEntry(id, title, text, Integer.toString(label));
        }
    }

    private FNNPolitifactEntry read_politifact_entry(File file) {
//        politifact4926
//        int id = Integer.parseInt(file.getParentFile().getName().substring(10));
        int id = this.getNextId();
        try {

            ObjectMapper mapper = new ObjectMapper();
            JsonNode tree = mapper.readTree(file);

            String url = tree.get("url").toString();
            String text = tree.get("text").toString();
            String title = tree.get("title").toString();
            int publish_date = tree.get("publish_date").intValue();

            FNNPolitifactEntry entry = new FNNPolitifactEntry(id, url, text, title, publish_date);
            return entry;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private List<FNNPolitifactEntry> getPolitifactEntries(String entry_dir_name) {

        File entry_type_dir = new File(this.getPolitifactDir(), entry_dir_name);
        List<FNNPolitifactEntry> politifactEntries = Stream.of(entry_type_dir.listFiles())
                                                           .map(file -> new File(file, "news content.json"))
                                                           .map(this::read_politifact_entry)
                                                           .toList();


        return politifactEntries;
    }


    @Override
    public List<NewsEntry> readDataset() {
        Stream<NewsEntry> real_news = this.getPolitifactEntries("real")
                                          .stream()
                                          .map(entry -> entry.get_as_news_entry(1));
        Stream<NewsEntry> false_news = this.getPolitifactEntries("fake")
                                           .stream()
                                           .map(entry -> entry.get_as_news_entry(0));

        return Stream.concat(real_news, false_news).toList();
    }
}
