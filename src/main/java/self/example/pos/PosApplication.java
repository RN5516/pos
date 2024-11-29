package self.example.pos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import self.example.pos.domain.Item;

@SpringBootApplication
public class PosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PosApplication.class, args);
		System.out.println("Welcome to Pos!");

		Item item = Item.builder().itemId(1).name("egg").category("Dairy").price(0.50).build();
		System.out.println(item);
	}

}
