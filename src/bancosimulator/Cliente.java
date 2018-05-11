package bancosimulator;

class Cliente{
    String nome;
    String sobrenome;
    String cpf;
    
    Cliente(String nome){//, String sobrenome, String cpf){
        this.nome = nome;
        //this.sobrenome = sobrenome;
        //this.cpf = cpf;
    }
    
    public static Cliente pedro = new Cliente("Pedro");//,"Sergio","Vaz");

    Cliente() {
    }
}
