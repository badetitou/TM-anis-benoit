Feature: En tant que client
je souhaite avoir une liste d'envie
afin de d'enregistrer les articles que j'ai envies

  Scenario Outline: creer une liste
  	Given L'utilisateur est sur la page home d'amazon
	When l'utilisateur va sur la page liste
	And l'utilisateur clique sur creer une liste
	And l'utilisateur valide la creation d'une liste
	Then la liste de l'utilisateur est crée
    
 
  Scenario Outline: Supprimer une liste
	Given L'utilisateur est sur la page home d'amazon
	And l'utilisateur a une liste 
	When l'utilisateur va sur la page liste
	And l'utilisateur clique modifier une liste
	And l'utilisateur clique sur supprimer la liste
	And l'utilisateur clique sur confirmer
	Then la liste de l'utilisateur est supprimée