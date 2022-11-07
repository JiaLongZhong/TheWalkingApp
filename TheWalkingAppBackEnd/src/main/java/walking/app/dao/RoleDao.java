package walking.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import walking.app.role.Role;
import walking.app.role.ERole;

@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
