## Запуск тестов

#### Для запуска тестов локально на Android emulator:

```
gradle clean android_local -DdeviceHost=emulator
```

#### Для запуска тестов в browserstack на Android:

```
gradle clean android -DdeviceHost=android
```

#### Для запуска тестов в browserstack на iOS:

```
gradle clean ios -DdeviceHost=ios
```