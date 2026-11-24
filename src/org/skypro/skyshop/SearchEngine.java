package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private final int MAX_INDEX = 5;

    private Searchable[] searchables = new Searchable[MAX_INDEX];
    private int index = 0;

    public void add(Searchable searchable){
        if(index == MAX_INDEX)
            return;

        searchables[index] = searchable;
        index++;
    }

    public Searchable[] search(String text){
        List<Searchable> other = new ArrayList<>();

        for(int i = 0; i < searchables.length; i++)
            if(searchables[i] != null && searchables[i].searchTerm().contains(text))
                other.add(searchables[i]);

        return other.toArray(Searchable[]::new);
    }

    public Searchable findBestMatchSearchable(String search) {
        if(search == null || search.isBlank())
            throw new IllegalArgumentException();

        Searchable[] coincidences = this.search(search);
        Searchable bestSearchable = null;
        int maxCount = -1;

        for (Searchable item : coincidences) {
            int count = 0;
            String term = item.searchTerm();

            for (int i = 0; i <= term.length() - search.length(); i++) {
                if (term.startsWith(search, i)) {
                    count++;
                }
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