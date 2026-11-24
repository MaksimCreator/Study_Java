package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;

public class App {
    public void main(){
        SearchEngine engine = new SearchEngine();

        engine.add(new Article("1", "description"));
        engine.add(new Article("2", "description"));
        engine.add(new Article("3", "Описания"));
        engine.add(new Article("4", "Описания"));

        Searchable[] searchables = engine.search("description");

        for(int i = 0; i < searchables.length;i++)
            IO.println(searchables[i].getStringRepresentation());
    }
}
