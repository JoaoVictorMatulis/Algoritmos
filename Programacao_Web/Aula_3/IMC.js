var imc = 18.51
if(imc<=18.5){
    console.log("Abaixo da média");
}
else{
    if(imc>18.5 && imc<=24.9){
        console.log("Na média");
    }
    else{
        if(imc>24.9 && imc<=29){
            console.log("Sobre peso");
        }
        else{
            console.log("Obeso");
        }
    }
} 