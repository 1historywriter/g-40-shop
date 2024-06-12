package de.ait_tr.g_40_shop.controller;

import de.ait_tr.g_40_shop.domain.entity.Cart;
import de.ait_tr.g_40_shop.service.interfaces.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carts")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping
    public Cart saveCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }

    @GetMapping("/{id}")
    public Cart getCartById(@PathVariable Long id) {
        return cartService.getCartById(id);
    }
}