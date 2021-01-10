1. mybatis generator to generate
    a. table object
    b. example object -> easy to implement more complicated mysql query
    c. mapper object -> map into the mapper.xml (add @Mapper to let spring boot recognize it), having methods like selectByPrimaryKey, selectByExample
    d. mapper.xml -> the raw sql query and table structure regarding to the mysql table
2. create controller
3. create service interface and implement it
