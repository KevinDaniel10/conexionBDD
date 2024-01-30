import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Ingreso de calificacioones");
        menuInsercion sgEstudiantes = new menuInsercion();
        frame.setContentPane(new menuInsercion().form1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sgEstudiantes.form1.setBackground(Color.lightGray);
        frame.setLocationRelativeTo(null);
        frame.setContentPane(sgEstudiantes.form1);
        frame.setSize(400,400);
        frame.setVisible(true);
    }
}