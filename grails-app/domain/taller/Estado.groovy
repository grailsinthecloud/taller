package taller

class Estado {

	Date fechaCambio
	String comentario
	Empleado empleado

	static belongsTo = [ servicio : Servicio ]

    static constraints = {
    	comentario nullable: true
    }

}