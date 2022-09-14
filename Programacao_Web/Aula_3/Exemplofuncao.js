/**--------------------------------------------------------------------------------------------------------------*
 *                                     SENAC - TADS - Programação Web                                            *
 *                                        Exemplo de um Função                                                   *
 *                                      Autor: João Victor Matulis                                               *
 * -------------------------------------------------------------------------------------------------------------*/
function somar (parcela1, parcela2){
    let resultado = parcela1 + parcela2;
    return resultado;
}

let valor1 = 3;
let valor2 = 6; 
somaDosValores = somar(valor1 + valor2);

console.log(`O  resultado da soma de ${valor1} + ${valor2} = ${somaDosValores} `);