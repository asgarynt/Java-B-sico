public class SmartWatch extends SmartDevices{

    String conectividad;
    boolean monitorSuenio;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String color, int releaseYear, String conectividad, boolean monitorSuenio, String oS) {
        super(marca, modelo, color, releaseYear, oS);
        this.conectividad = conectividad;
        this.monitorSuenio = monitorSuenio;
    }

    @Override
    public String toString() {
        return modelo
                + "\nMarca: " + marca
                + "\nColor: " + color
                + "\nAño de lanzamiento: " + releaseYear
                + "\nConectividad: " + conectividad
                + "\nMonitor de sueño: " + monitorSuenio
                + "\nSistema operativo: " + oS
                ;
    }
}
