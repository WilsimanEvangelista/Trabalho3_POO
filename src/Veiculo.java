public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFab;
    protected int mesFab;
    protected int anoMod;
    protected double valor;

    public Veiculo(String marca, String modelo, int anoFab, int mesFab, int anoMod, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.mesFab = mesFab;
        this.anoMod = anoMod;
        this.valor = valor;
    }

    public double getValor() {
        return this.valor;
    }

    public abstract int getAutonomia();

    public String getMarca() {
        return this.marca;
    }
    
    public String getModelo() {
        return this.modelo;
    }
    
    public int getAnoFab() {
        return this.anoFab;
    }
    
    public int getMesFab() {
        return this.mesFab;
    }
    
    public int getAnoMod() {
        return this.anoMod;
    }

    public String toString(){
        return marca + " " + modelo + " " + anoFab + "/" + anoMod +
                " - Autonomia: " +  getAutonomia() + ".0km";
    }

}