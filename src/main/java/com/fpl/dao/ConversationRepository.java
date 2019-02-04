package com.fpl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.fpl.entities.Conversation;

public interface ConversationRepository extends JpaRepository<Conversation, Long> {
	@Query("Select c from Conversation c where c.conversationPK.recepteur =:x and c.conversationPK.emetteur=:y")
	public Conversation getConversationByUser(@Param("y") Long idEmetteur,@Param("x") Long idRecepteur);
	
	


}
