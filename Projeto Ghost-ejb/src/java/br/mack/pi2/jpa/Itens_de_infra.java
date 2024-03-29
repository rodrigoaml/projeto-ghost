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
@Entity 
@Table (name = "itens_de_infra")
@NamedQueries({
    @NamedQuery(name = "ItensInfra.getAll", query = "SELECT a FROM Itens_de_infra a")})
public class Itens_de_infra implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    @Column (name = "quantidade")
    private int qtd;

    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Infraestrutura.class)
    @JoinColumn(name="Infraestrutura_idEstrutura")
    private Infraestrutura idInfra;
    
    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Evento.class)
    @JoinColumn(name="Evento_idEvento")
    private Evento idEvento;
    
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
        if (!(object instanceof Itens_de_infra)) {
            return false;
        }
        Itens_de_infra other = (Itens_de_infra) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Itens_de_infra[ id=" + id + " ]";
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the idInfra
     */
    public Infraestrutura getIdInfra() {
        return idInfra;
    }

    /**
     * @param idInfra the idInfra to set
     */
    public void setIdInfra(Infraestrutura idInfra) {
        this.idInfra = idInfra;
    }

    /**
     * @return the idEvento
     */
    public Evento getIdEvento() {
        return idEvento;
    }

    /**
     * @param idEvento the idEvento to set
     */
    public void setIdEvento(Evento idEvento) {
        this.idEvento = idEvento;
    }
    
}
