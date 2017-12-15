Feature: En tant que client
je souhaite controler mes informations personnelles
afin de parametrer mes preferences

  Scenario Outline: Modification de mes preferences de communication de courriers promotionnels
    Given L'utilisateur est sur la page home d'amazon
    When L'utilisateur recherche le produit produit
    Then L'utilisateur est sur la page du produit