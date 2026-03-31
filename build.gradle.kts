plugins {
    java
    id("com.osacky.doctor") version "0.11.0"
}

doctor {
//    warnWhenNotUsingParallelGC.set(false)
    javaHome {
        ensureJavaHomeMatches.set(false)
        ensureJavaHomeIsSet.set(false)
    }
}
