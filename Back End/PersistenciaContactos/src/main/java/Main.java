import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Contacto> listaContactos = new ArrayList<>();

        Contacto contacto1 = new Contacto();
        contacto1.setNombre("Laura");
        contacto1.setMail("laura@mail.com");
        contacto1.setTelefono(123);

        Contacto contacto2 = new Contacto();
        contacto2.setNombre("Roberta");
        contacto2.setMail("roberta@mail.com");
        contacto2.setTelefono(456);

        listaContactos.add(contacto1);
        listaContactos.add(contacto2);

        FileOutputStream fo;
        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream dos = new ObjectOutputStream(fo);

            dos.writeObject(listaContactos);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Contacto> contactos2 = null;
        FileInputStream fi = null;

        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);

            contactos2 = (ArrayList) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Contacto contacto: contactos2)
            System.out.println(contacto.getNombre() + " " + contacto.getMail() + " " + contacto.getTelefono());
    }
}
