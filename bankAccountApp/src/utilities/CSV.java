package utilities;
import java.io.*;
import java.util.*;
public class CSV {


		// This string will read data from CSV file and returns a list
		public static List<String[]> read(String file)
		{
			List<String[]> data = new LinkedList<String[]>();
			String dataRows;
			try {
				BufferedReader br = new BufferedReader(new FileReader(file)); //Reading data from the file
				while((dataRows = br.readLine())!=null)
				{
					String[] dataRecords = dataRows.split(",");
					data.add(dataRecords);
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("FILE NOT FOUND");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("FILE NOT READ");
				e.printStackTrace();
			}
			return data;
		}
	

}
