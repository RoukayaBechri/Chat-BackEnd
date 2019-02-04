package com.fpl.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
public class Conversation implements Serializable {
	@EmbeddedId
	ConversationPK conversationPK;
	
	
	

	public ConversationPK getConversationPK() {
		return conversationPK;
	}

	public void setConversationPK(ConversationPK conversationPK) {
		this.conversationPK = conversationPK;
	}

	public User getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(User emetteur) {
		this.emetteur = emetteur;
	}

	public User getRecepteur() {
		return recepteur;
	}

	public void setRecepteur(User recepteur) {
		this.recepteur = recepteur;
	}



	@ManyToOne 
    @JoinColumn(name="emetteur",referencedColumnName="id",insertable=false,updatable=false)
    private User emetteur ;
    
    @ManyToOne 
    @JoinColumn(name="recepteur",referencedColumnName="id",insertable=false,updatable=false)
    private User recepteur;
    
	


	public Conversation() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

	
	

}
