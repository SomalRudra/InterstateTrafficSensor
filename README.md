# InterstateTrafficSensor

This project uses Kafka messaging to simulate two cameras installed on a highway, which capture images of passing cars and extract their license plate numbers. Using this data, I built three services to help monitor and enforce speed limits on the highway.  
First, the SpeedService calculates the speed of every car that passes the cameras and writes the license plate and corresponding speed to the console. 
Any cars that exceed the speed limit of 72 miles per hour are then passed to the OwnerService, which looks up the owner information for each car and writes it to the console.  
Finally, the FeeCalculatorService calculates the fee that each owner must pay based on their speed, using a predetermined fee schedule. The service then writes the license plate, owner info, speed, and fee amount to the console for all cars that exceed the speed limit.  
This project was a great opportunity for me to work with Kafka messaging and explore how to apply it to real-world scenarios. I'm proud of the final result and I'm excited to share it with the community. Check out the code on my Github page and let me know what you think!

<img width="627" alt="Screenshot 2023-04-24 at 5 58 00 PM" src="https://user-images.githubusercontent.com/53370994/234133866-62836ab6-8708-4822-8af1-e2e6be7383d2.png">
