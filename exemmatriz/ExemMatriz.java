package exemmatriz;

import javax.swing.JOptionPane;

public class ExemMatriz {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        String[] alumnos = {"alum1","alum2","alum3"};
        String[] modulos = {"M1","M2","M3","M4"};
        int[]mAlumnos = new int[3];
        int[]mModulos = new int [4];
        int opcion;
        MetodosMatriz obx = new MetodosMatriz();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n 1 --> Crear Matriz\n 2--> Amosar\n 3 --> Amosar Todo \n 4 --> Alumnos Media\n 5 --> Modulos Media  \n 6 Sair"));
            switch (opcion) {
                case 1:
                    matriz = obx.crearMatriz(matriz);
                    break;
                case 2:
                    obx.amosar(matriz);
                    break;
                case 3:
                    obx.amosarTodo(matriz, alumnos, modulos);
                    break;
                case 4:
                    obx.mediaAlumnos(matriz, mAlumnos);
                    break;
                case 5: 
                    obx.mediaModulos(matriz, mModulos);
                case 6:
                    obx.sair();
                    break;
            }

        } while (opcion < 3);
    }

}
