# AHF-QoSEvaluatorSkeleton
Skeleton project for creating new QoS evaluators for the extended QoS architecture within the Arrowhead Framework

## Creating custom evaluators

Simply add your logic into `QoSEvaluatorImpl.java`!

## Building the evaluator jar file

Run `mvn clean install` to build the evaluator jar.

## Adding evaluator to the Orchestrator Core System

Copy this jar in the directory that is configured within your Orchestrator core system. (Specified with `-Dloader.path=<path>` on commandline or with property `loader.path=<path>` inside the `loader.properties` in the same directory as the Orchestrator's jar file)
