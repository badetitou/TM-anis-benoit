Feature: En tant que client
je souhaite controler mes informations personnelles
afin de parametrer mes preferences

  Scenario Outline: Modification de mes preferences de communication de courriers promotionnels
    Given L'utilisateur est sur la Preference courriers
    When L'utilisateur switch vers Ne m'envoyez pas de courriers promotionnels
    And L'utilisateur valide son choix
    Then Un message Vos préférences ont été enregistrees s'affiche