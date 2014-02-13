package br.ufs.livraria.enumeration;

public enum Genero {
	TUDO(1, "Tudo"),
	ADMINISTRACAO(2, "Administra��o"),
	AGROPECUARIA(3, "Agropecu�ria"),
	ARTES(4, "Artes"),
	CIENCIAS_BIOLOGICAS(5, "Ci�ncias biol�gicas"),
	CIENCIAS_EXATAS(6, "Ci�ncias exatas"),
	CIENCIAS_HUMANAS_E_SOCIAIS(7, "Ci�ncias humanas e sociais"),
	CONTABILIDADE(8, "Contabilidade"),
	CURSOS_E_IDIOMAS(9, "Cursos e idiomas"),
	DIDATICOS(10, "Did�ticos"),
	DIREITO(11, "Direito"),
	ECONOMIA(12, "Economia"),
	INFORMATICA(13, "Inform�tica"),
	LITERATURA_ESTRANGEIRA(14, "Literatura estrangeira"),
	LITERATURA_INFANTO_JUVENIL(15, "Literatura infanto-juvenil"),
	LITERATURA_NACIONAL(16, "Literatura nacional"),
	MEDICINA(17, "Medicina"),
	RELIGIAO(18, "Religi�o"),
	TURISMO(19, "Turismo");

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