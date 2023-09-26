# Redis-Using-Springboot
1) First you need to install redis server on your system. Following are Ubuntu commands to install Redis server.
     sudo apt update
     sudo apt install redis-server

2) Then you need to start the Redis server by entering command on terminal
     sudo service redis-server start
   
3) you can check if redis server has started or not using following commands
     sudo systemctl status redis-server
     redis-cli ping

4) To stop the Redis server uses following command
   sudo service redis-server stop

5) You need to add following configurations in application.property file for Redis configurations
     spring.redis.host=localhost
     spring.redis.port=6379

6) Also above entity need to add "@RedisHash("User")" annotation.
