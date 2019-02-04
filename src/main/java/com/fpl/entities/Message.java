package com.fpl.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Message implements Serializable{
		
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	    private Long id;
		private String contenu;
		    
	    @Temporal(TemporalType.DATE)
		private Date dateMessage;

	    @ManyToOne
	    private Conversation conversation;
	    
		public Conversation getConversation() {
			return conversation;
		}

		public void setConversation(Conversation conversation) {
			this.conversation = conversation;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getContenu() {
			return contenu;
		}

		public void setContenu(String contenu) {
			this.contenu = contenu;
		}

		public Date getDateMessage() {
			return dateMessage;
		}

		public void setDateMessage(Date dateMessage) {
			this.dateMessage = dateMessage;
		}

		public Message() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Message(String contenu, Date dateMessage) {
			super();
			this.contenu = contenu;
			this.dateMessage = dateMessage;
		}
		
		
}
