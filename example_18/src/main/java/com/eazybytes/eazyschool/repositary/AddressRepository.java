package com.eazybytes.eazyschool.repositary;

import com.eazybytes.eazyschool.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
