package Mod17.src.generic;

public class GenericEntry <T, E> {

    private T data; //propriedade do tipo data

    private E codigo; //propriedade do tipo long

    public GenericEntry(T data, E codigo) {//construtor
        this.data = data;
        this.codigo = codigo;
    }

    public T getData() { return this.data;
    }

    public E getCodigo() { return this.codigo;
    }
}
