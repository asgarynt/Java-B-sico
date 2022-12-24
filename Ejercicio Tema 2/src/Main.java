public class Main {
    public static void main(String[] args) {

        double price = precioIVA(200);

        System.out.println(price);

        price = precioIVA(180);

        System.out.println(price);
    }



    static double precioIVA(double precio){
        double iva = .15;
        return precio+(precio*iva);

    }
}