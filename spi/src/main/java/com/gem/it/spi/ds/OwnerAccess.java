package com.gem.it.spi.ds;

import com.gem.it.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Megaraj on 20-03-2019.
 */
public interface OwnerAccess extends CrudRepository<Owner, String> {
}
