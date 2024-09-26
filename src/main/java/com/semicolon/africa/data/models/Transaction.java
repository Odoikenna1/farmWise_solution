package com.semicolon.africa.data.models;

import com.semicolon.africa.data.type.PaymentMethod;
import com.semicolon.africa.data.type.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Data
public class Transaction {
    @Id
    private Long id;
    private TransactionType transactionType;
    private String description;
    private Double amount;
    private PaymentMethod paymentMethod;
    private LocalDateTime timestamp;
}
