# Contact Keeper App

Contact Keeper is an Android application that allows users to manage their contacts efficiently. It supports adding, editing, and deleting contacts, as well as assigning a profile photo to each contact. The app is built using MVVM architecture with Dependency Injection and Room database. It utilizes Material3 for a modern and cohesive UI design.

## Features

- **Add Contacts:** Add new contacts with name, phone number, email, and profile photo.
- **Edit Contacts:** Edit existing contacts' details.
- **Delete Contacts:** Remove contacts from the list.
- **Profile Photo:** Assign and display profile photos for each contact.
- **MVVM Architecture:** Follows MVVM architecture for a clean and maintainable codebase.
- **Room Database:** Uses Room database for local storage of contacts.
- **Material3 UI:** Modern UI components using Material3.

## Screenshots

*Include your screenshots here*

## Installation

1. Clone the repository:
    ```bash
    git clone https://github.com/yourusername/contactkeeper.git
    ```
2. Open the project in Android Studio.
3. Build and run the app on your Android device or emulator.

## File Structure

```plaintext
ContactKeeper/
├── .gitignore
├── build.gradle.kts
├── gradle.properties
├── gradlew
├── gradlew.bat
├── settings.gradle.kts
├── app/
│   ├── .gitignore
│   ├── build.gradle.kts
│   ├── proguard-rules.pro
│   ├── src/
│   │   ├── androidTest/
│   │   │   └── java/
│   │   │       └── com/
│   │   │           └── geniusapk/
│   │   │               └── contactkeeper/
│   │   │                   └── ExampleInstrumentedTest.kt
│   │   ├── main/
│   │   │   ├── AndroidManifest.xml
│   │   │   ├── ic_launcher-playstore.png
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── geniusapk/
│   │   │   │           ├── BaseApplication.kt
│   │   │   │           ├── MainActivity.kt
│   │   │   │           ├── data/
│   │   │   │           │   ├── test
│   │   │   │           │   └── database/
│   │   │   │           │       ├── Contact.kt
│   │   │   │           │       ├── ContectDataBase.kt
│   │   │   │           │       └── Dao.kt
│   │   │   │           ├── di/
│   │   │   │           │   └── HiltModule.kt
│   │   │   │           ├── navigation/
│   │   │   │           │   ├── NavGraph.kt
│   │   │   │           │   └── Routes.kt
│   │   │   │           ├── presentation/
│   │   │   │           │   ├── ContactState.kt
│   │   │   │           │   ├── ContactViewModel.kt
│   │   │   │           │   ├── Screens/
│   │   │   │           │   │   ├── AddEditScreen.kt
│   │   │   │           │   │   └── HomeScreen.kt
│   │   │   │           │   └── Utils/
│   │   │   │           │       ├── CustemTextField.kt
│   │   │   │           │       └── ImageCompress.kt
│   │   │   │           └── ui/
│   │   │   │               └── theme/
│   │   │   │                   ├── Color.kt
│   │   │   │                   ├── Theme.kt
│   │   │   │                   └── Type.kt
│   │   │   └── res/
│   │   │       ├── drawable/
│   │   │       │   ├── ic_launcher_background.xml
│   │   │       │   └── ic_launcher_foreground.xml
│   │   │       ├── mipmap-anydpi/
│   │   │       ├── mipmap-anydpi-v26/
│   │   │       │   ├── ic_launcher.xml
│   │   │       │   └── ic_launcher_round.xml
│   │   │       ├── mipmap-hdpi/
│   │   │       │   ├── ic_launcher.webp
│   │   │       │   └── ic_launcher_round.webp
│   │   │       ├── mipmap-mdpi/
│   │   │       │   ├── ic_launcher.webp
│   │   │       │   └── ic_launcher_round.webp
│   │   │       ├── mipmap-xhdpi/
│   │   │       │   ├── ic_launcher.webp
│   │   │       │   └── ic_launcher_round.webp
│   │   │       ├── mipmap-xxhdpi/
│   │   │       │   ├── ic_launcher.webp
│   │   │       │   └── ic_launcher_round.webp
│   │   │       ├── mipmap-xxxhdpi/
│   │   │       │   ├── ic_launcher.webp
│   │   │       │   └── ic_launcher_round.webp
│   │   │       ├── values/
│   │   │       │   ├── colors.xml
│   │   │       │   ├── ic_launcher_background.xml
│   │   │       │   ├── strings.xml
│   │   │       │   └── themes.xml
│   │   │       └── xml/
│   │   │           ├── backup_rules.xml
│   │   │           └── data_extraction_rules.xml
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── geniusapk/
│   │                   └── contactkeeper/
│   │                       └── ExampleUnitTest.kt
├── gradle/
│   ├── libs.versions.toml
│   └── wrapper/
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
```
hello
