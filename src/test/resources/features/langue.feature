Feature: En tant que client
  je souhaite pouvoir changer de langue
  afin de comprendre le site

  Scenario Outline: Changer la langue
    Given L'utilisateur est sur la page home d'amazon
    When L'utilisateur clique sur <langue>
    Then La page home est en <langue>

    Examples:
      | langue |
      | Australie|
      | Bresil|