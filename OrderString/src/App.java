public class App {
    public static void main(String[] args) throws Exception {
        // iniciar teste
        teste();
    }

    private static void teste(){
        // definir array
        String[] vetor ={"claudio", "rodrigo", "armando", "zafira", "plinio", "roberto", "alexandre", "pablo", "kelvin", "carlos"};

        // mostrar array sem ordenar
        System.out.println("Vetor sem ordenar: ");
        System.out.println(ShowArray(vetor));

        // ordenar e buscar valores
        int resultExistente = SortAndSearch.BinarySearch("zafira", vetor); //valor existente
        int resultNaoExistente = SortAndSearch.BinarySearch("paulo", vetor); //valor não existente
        
        //mostrar array ordenado
        System.out.println("\nVetor ordenado: ");
        System.out.println(ShowArray(vetor));

        //mostar resultado de valor existente no vetor
        System.out.println("\nResultado da busca de valor existente: \n");
        System.out.println((resultExistente != -1)?"Encontrado":"Não encontrado");
        
        //mostar resultado de valor não existente no vetor
        System.out.println("\nResultado da busca de valor não existente: \n");
        System.out.println((resultNaoExistente != -1)?"Encontrado":"Não encontrado");
    }

    //metodo para mostrar array
    private static String ShowArray(String[] array){
        String content = "";
        int i =0;
        for (String a : array) {
            content += "["+i+"] = " + a + ", ";
            i++;
        }
        return content;
    }
}
