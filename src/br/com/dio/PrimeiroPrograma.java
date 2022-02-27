package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);


        Livro livro = new Livro("O Problemas dos 3 corpos",300);
        System.out.println(livro);

        /*int a = 2;
        int b = 3;
        System.out.println("Hello World! " + (a+b));*/

    }
}


class Livro {

    private string nome;
    private integer numPaginas;


    public Livro(string nome, integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }


    public string getNome() {
        return nome;
    }

    public void setNome(string nome) {
        this.nome = nome;
    }

    public integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome=" + nome +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
