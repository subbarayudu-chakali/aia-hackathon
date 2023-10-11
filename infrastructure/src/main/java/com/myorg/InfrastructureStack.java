package com.myorg;

import software.amazon.awscdk.Duration;
import software.amazon.awscdk.RemovalPolicy;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;
import software.amazon.awscdk.services.s3.*;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;

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
        Bucket bucket = Bucket.Builder.create(this, "cdk-java-idp-bucket")
                .objectOwnership(ObjectOwnership.BUCKET_OWNER_ENFORCED)
                .encryption(BucketEncryption.S3_MANAGED)
                .blockPublicAccess(BlockPublicAccess.BLOCK_ALL)
                .versioned(false)
                .removalPolicy(RemovalPolicy.DESTROY)
                .bucketName("aia-insurance-hackathon-bucket")
                .enforceSsl(true)
                .objectLockEnabled(false)
                .build();
    }
}
