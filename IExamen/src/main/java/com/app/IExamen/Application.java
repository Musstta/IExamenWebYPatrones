package com.app.IExamen;

import com.app.IExamen.entidad.Concierto;
import com.app.IExamen.repositorio.ConciertoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

        @Autowired
        private ConciertoRepositorio repositorio;
        
    @Override
    public void run(String... args) throws Exception {
        /*
        Concierto concierto1 = new Concierto("Tool", 38000, "25/01/23", "Estadio Nacional", 35000);
        repositorio.save(concierto1);
        
        Concierto concierto2 = new Concierto("Foo Fighters", 32000, "21/10/22", "Estadio Nacional", 35000);
        repositorio.save(concierto2);
        */
}

}
