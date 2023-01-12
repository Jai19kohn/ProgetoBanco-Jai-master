import java.util.Scanner;

public class Funcoes {
    Scanner ler = new Scanner(System.in);

    private String numeroC;
    private String nome;
    private String cpf;
    private String cnpj;
    private String numCPF;
    private String numCNPJ;

    public int numAcao() {
        int num;
        Scanner ler = new Scanner(System.in);
        do {
            System.out.println("\nDigite qual função voce deseja \n 1 Sacar \n 2 Depositar \n 3 transferir\n " +
                    "4 Consultar saldo\n 5 Investir \n 6 Conta polpança \n 7 encerrar visita");
            num = ler.nextInt();
        } while (num>6);
        return num;
    }
    public void acao(Pessoa obj, int num) {
        Scanner sc = new Scanner(System.in);
        switch (num) {
            case 1 -> {
                double val;
                System.out.println("Digite a quntidade que voce quer sacar");
                val = sc.nextDouble();
                obj.sacar(val);
            }
            case 2 -> {
                double val2;
                System.out.println("digite a quntidade que voce quer depositar");
                val2 = sc.nextDouble();
                obj.depositar(val2);
                System.out.println("Seu saldo é" + obj.getSaldo());
            }
            case 3 -> {
                double val3;
                System.out.println("Digite a quntidade que voce quer transferir");
                val3 = sc.nextDouble();
                obj.transferir(val3);
            }
            case 4 -> System.out.println("Seu saldo é " + obj.mostrarSaldo());
            case 5 -> {
                double val5;
                System.out.println("Digite a quantidade que voce quer investir");
                val5 = sc.nextDouble();
                obj.investir(val5);
            }
            case 6 -> {
                double val6;
                if (obj instanceof Pf) {
                    System.out.println("Digite a quantia que voce quer colocar na sua conta poupança");
                    val6 = sc.nextDouble();
                    obj.contaPoupanca(val6);
                    System.out.println("voce colocou" + val6 + "na sua popança");

                } else {
                    System.out.println("Pj nao abre pupança");
                }
            }
            case 7 -> {
                System.out.println("Programa finalizado!");
            }
            default -> {numAcao();}
        }
    }

    public void criarContPf(){
        System.out.println("Digite seu nome");
        nome = ler.nextLine();
        System.out.println("Digite seu cpf");
        cpf = ler.nextLine();
    }
    public void criarContPj(){
        System.out.println("digite o nome da sua empresa");
        nome = ler.nextLine();
        System.out.println("Digite o CNPJ");
        cnpj = ler.nextLine();
    }

    public void confContPf(){
        do {
            System.out.println("Digite o número da conta");
            numeroC = ler.nextLine();
        } while (!numeroC.equalsIgnoreCase("1234"));
        do {
            System.out.println("Digite o seu cpf: ");
            numCPF = ler.nextLine();
        } while (!numCPF.equalsIgnoreCase("09072832457"));
    }

    public void confContPj() {
        do {
            System.out.println("Digite o número da conta");
            numeroC = ler.nextLine();
        } while (!numeroC.equalsIgnoreCase("4321"));
        do {
            System.out.println("Digite o seu cnpj: ");
            numCNPJ = ler.nextLine();
        } while (!numCNPJ.equalsIgnoreCase("13624635789"));
    }

    public String getNumeroC() {
        return numeroC;
    }
    public void setNumeroC(String numeroC) {
        this.numeroC = numeroC;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNumCPF() {
        return numCPF;
    }
    public void setNumCPF(String numCPF) {
        this.numCPF = numCPF;
    }
    public String getNumCNPJ() {
        return numCNPJ;
    }
    public void setNumCNPJ(String numCNPJ) {
        this.numCNPJ = numCNPJ;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
