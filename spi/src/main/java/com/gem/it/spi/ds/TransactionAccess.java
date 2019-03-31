package com.gem.it.spi.ds;

import com.gem.it.Transaction;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Megaraj on 21-03-2019.
 */
public interface TransactionAccess extends CrudRepository<Transaction, String> {
}
