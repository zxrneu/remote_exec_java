package com.play;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("E:\\java-code\\remote_exec_java\\target\\classes\\com\\play\\Hello.class");
        byte[] b = new byte[is.available()];
        is.read(b);
        is.close();
        System.out.println(JavaclassExecuter.execute(b));
    }
}
