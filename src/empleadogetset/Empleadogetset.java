package empleadogetset;

import javax.swing.JOptionPane;

public class Empleadogetset
{
    public static void main(String[] args)
    {
        /*
        Empleado datos = new Empleado();
        JOptionPane.showMessageDialog(null,
                "Ficha del Empleado\n\n"
                + "Nombre: " + datos.getNombre()
                + "\n" + "Edad: " + datos.getEdad() + "\n" + "Sexo: " + datos.getSexo() + "\n"
                + "Dirección: " + datos.getDireccion() + "\n" + "Teléfono: " + datos.getTelefono() +
                "\n" + "Nº de DUI: " + datos.getDUI() + "\n" + "E-mail: " + datos.getEmail() + "\n" +
                "Cargo que desempeña: " + datos.getCargo() + "\n" + "Sueldo Neto: $" + datos.getSueldoneto()
                + "\n" + "Sueldo Líquido: $" + datos.getSueldoliquido());
         */

        Empleado datos2 = new Empleado();
        datos2.setNombre("Omar");
        datos2.setEdad("20");
        datos2.setSexo("Masculino");
        datos2.setDireccion("Centella 56");
        datos2.setTelefono("5517803328");1
        datos2.setDUI("1122101010");
        datos2.setEmail("omrhvs@gmail.com");
        datos2.setCargo("Jefe");
        datos2.setSueldoneto(100000);
        datos2.setSueldoliquido(datos2.getSueldoneto()-(datos2.getSueldoneto()*(0.0625)+datos2.getSueldoneto()*
                (0.03)+datos2.getSueldoneto()*(0.07)));

        JOptionPane.showMessageDialog(null,
                "Ficha del Empleado\n\n"
                        + "Nombre: " + datos2.getNombre()
                        + "\n" + "Edad: " + datos2.getEdad() + "\n" + "Sexo: " + datos2.getSexo() + "\n"
                        + "Dirección: " + datos2.getDireccion() + "\n" + "Teléfono: " + datos2.getTelefono() +
                        "\n" + "Nº de DUI: " + datos2.getDUI() + "\n" + "E-mail: " + datos2.getEmail() + "\n" +
                        "Cargo que desempeña: " + datos2.getCargo() + "\n" + "Sueldo Neto: $" + datos2.getSueldoneto()
                        + "\n" + "Sueldo Líquido: $" + datos2.getSueldoliquido());
    }
}
