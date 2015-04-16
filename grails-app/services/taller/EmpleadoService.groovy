package taller

import grails.transaction.Transactional

@Transactional
class EmpleadoService {

    List buscar(Map params) {

    	def list = []

    	Empleado.withTransaction { status ->
    	
    		try {

		    	list = Empleado.withCriteria {
		            or {
		                ilike('nombre', "%${params.nombre}%")
		                ilike('apellido', "%${params.apellido}%")
		            }
		        }

		    } catch (Exception ex) {
		        status.setRollbackOnly()
	        	log.error "algo", ex
		    }

    	}

        return list

    }

    String getNombreCompleto(String nombre, String apellido) {
    	return "$nombre $apellido"
    }

}