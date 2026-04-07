package com.phishing;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Standardize;

public class Preprocess {

    public static Instances loadAndPreprocess(String filePath) throws Exception {
        DataSource source = new DataSource(filePath);
        Instances data = source.getDataSet();

        if (data.classIndex() == -1)
            data.setClassIndex(data.numAttributes() - 1);

        Standardize filter = new Standardize();
        filter.setInputFormat(data);
        Instances newData = Filter.useFilter(data, filter);

        return newData;
    }
}
