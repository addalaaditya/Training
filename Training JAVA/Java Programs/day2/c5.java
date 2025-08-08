package day2;

import java.util.Scanner;

public class c5 {
	String filename;
    String storageplace;
    double size;

    void upload() {
        Scanner sc = new Scanner(System.in);
        System.out.print("filename: ");
        filename = sc.nextLine();
        System.out.print("storage place ");
        storageplace = sc.nextLine();
        System.out.print("size");
        size = sc.nextDouble();
    }

    void download() {
        System.out.println("file details");
        System.out.println("filename " + filename);
        System.out.println("storage place " + storageplace);
        System.out.println("size " + size);
    }

    public static void main(String[] args) {
        c5 b = new c5();

        b.upload();
        b.download();
    }

}
