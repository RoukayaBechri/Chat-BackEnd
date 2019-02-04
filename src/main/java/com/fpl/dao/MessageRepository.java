package com.fpl.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.fpl.entities.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
	@Query("Select m from Message m where m.conversation.conversationPK.recepteur= :x and m.conversation.conversationPK.emetteur= :y ")
	public List<Message> getMsgByConversation(@Param("y") Long idEmetteur, @Param("x") Long idRecepteur);

	@Query("Select m from Message m where((m.conversation.conversationPK.recepteur= :x and m.conversation.conversationPK.emetteur= :y) or (m.conversation.conversationPK.recepteur= :y and m.conversation.conversationPK.emetteur= :x ))")
	public List<Message> getAllMsgByConversation(@Param("y") Long idEmetteur, @Param("x") Long idRecepteur);

	
	

}
