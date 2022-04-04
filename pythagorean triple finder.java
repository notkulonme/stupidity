package szamharmas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int x = 100 , szamharmas = 1;
			for(int a=1;a < x; a++) {
				//System.out.println(a);
				for(int b=1; b < x ; b++) {
					for(int c = 1; c < x ; c++ ) {
						if((Math.pow(a,2) + Math.pow(b,2)) == Math.pow(c,2)) {
							System.out.println(szamharmas+". számhármas: "+a+" "+b+" "+c);
							szamharmas++;
							String irrando=szamharmas+". számhármas: "+a+" "+b+" "+c;
						   try {
							   File file = new File("file location");
							   BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
						        writer.write(irrando);
						        writer.newLine();
						        writer.close();
						      } 
						    catch (IOException e) {
						        e.printStackTrace();
						      }
							}
						 }
					}		
			x++;
				}
			}
			
		}
