
# Credit Card Validator

A simple Java program which validates credit card numbers using Luhn's Algorithm.

# Luhn Algorithm

The Luhn algorithm, also known as the modulus 10 or mod 10 algorithm, is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers, IMEI numbers, Canadian Social Insurance Numbers. Most credit cards and many government identification numbers use the algorithm as a simple method of distinguishing valid numbers from mistyped or otherwise incorrect numbers. It was designed to protect against accidental errors, not malicious attacks.

Step 1 – Starting from the rightmost digit, double the value of every second digit

Step 2 – If doubling of a number results in a two digit number i.e greater than 9(e.g., 6 × 2 = 12), then add the digits of the product (e.g., 12: 1 + 2 = 3, 15: 1 + 5 = 6), to get a single digit number. 

Step 3 – Now take the sum of all the digits.

Step 4 – If the total modulo 10 is equal to 0 (if the total ends in zero) then the number is valid according to the Luhn formula; else it is not valid.


# Docker

Download Docker Desktop for Mac or Windows. Docker Compose will be automatically installed. On Linux, make sure you have the latest version of Compose.

This solution uses ubuntu:20.04 image to compile the code.

Run the following command to create a image and run it.

Step 1 – Below command is for create an image. 
```bash
docker build -t {image-name}:tag .
```
Step 2 – Below command is for run the image.

```bash
docker run --rm -it {image-name}:tag
```
