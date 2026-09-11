public class Moto extends Veiculo {
    private double cilindrada;

    public Moto(String marca,int ano,double cilindrada){
        super(marca, ano);
        this.cilindrada=cilindrada;
    }

    public double getCilindrada(){
        return cilindrada;
    }

    public void setCilindrada(double cilindrada){
        this.cilindrada=cilindrada;
    
}
    public void exibirInfo(){
        System.out.println("Cilindrada: " + cilindrada);
    }
}


