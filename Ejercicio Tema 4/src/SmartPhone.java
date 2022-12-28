public class SmartPhone extends SmartDevices {

    int almacenamiento;
    int mpxCamaraTrasera;
    int mpxCamaraDelantera;

    public SmartPhone() {
    }

    public SmartPhone(String marca, String modelo, String color, int releaseYear, int almacenamiento, int mpxCamaraTrasera, int mpxCamaraDelantera, String oS) {
        super(marca, modelo, color, releaseYear, oS);
        this.almacenamiento = almacenamiento;
        this.mpxCamaraTrasera = mpxCamaraTrasera;
        this.mpxCamaraDelantera = mpxCamaraDelantera;
    }

    @Override
    public String toString() {
        return modelo
                + "\nMarca: " + marca
                + "\nColor: " + color
                + "\nAño de lanzamiento: " + releaseYear
                + "\nAlmacenamiento: " + almacenamiento
                + "\nMegaPixeles Camara Trasera: " + mpxCamaraTrasera
                + "\nMegaPixeles Camara Delantera: " + mpxCamaraDelantera
                + "\nSistema operativo: " + oS;
    }
}
