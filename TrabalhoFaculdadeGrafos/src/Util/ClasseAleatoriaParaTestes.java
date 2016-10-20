/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import Objetos.Grafo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author comp15
 */
public class ClasseAleatoriaParaTestes {
    public static void main(String[] args) {

		try {
			Grafo g = new Grafo();
                        g.setArestas(new String[]{"asd"});

			// write object to file
			FileOutputStream fos = new FileOutputStream("mybean.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(g);
			oos.close();

			// read object from file
			FileInputStream fis = new FileInputStream("mybean.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Grafo result = (Grafo) ois.readObject();
			ois.close();

			System.out.println("SUCEXO");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
