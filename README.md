# AIA Insurance Hackathon

### TODO (Theoretical flow):
* Intelligent Document Processing Flow
  * Uploading files into s3 bucket
  * Document classification
  * Feature extraction, textract queries, PII identification
  * Insights generation using comprehend 
  * creating json / csv file with feature details including medical history summary
  * sending data to up/downstream systems
* Augmented AI when the confidence score is less than 80% (signatures, identity forms, etc,.)
* Summarizing or Classifying risk profiles based on applicant medical history
* Finalizing features required for premium calculation (Health or Term or Life)
* Explainability model to explain the risk profile classification and premium prediction
* Serverless framework to automate the full flow or at least IDP
* CI/CD pipeline

## Technology Suite

## Architecture

## Resources

### Questions
* How to collect lifestyle information (habits, salary usage, credit score, health related activities, etc)
* Creating separate buckets for different types of insurances like 3 buckets for 3 types of insurance instead of storing all files in a single bucket
* Creating a GITHUB gist to share with others
* adding Alerting(CloudWatch/Slack/SNS/SES), monitoring (ELK/Splunk/Datadog/NewRelic whichever is simpler to setup) and logging (SLF4J)