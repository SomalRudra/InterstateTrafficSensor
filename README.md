# InterstateTrafficSensor

This project uses Kafka messaging in a microservice architecture to simulate two cameras installed on a highway, which capture images of passing cars and extract their license plate numbers. Using this data, I built three services to help monitor and enforce speed limits on the highway.  

First, the "InterstateTrafficSensors" service that takes input from 2 cameras via rest call. The camera input contains licencePlate, minute, second and cameraId which is mapped to an entity named 'SensorRecord'. This service then sends input of camera1 on the kafka stream on topic 'cameraTopic1' and the input of camera2 on topic 'cameraTopic2'.

Next,the InterstateSpeedService which has subscribed to 'cameraTopic1' and 'cameraTopic2' gets the sensor data, calculates the speed(miles/hour) of every car that passes the cameras using the formula (0.5/sensorRecord.getSecond())*3600 and writes the license plate and corresponding speed to the console. If speed is greater than the speed-limit, it fetches the owner info from the number plate and sends it to the kafka stream on the topic 'tofasttopic'

Finally, The OwnerService which has subscribed to 'tofasttopic' when gets the vehicle owner info who is speeding, calculates the fee using a predefined formula. The service then writes the license plate, owner info, speed, and fee amount for all cars that exceed the speed limit. 
  

<img width="627" alt="Screenshot 2023-04-24 at 5 58 00 PM" src="https://user-images.githubusercontent.com/53370994/234133866-62836ab6-8708-4822-8af1-e2e6be7383d2.png">
