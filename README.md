### Development Environtment :
- [Android Studio Bumblebee](https://developer.android.com/studio)
- [jdk-17.0.2 LTS](https://adoptium.net/)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Appium Server GUI 1.22.2](https://github.com/appium/appium-desktop/releases/tag/v1.22.2)
- [Appium Inspector 2022.2.1](https://github.com/appium/appium-inspector/releases/tag/v2022.2.1)
- Pixel 3 Android 10 API 29 AVD

> **Don't forget to setup environtment variable like JAVA_HOME and ANDROID_HOME** 


### Appium Inspector Configuration :

- Remote Host : localhost
- Remote Path : /wd/hub
- Remote Port : 4723
- Capability :
```
{
  "appium:deviceName": "Pixel 3 API 29",
  "platformName": "Android",
  "appium:automationName": "UiAutomator2",
  "appium:platformVersion": "11",
  "appium:skipUnlock": false
}
```

## User Guide
1. Start AVD, Appium Server and Appium Inspector
2. Put ecommerce-test.apk on **resources** folder
3. Code under structure Tests/{feature-name}/{test-scenario}/{TC}.java
4. Add written class and test-scenario to Tests/{feature-name}.xml and to testng.xml
