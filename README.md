# TpRMI
# Présentation génerale sur le projet:
Dans l'ensemble, ce projet desktop de gestion des machines et des salles offre un moyen pratique et convivial pour les utilisateurs de suivre et de gérer les équipements dans diverses salles, tout en utilisant la puissance de RMI et Hibernate pour garantir une communication efficace et une gestion des données optimale.
Notre projet va entamer sur 3 cotes principales:
- [Côté serveur de l'application]:
vous avons mis en place un système RMI (Remote Method Invocation) qui permet à un client distant de se connecter au serveur. Le serveur est chargé de gérer les informations relatives aux machines et aux salles. Il propose une interface de gestion des machines où les clients peuvent ajouter, modifier et supprimer des machines. De plus, il permet aux clients de filtrer les machines en fonction du code de salle, offrant ainsi un moyen de visualiser les machines associées à une salle spécifique. Le serveur gère également les informations relatives aux salles, avec la possibilité d'ajouter de nouvelles salles en spécifiant un code et un identifiant.

- [Côté client de l'application] : 
l'interface utilisateur est développée en utilisant Swing, offrant une expérience conviviale pour les utilisateurs finaux. Les clients peuvent ajouter de nouvelles machines en fournissant des détails tels que( la marque, la référence, le prix et l'ID de la salle) à laquelle la machine est associée. Ils peuvent également effectuer des opérations de mise à jour et de suppression sur les machines existantes. De plus, l'interface permet aux clients de filtrer les machines par le code de la salle, facilitant ainsi la recherche et la visualisation des machines spécifiques à une salle donnée.

- [Côté de la base de données] :
Elle est gérée avec Hibernate, une technologie de mappage objet-relationnel qui simplifie le stockage et la récupération des données. Cela garantit que les informations sur les machines et les salles sont stockées de manière efficace et cohérente, facilitant ainsi la gestion des données.
- Voici la démonstration de notre projet:

# Le shéma de ClientRMI:
![rmi1](https://github.com/salmachtioui/TpRMI/assets/147477621/f5cec392-7818-4522-8ffc-af8c13025a82)

# Le shéma de ServerRMI:
![rmi2](https://github.com/salmachtioui/TpRMI/assets/147477621/d80de959-1375-4e88-8562-95d2e14e68ea)

# L'interface de gestion des machines :
![rmi3](https://github.com/salmachtioui/TpRMI/assets/147477621/0bb5c3fb-4363-4674-aa5d-70a172c3515e)

# L'interface de gestion des salles avec un exemple de teste de "button modifier"
![rmi4](https://github.com/salmachtioui/TpRMI/assets/147477621/77a260a1-9b7c-4fd3-8de2-de3f84c49be9)

# Creation de table "machine" et l'insertion des données à base de données:
![rmi5](https://github.com/salmachtioui/TpRMI/assets/147477621/1f9bdbc4-e34b-4b6f-be7f-0b057fd0f81b)

# Creeation de table "service" et l'insertion des données à base de données:
![rmi6](https://github.com/salmachtioui/TpRMI/assets/147477621/55d60064-a0e6-4edd-8ce8-f33b7326a68f)

# Le shema de base de données de notre projet:
![rmi7](https://github.com/salmachtioui/TpRMI/assets/147477621/754d4fe4-a0e5-4f19-b443-6fff75079014)

# Les technologies utilisées:
- Java
- Swing
- Xampp( MySql) pour creation et l'apercu des bases de donnees
- Hibernate
- RMI pour créer la connexion entre le "clientrmi" et "serveurrmi"

# Les fonctionnalites implementées:
- CRUD (Create, Read, Update, Delete) pour machine. 
- CRUD (Create, Read, Update, Delete) pour salle
