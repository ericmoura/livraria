package br.ufs.livraria.enumeration;

public enum Genero {
	ADMINISTRACAO(1, "Administra��o"),
	AGROPECUARIA(2, "Agropecu�ria"),
	ARTES(3, "Artes"),
	CIENCIAS_BIOLOGICAS(4, "Ci�ncias biol�gicas"),
	CIENCIAS_EXATAS(5, "Ci�ncias exatas"),
	CIENCIAS_HUMANAS_E_SOCIAIS(6, "Ci�ncias humanas e sociais"),
	CONTABILIDADE(7, "Contabilidade"),
	CURSOS_E_IDIOMAS(8, "Cursos e idiomas"),
	DIDATICOS(9, "Did�ticos"),
	DIREITO(10, "Direito"),
	ECONOMIA(11, "Economia"),
	INFORMATICA(12, "Inform�tica"),
	LITERATURA_ESTRANGEIRA(13, "Literatura estrangeira"),
	LITERATURA_INFANTO_JUVENIL(14, "Literatura infanto-juvenil"),
	LITERATURA_NACIONAL(15, "Literatura nacional"),
	MEDICINA(16, "Medicina"),
	RELIGIAO(17, "Religi�o"),
	TURISMO(18, "Turismo");

	private final int value;
	private final String label;

	private Genero(int value, String label) {
		this.value = value;
		this.label = label;
	}

	public int getValue() {
		return value;
	}
	
	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return label;
	}

}