package com.cts.hackathon;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Hello world!
 *
 */
public class HelloLambda implements RequestHandler<String, String>
{

    @Override
    public String handleRequest(String name, Context context) {
        return "Hello from AWS Lambda " + name;
    }

}
