package org.jlobato.gpro.categories.adapter.primary.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
public class CategoryRequest {
	
	private int id;
	private int level;
	private String code;
	private String altCode;
	private String description;
}
