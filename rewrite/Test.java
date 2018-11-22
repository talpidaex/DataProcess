
package vize.rewrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* Author : Oguzhan Bayrak       */

public class Test {
    
    static ArrayList<Person> personList = new ArrayList<Person>();
   
    public static void main(String[] args) {
            readData();
            CompareData();
            writeData();
    }
    private static void readData() {
               try {
                File file = new File("C:\\Users\\ousha\\OneDrive\\Belgeler\\NetBeansProjects\\2018\\Vize-reWrite\\src\\vize\\rewrite\\data.txt");
                   FileReader fileReader = new FileReader(file);
                   BufferedReader bufferedReader = new BufferedReader(fileReader);
                   String line = bufferedReader.readLine();
                    while(line != null){
                        String[] x = line.split(":| ");
                        Person p = new Person();    //Personu burda çalıştırmak zorundayım yoksa en son kişiyi arrayliste atıyor.
                        p.setYearOfBirth(Integer.valueOf(x[0]));    //while döndükçe yeni kişi oluşturacak.
                        p.setName(x[1]);
                        p.setSurname(x[2]);
                        personList.add(p);
                        line = bufferedReader.readLine();   //bir sonraki satırı oku!
                    }
                    
                    bufferedReader.close();
            } 
               catch (IOException e) {
                    System.out.println("File Reader crushed!");
            }
    }
    private static void CompareData() {
            
            Collections.sort(personList);
            System.out.println(personList);
     
    }
    private static void writeData() {
            try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\ousha\\OneDrive\\Belgeler\\NetBeansProjects\\2018\\Vize-reWrite\\src\\vize\\rewrite\\output.txt"));
            bufferedWriter.write(personList.get(3).name.toUpperCase()+"\t");
            bufferedWriter.write(personList.get(3).surname.substring(0,3)+"\t");
            bufferedWriter.write(String.valueOf(2016-personList.get(3).yearOfBirth));
            bufferedWriter.flush();
            bufferedWriter.close();
        } 
            catch (IOException e) {
        }
            
    }
 
}
