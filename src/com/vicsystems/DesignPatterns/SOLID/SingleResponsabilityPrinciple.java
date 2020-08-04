package com.vicsystems.DesignPatterns.SOLID;

/*
* 1-Una clase debe tener una sola razon cambiar
* 2-Una clase debe tener una sola responsabilidad.
* 3-Si tiene muchas responsabilidades caes en en el antipatron God Object.
* 4- O sea una clase no puede estar preocupada por persistencia ni funcionalidades que pueden servir de forma general.
* */

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SingleResponsabilityPrinciple {

    private final List<String> entrada = new ArrayList<>();

    private static int cont = 0;

    public void addEntry(String text)
    {
        entrada.add("" + (++cont) + ": " + text);
    }

    public void removeEntry(int index)
    {
        entrada.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entrada);
    }

    // Aqui rompemos el principio de SRP
    public void save(String filename) throws Exception
    {
        try (PrintStream out = new PrintStream(filename))
        {
            out.println(toString());
        }
    }

    public void load(String filename) {}
    public void load(URL url) {}

}

// Maneja la responsabilidad de persistir objetos
class Persistence
{
    public void saveToFile(SingleResponsabilityPrinciple journal,
                           String filename, boolean overwrite) throws Exception
    {
        if (overwrite || new File(filename).exists())
            try (PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
    }

    public void load(SingleResponsabilityPrinciple singleResponsabilityPrinciple, String filename) {}
    public void load(SingleResponsabilityPrinciple singleResponsabilityPrinciple, URL url) {}
}

class Demo{
    public static void main(String [] args) throws Exception {
        SingleResponsabilityPrinciple j = new SingleResponsabilityPrinciple();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "c:\\Work\\diario.txt";
        p.saveToFile(j, filename, true);
        // windows! Mostrar contenido del archivo
        Runtime.getRuntime().exec("notepad.exe " + filename);
    }
}
