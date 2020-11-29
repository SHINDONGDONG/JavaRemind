package chap08.Sample22;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Car {

	@NonNull
	private String color;//색상
	
	private final int  door;//문수
	
	private String manufacturer;//제조사
	
	
}
