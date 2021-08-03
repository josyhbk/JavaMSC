class API {
    constructor(apikey) {
        this.apikey = apikey;
    }

    async obtenerEstadoDeSolicitud() {
        const url = `https://link?api_key+${this.apikey}`;
        const solicitud = await fetch(url);
        const datos = await solicitud.json();
        return {
            datos
        }
    }

    async enviarSolicitudAPI(params){
        var url = 'http://192.168.1.17:8080/solicitud';
        
        await fetch(url, {
          method: 'POST', // or 'PUT'
          body: JSON.stringify(params), // data can be `string` or {object}!
          headers:{
            'Content-Type': 'application/json'
          }
        }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => console.log('Success:', response));
    }

    async registrarAPI(params){

        var url = 'http://192.168.1.17:8080/cliente';
        
        await fetch(url, {
          method: 'POST', // or 'PUT'
          body: JSON.stringify(params), // data can be `string` or {object}!
          headers:{
            'Content-Type': 'application/json'
          }
        }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => console.log('Success:', response));
        
    }

    async loadClientesAPI(){

        var url = 'http://192.168.1.17:8080/cliente';
        
        await fetch(url, {
          method: 'GET', // or 'PUT'
          headers:{
            'Content-Type': 'application/json'
          }
        }).then(res => res.json())
        .catch(error => console.error('Error:', error))
        .then(response => console.log('Success:', response));
        
    }

    async recordCrediticio(params){
        const url = `https://link?params=${params}}&api_key+${this.apikey}`;

        const urlConvertir = await fetch(url);

        const resultado = await urlConvertir.json();

        return { 
            resultado 
        }
    }

    async logeo(){
        const url = `http://192.168.1.17:8080/cliente`;

        const urlConvertir = await fetch(url);

        const resultado = await urlConvertir.json();
        $.each(resultado, function (key, val) {
            
       });
    }

}