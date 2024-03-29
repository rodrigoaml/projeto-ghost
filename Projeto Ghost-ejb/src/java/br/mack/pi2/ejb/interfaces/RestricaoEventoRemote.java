/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.mack.pi2.ejb.interfaces;

import br.mack.pi2.jpa.Restricao_evento;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author michel.oh
 */
@Remote
public interface RestricaoEventoRemote {
    public boolean insereRestricao(Restricao_evento re);
    public boolean modificaRestricao(Restricao_evento re);
    public boolean deletaRestricao(Restricao_evento re);
    public Restricao_evento getRestricao(int id);
    public List<Restricao_evento> getAllRestricao();
}
