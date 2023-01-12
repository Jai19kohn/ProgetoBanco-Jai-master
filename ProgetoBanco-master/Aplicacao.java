import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        String cren; //Criar e entrar
        String tipo;

        Funcoes funcoes = new Funcoes();
        Pf pfCriar = new Pf(funcoes.getNome(), 9999, 0, funcoes.getCpf());
        Pf pfEntrar = new Pf("Rosangela", 1234, 35240, "09072832457");
        Pj pjCriar = new Pj(funcoes.getNome(), 1111, 0, funcoes.getCnpj());
        Pj pjEntrar = new Pj("Lojita", 4321, 3563565, "13624635789");


        do {
            System.out.println("Digite se você é PF(Pessoa fisica) PJ(Pessoa juridica)");
            tipo = ler.next();
        } while (!tipo.equalsIgnoreCase("pf") && !tipo.equalsIgnoreCase("pj"));
        if ("PF".equalsIgnoreCase(tipo)) {
            do { System.out.println("voce deseja criar ou entrar em uma conta?");
            cren = ler.next();
            }while (!cren.equalsIgnoreCase("CRIAR") && !cren.equalsIgnoreCase("ENTRAR"));
            //Pf pf = null;
            if ("CRIAR".equalsIgnoreCase(cren)) {
                funcoes.criarContPf();
                System.out.println("O número da sua conta é " + pfCriar.getNumConta());
                do{
                    num = funcoes.numAcao();
                funcoes.acao(pfCriar, num);
                }while (num!=7);
            } else if ("ENTRAR".equalsIgnoreCase(cren)) {
                funcoes.confContPf();
                num = funcoes.numAcao();
                funcoes.acao(pfEntrar, num);
            }

        } else if ("PJ".equalsIgnoreCase(tipo)) {
            System.out.println("voce deseja criar ou entrar em uma conta");
            cren = ler.nextLine();
            if ("CRIAR".equalsIgnoreCase(cren)) {
                funcoes.criarContPj();
                System.out.println("O numero da conta é" + pjCriar.getNumConta());
                num = funcoes.numAcao();
                funcoes.acao(pjCriar,num);
            } else if ("ENTRAR".equalsIgnoreCase(cren)) {
                funcoes.confContPj();
                num = funcoes.numAcao();
                funcoes.acao(pjEntrar, num);
            }
        }
    }


}
