package Mod16.src.br.com.gonzaga.adapter;

import java.io.File;

public interface PersistenciaAquivos {
    public void gravar(File file);

    public File ler(String caminho);
}
