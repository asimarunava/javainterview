# Below are the JVM related options for better profiling

## -XX:+PrintCompilation

This option will show if the some portion of the code is used by C1 or C2 compiler to create Native code block for Faster execution. Level 1,2,3 is C1. Level 4 is C2. C2 is better. JVM decidees it.

## -XX:+UnlockDiagnosticVMPtions -XX:+LogCompilation

This will log the compilation output to a file.


