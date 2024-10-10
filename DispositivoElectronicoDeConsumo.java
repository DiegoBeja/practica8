public class DispositivoElectronicoDeConsumo extends DispositivoElectronico{
    protected boolean encendido;

    public DispositivoElectronicoDeConsumo(String fabricante, String numeroSerie, String marca, String nombre, float costo, boolean encendido) {
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.encendido = encendido;  
    }
    
    public DispositivoElectronicoDeConsumo() {
        this.encendido = false;
    }


    public void encender(){
        encendido = true;
    }

    public void apagar(){
        encendido = false;
    }

    public boolean isEncendido(){
        return encendido;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
