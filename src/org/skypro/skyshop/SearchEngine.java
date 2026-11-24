package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;

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
        int count = 0;
        Searchable[] coincidences = new Searchable[MAX_INDEX];

        for(int i = 0; i < searchables.length; i++){
            if(searchables[i] != null && searchables[i].searchTerm().contains(text)){
                coincidences[count] = searchables[i];
                count++;
            }
        }

        Searchable[] otherCoincidences = new Searchable[count];

        for(int i = 0; i < otherCoincidences.length;i++)
            otherCoincidences[i] = coincidences[i];

        return otherCoincidences;
    }
}
