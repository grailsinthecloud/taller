package taller

class Cliente {

	String nombre
	String apellido
	String email
	String celular

	static hasMany = [ autos : Auto, solicitudes : Solicitud ]

    static constraints = {
    	importFrom Empleado
    	email nullable: false, email: true
    	celular matches: "09[0-9]{7}"
    }

}