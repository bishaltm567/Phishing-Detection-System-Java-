package com.phishing;

import weka.classifiers.Classifier;
import weka.core.Instances;
import weka.core.SerializationHelper;

public class DetectPhishing {

    public static void main(String[] args) {
        try {
            Instances data = Preprocess.loadAndPreprocess("data/phishing_dataset.csv");

            Classifier cls = (Classifier) SerializationHelper.read("models/phishing_model.model");
            System.out.println("Model loaded successfully!");

            System.out.println("Predictions for first 10 samples:");
            for (int i = 0; i < 10; i++) {
                double pred = cls.classifyInstance(data.instance(i));
                System.out.println("Sample " + (i+1) + " => " + data.classAttribute().value((int) pred));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
