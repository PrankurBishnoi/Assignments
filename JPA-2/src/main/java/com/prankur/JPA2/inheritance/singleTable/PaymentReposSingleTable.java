package com.prankur.JPA2.inheritance.singleTable;

import com.prankur.JPA2.inheritance.singleTable.PaymentSingleTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentReposSingleTable extends CrudRepository<PaymentSingleTable,Integer>
{

}
