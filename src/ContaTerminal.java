import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        ContaDadosUsuario novoUsuario = new ContaDadosUsuario();
        String resposta;

        Scanner abrirContaBancaria = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("Deseja Abri uma Conta? S/N");
        resposta = abrirContaBancaria.nextLine();
        novoUsuario.abirConta(resposta.charAt(0));


        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("-------------------------------------");
            Scanner novosDados = new Scanner(System.in);

            System.out.print("Digite seu nome: ");
            String nome = novosDados.nextLine();
            novoUsuario.setNome(nome);

            System.out.print("Digite sua idade: ");
            int idade = novosDados.nextInt();
            novoUsuario.setIdade(idade);


            novosDados.nextLine();

            System.out.println("Digite seu CPF: ");
            String cpf = novosDados.nextLine();
            novoUsuario.setCpf(cpf);

            System.out.println("Digite seu CEP: ");
            String cep = novosDados.nextLine();
            novoUsuario.setCep(cep);

            System.out.println("Digite seu número de celular: ");
            long numeroCelular = novosDados.nextLong();
            novoUsuario.setNumeroCelular(numeroCelular);

            novosDados.nextLine();

            System.out.println("Digite seu e-mail: ");
            String email = novosDados.nextLine();
            novoUsuario.setEmail(email);

            System.out.println("Digite o número da Agência: ");
            String agencia = novosDados.nextLine();
            novoUsuario.setAgencia(agencia);

            System.out.println("Digite o número da Conta: ");
            int numeroConta = novosDados.nextInt();
            novoUsuario.setNumero(numeroConta);

            System.out.print("Digite o valor do depósito inicial: R$");
            double depositoInicial = novosDados.nextDouble();
            novoUsuario.depositarSaldo(depositoInicial);


            System.out.println("Dados cadastrados com sucesso!");
            System.out.println("--------------Dados Bancários------------------");
            novoUsuario.dadosCliente();

            System.out.println("===========================");
            String retirarSaldo;
            Scanner retirada = new Scanner(System.in);
            System.out.println("Deseja retirar um valor? S/N");
            retirarSaldo = retirada.nextLine();
            if (retirarSaldo.equalsIgnoreCase("S")) {
                System.out.print("Digite o valor que deseja retirar: R$");
                double valorRetirada = novosDados.nextDouble();
                if (novoUsuario.retirarSaldo(valorRetirada)) {
                    System.out.println("Retirada realizada com sucesso!");
                }
                System.out.println("Saldo atual: R$" + novoUsuario.getSaldo());
            }else {
                System.out.println("Obrigado!");
            }
        }

    }
}
