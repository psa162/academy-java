package com.bptn.course._24_file_handling_basics;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class FileReadDemo {

		public static void main(String[] args) {

			try {
				FileReader reader = new FileReader("student.txt");
				BufferedReader bufferedReader = new BufferedReader(reader);
				String line;
				while ((line = bufferedReader.readLine()) != null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				System.out.println("Something went wrong while creating the file: " + e.getMessage());
				e.printStackTrace();
			}
		}
	}

	//Student testStudent = new Student(123, line);
	//while (reader.read() != -1) {
	//System.out.println(reader.read());
	//}


