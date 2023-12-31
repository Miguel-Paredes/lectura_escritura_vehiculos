import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class menuPrincipal {
    private javax.swing.JPanel JPanel;
    private JLabel numeracion;
    private JLabel marca;
    private JLabel anio;
    private JLabel modelo;
    private JButton retroceder;
    private JButton avanzar;
    private JLabel readmarca;
    private JLabel readanio;
    private JLabel readmodelo;

    public static void main(String[] args) {
        JFrame frame = new JFrame("vehiculos");
        frame.setContentPane(new menuPrincipal().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        vehiculos Camry = new vehiculos(1,"Camry",1992,"Toyota");
        vehiculos Corolla = new vehiculos(2,"Corolla",1966,"Toyota");
        vehiculos Prius = new vehiculos(3,"Prius",1997,"Toyota");
        vehiculos Hilux = new vehiculos(4,"Hilux",1968,"Toyota");
        vehiculos Focus = new vehiculos(5,"Focus",1998, "Ford");
        vehiculos Mustang = new vehiculos(6,"Mustang",1964,"Ford");
        vehiculos Camaro = new vehiculos(7,"Camaro",1966,"Chevrolet");
        List<vehiculos> lista = new ArrayList<vehiculos>();
        lista.add(Camry);
        lista.add(Corolla);
        lista.add(Prius);
        lista.add(Hilux);
        lista.add(Focus);
        lista.add(Mustang);
        lista.add(Camaro);
        String filePath="datos.dat";
        try (FileOutputStream fileOut=new FileOutputStream(filePath);
             ObjectOutputStream obOut=new ObjectOutputStream(fileOut);
        ) {
            obOut.writeObject(lista);
            System.out.println("archivo escrito correctamente");
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        try(FileInputStream fileIn=new FileInputStream(filePath);
            ObjectInputStream objIn= new ObjectInputStream(fileIn);
        ){
            vehiculos readObject=(vehiculos) objIn.readObject();
            System.out.println("El objeto en disco es: \n"+readObject);
        }catch(IOException e){
            throw new RuntimeException(e);
        }catch (ClassNotFoundException e){
            throw new RuntimeException();
        }
    }
}
