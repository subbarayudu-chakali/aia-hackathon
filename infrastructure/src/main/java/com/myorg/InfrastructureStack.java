package com.myorg;

import software.amazon.awscdk.Duration;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class InfrastructureStack extends Stack {
    public InfrastructureStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public InfrastructureStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

        // The code that defines your stack goes here

        Function.Builder.create(this, "function")
                .functionName("aiaHackathonFunction")
                .memorySize(128)
                .timeout(Duration.seconds(30))
                .handler("com.cts.hackathon.HelloLambda")
                .code(Code.fromAsset("../assets/function.jar"))
                .runtime(Runtime.JAVA_11)
                .build();
    }
}
