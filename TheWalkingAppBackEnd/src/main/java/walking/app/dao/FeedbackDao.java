package walking.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import walking.app.entities.Feedback;

@Repository
public interface FeedbackDao extends JpaRepository<Feedback,Integer> {
	
	@Query(value="select * from feedback where feedbackid=?1", nativeQuery =true)
	public Feedback findByFeedbackID(int fid);
	
	@Query(value="select * from feedback where exists(select productID from product where product.productID= feedback.productID and branchID=?1)", nativeQuery =true)
	public List<Feedback> findAllFeedbackByBranchID(int bid);
}