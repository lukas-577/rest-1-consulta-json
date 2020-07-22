package cl.lmedinar.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
//seter y getter
@Data
public class Persona {
	private Integer id;
	private String name;
	private String username;
	private String email;
	private Address address;
 
}
