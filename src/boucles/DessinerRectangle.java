package boucles;

public class DessinerRectangle {

    public static void main(String[] args) {
        DessinerRectangle app = new DessinerRectangle();
        app.dessiner(5, 3);
    }

    public void dessiner(int longueur, int largeur){

        for ( int i = 0; i < largeur; i++){
            for ( int j = 0; j < longueur; j++){
                System.out.print("0");
            }
            System.out.println();
        }

    }

}


