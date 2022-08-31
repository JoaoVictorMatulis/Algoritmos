var arrayNumeros = [12,22,33,44,45,667];
function verificaPares1(elemento){
    if(elemento%2 == 0)
    console.log(`O numero ${elemento} eh par`);
}
arrayNumeros.forEach(verificaPares1);

var arrayMarca = ['Ford','BMW','Fiat','Audi','Volkswagen'];
arrayMarca.forEach((marca, indice) => {
    console.log("A marca "+marca+" corresponde ao indice: "+indice);
    if(marca === 'BMW'){
        let itemExcluido = arrayMarca.splice(indice,1);
        console.log("Confira: Excluimos o elemento "+itemExcluido);
    }
})
console.log(arrayMarca);