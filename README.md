Load Testing Tool that utilizes a mock web server

How to run:

1.Change the values(if needed) in load_generation.properties to:

number.of.threads=100

ramp.up.period.in.seconds=100

loop.count=2

(100 requests in 100secs i.e. each request in 1 sec gap, looping twice, meaning 200 parallel requests)

2.Run RunMeFirstApiServer main method

3.Run testGetScreeningLocalAndGlobal method inside GetScreeningServiceTest

