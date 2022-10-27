package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import walking.app.entities.Branches;

@Repository
public interface BranchDao extends JpaRepository<Branches,Integer> {
		
}

