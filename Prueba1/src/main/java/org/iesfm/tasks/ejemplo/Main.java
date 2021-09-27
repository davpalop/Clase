package org.iesfm.tasks.ejemplo;

public class Main {
    public static void main(String[] args) {
        SaludoTask saludoTask = new SaludoTask("hola", 2000);
        Thread t = new Thread(saludoTask);
        t.start();
        SaludoTask helloTask = new SaludoTask("hello", 3000);
        Thread th = new Thread(helloTask);
        th.start();
    }
}
