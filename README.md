# The Pact Sample Project Based on pact-jvm-provider-junit_2.11. 

The repo "pact-consumer" demonstrates an e-commerce application which depends on the "pact-producer" restful service. The former (as a consumer) requests the latter (as a provider) to provide rating information (such as a 3-star of a 5-star rating) for a product on the e-commerce website with product id and user name.

The repo "pact-producer" is the sample project to show how to use the pact-jvm-provider-junit_2.11. 

# How to Run It

0. Generate the pact (i.e. contract) of the sample application according to the README.md in the repo ["consumer-app"](https://github.com/zonghui-ddd-spring-cloud/pact-consumer).
1. Git clone the ["product-service"](https://github.com/zonghui-ddd-spring-cloud/pact-producer) repo.
3. Copy the pact file generated in the consumer side in step 0 to the folder "src/test/resources" of the provider project folder.
4. Run command "./gradlew clean test"