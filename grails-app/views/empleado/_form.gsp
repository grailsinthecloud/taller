<%@ page import="taller.Empleado" %>



<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="empleado.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${empleadoInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'apellido', 'error')} required">
	<label for="apellido">
		<g:message code="empleado.apellido.label" default="Apellido" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="apellido" required="" value="${empleadoInstance?.apellido}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'serviciosRealizados', 'error')} ">
	<label for="serviciosRealizados">
		<g:message code="empleado.serviciosRealizados.label" default="Servicios Realizados" />
		
	</label>
	<g:select name="serviciosRealizados" from="${taller.Servicio.list()}" multiple="multiple" optionKey="id" size="5" value="${empleadoInstance?.serviciosRealizados*.id}" class="many-to-many"/>

</div>

