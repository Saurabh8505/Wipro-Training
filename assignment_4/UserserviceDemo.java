// Create an interface UserService with a default method getWelcomeMessage(), which returns "Welcome, Guest!" if no name is provided. Implement a method getUser(String name) that returns an Optional<String> representing the user's name. In the implementation, if the name is present, return a welcome message with the user's name; otherwise, return the default message.
 
//Hint: Use Optional.ofNullable() and default methods in interfaces.


package assignment_4;

import java.util.Optional;

interface UserService {
   
    default String getWelcomeMessage() {
        return "Welcome, Guest!";
    }

   
    Optional<String> getUser(String name);
}

class UserServiceImpl implements UserService {

    
    @Override
    public Optional<String> getUser(String name) {
       
        if (name == null || name.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(name); 
    }

    
    @Override
    public String getWelcomeMessage() {
        return "Welcome to our service!";
    }
}

public class UserserviceDemo {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        
        String name = "John";
        String welcomeMessage = userService.getUser(name)
            .map(userName -> "Welcome, " + userName + "!") 
            .orElse(userService.getWelcomeMessage()); 

        System.out.println(welcomeMessage); 

        
        String noName = null;
        welcomeMessage = userService.getUser(noName)
            .map(userName -> "Welcome, " + userName + "!")
            .orElse(userService.getWelcomeMessage()); 

        System.out.println(welcomeMessage); 
    }
}
