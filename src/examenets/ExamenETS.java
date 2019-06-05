package examenets;

import javax.swing.JOptionPane;

/**
 * @author julia
 */
public class ExamenETS {

    /**
     * @param args the command line arguments
     * @since 05/06 17:15 El metodo main con el nombre de todos los metodos para
     * que se puedan ejecutar
     */
    public static void main(String[] args) {
        ExamenETS ets;
        ets = new ExamenETS();
        ets.Suma();
        ets.Resta();
        ets.Multiplicacion();
        ets.Division();
    }

    /**
     * @since 05/06 17:58 Metodo en el que se divide Tengo las variables
     * declaradas dentro, por lo que no se le pasa nada por parametro
     */
    public void Division() {
        double Division1;
        String divi1 = "";
        divi1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        Division1 = Double.parseDouble(divi1);
        double div2;
        String divi2 = "";
        divi2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
        div2 = Double.parseDouble(divi2);
        double div3;
        String divi3 = "";
        divi3 = JOptionPane.showInputDialog("Ingrese el tercer numero");
        div3 = Double.parseDouble(divi3);
        double dividir = Division1 / div2 / div3;
        System.out.println("Operación dividir = " + dividir);
    }

    /**
     * @since 05/06 17:55 Metodo en el que se multiplica Tengo las variables
     * declaradas dentro, por lo que no se le pasa nada por parametro
     */
    public void Multiplicacion() {
        double Multiplicacion1;
        String multi1 = "";
        multi1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        Multiplicacion1 = Double.parseDouble(multi1);
        double mul2;
        String multi2 = "";
        multi2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
        mul2 = Double.parseDouble(multi2);
        double mul3;
        String multi3 = "";
        multi3 = JOptionPane.showInputDialog("Ingrese el tercer numero");
        mul3 = Double.parseDouble(multi3);
        double multiplicar = Multiplicacion1 * mul2 * mul3;
        System.out.println("Operación Multiplicar = " + multiplicar);
    }

    /**
     * @since 05/06 17:50 Metodo en el que se resta Tengo las variables
     * declaradas dentro, por lo que no se le pasa nada por parametro
     */
    public void Resta() {
        int Resta1;
        String resta1 = "";
        resta1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        Resta1 = Integer.parseInt(resta1);
        int rest2;
        String resta2 = "";
        resta2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
        rest2 = Integer.parseInt(resta2);
        int rest3;
        String resta3 = "";
        resta3 = JOptionPane.showInputDialog("Ingrese el tercer numero");
        rest3 = Integer.parseInt(resta3);
        int restar = Resta1 - rest2 - rest3;
        System.out.println("Operación Restar =  " + restar);
    }

    /**
     * @since 05/06 17:48 Metodo en el que se suma Tengo las variables
     * declaradas dentro, por lo que no se le pasa nada por parametro
     */
    public void Suma() {
        int Sumar1;
        String suma1 = "";
        suma1 = JOptionPane.showInputDialog("Ingrese el primer numero");
        Sumar1 = Integer.parseInt(suma1);
        int sum2;
        String suma2 = "";
        suma2 = JOptionPane.showInputDialog("Ingrese el segundo numero");
        sum2 = Integer.parseInt(suma2);
        int sum3;
        String suma3 = "";
        suma3 = JOptionPane.showInputDialog("Ingrese el tercer numero");
        sum3 = Integer.parseInt(suma3);
        int sumar = Sumar1 + sum2 + sum3;
        System.out.println("Operación Suma = " + sumar);
    }

}
