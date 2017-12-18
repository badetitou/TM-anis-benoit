# Projet TM de Anis Jomni et Benoît Verhaeghe

## Informations générales

L'objectif du projet et de tester le site amazon.fr.
Pour cela nous avons utilisé Cucumber et Selenium. 
A cause de problèmes avec les machines de Polytech nous n'avons testé que sur le navigateur Google Chrome.

Les sources des tests sont dans le dossier src/test/\*.
Les sources java dans src/test/java/\* et les sources des features dans src/test/resources/\*.

Nous avons écrit les tests pour la connexion, la gestion d'une liste amazon, le changement de la langue, la gestion des preferences et la recherche d'un article.

Seul le code java pour la connexion, la langue et le début de la recherche d'article a été écrit. 

## Lancer le projet

Pour lancer le projet, lancer les commandes depuis la racine du projet

```
mvn install

mvn failsafe:integration-test
```
