public class ComponenteElectronico extends DispositivoElectronico{
    protected DispositivoElectronico esParteDe;

    public ComponenteElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo, DispositivoElectronico esParteDe){
        super(fabricante, numeroSerie, marca, nombre, costo);
        this.esParteDe = esParteDe;
    }
    
    public void setEsParteDe(DispositivoElectronico esParteDeNuevo){
        esParteDe = esParteDeNuevo;
    }

    public DispositivoElectronico getEsParteDe(){
        return esParteDe;
    }

    @Override
    public String toString() {
        return "ComponenteElectronico{" +
                "nombre='" + nombre + '\'' +
                ", esParteDe=" + (esParteDe != null ? esParteDe.getNombre() : "N/A") +
                '}';
    }
}
