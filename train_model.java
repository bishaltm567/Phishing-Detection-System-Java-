package com.phishing;

import weka.classifiers.trees.RandomForest;
import weka.classifiers.Classifier;
import weka.core.Instances;
import weka.core.SerializationHelper;

public class TrainModel {

    public static void main(String[] args) {
        try {
            Instances data = Preprocess.loadAndPreprocess("data/phishing_dataset.csv");

            RandomForest rf = new RandomForest();
            rf.setNumTrees(100);
            rf.buildClassifier(data);

            SerializationHelper.write("models/phishing_model.model", rf);
            System.out.println("Model trained and saved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
