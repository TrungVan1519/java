package package3_exercise.part2_serializable_file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DocGhiFileSerializer {
	public static boolean ghiFile(ArrayList<DanhBa> list, String path) {
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			
			oos.close();
			fos.close();
			return true;
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}
	
	public static ArrayList<DanhBa> docFile(String path){
		ArrayList<DanhBa> list = new ArrayList<DanhBa>();
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Object obj = ois.readObject();
			list = (ArrayList<DanhBa>) obj;
			
			ois.close();
			fis.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return list;
	}
}
