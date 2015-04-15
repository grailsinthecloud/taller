package taller

class Solicitud {

	Cliente cliente
	Auto auto
	Empleado empleado
	Date fecha = new Date()

	static hasMany = [ servicios : Servicio ]

    static constraints = {
    	cliente nullable: false
    	auto nullable: false
    	empleado nullable: false
    }

}