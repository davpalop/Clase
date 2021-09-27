package org.iesfm.printLog;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class PrintLog {

    public static void main(String[] args) {
        File logs = new File(args[0]);
        try {
            FileInputStream fis = new FileInputStream(logs);
            byte[] fileInBytes = fis.readAllBytes();
            String content = new String(fileInBytes, StandardCharsets.UTF_8);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
