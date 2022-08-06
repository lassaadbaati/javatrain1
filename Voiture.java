public class Voiture {
    public int serie;
    public String marque; 
    public static void main(String[] args){
        int x ;
        x = 20;
        System.out.println(" test reussi");
        System.out.println(" test reussi avec X = "+x);

        // Creer un objet Voiture BMW serie 3
        Voiture v1 = new Voiture();
        v1.serie = 3;
        v1.marque = "BMW"; 
        System.out.println("La voiture v1 serie : " + v1.serie);
        System.out.println("La voiture v1 Marque : " + v1.marque);
    }


}
