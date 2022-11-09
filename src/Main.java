public class Main {
    public static void main(String[] args) {
        int pocetopakovani = 0;
        int fizz = 3;
        int buzz = 5;


        while (pocetopakovani < 101) {

            if (fizz == pocetopakovani && buzz == pocetopakovani){
                System.out.println("FizzBuzz");
                fizz += 3;
                buzz += 5;
                pocetopakovani ++;

            } else if (buzz == pocetopakovani) {
                System.out.println("buzz");
               buzz += 5;
                pocetopakovani ++;

            } else if (fizz == pocetopakovani) {
                System.out.println("fizz");
                fizz += 3;
                pocetopakovani ++;

            }
            else {
                System.out.println(pocetopakovani);
                pocetopakovani ++;


            }




        }


    }
}