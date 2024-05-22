package JdbcIntro.blit;

public class Day1 {
    public static void main(String[] args) {
//        JDBC: JAVA DATABASE CONNECTIVITY:
//        -> MySql driver lib = my sql connecto jarfile
//        -> driver manager (class) = this will create a connection to the database
//        -> connection (interface) = this will represent the physical connection to a database
//        -> statement (interface) = this represents a sql statement to run against the database
//        -> prepared statement (interface) = this represents a sql statement that
//                                          is ready to accept parameters
//        -> resultSet (interface) = this represents a response to a query from database
//      DAO =DAO design pattern (data access object).
//      DAO = provides a clean separation between the business logic and our data access logic
//        CRUD = create, update, delete , read/ display
//
//      1-  DAO INTERFACE = CRUD OPERATIONS.
//        -> abstract methods without implementations
//        DAO IMPLEMENTATIONS (class): it will deal with the crud operation implementations.
//      2-  entity class= pojo class = plain old java objects =
//        (any object so if you create user object there will be a user class)
//        private methods-> getters/setters -> constructors
//      3-  Service= build our business logic
//      4-  Controllers = user will interact with this layer to perform crud operations
//      5-  Util = for util functions
//      WORKFLOW:
//        database <- dao implementations <- services <- controllers.

    }
}
