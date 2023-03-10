/* 4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.


 ********** RESPOSTA **********

Pode-se resolver esse problema usando a fórmula de distância, que é:

distância = velocidade x tempo

Sabe-se que a distância entre Ribeirão Preto e Franca é de 100 km. Vamos chamar a distância que o carro percorre até o ponto de encontro de "d1"
e a distância que o caminhão percorre de "d2". Além disso, sabe-se que a velocidade do carro é de 110 km/h e a velocidade do caminhão é de 80 km/h.

Para descobrir quanto tempo levará para os veículos se encontrarem, pode-se igualar as equações de distância percorrida pelo carro e pelo caminhão:

d1 = 110t
d2 = 80t + (5/60) + (5/60)

Note que foi adicionado 5 minutos (ou 1/12 de hora) duas vezes, uma vez para cada pedágio que o caminhão precisa parar. Agora pode-se igualar as duas equações e resolver para t:

110t = 100 - (80t + 1/12 + 1/12)
110t = 100 - 80t - 1/6
190t = 599/3
t = 3,16 horas

Agora, pode-se calcular as distâncias que cada veículo percorreu até o ponto de encontro:

d1 = 110 x 3,16 = 347,6 km
d2 = 80 x 3,16 + 1/6 + 1/6 = 252,4 km

Note que foi adicionado novamente os 5 minutos de espera em cada pedágio ao calcular a distância percorrida pelo caminhão.

Portanto, quando os veículos se encontrarem, o carro estará mais próximo de Ribeirão Preto, pois ele terá percorrido 347,6 km e o caminhão terá percorrido 252,4 km.

 */

