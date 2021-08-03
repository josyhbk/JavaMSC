function fechaActual() {
    var hoy = new Date();
    var dd = hoy.getDate();
    var mm = hoy.getMonth() + 1;
    var yyyy = hoy.getFullYear();

    dd = addZero(dd);
    mm = addZero(mm);

    return yyyy + '-' + mm + '-' + dd;
}

function addZero(i) {
    if (i < 10) {
        i = '0' + i;
    }
    return i;
}

function calcularInteres() {

    interes = 0;
    interesTotal= 0;
    cuota = $('#cuotaMensual').val();
    montoASolicitar = $('#montoASolicitar').val();
    switch (cuota) {
        case '12':
            interes = 11;
            break;
        case '24':
            interes = 12;
            break;
        case '36':
            interes =13;
            break;
        case '48':
            interes = 14;
            break;
        case '60':
            interes = 16;
            break;
        case '72':
            interes = 18;
            break;
        case '84':
            interes = 20;
            break;
        case '96':
            interes = 22;
            break;
    }
    
    interesTotal =(montoASolicitar*(interes/100))
    $('#tasaAplicada').val(interes);
    $('#interesTotal').val(parseFloat(interesTotal).toFixed(2));

}