package com.fpl.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ConversationPK implements Serializable {
	private Long recepteur;
	private Long emetteur;
	public Long getRecepteur() {
		return recepteur;
	}
	public void setRecepteur(Long recepteur) {
		this.recepteur = recepteur;
	}
	public Long getEmetteur() {
		return emetteur;
	}
	public void setEmetteur(Long emetteur) {
		this.emetteur = emetteur;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emetteur == null) ? 0 : emetteur.hashCode());
		result = prime * result + ((recepteur == null) ? 0 : recepteur.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConversationPK other = (ConversationPK) obj;
		if (emetteur == null) {
			if (other.emetteur != null)
				return false;
		} else if (!emetteur.equals(other.emetteur))
			return false;
		if (recepteur == null) {
			if (other.recepteur != null)
				return false;
		} else if (!recepteur.equals(other.recepteur))
			return false;
		return true;
	}
	

}
