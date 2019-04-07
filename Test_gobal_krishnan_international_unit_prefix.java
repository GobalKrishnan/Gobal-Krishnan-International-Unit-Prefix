import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import gobalkrishnanv.gobal1995.gki_prefix.gobal_krishnan_international_unit_prefix;

public class Test_gobal_krishnan_international_unit_prefix {
	public static void main(String[] args) throws IOException {
		gobal_krishnan_international_unit_prefix r=new gobal_krishnan_international_unit_prefix();
		for(gobal_krishnan_international_unit_prefix w:r.list()) {
           System.out.println(w);		
		}
		System.out.println(r.get(50));
		System.out.println(r.getByName("all"));
		System.out.println(r.getBySymbol("all"));
		System.out.println(r.getByValue("1"));
		
		System.out.println("Size=="+r.list().size());
	}
}
