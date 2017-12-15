Feature: En tant que client
  Je souhaite pouvoir me connecter
  Afin d'avoir accès à mon compte 

  Scenario Outline: Se connecter à mon compte
    Given l'utilisateur est sur la page login
    And L'utilisateur rentre son <email> et son <password>
	Then L'utilisateur est bien connecte
    
  Examples:
    | email | password |
    |  benoit.verhaeghe@polytech-lille.net | tmtmtm |
    
  Scenario Outline: Se connecter à mon compte avec un mauvais mot de passe
    Given l'utilisateur est sur la page login
    And L'utilisateur rentre son <email> et son <password>
	Then Le message d'erreur de mauvais mot de passe s'affiche
    
  Examples:
    | email | password |
    |  benoit.verhaeghe@polytech-lille.net | tmtmtmtmtm |

  Scenario Outline: Se connecter à mon compte avec un mauvais identifiant
    Given l'utilisateur est sur la page login
    And L'utilisateur rentre son <email> et son <password>
    Then Le message d'erreur d'indentifiant s'affiche

    Examples:
      | email | password |
      |  benoit.verhaeghe@polytlille.net | tmtmtmtm |

  Scenario Outline: Se deconnecter
  	Given L'utilisateur est sur la page home d'amazon
  	And L'utilisateur est connecte
	When l'utilisateur clique sur se deconnecter
	Then L'utilisateur est déconnecte
    Examples:
      |  |
	