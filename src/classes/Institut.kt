package classes
// Generated 17 de nov. 2020, 19:55:31 by Hibernate Tools 5.2.12.Final
/**
 * Institut generated by hbm2java
 */
class Institut : java.io.Serializable {
	var codi: String? = null
	var poblacio: Poblacio? = null
	var nom: String? = null
	var adreca: String? = null
	var numero: String? = null
	var codpostal: Int? = null

	constructor() {}
	constructor(codi: String?) {
		this.codi = codi
	}

	constructor(
		codi: String?,
		poblacio: Poblacio?,
		nom: String?,
		adreca: String?,
		numero: String?,
		codpostal: Int?
	) {
		this.codi = codi
		this.poblacio = poblacio
		this.nom = nom
		this.adreca = adreca
		this.numero = numero
		this.codpostal = codpostal
	}
}