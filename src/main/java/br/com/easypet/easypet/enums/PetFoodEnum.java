package br.com.easypet.easypet.enums;

public enum PetFoodEnum {

	ALPO("Alpo", "low"), BENEFUL("Beneful", "middle"), BIG_BOSS("BigBoss", "middle"), BIOFRESH("BioFresh",
			"high"), CATCHOW("CatChow", "low"), CHAMP("Champ", "middle"), CIBAU("Cibau", "high"), DELIDOG("Deli-Dog",
					"middle"), DOGCHOW("DogChow", "low"), ECOPET("Ecopet", "middle"), EQUILIBRIO("Equilibrio",
							"high"), FOSTER("Foster", "low"), FRISKIES("Friskies", "low"), FROLIC("Frolic",
									"low"), GOLDEN("Golden", "middle"), GRANPLUS("GranPlus", "middle"), HEROI("Heroi",
											"low"), HILLS_SCIENCE("Hills Science", "high"), KANINA("Kanina",
													"low"), LIDER("Lider", "low"), MAGNUS("Magnus", "low"), MATISSE(
															"Matisse", "middle"), MAX("Max", "middle"), NATURALIS(
																	"Naturalis", "middle"), NDFARMINA("N&D Farmina",
																			"high"), OSSOBUCO("Ossobuco",
																					"high"), PEDIGREE("Pedigree",
																							"low"), PET_DELICIA(
																									"Pet Delicia",
																									"high"), PREMIER_PET(
																											"Premier Pet",
																											"high"), PROPLAN(
																													"Pro-Plan",
																													"high"), ROYAL_CANIN(
																															"Royal Canin",
																															"high"), SABOR_VIDA(
																																	"Sabor e Vida",
																																	"middle"), THREECATS(
																																			"Three Cats",
																																			"middle"), THREEDOGS(
																																					"Three Dogs",
																																					"middle"), TUTANO(
																																							"Tutano",
																																							"middle"), VITTA_NATURA(
																																									"Vitta Natura",
																																									"middle"), WHISKAS(
																																											"Whiskas",
																																											"middle"),;

	private final String name;
	private final String quality;

	private PetFoodEnum(String name, String quality) {
		this.name = name;
		this.quality = quality;
	}

	public String getName() {
		return name;
	}

	public String getQuality() {
		return quality;
	}

}
