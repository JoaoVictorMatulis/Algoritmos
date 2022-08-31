/**--------------------------------------------------------------------------------------------------------------*
 *                                     SENAC - TADS - Programação Web                                            *
 *                                        Exemplo de Switch case                                           *
 *                                      Autor: João Victor Matulis                                               *
 * -------------------------------------------------------------------------------------------------------------*/
let diaObtido = new Date().getDay();
//diaObtido = 5;
switch(diaObtido){
    case 0:
        diaObtido = "Domingo";
        break;
    case 1:
        diaObtido = "Segunda-Feira";
        break;
    case 2:
        diaObtido = "Terça-Feira"
        break;
    case 3:
        diaObtido = "Quarta-Feira"
        break;
    case 4:
        diaObtido = "Quinta-Feira"
        break;
    case 5:
        diaObtido = "Sexta-Feira"
        break;
    case 6:
        diaObtido = "Domingo-Feira"
        break;
    default:
        diaObtido = "Dia invalido";
        break;
}
console.log("Hoje eh: "+diaObtido);