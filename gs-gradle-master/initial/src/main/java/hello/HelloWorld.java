package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
    repositories  {
        mavenCentral(sourceCompatibility = 1.8
                targetCompatibility = 1.8)
    }

    dependencies {
        implementation "joda-time:joda-time:2.2"
        testImplementation "junit:junit:4.12"
    }
    jar {
        archiveBaseName = 'gs-gradle'
        archiveVersion =  '0.1.0'
    }
}