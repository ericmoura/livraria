package br.ufs.livraria.enumeration;

public enum Genero {
	TUDO("Tudo"),
	ADMINISTRACAO("Administra��o"),
	AGROPECUARIA("Agropecu�ria"),
	ARTES("Artes"),
	CIENCIAS_BIOLOGICAS("Ci�ncias biol�gicas"),
	CIENCIAS_EXATAS("Ci�ncias exatas"),
	CIENCIAS_HUMANAS_E_SOCIAIS("Ci�ncias humanas e sociais"),
	CONTABILIDADE("Contabilidade"),
	CURSOS_E_IDIOMAS("Cursos e idiomas"),
	DIDATICOS("Did�ticos"),
	DIREITO("Direito"),
	ECONOMIA("Economia"),
	INFORMATICA("Inform�tica"),
	LITERATURA_ESTRANGEIRA("Literatura estrangeira"),
	LITERATURA_INFANTO_JUVENIL("Literatura infanto-juvenil"),
	LITERATURA_NACIONAL("Literatura nacional"),
	MEDICINA("Medicina"),
	RELIGIAO("Religi�o"),
	TURISMO("Turismo");

	private final String label;

	private Genero(String label) {
		this.label = label;
	}

	public int getValue() {
		return this.ordinal();
	}
	
	public String getLabel() {
		return label;
	}

	@Override
	public String toString() {
		return label;
	}

}