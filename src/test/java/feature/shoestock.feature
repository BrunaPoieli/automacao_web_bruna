#language: en

  Feature: Shoestock

  @CT01
  Scenario: Verificar campo de busca na home da shoestock
  Given que acessei a home da shoestock
  When eu realizar uma busca
  Then valido a busca de produtos

  @CT02
  Scenario: Vericar a inclusao de produto no carrinho
  Given que acessei a home da shoestock
  When eu selecionar um produto
  Then valido a inclusao do produto no carrinho