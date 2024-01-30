import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuInsercion {
    private JButton conectarBDDButton;
    public JPanel form1;
    private JLabel mensajetxt;
    private JTextField nombretext;
    private JTextField cedtext;
    private JTextField cal2text;
    private JButton insertarButton;
    private JLabel nombre;
    private JLabel cedula;
    private JLabel cal1;
    private JLabel cal2;
    private JTextField cal1text;
    private JButton borrarCamposButton;

    public menuInsercion() {
        conectarBDDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                conexionBDD miconexion= new conexionBDD();
                miconexion.conexionlocal("jdbc:mysql://localhost:3306/estudiantes","root","");
                mensajetxt.setText(miconexion.getMensaje());
            }

        });
        borrarCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombretext.setText("");
                cedtext.setText("");
                cal1text.setText("");
                cal2text.setText("");
            }
        });
        insertarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InsertarDatos insertarDatos=new InsertarDatos();
                insertarDatos.ingresarDatos(nombretext.getText(),cedtext.getText(),Integer.parseInt(cal1text.getText()),Integer.parseInt(cal2text.getText()));
            }
        });
    }


}
