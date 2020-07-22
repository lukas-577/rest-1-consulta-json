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
public class Geo {
	
	
	private String lat;
	private String lng;

}
