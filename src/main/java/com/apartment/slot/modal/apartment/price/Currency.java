package com.apartment.slot.modal.apartment.price;

import com.apartment.slot.modal.base.AbstractConstantEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "currency")
@SuperBuilder
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(
                name = "Currency.findByValue",
                query = "SELECT c FROM Currency c WHERE c.value = : value"
        ),
        @NamedQuery(
                name = "Currency.all",
                query = "SELECT c FROM Currency c"
        )
})
public class Currency extends AbstractConstantEntity {
}
