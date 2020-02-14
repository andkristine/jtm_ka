package jtm.activity10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCopy {

	/*
	 * TODO Implement method that takes path to file as a parameter And copies
	 * whole contents of the file to the same location but with a new file name:
	 * <old_file_name>_backup e.g. if file is data.txt copy should be named
	 * data.txt_backup
	 */

	public void copyFile(String filePath) throws IOException {
		
		List<String> linesInList = Files.readAllLines(Paths.get(filePath));
		Path pathToFile = Paths.get(filePath + "_backup");
		Files.write(pathToFile, linesInList);

	}

	public static void main(String[] args) throws IOException {
		FileCopy copy = new FileCopy();
		copy.copyFile("/home/student/Desktop/JTM_KA/src/main/resources/data.json");
	}

}
