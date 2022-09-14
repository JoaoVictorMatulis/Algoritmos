/**--------------------------------------------------------------------------------------------------------------*
 *                                     SENAC - TADS - Programação Web                                            *
 *                                        Exemplo de um Função Anonima                                           *
 *                                      Autor: João Victor Matulis                                               *
 * -------------------------------------------------------------------------------------------------------------*/
let valor1 = 3;
let valor2 = 6; 

let somaDosValores = (parcela1, parcela2) =>{
    let resultado = parcela1 + parcela2;
    return resultado;
}

console.log(`O  resultado da soma de ${valor1} + ${valor2} = ${somaDosValores(valor1,valor2)} `);