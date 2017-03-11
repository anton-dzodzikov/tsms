# Test Suite Management Service

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