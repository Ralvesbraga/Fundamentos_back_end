public class Principal {
    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); //Com o construtor, terá que passar todas as informações por ele
        //Agora com private, terá que usar os métodos de acessos para obter as informações
        // p1.name = "Rafael";
        // p1.email = "alves.rafael@sou.ufac.br";
        // System.out.println("Nome:" + p1.name);
        // System.out.println("Email:" + p1.email);
        
        Pessoa p1 = new Pessoa("Rafael", "alves.rafael@sou.ufac.br", "111.111.111-XX");

        p1.setName("JUBILEU");
        System.out.println("Nome:" + p1.getName());
        System.out.println("Email:" + p1.getEmail());
        System.out.println("CPF:" + p1.getCpf());

        Aluno a1 =  new Aluno();

        a1.setName("Irineu");
        a1.setEmail("irineu@sou.ufac");
        a1.setMatricula(20224);
        

    }
}
