# Partitioning Kata

(english)
The goal is to split the given monolith into several (3) modules (which can be seen as potentiel microsrvices or modules within a modular monolith). The bounded contexts or sub-domains here are obvious to find.

Your work is to import the small codebase in your chosen language (zip or clone), then create the 3 target modules (packages in Java, sub-project or namespace in C#), then move the classes as you see fit. But the focus of the kata is to do what you think is needed so that each module can become mostly autonomous from any other, as in "no import from other modules in the weight calculation code in Shipping".  

(french)
L'objectif est de découper un système monolithique existant en plusieurs modules (potentiels microservices ou modules dans un modular monolith) en code. Les bounded contexts ou sous-domaines ici sont triviaux à trouver.

En pratique, importez la base de code du langage de votre choix, créez les 3 modules cibles, puis déplacez les classes aux mieux, et faites ce que vous jugez nécessaire pour s'assurrer que chaque module soit sufisamment autonome en fonctionnalité, avec donc aucun import externe au module dans le code de calcul du poids dans le module Shipping. 

