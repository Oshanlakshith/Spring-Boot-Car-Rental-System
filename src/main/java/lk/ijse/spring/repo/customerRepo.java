package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface customerRepo extends JpaRepository<Customer,String> {
}