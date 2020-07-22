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
public class Address {
	
	private String street;
	private String suite;
	private String city;
	private String zipcode;
	private Geo geo;

}
