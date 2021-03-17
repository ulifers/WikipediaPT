$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Post.feature");
formatter.feature({
  "line": 2,
  "name": "Consulta",
  "description": "",
  "id": "consulta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3082908900,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Consultar Ovo de Pascoa",
  "description": "",
  "id": "consulta;consultar-ovo-de-pascoa",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "que acesso a Wikipedia em Portugues",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "pesquiso por \"Ovo de Pascoa\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "exibe a expressao \"Ovo de Pascoa\" no titulo da guia",
  "keyword": "Then "
});
formatter.match({
  "location": "Post.queAcessoAWikipediaEmPortugues()"
});
formatter.result({
  "duration": 2328050100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Pascoa",
      "offset": 14
    }
  ],
  "location": "Post.pesquisoPor(String)"
});
formatter.result({
  "duration": 1367287900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ovo de Pascoa",
      "offset": 19
    }
  ],
  "location": "Post.exibe_a_expressao_no_titulo_da_guia(String)"
});
formatter.result({
  "duration": 31781600,
  "status": "passed"
});
formatter.after({
  "duration": 1010687900,
  "status": "passed"
});
});