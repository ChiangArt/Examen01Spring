package pe.edu.cibertec.Examen01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.Examen01.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer> {
}
