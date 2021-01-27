$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/shoestock.feature");
formatter.feature({
  "description": "",
  "name": "Shoestock",
  "keyword": "Feature"
});
formatter.scenario({
  "tags": [
    {
      "name": "@CT01"
    }
  ],
  "description": "",
  "keyword": "Scenario",
  "name": "Verificar campo de busca na home da shoestock"
});
formatter.step({
  "keyword": "Given ",
  "name": "que acessei a home da shoestock"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "keyword": "When ",
  "name": "eu realizar uma busca"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "keyword": "Then ",
  "name": "valido a busca de produtos"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});