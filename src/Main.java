public class Main {
    public static void main(String[] args) {
        Funcionario primeiroFuncionario = new Funcionario();
        primeiroFuncionario.nome = ("Primeiro funcionario: Phil");
        primeiroFuncionario.rg = ("RG: 789423");
        primeiroFuncionario.telefone = ("Telefone: 47 923459878");
        primeiroFuncionario.endereco = ("Endereço: Santa Catarina");
        System.out.println(primeiroFuncionario.nome);
        System.out.println(primeiroFuncionario.rg);
        System.out.println(primeiroFuncionario.telefone);
        System.out.println(primeiroFuncionario.endereco);

        Funcionario segundoFuncionario = new Funcionario();
        segundoFuncionario.nome = ("Segundo Funcionario: Jessica");
        segundoFuncionario.rg = ("RG: 321654");
        segundoFuncionario.telefone = ("Telefone: 49 23164578");
        segundoFuncionario.endereco = ("Santa Catarina");
        System.out.println(segundoFuncionario.nome);
        System.out.println(primeiroFuncionario.rg);
        System.out.println(primeiroFuncionario.telefone);
        System.out.println(primeiroFuncionario.endereco);


    }
}