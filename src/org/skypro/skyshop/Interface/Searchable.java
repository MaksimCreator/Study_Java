package org.skypro.skyshop.Interface;

public interface Searchable {
    String searchTerm();
    String getContent();

    default String getStringRepresentation(){
        return "Имя " + searchTerm() + "-объекта — тип " + getContent() + "-объекта»";
    }
}
