package org.iesfm.tasks.segundoEjercicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        FileReader fr = null;
        FileReader fr2 = null;
        FileReader fr3 = null;
        FileReader fr4 = null;
        try {
            File archivo = new File ("/home/dapalo/files/1.txt");
            File archivo2 = new File("/home/dapalo/files/2.txt");
            File archivo3 = new File ("/home/dapalo/files/3.txt");
            File archivo4 = new File ("/home/dapalo/files/4.txt");
            fr = new FileReader(archivo);
            fr2 = new FileReader(archivo2);
            fr3 = new FileReader(archivo3);
            fr4 = new FileReader(archivo4);
            BufferedReader br = new BufferedReader(fr);
            BufferedReader br2 = new BufferedReader(fr2);
            BufferedReader br3 = new BufferedReader(fr3);
            BufferedReader br4 = new BufferedReader(fr4);
            String linea;
            if ((linea = br.readLine())!= null) {
                System.out.println(linea);
            } if ((linea = br2.readLine()) != null){
                System.out.println(linea);
            }
            if ((linea = br3.readLine()) != null) {
                System.out.println(linea);
            } if ((linea = br4.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try{
                if(null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    }

    //dentro del psvm
// private static String readFile(File file){}
//File folder = new File("home/dapalo/files");
//File[] filesInFolder = folder.listFiles();
//for(File file : filesInFolder) {
//    String content = readFile(file);
//      builder.append(content).append("\n");
// sout
//HolaReader reader = new HolaReader("hola");
//holaReader.muestraSaludo();