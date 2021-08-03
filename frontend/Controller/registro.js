function registrar(){
   
    params = {
        cui: $('#cui').val(),
        pasaporte: $('#pasaporte').val(),
        primer_nombre: $('#primerNombre').val(),
        segundo_nombre: $('#segundoNombre').val(),
        primer_apellido: $('#primerApellido').val(),
        segundo_apellido: $('#segundoApellido').val(),
        apellido_casada: $('#apellidoCasada').val(),
        salario_nominal: parseFloat($('#salarioNominal').val()).toFixed(2),
        salario_bruto: parseFloat($('#salarioBruto').val()).toFixed(2),
        salario_liquido: parseFloat($('#salarioLiquido').val()).toFixed(2),
    }
     respuesta = key.registrarAPI(params);
     $.each(respuesta, function (key, val) {
        console.log(val);
   });
     alert("Registrado Exitosamente");
   
}

function loadRegistro(){

    const url = "registro.html";


    fetch(url)
        .then(respuesta => {
            return respuesta.text()
        })
        .then(datos => {

            document.getElementById('body').innerHTML = datos;
            document.getElementById('card-title').innerText = "Registro";
        })

}

function loadClientes(){

    loadClientesAPI();
}