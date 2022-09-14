/**--------------------------------------------------------------------------------------------------------------*
 *                                     SENAC - TADS - Programação Web                                            *
 *        Exercício de um Função mostras a mensagem "Bom dia Sr/a (nome da pessoas), Bem vindo ao Sistema "      *
 *                                      Autor: João Victor Matulis                                               *
 * -------------------------------------------------------------------------------------------------------------*/
function BoasVindasAoSistem(nmCliente){
    console.log(`Bom dia Sr/a ${nmCliente}, Bem vindo ao Sistema `);
}
let nome = "João"
BoasVindasAoSistem(nome);

//Segundo modo por função Anonima
let nomeTela = "Rebeca"
var mensagem = (nomeEntrada)=>{
    console.log(`Bom dia Sr/a ${nomeEntrada}, Bem vindo ao Sistema `);
}
mensagem(nomeTela);