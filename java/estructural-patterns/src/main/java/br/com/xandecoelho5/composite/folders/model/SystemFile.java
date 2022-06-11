package br.com.xandecoelho5.composite.folders.model;

public class SystemFile implements FileSystemItem {

    private final String name;

    public SystemFile(String name) {
        this.name = name;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
    }
}
