package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walking.app.entities.Reply;

@Repository
public interface ReplyDao extends JpaRepository<Reply,Integer> {
	
}
