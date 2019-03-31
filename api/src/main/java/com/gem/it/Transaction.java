package com.gem.it;

import com.gem.it.traits.HasIdentity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Megaraj on 21-03-2019.
 */
@Entity
@Table(name = "it_transaction")
public class Transaction implements HasIdentity {
    @Id
    private final String id;
    private final TransactionType transactionType;
    private final long date;
    private final long amount;
    private final TransactionCategory category;


    public Transaction(final String id, final TransactionType transactionType, final long date, final long amount, final TransactionCategory category) {
        this.id = id;
        this.transactionType = transactionType;
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public long getDate() {
        return date;
    }

    public long getAmount() {
        return amount;
    }

    public TransactionCategory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", transactionType=" + transactionType +
                ", date=" + date +
                ", amount=" + amount +
                ", category=" + category +
                '}';
    }

}
