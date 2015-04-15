package taller

class Auto {

	String marca
	String modelo
	Integer anho
	String matricula

	static belongsTo = [ cliente : Cliente ]

	static hasMany = [ 
		serviciosAnteriores : Servicio, 
		solicitudesActivas : Solicitud 
	]

    static constraints = {
    	marca nullable: false, inList: ['Fiat','Chevrolet','Volkswagen']
    	modelo nullable: false, blank: false 
    	anho max: Calendar.instance.get(Calendar.YEAR)
    	matricula unique: true, matches: "[A-S]{1}[A-Z]{2}[0-9]{4}"
    }

}