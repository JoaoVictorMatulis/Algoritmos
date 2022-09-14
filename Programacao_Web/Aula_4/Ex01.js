var arrayMarca = ['Ford','BMW','Fiat','Audi','Volkswagen'];
function lista(){
    let id = document.getElementById("listaMarca")
    arrayMarca.forEach((item)=>{
        var lista = document.createElement('li');
        lista.innerText = item
        id.appendChild(lista)
    })
}