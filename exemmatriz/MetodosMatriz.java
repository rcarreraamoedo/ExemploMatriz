package exemmatriz;

public class MetodosMatriz {

    public int[][] crearMatriz(int[][] taboa) {
        for (int f = 0; f < taboa.length; f++) {
            for (int c = 0; c < taboa[f].length; c++) {
                taboa[f][c] = PedirDatos.pedirInt("Teclea valores para la tabla: ");
            }
        }
        return taboa;
    }

    public void amosar(int[][] taboa) {
        for (int f = 0; f < taboa.length; f++) {
            System.out.println("\n");
            for (int c = 0; c < taboa[f].length; c++) {
                System.out.print(taboa[f][c] + " ");
            }
        }
    }

    public void sair() {
        System.exit(0);
    }

    public String[] arrayFila(int[][] taboa) {
        String[] filas = new String[taboa.length];
        for (int i = 0; i < filas.length; i++) {
            filas[i] = PedirDatos.pedirString("nome filas ");
        }
        return filas;
    }

    public String[] arrayColumnas(int[][] taboa) {
        String[] columnas = new String[taboa[0].length];
        for (int i = 0; i < columnas.length; i++) {
            columnas[i] = PedirDatos.pedirString("nome columnas ");
        }
        return columnas;
    }

    public void amosarTodo(int[][] taboa, String[] alumnos, String[] modulos) {
        for (int i = 0; i < modulos.length; i++) {
            System.out.print("   " + modulos[i] + " ");
        }
        for (int f = 0; f < taboa.length; f++) {
            System.out.println("\n" + alumnos[f]);
            for (int c = 0; c < taboa[f].length; c++) {
                System.out.print(taboa[f][c] + " ");
            }
        }
    }

    public int[] mediaAlumnos(int[][] taboa, int[] mAlumnos) {
        int acu = 0;
        for (int c = 0; c < taboa.length; c++) {
            acu = 0;
            for (int f = 0; f < taboa.length; f++) {
                acu = acu + taboa[f][c];
                System.out.println("--" + acu);
                mAlumnos[c] = acu / mAlumnos.length;
            }
        }
        return mAlumnos;
    }

    public int[] mediaModulos(int[][] taboa, int[] mModulos) {
        int acu = 0;
        for (int c = 0; c < taboa.length; c++) {
            acu = 0;
            for (int f = 0; f < taboa.length; f++) {
                acu = acu + taboa[f][c];
                System.out.println("--" + acu);
                mModulos[c] = acu / mModulos.length;
            }
        }
        return mModulos;
    }
}
