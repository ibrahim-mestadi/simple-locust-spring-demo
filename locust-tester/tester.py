from locust import HttpUser, task, between 
#importing required classes, function from locust module.

class SpringBootUser(HttpUser): #Simulates a single Real world User. HttpUser class is extended so we provide what task user will do.
    
    wait_time = between(1, 3) 
    
    '''
    @task are treated as a singel http request made.
    We can multiple have @task. In below we are going 
    to hit /greet endpoint on our localhost
    '''
    @task
    def hello_world(self):
        self.client.get("/greet")