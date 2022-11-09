package walking.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import walking.app.entities.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart,Integer> {
		
}