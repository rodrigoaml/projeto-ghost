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
@Table (name = "permissao")
@NamedQueries({
    @NamedQuery(name = "Permissao.getAll", query = "SELECT a FROM Permissao a")})
public class Permissao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "tipo_user")
    private int id;
    
    @Column (name = "desc_user", length = 20)
    private String descUser;
    
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
        if (!(object instanceof Permissao)) {
            return false;
        }
        Permissao other = (Permissao) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Permissao[ id=" + id + " ]";
    }

    /**
     * @return the descUser
     */
    public String getDescUser() {
        return descUser;
    }

    /**
     * @param descUser the descUser to set
     */
    public void setDescUser(String descUser) {
        this.descUser = descUser;
    }
    
}
