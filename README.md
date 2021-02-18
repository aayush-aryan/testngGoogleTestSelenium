# testngGoogleTestSelenium


dependencies {
    implementation 'org.testng:testng:7.1.0'
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.0'
    testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine'

    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.0.0-alpha-7'
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver
    implementation group: 'org.seleniumhq.selenium', name: 'selenium-chrome-driver', version: '4.0.0-alpha-7'

    // https://mvnrepository.com/artifact/commons-io/commons-io
    implementation group: 'commons-io', name: 'commons-io', version: '2.7'

    // https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
    implementation group: 'io.github.bonigarcia', name: 'webdrivermanager', version: '4.3.0'

    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation group: 'org.testng', name: 'testng', version: '7.1.0'

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-log4j12
   //  testImplementation group: 'org.slf4j', name: 'slf4j-log4j12', version: '2.0.0-alpha0'

    // https://mvnrepository.com/artifact/org.slf4j/slf4j-simple
    testImplementation group: 'org.slf4j', name: 'slf4j-simple', version: '1.7.30'

// https://mvnrepository.com/artifact/org.slf4j/slf4j-api
    implementation group: 'org.slf4j', name: 'slf4j-api', version: '1.7.30'

    // https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml
    implementation group: 'org.apache.poi', name: 'poi-ooxml', version: '3.9'

}

test {
    useTestNG()
}
