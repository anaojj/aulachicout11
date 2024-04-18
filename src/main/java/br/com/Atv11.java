package br.com;

import java.io.*;

public class Atv11 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João da Silva", 30);

        try (FileOutputStream fileOutputStream = new FileOutputStream("pessoa.dat");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(pessoa);

        } catch (IOException e) {
            System.err.println("Erro ao serializar objeto: " + e.getMessage());
        }

        System.out.println("Objeto serializado com sucesso!");
    }
}