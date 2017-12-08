Feature: En tant que client
Je souhaite pouvoir me connecter
Afin d'avoir accès à mon compte 

  Scenario Outline: Se connecter à mon compte
  	Given L'utilisateur est sur la page home d'amazon
	When l'utilisateur va sur la page login
	And L'utilisateur rentre son <email> et son <password>
	Then L'utilisateur est connecté
    
  Examples:
    | email | password |
    |  benoit.verhaeghe@polytech-lille.net | tmtmtm |
    
  Scenario Outline: Se connecter à mon compte avec un mauvais mot de passe
  	Given L'utilisateur est sur la page home d'amazon
	When l'utilisateur va sur la page login
	And L'utilisateur rentre son <email> et son <password>
	Then Un message d'erreur s'affiche
    
  Examples:
    | email | password |
    |  benoit.verhaeghe@polytech-lille.net | tmtmtmtmtm |
    
  Scenario Outline: Se deconnecter
  	Given L'utilisateur est sur la page home d'amazon
  	And L'utilisateur est connecté
	When l'utilisateur clique sur se deconnecter
	Then L'utilisateur est déconnecté
	