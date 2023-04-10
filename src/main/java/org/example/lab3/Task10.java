package org.example.lab3;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Task10 {
    public static File[] allDirectoryByLambda(String dirpath) {
        File dir = new File(dirpath);
        return dir.listFiles(file -> file.isDirectory());
    }

    public static File[] allDirectoryByMethodRef(String dirpath) {
        File dir = new File(dirpath);
        return dir.listFiles(File::isDirectory);
    }

    public static File[] allDirectoryByClass(String dirpath) {
        File dir = new File(dirpath);
        return dir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return file.isDirectory();
            }
        });
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(allDirectoryByLambda("C:\\")));
        System.out.println(Arrays.toString(allDirectoryByMethodRef("C:\\")));
        System.out.println(Arrays.toString(allDirectoryByClass("C:\\")));
    }
}
