#Disconf with guice

We are considering using Disconf for our distribution conf, 
but it cannot integrate with guice , so ... , 
we create this project for integrating with guice and manage bean lifecycle with ninja framework , just see @Start @Dispose annotations.

### How to use ?
AppTest.class give us an easy sample.

### Attention 

All of jar dependences are scoped 'provided'. This means that you should dependence those which should dependence.

### Contributors
konghang