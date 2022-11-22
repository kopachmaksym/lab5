package com.command;
import java.io.IOException;
import java.util.Scanner;

public class Database {
    Scanner scanner = new Scanner(System.in);

    public Database() {

    }


    public void salatFile() throws IOException {
        System.out.println("Displayed file");
    }

    public void help() throws IOException {
        System.out.println("Displayed file");
    }

    public void exit(){
        System.exit(0);
    }

}
