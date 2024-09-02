public class Livro {
    String titulo;
    int numeroPaginas;
    String genero;
    int anoPublicacao;
    double preco;
    String autor;

        void cadastrar(){
        System.out.println("Cadastrando o livro");
    }
        double calcFrete(String cep){
        double frete = 0;
        System.out.println(" Calculando o frete para o CEP "+ cep);
        return frete;
    }
    void vender () {
         System.out.printf(" Vendendo livro por, this.preco");
    }
    String trocar (){
        return "Livro trocado!";

    }
}

    
}

    

    }





}