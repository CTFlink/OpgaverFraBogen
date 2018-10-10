package Chapters;

public class Arrays {
    public static void main(String[] args) {



        //Her er lidt spas med arrays

        int marks[] = {1,2,3,4,5};

        //Her starter counteren på 0, printer derefter tallet fra arrayen ud, svarende til array pladsen som counteren er nået til
        // derefter gør den counteren 1 større
        for(int counter = 0; counter < marks.length ; counter++){

            System.out.println(marks[counter]);
        }
        String navne[] = {"Christian","Dan",};
        System.out.println(navne[1] + navne[0]);


        for (int n=0; n<100; n++) {

            int i = 100;
            int start = 2;
            System.out.print(i+ ((i-(start-1))%10==0 ? "\n" : " "));

            int pentagolNumber = n * (3 * n - 1) / 2;
        }

    }
    }


