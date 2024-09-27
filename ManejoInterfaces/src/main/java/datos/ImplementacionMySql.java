package datos;
public class ImplementacionMySql implements AccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MySql");
    }
    
}
