public class SortAndSearch {

    //binary search
    public static int BinarySearch(String elementToFind, String[] vetor){
        SortStrings(vetor);
        int l = 0;
        int r = vetor.length - 1;
        while(l <= r){
            int m = (l + r) / 2;
            int c = elementToFind.compareTo(vetor[m]);


            if(c == 0){
                return m;
            }else if(c < 0){
                r = m - 1;
            }else{
                l = m + 1;

            }
        }
        return -1;
    }

    //bubble sort
    private static void SortStrings(String[] vetor){
        int n = vetor.length;
        String temp;

        for(int i=0; i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(vetor[j].compareTo(vetor[j+1]) > 0 ){
                    temp = vetor[j+1];
                    vetor[j+1] = vetor[j];
                    vetor[j] = temp;
                }
            }
        }
    }
}
