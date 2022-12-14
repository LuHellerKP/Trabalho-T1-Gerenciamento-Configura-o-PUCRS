# Trabalho-T1-Gerenciamento-Configura-o-PUCRS
Simulação de Projeto Colaborativo

# Como clonar o projeto:
```
git clone https://github.com/LuHellerKP/Trabalho-T1-Gerenciamento-Configura-o-PUCRS.git
mvn package
java -jar target/*.jar
```

## Grupo 3
- Felipe Freitas
- Luiza Heller
- Lucas S. Wolschick
<br><br><br>


[Enunciado 2309 - Truco](https://www.beecrowd.com.br/judge/en/problems/view/2309)
<body>
<div class="header">
<h1>Truco</h1>
<div>
<p>Por OBI - Olimpíada Brasileira de Informática 2006 <img src='https://resources.beecrowd.com.br/gallery/images/flags/br.gif' alt='BR' /> Brazil</p>
</div>
<strong>Timelimit: 1</strong>
</div>
<div class="problem">
<div class="description">
<p>Truco é&nbsp;um jogo de cartas que pode ser jogado por duas ou mais pessoas. Existem diversas variações: o Truco Cego ou Truco Espanhol (popular no sul do Brasil, Argentina, Uruguai e outros países), o Truco Paulista, Capixaba ou Mineiro (variações populares no Brasil), o Truco Índio e o Truco Eteviano. Em geral, é&nbsp;uma disputa de três rodadas (“melhor de três”) para ver quem tem as cartas mais “fortes” (de valor simbólico mais alto).</p>
<p>Adalberto e Bernardete estão jogando uma variação de truco com 40 cartas (foram retirados do baralho todas as cartas de valor 8, 9 e 10, além dos coringas), e o valor simbólico independente do naipe da carta. A ordem de valor simbólico das cartas nessa variação de truco é&nbsp;mostrada abaixo, ordenada da mais “fraca” (mais à&nbsp;esquerda) para a mais “forte” (mais à&nbsp;direita)</p>
<p style="text-align: center;">4 5 6 7 Q J K A 2 3</p>
<p>Cada partida é&nbsp;disputada em três rodadas. A cada rodada, os jogadores escolhem uma das cartas para mostrar, e vence aquele que tiver a carta com o maior valor simbólico. Em caso de empate (ou seja, os dois apresentarem cartas com os mesmos valores simbólicos), Adalberto vence, pois é&nbsp;mais velho que Bernardete. Vence a partida aquele que vencer o maior número de rodadas.</p>
<p>Depois de algumas partidas, Adalberto e Bernardete estão com dificuldades para saber quem venceu mais partidas, e pediram a sua ajuda.</p>
<p>Sua tarefa é&nbsp;escrever um programa que calcule o número de partidas que cada um dos competidores (Adalberto e Bernardete) venceram.</p>
</div>
<h2>Entrada</h2>
<div class="input">
<p>A entrada contém um único conjunto de testes, que deve ser lido do dispositivo de entrada padrão (normalmente o teclado). A primeira linha da saída possui um inteiro <strong>N</strong> que indica o número de partidas disputadas entre Adalberto e Bernardete (1 ≤ <strong>N</strong> ≤ 1000000). As <strong>N</strong> linhas seguintes contêm cada uma seis inteiros, <strong>A<sub>1</sub></strong>, <strong>A<sub>2</sub></strong>, <strong>A<sub>3</sub></strong>, <strong>B<sub>1</sub></strong>, <strong>B<sub>2</sub></strong> e <strong>B<sub>3</sub></strong> , que correspondem às três cartas apresentadas por Adalberto nas rodadas 1, 2 e 3 daquela partida (<strong>A<sub>1</sub></strong>, <strong>A<sub>2</sub></strong>, <strong>A<sub>3</sub></strong> ∈ {1, 2, 3, 4, 5, 6, 7, 11, 12, 13}), seguidas pelas três cartas apresentadas por Bernardete nas rodadas 1, 2 e 3 da mesma partida (<strong>B<sub>1</sub></strong>, <strong>B<sub>2</sub></strong>, <strong>B<sub>3</sub></strong> ∈ {1, 2, 3, 4, 5, 6, 7, 11, 12, 13}). Na entrada, o número 1 representa o Ás &nbsp;(<strong>A</strong>), 11 representa o Valete (<strong>J</strong>), 12 representa a Dama (<strong>Q</strong>) e 13 representa o Rei (<strong>K</strong>).</p>
</div>
<h2>Saída</h2>
<div class="output">
<p>Seu programa deve imprimir, na saída padrão, uma única linha, que contém os números de partidas vencidas por Adalberto e por Bernadete, nessa ordem, separados por espaços.</p>
</div>
<div class="both"></div>
<table>
<thead>
<tr>
<td>Exemplos de Entrada</td>
<td>Exemplos de Saída</td>
</tr>
</thead>
<tbody>
<tr>
<td class="division">
<p>1</p>
<p>1 2 3 1 3 2</p>
</td>
<td>
<p>1 0</p>
</td>
</tr>
</tbody>
</table>
<div class="both"></div>
<table>
<thead>
</thead>
<tbody>
<tr>
<td class="division">
<p>2</p>
<p>1 5 6 6 3 4</p>
<p>5 6 2 11 13 12</p>
</td>
<td>
<p>1 1</p>
</td>
</tr>
</tbody>
</table>
<div class="both"></div>
<table>
<thead>
</thead>
<tbody>
<tr>
<td class="division">
<p>5</p>
<p>1 2 11 12 7 6</p>
<p>3 5 1 13 1 4</p>
<p>4 5 7 11 12 13</p>
<p>1 5 6 3 5 2</p>
<p>5 6 7 4 5 2</p>
</td>
<td>
<p>3 2</p>
</td>
</tr>
</tbody>
</table>
<p class="footer">
OBI - Olimpíada Brasileira de Informática 2006 Fase 1 Nível 2
</p>
</div>
</body>
