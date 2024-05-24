package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data
public class Details {

	private Integer id;
	private String name;
	private Boolean isInterested;
}
// Instead of these five annotatons you can simply use a combination of these four which is @Data
