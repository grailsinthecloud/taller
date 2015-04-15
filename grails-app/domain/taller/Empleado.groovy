package taller

class Empleado {

	String nombre
	String apellido

	static hasMany = [ serviciosRealizados : Servicio ]

    static constraints = {
    	nombre nullable: false, blank: false
    	apellido nullable: false, blank: false
    }

}