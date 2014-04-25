/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.jpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author MichelOh
 */
@Entity (name = "itens_local")
public class Itens_Local implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idItens_Local")
    private int id;
    
    @Column (name = "nome_item", length = 50)
    private String nomeItem;
    @Column (name = "desc_item", length = 100)
    private String descItem;
    @Column (name = "quantidade")
    private int qtd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itens_Local)) {
            return false;
        }
        Itens_Local other = (Itens_Local) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Itens_Local[ id=" + id + " ]";
    }
    
}
