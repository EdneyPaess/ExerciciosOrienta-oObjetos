class RodarAplicacao{

  public static void main(String[] args) {
    //Criando objeto carro usando o construtor Carro() vazio sem parametros
    Carro objetoCarro= new Carro();

    //Setando valor aos métodos, isto é, atribuindo valor aos métodos
    objetoCarro.setCor("azul");
    objetoCarro.setModelo("SUV");
    objetoCarro.setCapacidadeTanque(70);

    //Chamando os valores dos métodos com get e imprimindo-os
    System.out.println(objetoCarro.getModelo());
    System.out.println(objetoCarro.getcor());
    System.out.println(objetoCarro.getcapacidadeTanque());
    System.out.println(objetoCarro.totalValor(5.70));

    //Aqui criamos um objeto com os parametros do construor preenchidos, isto é, passando valores para o construtor utilizando a sobrecarga do construtor.

    //Dessa forma não precisamos usar o set, pois os valores já foi passado para o construtor, só usamos os get para imprimir o valor
    Carro objetoCarro2 = new Carro("Cinza", "SUV", 66);

    System.out.println(objetoCarro.getModelo());
    System.out.println(objetoCarro.getcor());
    System.out.println(objetoCarro.getcapacidadeTanque());
    System.out.println(objetoCarro.totalValor(5.70));
    }
}