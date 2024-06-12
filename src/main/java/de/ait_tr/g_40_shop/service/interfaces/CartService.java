package de.ait_tr.g_40_shop.service.interfaces;

import de.ait_tr.g_40_shop.domain.entity.Cart;

public interface CartService {
    Cart saveCart(Cart cart);
    Cart getCartById(Long id);
}