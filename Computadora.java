public class Computadora extends DispositivoElectronicoDeConsumo{
    protected Microprocesador cpu;
    protected long ramMB;

    public Computadora(Microprocesador cpu, long ramMB){
        this.cpu = cpu;
        this.ramMB = ramMB;
    }

    public Microprocesador getCpu(){
        return this.cpu;
    }

    public void setCpu(Microprocesador cpuNueva){
        this.cpu = cpuNueva;
    }

    public long getRamMB(){
        return ramMB;
    }

    public void setRamMB(long nuevaRamMB){
        this.ramMB = nuevaRamMB;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
