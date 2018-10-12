package test;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

import javax.swing.*;

public class JFileChooserDemo extends JFrame {
	private final JTextArea outputArea;
	
	public JFileChooserDemo() throws IOException{
		super("JFileChooser Demo");
		outputArea = new JTextArea();
		add(new JScrollPane(outputArea));
		analyzePath();
	}
	
	public void analyzePath() throws IOException{
		Path path = getFileOrDirectoryPath();
		if(path != null && Files.exists(path)) {
			StringBuilder builder = new StringBuilder();
			builder.append(String.format("%s:%n", path.getFileName()));
			builder.append(String.format("%s is  a directory%n",  Files.isDirectory(path)?"is":"not"));
			builder.append(String.format("%s an absolute path%n",path.isAbsolute() ? "Is" : "Is not"));
			builder.append(String.format("Last modified: %s%n",Files.getLastModifiedTime(path)));builder.append(String.format("Size: %s%n", Files.size(path))); builder.append(String.format("Path: %s%n", path));
			builder.append(String.format("Absolute path: %s%n",path.toAbsolutePath()));
			
			if(Files.isDirectory(path)) {
//				builder.append(String.format("%nDirectory contends:%n"));
//				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
//				for(Path P: directoryStream) {
//					builder.append(String.format("%s%n", P));
//				}
				builder.append(String.format("%nDirectory contents%n"));
				DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);
				for(Path P: directoryStream) {
					builder.append(String.format("%s%n", P));
				}
				outputArea.setText(builder.toString());
			}
			else {
				JOptionPane.showMessageDialog(this, path.getFileName() + "doesnt exit", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private Path getFileOrDirectoryPath() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		int result = fileChooser.showOpenDialog(this);
		if(result == JFileChooser.CANCEL_OPTION)
			System.exit(1);
		return fileChooser.getSelectedFile().toPath();
	}
}
