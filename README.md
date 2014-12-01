projet
======
Création d’un projet Maven/Spring/JPA

Initialisation d’un projet

Initialisation sur github

Initialisation du projet

Annexe

Dépendance :

<!­­ Pour faire du JPA ­­>

<!­­ Pour utiliser Hibernate ­­>

<!­­ Pour utiliser MySQL ­­>

<!­­ Pour utiliser PostgreSQL ­­>

<!­­ Pour utiliser SPRING ­­>

<!­­Pour faire des JSP/Servlet ­­>

<!­­ Pour faire du test ­­>

Initialisation d’un projet

Initialisation sur github

­ Crée un nouveau repository

­ Cocher “Initialize this repository with a README”

­ dans “add gitigore”, ajouter Maven

Initialisation du projet

­ ajouter les répertoires suivant :

­ src

­ main

­ java

­ webapp

­ test

­ java

­ META­INF

­ Dans src/main/java, ajouter les packages suivant :

­ com.formation.monDuProjet

­ controller

­ model

­ entity

­ dao

­ manager

­ Ajouter les fichiers suivants :

­ src/main/java/spring.xml

­ src/main/java/META­INF/persistence.xml

­ src/test/java/spring.xml

­ src/test/java/META­INF/persistence.xml

­ src/main/webapp/WEB­INF/web.xml

­

­ Ajouter pom.xml et configurer le :

­ Un pom possede toujours une identité :

<groupId>com.formation</groupId>

<artifactId>magasin</artifactId>

<version>0.0.1-SNAPSHOT</version>

­ Un pom possède une liste de propriétés

<properties>

<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>

<spring.version>3.2.5.RELEASE</spring.version>

<hibernate.version>4.1.9.Final</hibernate.version>

<mysql.connector.version>5.1.6</mysql.connector.version>

</properties>

­ Un pom possède une liste de dépendance vers d’autre projet :

<dependencies>

....

</dependencies>

voir annexe pour des exemples de dépendance

­ Un pom possède des propriétés de contruction

<build>

<finalName>test</finalName>

<plugins>

<plugin>

</plugin>

</plugins>

</build>

Dépendance :

<!-- Pour faire du JPA -->

<dependency>

<groupId>commons­dbcp</groupId>

<artifactId>commons­dbcp</artifactId>

<version>1.4</version>

</dependency>

<dependency>

<groupId>javassist</groupId>

<artifactId>javassist</artifactId>

<version>3.12.1.GA</version>

</dependency>

<!-- Pour utiliser Hibernate -->

<dependency>

<groupId>org.hibernate</groupId>

<artifactId>hibernate-core</artifactId>

<version>${hibernate.version}</version>

</dependency>

<dependency>

<groupId>org.hibernate</groupId>

<artifactId>hibernate-entitymanager</artifactId>

<version>${hibernate.version}</version>

</dependency>

<!-- Pour utiliser MySQL -->

<dependency>

<groupId>mysql</groupId>

<artifactId>mysql-connector-java</artifactId>

<version>${mysql.connector.version}</version>

</dependency>

<!-- Pour utiliser PostgreSQL -->

<dependency>

<groupId>postgresql</groupId>

<artifactId>postgresql</artifactId>

<version>9.1-901.jdbc4</version>

</dependency>

<!-- Pour utiliser SPRING -->

<dependency>

<groupId>org.springframework</groupId>

<artifactId>spring-webmvc</artifactId>

<version>${spring.version}</version>

</dependency>

<dependency>

<groupId>org.springframework</groupId>

<artifactId>spring-tx</artifactId>

<version>${spring.version}</version>

</dependency>

<dependency>

<groupId>org.springframework</groupId>

<artifactId>spring-jdbc</artifactId>

<version>${spring.version}</version>

</dependency>

<dependency>

<groupId>org.springframework</groupId>

<artifactId>spring-orm</artifactId>

<version>${spring.version}</version>

</dependency>

<!--CGLIBisrequiredtoprocess@Configurationclasses-->

<dependency>

<groupId>cglib</groupId>

<artifactId>cglib</artifactId>

<version>2.2.2</version>

</dependency>

<!--Pour faire des JSP/Servlet -->

<dependency>

<groupId>javax.servlet</groupId>

<artifactId>javax.servlet-api</artifactId>

<version>3.0.1</version>

<scope>provided</scope>

</dependency>

<dependency>

<groupId>javax.servlet.jsp</groupId>

<artifactId>jsp-api</artifactId>

<version>2.1</version>

<scope>provided</scope>

</dependency>

<dependency>

<groupId>jstl</groupId>

<artifactId>jstl</artifactId>

<version>1.2</version>

</dependency>

<!-- Pour faire du test -->

<dependency>

<groupId>junit</groupId>

<artifactId>junit</artifactId>

<version>4.7</version>

<scope>test</scope>

</dependency>

<dependency>

<groupId>org.springframework</groupId>

<artifactId>spring-test</artifactId>

<version>${spring.version}</version>

<scope>test</scope>

</dependency>

<dependency>

<groupId>org.mockito</groupId>

<artifactId>mockito-all</artifactId>

<version>1.9.5</version>

<scope>test</scope>

</dependency>
