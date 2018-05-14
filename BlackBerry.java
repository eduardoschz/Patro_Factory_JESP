package fes.aragon;

public class BlackBerry implements Telefonos {

    private int Ram;
    private String Procesador;
    public String name = Telefonos.BLACKBERRY;

    public BlackBerry(int Ram) {
        this.Ram = Ram;
    }

    public BlackBerry(String Procesador) {
        this.Procesador = Procesador;
        this.Ram = 2;
    }

}
