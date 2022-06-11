package br.com.xandecoelho5.composite.folders.model;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {

    private final String name;
    private final List<FileSystemItem> items;

    public Folder(String name, List<FileSystemItem> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (var item : items) {
            item.print(structure + "| ");
        }
    }
}
