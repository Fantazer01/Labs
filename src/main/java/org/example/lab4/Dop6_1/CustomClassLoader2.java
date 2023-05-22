package org.example.lab4.Dop6_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomClassLoader2 extends ClassLoader {
    private final String javapath;
    private final String classpath;

    public CustomClassLoader2(String javapath, String classpath) {
        this.javapath = javapath;
        this.classpath = classpath;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        if (name.equals(javapath)) {
            byte[] classBytes;
            try {
                classBytes = loadClassBytesFromCustomSource();
            } catch (IOException e) {
                throw new ClassNotFoundException("Failed to load class bytes from custom source", e);
            }
            return defineClass(name, classBytes, 0, classBytes.length);
        }
        return super.findClass(name);
    }

    private byte[] loadClassBytesFromCustomSource() throws IOException {
        Path classFilePath = Path.of(classpath);
        return Files.readAllBytes(classFilePath);
    }
}