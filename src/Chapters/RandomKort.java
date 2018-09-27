package Chapters;

public class RandomKort {
    public static void main(String[] args) {


        int randomTal = (int) (System.currentTimeMillis() % 13 + 1);
        int color = (int) (System.currentTimeMillis() % 4 + 1);
        String Kort = "hej";
        String Kuloer = "hhej2" ;


        switch (randomTal) {
            case 1:
                Kort = "Es";
                break;
            case 2:
                Kort = "To";
                break;
            case 3:
                Kort = "Tre";
                break;
            case 4:
                Kort = "Fire";
                break;
            case 5:
                Kort = "Fem";
                break;
            case 6:
                Kort = "Seks";
                break;
            case 7:
                Kort = "Syv";
                break;
            case 8:
                Kort = "Otte";
                break;
            case 9:
                Kort = "Ni";
                break;
            case 10:
                Kort = "Ti";
                break;
            case 11:
                Kort = "Knægt";
                break;
            case 12:
                Kort = "Dronning";
                break;
            case 13:
                Kort = "Konge";
                break;

            default:
                System.out.println("Du har taget et tal uden for 1-13!!! FEJL I KODEN");
        }

        switch (color) {

            case 1:
                Kuloer = "Hjerter";
                break;
            case 2:
                Kuloer = "Klør";
                break;
            case 3:
                Kuloer = "Ruder";
                break;
            case 4:
                Kuloer = "Spar";
                break;

            default:
                System.out.println("Du har valgt en kulør mellem 1 og 4! Fejl i koden!");
        }

        System.out.println(Kort + " " + Kuloer);
    }
}
