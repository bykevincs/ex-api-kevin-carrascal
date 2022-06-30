Feature: freetogame

  @test1
  Scenario: Se debe validar el status 200 e imprimir

    When envio el platform "pc", category "shooter"
    Then el código de respuesta es 200
    And el type es "successfully"

  @test2
  Scenario: Caso error - Validar status 400

    When envio el platform "switch", category "shoot"
    Then el código de respuesta es 400
    And el type es "unknown"