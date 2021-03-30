# Fibonacci API
Simple rest service to get fibonacci result (recursive).
## Requirements
- java 11+
- git
- maven (optional)
## Run project
```sh
git clone https://github.com/skuarch/fibonacci.git
cd fibonacci
./mvnw spring-boot:run (only linux or mac)
mvnw.cmd spring-boot:run (windows)
```
Open your favorite rest client with this url
http://localhost:8080/v1/fibonacci/{number}
replace {number} with any number
http://localhost:8080/v1/fibonacci/6

## Next versions
For future versions one improvement is to use a cache, example: if you try to get the result for large number it requires to compute all the results every time the endpoint is hited, the solution is to use a cache and avoid compute all the results.
