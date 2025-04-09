package pe.edu.cibertec.Examen01.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffId;
    private String firstName;
    private String lastName;
    private Integer addressId;
    private String picture;
    private String email;
    private Integer storeId;
    private Integer active;
    private String username;
    private String password;
    private Date lastUpdate;
}
