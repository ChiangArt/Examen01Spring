package pe.edu.cibertec.Examen01.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HikariStConfig {

    @Value("${DB_SAKILA_URL}")

    private String dbSakilaUrl;

    @Value("${DB_SAKILA_USER}")

    private String dbSakilaUser;

    @Value("${DB_SAKILA_PASS}")

    private String dbSakilaPass;

    @Value("${DB_SAKILA_DRIVER}")

    private String dbSakilaDriver;



    @Bean

    public HikariDataSource hikariDataSource() {



        HikariConfig config = new HikariConfig();



        /**

         * Configurar propiedad de conexion a BD

         */

        config.setJdbcUrl(dbSakilaUrl);

        config.setUsername(dbSakilaUser);

        config.setPassword(dbSakilaPass);

        config.setDriverClassName(dbSakilaDriver);



        /**

         * Configurar propiedades del pool de HikariCP

         * - MaximumPoolSize: Máximo # de conexiones del pool.

         * - MinimumIdle: Mínimo # de conexiones inactivas del pool.

         * - IdleTimeout: Tiempo máximo de espera para

         *     eliminar una conexión inactiva.

         * - ConnectionTimeout: Tiempo máximo de espera

         *     para conectarse a la BD.

         */

        config.setMaximumPoolSize(6);

        config.setMinimumIdle(2);

        config.setIdleTimeout(120000);

        config.setConnectionTimeout(60000);



        System.out.println("###### HikariCP initialized ######");

        return new HikariDataSource(config);



    }
}
