package exemmatriz;

import javax.swing.JOptionPane;

public class PedirDatos {

    public static int pedirInt(String mensaxe) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }

    public static String pedirString(String mensaxe) {
        return JOptionPane.showInputDialog(mensaxe);
    }

}
