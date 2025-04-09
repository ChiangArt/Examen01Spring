package pe.edu.cibertec.Examen01.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int staffId;
    private String firstName;
    private String lastName;
    private int addressId;
    private byte[] picture;  // BLOB
    private String email;
    private int storeId;
    private boolean active;
    private String username;
    private String password;
    private Timestamp lastUpdate;
}
