package parta.repositories;

import parta.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}
