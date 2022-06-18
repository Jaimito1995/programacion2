import javax.swing.*;

public class programacion2 {
    public static void main(String args[]){
        int pesos = Integer.parseInt(JOptionPane.showInputDialog("ingresar valor en pesos"));
        double bolivar = (0.0014 * pesos);
        JOptionPane.showMessageDialog(null,"el valor de los pesos en bolivares es" + bolivar);

    }
}
