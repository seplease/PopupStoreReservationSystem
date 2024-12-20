package com.westsomsom.finalproject.store.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "Store")
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int storeId;

    @Column(nullable = false, length = 20)
    private String storeName;

    @Column(nullable = false, length = 100)
    private String storeBio;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate finDate;

    @Column(nullable = false, length = 20)
    private String storeCategory;

    @Column(nullable = false, length = 100)
    private String storeLoc;

    @Builder
    public Store(String storeName, String storeBio, LocalDate startDate, LocalDate finDate, String storeCategory, String storeLoc) {
        this.storeName = storeName;
        this.storeBio = storeBio;
        this.startDate = startDate;
        this.finDate = finDate;
        this.storeCategory = storeCategory;
        this.storeLoc = storeLoc;
    }
}
