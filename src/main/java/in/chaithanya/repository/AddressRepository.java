package in.chaithanya.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chaithanya.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable> {

}
