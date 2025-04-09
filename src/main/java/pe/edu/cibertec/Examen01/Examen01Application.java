package pe.edu.cibertec.Examen01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.Examen01.entity.Staff;
import pe.edu.cibertec.Examen01.repository.StaffRepository;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@SpringBootApplication
public class Examen01Application implements CommandLineRunner {

	@Autowired
	StaffRepository staffRepository;

	public static void main(String[] args) {SpringApplication.run(Examen01Application.class, args);}

	@Override
	public void run(String... args) throws Exception {


		//Listar todos los elementos
		Iterable<Staff> staff = staffRepository.findAll();
		staff.forEach(System.out::println);


		//Listar un elemento
		Optional<Staff> staff1 = staffRepository.findById(2);
		staff1.ifPresentOrElse(
				(staff3) -> {
					System.out.println(staff3);
				},
				() -> {
					System.out.println("Staff no found");
				}
		);


		//Registrar un elemento
		Staff staffCreate = new Staff(null, "Bryan", "Chiang", 1,"picture/12",
				"bryan@cibertec.edu.com", 1, 1, "bryan_Chi", "password12354", new Date());

		staffRepository.save(staffCreate);


		 //Actualizar los datos de un elementos
		Integer id = 4;
		Optional<Staff> optionalStaff = staffRepository.findById(id);

		if (optionalStaff.isPresent()) {
			Staff staff123 = optionalStaff.get();
			staff.setFirstName("Jose");
			staff.setLastName("Manuel");
			staff.setEmail("jose.manuel@cibertec.com");

			staffRepository.save(staff123);
			System.out.println("Staff actualizado.");
		} else {
			System.out.println("No se encontró el ID " + id);
		}



		//Eliminar un elemento
		List<Integer> ids = List.of(1);
		ids.stream().filter(id -> staffRepository.existsById(id)).collect(Collectors.toList());

		if(!ids.isEmpty()){
			staffRepository.deleteAllById(ids);
		}else{
			System.out.println("No staff found");
		}
	}
}
