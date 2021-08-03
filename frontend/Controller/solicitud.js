const key = new API('38cde5cda104dfa806a92cc5b8f8477c3b13d848cf43bb18c2fc22a4e1ab32f4');


function loadSolicitudPrestamo() {
    const url = "solicitud.html";


    fetch(url)
        .then(respuesta => {
            return respuesta.text()
        })
        .then(datos => {

            document.getElementById('body').innerHTML = datos;
            document.getElementById('card-title').innerText = "Formulario de solicitud";
            document.getElementById('fechaSolicitud').value = fechaActual();

        })
}

function enviarSolicitud() {

    params = {
       
        id_cliente: $('#idCliente').val(),
        id_precalificacion: 2,   
        monto_solicitado: parseFloat($('#montoASolicitar').val()).toFixed(2),
        monto_autorizado: parseFloat($('#montoASolicitar').val()*0.96).toFixed(2),
        tasa_aplicada: parseFloat($('#tasaAplicada').val()/100).toFixed(0),
        cuota:  parseFloat($('#cuotaMensual').val()).toFixed(0),
        fecha_solicitud: $('#fechaSolicitud').val(),    
    }
    console.log(params);
    key.enviarSolicitudAPI(params);
    alert("Solicitud Enviada Exitosamente");

}

function loadSeguimientoDeSolicitud() {
    const url = "seguimientoSolicitud.html";


    fetch(url)
        .then(respuesta => {
            return respuesta.text()
        })
        .then(datos => {

            document.getElementById('body').innerHTML = datos;
            document.getElementById('card-title').innerText = "Formulario de solicitud";
            document.getElementById('fechaSolicitud').value = fechaActual();
            //key.obtenerEstadoDeSolicitud();
            /*$.each(data, function (key, val) {
                 $('#fecha').val(val.fecha),
                 $('#cui').val(val.cui),
                 $('#pasaporte').val(val.pasaporte)
                 $('#primerNombre').val(val.primerNombre)
                 $('#segundoNombre').val(val.segundoNombre)
                 $('#primerApellido').val(val.primerApellido)
                 $('#segundoApellido').val(val.segundoApellido)
                 $('#montoASolicitar').val(val.montoSolicitado)
                 $('#cuotaMensual').val(val.cuotaMensual)
               $('#tasaAplicada').val(val.TasaAplicada)
            });
            */
            estado=1
            
            switch (estado) {
                case 1:
                    document.getElementById('estadoSolicitud').value = "#AF7AC5"
                    break;
                case 2:
                    document.getElementById('estadoSolicitud').value = "#2980B9"
                    break;
                case 3:
                    document.getElementById('estadoSolicitud').value = "#F1C40F"
                    break;
                case 4:
                    document.getElementById('estadoSolicitud').value = "#C0392B"
                    break;
                case 5:
                    document.getElementById('estadoSolicitud').value = "#229954"
                    break;



            }
            document.getElementById('card-title').innerText = "Seguimiento de solicitud";

        })
}