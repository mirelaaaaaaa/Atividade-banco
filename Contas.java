public class Contas {

    //atributos

    int numero;
    String titular;
    double saldo;
    

    //CONSTRUTOR
    public Contas (int numero, String titular, double saldo){
     this.numero = numero;
     this.titular = titular;
     this.saldo = saldo;
     }

     public double getSaldo(){
        return saldo;                                     
     }

    //métodos
    public void depositar(double valor){
        System.out.println("Adicionando valor ao saldo" );
    }
    public void sacar(double valor ){
        if(valor <= saldo){
        double subtra = valor - saldo;
        System.out.println(subtra);
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
     public double getVerificar_saldo(){
        return saldo;
    }
}
