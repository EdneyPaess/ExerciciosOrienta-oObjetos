import javax.xml.validation.Validator;

//Exercicio 1: Criar uma classe Carro
/* class Carro {

} */
//Exercicio 2:Evolua o exercicio 1 e defina 3 atributos para sua classe "Carro": cor, modelo e capacidade do tanque.

/* String cor;
String modelo;
int capacidadeTanque;  */

//Exercicio 3: Evolua o conceito do exercício 2 e defina 1 método para calcular o valor total  para encher o tanque. Este deve receber como parâmetro o valor da gasolina.Faça também duas sobrecargas do construtor.

/* Obs: use a linguagem que gostar e siga as dicas
sobre como criar métodos
Obs: Crie métodos específicos para fornecer e
obter os valores dos atributos(set/get),
caso aplicável.  */

/* Exercicio 4: Evolua o conceito do exercício 3 criando objetos da classe "Carro". Use os métodos set/get, quando aplicáveis, para definir os valores dos atributos e exibir estes valores "get". Passe também uma mensagem para o cálculo do total pra encher o tanque.

Obs: use a linguagem que gostar e siga as dicas
sobre como criar métodos, atributos, etc.
Obs: use System.out, Console.WriteLine ou print
 */

class Carro {
    String cor;
    String modelo;
    int capacidadeTanque; 
    double valorGasolina;

    //construtor sem parametros, vazio
    Carro(){

    }

    //construtor com parametros, isto é, com sobrecarga pois sofreu alterações nos parametros, antes vazio agora "cheio"
    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor= cor;
        this.modelo= modelo;
        this.capacidadeTanque= capacidadeTanque;
    }

    // esse this é para diferenciar o que pertence a um objeto e o que não pertence a um objeto ex:
    //this.capacidadeTanque= capacidadeTanque;
    // isso acima quer dizer que estou pegando o atributo capacidadeTanque, e colocando nele o parametro de capacidadeTanque, se eu retiro o This desse codigo, iria dar erro pois eu estaria atribuindo o valor capacidadeTanque do parametro para ele mesmo, já com o this eu estou atribuindo valor do ATRIBUTO capacidadeTanque para o PARAMETRO capacidadeTanque.


    void setCor(String cor){ 
    this.cor= cor;
    }  //Aqui estamos usando Set, setCor para defenir/atribuir um valor ao atributo cor, e o método dele é void pois ele não precisa retornar nenhum valor, já que o intuito é apenas atribuir valor, guardar valor e não retornar. Todos os set são assim.

    String getcor(){ 
        return cor;
    } // já get é diferente é usado para retornar/obter o valor de uma propriedade, nesse caso é como se fosse "me fale a cor desse carro". Como ele retorna a cor do carro, não é usado void, usamos o tipo de dado de acordo com o tipo de dado da propriedade que queremos obter o retorno, nesse caso String

    void setModelo(String modelo){
        this.modelo= modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque=capacidadeTanque;
    } // então aqui com o set estou atribuindo valor

    int getcapacidadeTanque(){
        return capacidadeTanque;
    }// e aqui com o get estou pedindo pra ele me retornar o valor que atribiu com o set

    double totalValor(double valorGasolina){
        return valorGasolina * capacidadeTanque;
    }

}

