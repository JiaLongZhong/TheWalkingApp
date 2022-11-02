package walking.app.security;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends CrudRepository<User,Integer>{
		
		@Query("SELECT u FROM User u WHERE u.username = :username")
		public User getUserByUsername(@Param("username")String username);

}
