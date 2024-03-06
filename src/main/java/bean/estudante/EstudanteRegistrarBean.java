/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean.estudante;

import javax.inject.Named;
import java.io.Serializable;

/**
 *
 * @author ygor
 */

@Named
public class EstudanteRegistrarBean implements Serializable {
    private String nome = "William";
    private String sobrenome = "Suane";
    private double nota1;
    private double nota2;
    private double nota3;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
}
