package com.systemzarzadzaniaerphrm;



import com.systemzarzadzaniaerphrm.DBconfig.DBrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemZarzadzaniaErphrMv2Application {

	public static void main(String[] args) {
		SpringApplication.run(SystemZarzadzaniaErphrMv2Application.class, args);
	}

	@Autowired
	private DBrepo dbrepository;


}
