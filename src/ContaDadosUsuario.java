public class ContaDadosUsuario {
    private String nome;
    private int idade;
    private String cpf;
    private String cep;
    private long numeroCelular;
    private String email;
    private int numero;
    private String agencia;
    private ContaDadosValores contaValores;

    public ContaDadosUsuario() {
        contaValores = new ContaDadosValores();
    }


    public void abirConta(char resposta)throws Exception{

        if (resposta  != 'S' && resposta != 'N') {
            throw new IllegalAccessException("Apenas S ou N, sem inteiros ou outros caracteres!");
        }
        if (resposta == 'S'){
            System.out.println("Conta Aberta com sucesso!");
        }else {
            System.out.println("Finalizando por aqui. Obrigado pela atenção!");
            }
        }
    public void dadosCliente(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("CEP: " + getCep());
        System.out.println("Numero de Celular: " + getNumero());
        System.out.println("EMAIL: " + getEmail());
        System.out.println("Olá " + this.getNome() + ", obrigado por criar uma conta em nosso banco, sua Agência é " + getAgencia() + ", Conta: " + getNumero() + " e seu saldo " + getSaldo() + " já está disponível para saque");
    }

    public void depositarSaldo(double valor) {
        contaValores.depositar(valor);
    }

    public boolean retirarSaldo(double valor) {
        return contaValores.retirarSaldo(valor);
    }

    public double getSaldo() {
        return contaValores.getSaldo();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade)throws IllegalArgumentException {
        if (idade < 18 ){
            throw new IllegalArgumentException("Usuario menor de Idade!");

        }
        this.idade = idade;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCeluar(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
