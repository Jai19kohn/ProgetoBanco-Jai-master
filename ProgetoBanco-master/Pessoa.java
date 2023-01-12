import java.util.Scanner;

public class Pessoa {
    private String nome;
    private int numConta;
    private double saldo;
    private String tConta;
    public Pessoa(String nome, int numConta, double saldo ) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;

    }public Pessoa(String nome, int numConta, double saldo, String tConta) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
        this.tConta = tConta;
    }
    public Pessoa() {
    }

    public String gettConta() {
        return tConta;
    }

    public void settConta(String tConta) {
        this.tConta = tConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double sacar(double val){

        if(val > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val;
           saldo = saldoAtual;

            System.out.println("Seu saldo é: " + saldo);
        }
        return saldo;
    }
    public double depositar(double val){
        return saldo += val;
    }
    public double transferir(double val3){
        if(val3 > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val3;
            saldo = saldoAtual;
            System.out.println("A quantidade transferida é de " + val3 + "e seu saldo da conta é " + saldo);
        }
        return saldo;
    }
    public double mostrarSaldo(){
        return getSaldo();
    }
    public double investir(double val5){
        if(val5 > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val5;
            saldo = saldoAtual;
            System.out.println("a quntidade investida é " + val5 + "e seu saldo é de " + saldo);
        }
        return saldo;
    }
    public double contaPoupanca(double val6){
        if(val6 > saldo){
            System.out.println("Seu saldo é insuficiente");
        } else{
            double saldoAtual = saldo -= val6;
            saldo = saldoAtual;
            System.out.println("a quntidade investida é" + val6 + "e seu saldo é de " + saldo);
        }
        return saldo;
    }

}
