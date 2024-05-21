package com.monster.luvCocktail.domain.cocktail.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CreateCocktailResponse {
	private String title;
	private String description;
	private Long degree;
	private String creatorName;
	private boolean isCustom = false;
}