# springboot-microservices-orderproduct

This project is Done using java 1.8 features we had Explored spring boot micro services concepts .
We are using API Gateway and we are routing all our microservices to our Gateway.
We are using Eureka Service Registry and registring all our micro services in Eureka Service Registry.
After Registring all our Services in Eureka Service Registry we are injecting our services in Api Gate way.
We have Developed two micro services 1) Product service and 2) Order Service and we are calling our product service from order service because product service has dependency on order service. Each product has its order Id and order details associated with each order.
We are also using Hystrix to monitor our micro services Health History.
We have used Fall back methods and circutbreaker to notify user about our microservice health status and notify user when any service is down.
![Screenshot (62)](https://github.com/sivaganeshbathula70/springboot-microservices-orderproduct/assets/60910411/5f6d5b73-2641-4154-ac91-f83379e63c47)

****************************************** Block Diagram****************************************************************************

 ![Screenshot (63)](https://github.com/sivaganeshbathula70/springboot-microservices-orderproduct/assets/60910411/36c9b0fc-ad51-4021-aaa3-c3f66057ff1d)
 
 **************************************************** Service - Registry****************************************************************

![Screenshot (59)](https://github.com/sivaganeshbathula70/springboot-microservices-orderproduct/assets/60910411/e9eb36fc-29dc-427e-9bfb-4d6685389470)
we are calling our services from Api gateway

************************************************************** API- GateWay *******************************************************************
![Screenshot (57)](https://github.com/sivaganeshbathula70/springboot-microservices-orderproduct/assets/60910411/aea16c4f-f174-4f5d-8f59-a4de63538f7f)
When our service is down circut breaker call Fall back method
********************************************************** Circut Breaker********************************************************************







 
  
  


  
  
  
 
 
  
  
  
 
 
  
 
 
  
  
  
 
 
  
 
 
  
  
 







 
  
  
  
  
  
  
 
 
  
  
  
 
 
  
 
 
  
  
  
 
 
  
 
 
  
  
 



 
