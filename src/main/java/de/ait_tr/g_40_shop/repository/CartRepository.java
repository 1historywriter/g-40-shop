package de.ait_tr.g_40_shop.repository;

import de.ait_tr.g_40_shop.domain.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}