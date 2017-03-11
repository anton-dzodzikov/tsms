# Test Suite Management Service

## Run project

### Run with Gradle (wrapper)
<pre>gradlew clean bootRun
        -PdbUrl=DATABASE_URL
        -PdbUsername=DATABASE_USER
        -PdbPassword=DATABASE_PASSWORD</pre>

## Migration

### Clean database schema
<pre>gradlew clean :tsms-persistence:processResources flywayClean
        -Pflyway.url=DATABASE_URL
        -Pflyway.user=DATABASE_USER
        -Pflyway.password=DATABASE_PASSWORD</pre>

### Migrate database schema
<pre>gradlew clean :tsms-persistence:processResources flywayMigrate
        -Pflyway.url=DATABASE_URL
        -Pflyway.user=DATABASE_USER
        -Pflyway.password=DATABASE_PASSWORD</pre>