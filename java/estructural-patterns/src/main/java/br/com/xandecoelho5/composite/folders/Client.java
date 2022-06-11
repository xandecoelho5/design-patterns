package br.com.xandecoelho5.composite.folders;

import br.com.xandecoelho5.composite.folders.model.FileSystemItem;
import br.com.xandecoelho5.composite.folders.model.Folder;
import br.com.xandecoelho5.composite.folders.model.SystemFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Client {

	public static FileSystemItem createCompositeFromFile(File file) {
		if(!file.isDirectory()) return new SystemFile(file.getName());
		List<FileSystemItem> childs = new ArrayList<>();
		File[] files = file.listFiles();
		for(File javaFile: files) {
			childs.add(createCompositeFromFile(javaFile));
		}
		return new Folder(file.getName(), childs);
	}

	public static void main(String[] args) {
		FileSystemItem file1 = new SystemFile("teste1.txt");
		FileSystemItem file2 = new SystemFile("teste2.txt");
		FileSystemItem file3 = new SystemFile("teste3.txt");
		FileSystemItem file4 = new SystemFile("teste4.txt");
		FileSystemItem file5 = new SystemFile("teste5.txt");

		FileSystemItem sf1 = new Folder("sf1", List.of(file1, file2));
		FileSystemItem sf2 = new Folder("sf2", List.of(file3, file4, sf1));

		FileSystemItem folder = new Folder("folder", List.of(sf2, file5));

		folder.print("");

		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
		fromDisk.print(">");
	}
}
