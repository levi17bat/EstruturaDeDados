package Entities;

import Others.SEXO;

public class Person {

    private String nome;
    private SEXO sexo;
    private Person proxima;

//constructor
    public Person(String nome, SEXO sexo) {
        this.nome = nome;
        this.sexo = sexo;
        this.proxima = null;
    }

    public Person(String nome, SEXO sexo, Person proxima) {
        this.nome = nome;
        this.sexo = sexo;
        this.proxima = null;
        this.proxima = proxima;
    }

    public Person() {
    }

//end constructor
//get and set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    public Person getProxima() {
        return proxima;
    }

    public void setProxima(Person proxima) {
        this.proxima = proxima;
    }
//end get and set

//others
    @Override
    public String toString() {
        if (this.proxima != null) {
            return " - Person - "
                    + "\nName = " + this.nome
                    + "\nSex  = " + this.sexo
                    + "\nNext = " + this.proxima.getNome();
        } else {
            return " - Person - "
                    + "\nName = " + this.nome
                    + "\nSex  = " + this.sexo+
                      "\nNext = "+null;
        }
    }
    //end others

}
