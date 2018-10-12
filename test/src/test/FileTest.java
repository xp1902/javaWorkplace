package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileTest {
	private static final String Path = null;
	public static void main(String[] args) throws IOException {
		File file = new File("d:" + File.separator + "me" + File.separator + "hello.txt");
		if(file.isDirectory()) {
			new Thread(() ->{
				listDir(file);
			}).start();
			System.out.println("开始列出文件.....");
		};
		if(!file.getParentFile().exists()) {
			file.getParentFile().mkdirs();
		}
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			file.delete();
		}
		
		String str = "世界和平\n";
//		FileWriter fw = new FileWriter(file);
//		fw.write(str);
//		fw.close();
		OutputStream out = new FileOutputStream(file, true);
		out.write(str.getBytes());
		out.close();
		
		InputStream in = new FileInputStream(file);
		byte[] data = new byte[1024];
		int len = in.read(data);
		System.out.println(new String(data, 0, len));
		in.close();
		
		//读写文件---------------------------------------------------------------------------------------
		java.nio.file.Path path0= Paths.get("d:" + File.separator + "me" + File.separator + "hello.txt");
		byte[] data1 = Files.readAllBytes(path0);
		String content = new String(data1, "utf-8");
		List<String> lines = Files.readAllLines(path0);
		System.out.println(lines);
		Files.write(path0, content.getBytes(), StandardOpenOption.APPEND);
		
		//testing file-----------------------------------------------------------
		Scanner input = new Scanner(System.in);
		//input = new Scanner(Paths.get("clients.txt"));
		System.out.println("Enter file or directory name:");
		java.nio.file.Path path = Paths.get(input.nextLine());
		if(Files.exists(path)) {
			System.out.printf("%n%s exits %n", path.getFileName());
		}
		//add records-------------------
		Formatter output = new Formatter("clients.txt");
		while(input.hasNext()) {
			try {
				output.format("%d %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
			}
			catch(FormatterClosedException e) {
				System.out.print(e.getMessage());
			}
			catch(NoSuchElementException e) {
				System.out.println("please input again");
				input.nextLine();
			}
			//test
		}
	}
	private static void listDir(File file) {
		if(file.isDirectory()) {
			File[] result = file.listFiles();
			if(result != null) {
				for(File f: result) {
					listDir(f);
				}
			}
			System.out.println(file);
		}
	}

}
