import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertarDatos {
    String nombre;
    String cedula;

    int calif1;
    int calif2;

    public InsertarDatos(String nombre, String cedula, int calif1, int calif2) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.calif1 = calif1;
        this.calif2 = calif2;
    }

    public InsertarDatos() {
    }

    public void ingresarDatos(String nombre,String cedula, int calif1,int calif2){
        try(Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/estudiantes","root","")){
            String sql="INSERT INTO calificaciones(nombre,cedula,calificacion1,calificacion2)values(?,?,?,?)";
            try(PreparedStatement preparedStatement=connection.prepareStatement(sql)){
                preparedStatement.setString(1,nombre);
                preparedStatement.setString(2,cedula);
                preparedStatement.setInt(3,calif1);
                preparedStatement.setInt(4,calif2);

                int filasAfectadas=preparedStatement.executeUpdate();
                if(filasAfectadas>0){
                    System.out.println("Insercion exitosa");
                }else {
                    System.out.println("No se pudo insertar");
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

    }
}
