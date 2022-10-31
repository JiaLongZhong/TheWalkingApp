package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import walking.app.entities.Feedback;

@Repository
public interface FeedbackDao extends JpaRepository<Feedback,Integer> {
		
}