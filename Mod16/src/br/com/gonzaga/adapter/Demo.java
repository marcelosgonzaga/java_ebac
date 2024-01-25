package Mod16.src.br.com.gonzaga.adapter;

import java.io.File;

public class Demo {

    public static void main(String[] args) {
        String file = "teste.txt";
        DropBox drop = new DropBox();
        PersistenciaAquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));

    }
}
