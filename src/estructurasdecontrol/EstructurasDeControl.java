/*
Programa que utilice las 5 estructuras de control while, do while, for,if , switch
c.joseanguiano@gmail.com //Para cualquier duda ;D
https://github.com/cjoseanguiano/EstructurasDeControl
 */
package estructurasdecontrol;

import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class EstructurasDeControl {

    public int a = 0;

    public static void main(String[] args) {
        int valor;
        EstructurasDeControl estructurasDeControl = new EstructurasDeControl();
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un valor \n\n"
                + "1.- Estructura de Control While\n"
                + "2.- Estructura de Control do While\n"
                + "3.- Estructura de Control for\n"
                + "4.- Estructura de Control if\n"
                + "5.- Estructura de Control Switch\n\n"
        ));

        switch (valor) {

            case 1:
                estructurasDeControl.estructuraWhile();
                break;
            case 2:
                estructurasDeControl.estructuraDoWhile();

                break;
            case 3:
                estructurasDeControl.estructuraFor();

                break;
            case 4:
                estructurasDeControl.estructuraIf();
                break;
            case 5:
                estructurasDeControl.estructuraSwitch();
                break;
            default:
                System.out.println("Ingresaste un valor invalido");
                System.exit(0);
                break;
        }

    }

    public void estructuraWhile() {
        System.out.println("estructuraWhile");

        while (a < 100) {
            a++;
            System.out.println("Valor " + a);

        }

    }

    public void estructuraDoWhile() {
        System.out.println("estructuraDoWhile");

        do {
            a++;
            System.out.println("Valor " + a);
        } while (a < 100);

    }

    public void estructuraFor() {
        System.out.println("estructuraFor");

        for (int i = 0; i < 100; i++) {
            a++;
            System.out.println("Valor :" + a);

        }
    }

    public void estructuraIf() {
        System.out.println("estructuraIf");

        int b = 1;
        if (a == 0 && a < 100) {

            for (int i = 0; i < 100; i++) {
                a++;
                System.out.println("Valor : " + a);
            }
        } else {
            System.out.println("Valor menor");
        }
    }

    public static void estructuraSwitch() {
        System.out.println("estructuraSwitch");

        System.out.println("Ya se esta utilizando en el menu :D");
    }
}
