package examenets;

/**
 * @author julia
 */
public class ExamenETS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Suma();
        Resta();
        Multiplicacion();
        Division();
    }

    public static void Division() throws NumberFormatException {
        double Division1;
        String divi1 = "";
        Division1 = Double.parseDouble(divi1);
        double div2;
        String divi2 = "";
        div2 = Double.parseDouble(divi2);
        double div3;
        String divi3 = "";
        div3 = Double.parseDouble(divi3);
        double dividir = Division1 / div2 / div3;
        System.out.println("Operación dividir = " + dividir);
    }

    public static void Multiplicacion() throws NumberFormatException {
        double Multiplicacion1;
        String multi1 = "";
        Multiplicacion1 = Double.parseDouble(multi1);
        double mul2;
        String multi2 = "";
        mul2 = Double.parseDouble(multi2);
        double mul3;
        String multi3 = "";
        mul3 = Double.parseDouble(multi3);
        double multiplicar = Multiplicacion1 * mul2 * mul3;
        System.out.println("Operación Multiplicar = " + multiplicar);
    }

    public static void Resta() throws NumberFormatException {
        int Resta1;
        String resta1 = "";
        Resta1 = Integer.parseInt(resta1);
        int rest2;
        String resta2 = "";
        rest2 = Integer.parseInt(resta2);
        int rest3;
        String resta3 = "";
        rest3 = Integer.parseInt(resta3);
        int restar = Resta1 - rest2 - rest3;
        System.out.println("Operación Restar =  " + restar);
    }

    public static void Suma() throws NumberFormatException {
        int Sumar1;
        String suma1 = "";
        Sumar1 = Integer.parseInt(suma1);
        int sum2;
        String suma2 = "";
        sum2 = Integer.parseInt(suma2);
        int sum3;
        String suma3 = "";
        sum3 = Integer.parseInt(suma3);
        int sumar = Sumar1 + sum2 + sum3;
        System.out.println("Operación Suma = " + sumar);
    }

}
