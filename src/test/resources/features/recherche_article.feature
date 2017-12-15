Feature: En tant que client
  je souhaite pouvoir cherche un produit
  afin de choisir facilement un produit

  Scenario Outline: Recherche un produit
    Given L'utilisateur est sur la page home d'amazon
    When L'utilisateur recherche le produit <produit>
    Then L'utilisateur est sur la page du produit

    Examples:
      | produit |
      | PS4|
      | FIFA|
      | XBOX|

  Scenario Outline: Recherche un produit qui n'existe pas
    Given L'utilisateur est sur la page home d'amazon
    When L'utilisateur recherche le produit <produit>
    Then Un message d'erreur s'affiche

    Examples:
      | produit |
      | ftyerzezeyfyzycfzedfzeg |