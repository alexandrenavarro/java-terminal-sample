# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/maven-plugin/reference/html/#build-image)



native-image --report-unsupported-elements-at-runtime -Djdk.internal.lambda.eagerlyInitialize=false --no-server -H:+ExitAfterRelocatableImageWrite -H:+SharedLibrary -H:+AddAllCharsets -H:+ReportExceptionStackTraces -H:-DeadlockWatchdogExitOnTimeout -H:DeadlockWatchdogInterval=0 --features=org.graalvm.home.HomeFinderFeature -H:TempDirectory=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/tmp -H:EnableURLProtocols=http,https -H:ReflectionConfigurationFiles=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/reflectionconfig-x86_64-linux.json -H:JNIConfigurationFiles=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/jniconfig-x86_64-linux.json -H:ResourceConfigurationFiles=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/resourceconfig-x86_64-linux.json -Dsvm.platform=org.graalvm.nativeimage.Platform$LINUX_AMD64 -cp /home/anavarro/IdeaProjects/java-terminal-sample/target/classes com.github.alexandrenavarro.javaterminalsample.JavaTerminalSampleApplication

native-image --report-unsupported-elements-at-runtime -Djdk.internal.lambda.eagerlyInitialize=false --no-server -H:+ExitAfterRelocatableImageWrite -H:+SharedLibrary -H:+AddAllCharsets -H:+ReportExceptionStackTraces --features=org.graalvm.home.HomeFinderFeature -H:TempDirectory=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/tmp -H:EnableURLProtocols=http,https -H:ReflectionConfigurationFiles=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/reflectionconfig-x86_64-linux.json -H:JNIConfigurationFiles=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/jniconfig-x86_64-linux.json -H:ResourceConfigurationFiles=/home/anavarro/IdeaProjects/java-terminal-sample/target/client/x86_64-linux/gvm/resourceconfig-x86_64-linux.json -cp /home/anavarro/IdeaProjects/java-terminal-sample/target/classes com.github.alexandrenavarro.javaterminalsample.JavaTerminalSampleApplication
