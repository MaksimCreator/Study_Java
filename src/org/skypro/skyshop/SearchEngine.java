package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> searchables = new ArrayList<>();

    public void add(Searchable searchable){
        searchables.add(searchable);
    }

    public List<Searchable> search(String text){
        List<Searchable> other = new ArrayList<>();

        for(Searchable item: searchables){
            if(item != null && item.searchTerm().contains(text))
                other.add(item);
        }

        return other;
    }

    public Searchable findBestAccordanceText(String text) {
        if(text == null || text.isBlank())
            throw new IllegalArgumentException();

        List<Searchable> coincidences = this.search(text);
        Searchable bestSearchable = null;

        int maxCount = -1;

        for (Searchable item: coincidences) {
            int count = 0;
            String term = item.searchTerm();

            for (int i = 0; i <= term.length() - text.length(); i++) {
                if (term.startsWith(text, i))
                    count++;
            }

            if (count > maxCount) {
                maxCount = count;
                bestSearchable = item;
            }
        }

        if(bestSearchable == null)
            throw new BestResultNotFound();

        return bestSearchable;
    }
}