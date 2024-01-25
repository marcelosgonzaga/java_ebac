package Mod16.src.br.com.gonzaga.adapter;

import java.io.File;

public class DropBoxAdapter implements PersistenciaAquivos{

    private DropBox dropBox;

    public DropBoxAdapter(DropBox dropbox) {
        this.dropBox =  dropbox;
    }
    @Override
    public void gravar(File file) {
        dropBox.download(file.getAbsolutePath());

    }

    @Override
    public File ler(String caminho) {
        DropBoxFile file = dropBox.download(caminho);
        return new File(file.getLocalPath());

    }
}
