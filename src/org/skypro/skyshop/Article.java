package org.skypro.skyshop;

import org.skypro.skyshop.Interface.Searchable;

public class Article implements Searchable
{
    private final String name;
    private final String description;

    public Article(String name,String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return name + "\n" + description;
    }

    public String searchTerm(){ return toString(); }

    public String getContent(){ return "ARTICLE"; }
}
