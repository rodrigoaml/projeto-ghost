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
@Table (name = "participantes")
@NamedQueries({
    @NamedQuery(name = "Participantes.getAll", query = "SELECT a FROM Participantes a")})
public class Participantes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "idParticipantes")
    private int id;

    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Evento.class)
    @JoinColumn(name="Evento_idEvento")
    private Evento idEvento;
    
    @ManyToOne (fetch = FetchType.LAZY,targetEntity = Usuario.class)
    @JoinColumn(name="Usuario_idLogin")
    private Usuario idLogin;
    
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
        if (!(object instanceof Participantes)) {
            return false;
        }
        Participantes other = (Participantes) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.mack.pi2.jpa.Participantes[ id=" + id + " ]";
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

    /**
     * @return the idLogin
     */
    public Usuario getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(Usuario idLogin) {
        this.idLogin = idLogin;
    }

}
