package package3_exercise.part1_text_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class DocGhiFile {
	public static boolean ghiFile(ArrayList<KhachHang> list, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			for(var item : list) {
				String line = item.getMa() + "\t" +
						item.getTen() + "\t" +
						DateConverter.getStringFromDate(item.getNamSinh());
				bw.write(line);
				bw.newLine();
			}
			
			bw.close();
			osw.close();
			fos.close();
			return true;
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<KhachHang> docFile(String path){
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		try {
			FileInputStream fis = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line = br.readLine();
			while(line != null) {
				String[] info = line.split("\\t");
				if(info.length == 3) {
					KhachHang kh = new KhachHang();
					kh.setMa(Integer.parseInt(info[0]));
					kh.setTen(info[1]);
					kh.setNamSinh(DateConverter.getDateFromString(info[2]));
					
					list.add(kh);
				}
				
				line = br.readLine();
			}
			
			br.close();
			isr.close();
			fis.close();
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
}
