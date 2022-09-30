package com.multi.frame;

import java.io.FileOutputStream;
import org.springframework.web.multipart.MultipartFile;

//서버에서 file을 write해주는 class임 
//file을 내가 원하는 directory에 저장을 하는 것
public class Util {
	public static void saveFile(MultipartFile mf, String admindir, String custdir) {
		byte [] data;
		String imgname = mf.getOriginalFilename();
		try {
			data = mf.getBytes();
			FileOutputStream fo = 
					new FileOutputStream(admindir+imgname);
			fo.write(data);
			//system에 접속하고 나서는 반드시 close를 해줘야 함
			fo.close();
			FileOutputStream fo2 = 
					new FileOutputStream(custdir+imgname);
			fo2.write(data);
			//system에 접속하고 나서는 반드시 close를 해줘야 함
			fo2.close();
		}catch(Exception e) {
			
		}
		
	}
	
}




