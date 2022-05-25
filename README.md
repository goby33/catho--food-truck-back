
# API FOOD TRUCK


## URL HEROKU 
https://morning-escarpment-57263.herokuapp.com/

## SWAGGER 

https://morning-escarpment-57263.herokuapp.com/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/Menu/getMenus
##start the app localy

1) install JAVA: https://docs.oracle.com/en/java/javase/11/install/installation-jdk-linux-platforms.html#GUID-737A84E4-2EFF-4D38-8E60-3E29D1B884B8

2) 
```bsg
mvn package -Dmaven.test.skip
```
run le proet avec cette classe :

```java
@SpringBootApplication
public class CathoAppFoodTruckBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(CathoAppFoodTruckBackApplication.class, args);
    }

}
```





