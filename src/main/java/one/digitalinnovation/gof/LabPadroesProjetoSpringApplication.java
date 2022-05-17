package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**  
 * Projeto Spring Boot gerado via Spring Initializr.
 * 	Selecionado as seguinte dependências:
 * 		- Spring Web
 * 		- Spring Data JPA
 * 		- H2 Database
 * 		- OpenFeig
 * 
 * @author Antonia
 *
 */

@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
