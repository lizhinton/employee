package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import beans.employee;

@Repository
public interface employeeRepository extends JpaRepository<employee, Long> {
	
}
