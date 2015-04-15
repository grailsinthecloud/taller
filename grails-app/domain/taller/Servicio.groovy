package taller

class Servicio {

	TipoServicio tipo
	String comentario

	static hasOne = [ estado : Estado ]

	static belongsTo = [ solicitud : Solicitud ]

    static constraints = {
    	comentario nullable: true
    }

}