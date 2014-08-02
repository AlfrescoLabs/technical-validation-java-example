/*
 * Copyright (C) 2007-2014 Peter Monks.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * This file is part of an unsupported extension to Alfresco.
 * 
 */


package org.alfrescolabs.technical.validation.java.example;

import java.util.List;
import java.util.Map;

import com.google.gson.*;

import org.alfrescolabs.technical.validation.AlfrescoTechnicalValidation;
import org.alfrescolabs.technical.validation.impl.AlfrescoTechnicalValidationImpl;

/**
 * This class demonstrates how to use the Java API interface to the Alfresco
 * Technical Validation tool (https://github.com/AlfrescoLabs/technical-validation).
 *
 * @author Peter Monks (pmonks@gmail.com)
 *
 */
public class JavaExample
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        AlfrescoTechnicalValidation atv               = new AlfrescoTechnicalValidationImpl();
        List<Map<String,Object>>    validationResults = atv.validate(args[0], args[1], args[2]);
        
        // Print the results as JSON, because it's one of the few sane ways to pretty print nested collections in Java #fail
        Gson   gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(validationResults);
        System.out.println(json);
    }

}
