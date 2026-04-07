# Phishing-Detection-System-Java-
A Java-based Phishing Detection System using machine learning (Random Forest via Weka) to classify URLs as phishing or legitimate.
# Phishing Detection System - Java

## Overview
Detect phishing URLs using machine learning in Java (Weka). This project trains a Random Forest classifier on phishing datasets and predicts new URLs.

## Features
- Data preprocessing & standardization
- Random Forest model training
- Predict phishing URLs
- Modular, Java-based solution

## Setup
1. Clone repository
2. Add Weka jar to `lib/` or Maven dependency
3. Place dataset in `data/phishing_dataset.csv`

## How to Run
```bash
javac -cp "lib/weka-stable-3.8.6.jar" src/main/java/com/phishing/*.java
java -cp "lib/weka-stable-3.8.6.jar:src/main/java" com.phishing.PhishingDetection
Https://github.com/bishaltm567
