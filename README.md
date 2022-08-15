# springboot-initial

** ApplicationContext is a corner stone of a Spring Boot application. 
    It represents the Spring IoC container and is responsible for instantiating, 
    configuring, and assembling the beans. 

** Layers : Controller <-> Service <-> Persistence

** Integration Test
        - Integration testing between two or more classes / units/ layers.
        - It's real application test.
        - Creates application context and do actual call.
        - Time consuming
        - Testing for whole path.
        
** Unit Tests
        - For a single Unit e.g. class
        
** Integration testing vs functional testing
        What is the difference between functional testing and integration testing?
        Functional testing is performed to validate all functionalities of an application,
        while integration testing is performed to validate the interaction across modules 
        and verify that they work well when compiled.
        
** @SpringBootTest vs test slice annotation
    @SpringBootTest annotation loads the complete Spring application context. 
    In contrast, a test slice annotation only loads beans required to test a particular
    layer. And because of this, we can avoid unnecessary mocking and side effects.
     
** Test slice annotation
    1. @WebMvcTest 
    
** https://reflectoring.io/spring-boot-test/
    @WebMvcTest
    Our web controllers bear many responsibilities, 
        - such as listening to the HTTP request, 
        - validating the input, calling the business logic, serializing the output, 
        - and translating the Exceptions to a proper response. We should write tests 
     to verify all these functionalities.
    
    The @WebMvcTest test slice annotation will set up our application context with just
     enough components and configurations required to test our web controller layer. 
     For instance, it will set up our @Controller’s, @ControllerAdvice’s, a MockMvc bean, 
     and some other auto configuration.
     
    @DataJpaTest
        Just like @WebMvcTest allows us to test our web layer, @DataJpaTest is used to test the
         persistence layer.
    
    