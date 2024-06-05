package de.ait_tr.g_40_shop.domain.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class ProductDto {

    private Long id;
    private String title;
    private BigDecimal price;

    private Long getId;


    @Override
    public String toString() {
        return String.format("Product: id - %d, title - %s, price - %s, active - %s",
                id, title, price);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductDto that = (ProductDto) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(price, that.price) && Objects.equals(getId, that.getId);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String getTitle() {
        return "";
    }

    public BigDecimal getPrice() {
        return null;
    }

    public void setTitle(String title) {
    }

    public void setPrice(BigDecimal price) {
    }
}
