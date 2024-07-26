public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 2;
        
        String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

    }
    
}

// Exemplo 01
///int nota = 6;

///if(nota >= 7)
///System.out.println("Aprovado");

///else if (nota >= 5 && nota < 7)
///System.out.println("Prova de Recuperação");

///else
///System.out.println("Reprovado");

/// Exemplo 2
//int nota = 6;
        
//String resultado = nota >=7 ? "Aprovado" : "Reprovado";

//System.out.println(resultado);

///Exemplo 3
//int nota = 2;
        
//String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";

//System.out.println(resultado);