package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import walking.app.entities.Manager;

@Repository
public interface ManagerDao extends JpaRepository<Manager,Integer> {
		
}
