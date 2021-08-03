function loadRecordCrediticio(){
    const url ="recordCrediticio.html";
    

    fetch(url)
    .then (respuesta => {
        return respuesta.text()
    })
    .then (datos => {
       
        document.getElementById('body').innerHTML = datos;

        data = key.obtenerRecordCrediticio();
        $.each(data, function (key, val) {
            resultado += parseFloat(val.subtotal);
            dataTableBody += "<tr class='odd gradeX'>";
            dataTableBody += "<td class='center'>" + val.banco + "</td>";
            dataTableBody += "<td class='center'>" + val.cuotasPendientes + "</td>";
            dataTableBody += "<td class='center'>" + val.estado + "</td>";
            dataTableBody += "<td class='center'>" +  parseFloat(val.monto).toFixed(2) + "</td>";
            dataTableBody += "</tr>";
        });

        $("#dataTableBody").empty();
        $("#dataTableBody").append(dataTableBody);

    });
        
   
}