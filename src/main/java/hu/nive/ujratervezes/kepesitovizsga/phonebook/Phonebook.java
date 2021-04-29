package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {


    public void exportPhonebook(Map<String, String> contacts, String output) {
        validator(contacts);
        validator(output);
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
            writeLines(contacts, writer);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }

    }

    private void writeLines(Map<String, String> contacts, BufferedWriter writer){
        try {
            for (Map.Entry<String, String> entry: contacts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }

    private void validator(Object object){
        if (object == null){
            throw new IllegalArgumentException();
        }
    }

}
