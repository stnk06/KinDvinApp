# <a id="ru"></a>Кинь-Двинь бродилка / Kin-Dvin Board Game

«Кинь-Двинь бродилка» — пошаговая настольная игра для смартфонов и планшетов на базе Android. Приложение предназначено для совместной игры компании друзей или семьи за одним экраном: игроки делятся на команды, по очереди бросают кубик, двигают фишки по маршруту, выполняют задания и соревнуются за право первым пересечь финишную черту.

В проекте совмещены механика классических настольных бродилок, система ставок на выполнение испытаний, а также встроенные редакторы, позволяющие полностью менять контент и правила под конкретную компанию.

---

## Язык / Language
- [Русский](#ru)
- [English](#en)

---

## Правила игры

В основе игрового процесса лежит классический принцип ходилок («брось кубик — сделай ход»), дополненный командным соревнованием и случайными событиями.

### 1. Подготовка к партии
1. Игроки делятся на две или более команды.
2. В редакторе команд настраиваются названия и выбираются индивидуальные фишки для каждой стороны.
3. Все участники выставляются на стартовую позицию игрового поля.

### 2. Ход игры
- Команды совершают ходы строго по очереди.
- Активный игрок нажимает кнопку броска кубика.
- Генератор случайных чисел определяет значение от 1 до 6, сопровождаемое анимацией и звуком.
- Фишка команды перемещается по клеткам поля на выпавшее число шагов.

### 3. Специальные клетки поля
Игровое поле состоит не только из базовых ячеек маршрута, но и включает события:
- **Клетки испытаний (челленджи):** команда вытягивает случайное задание из базы. Доступна система ставок: можно рискнуть и подтвердить выполнение задания ради получения игрового бонуса, либо потерять позицию при отказе или неудаче.
- **Телепорты (стрелки):** могут перенести фишку вперед ближе к финишу либо отбросить ее назад.
- **Клетки атаки (мечи):** создают прямое противостояние между командами, если траектории их движения пересекаются.

### 4. Победа
Побеждает команда, чья фишка первой достигает финальной клетки игрового поля.

---

## Основные возможности

- **Игра на одном устройстве:** подключение к интернету не требуется, телефон или планшет передается из рук в руки.
- **Редактор команд:** добавление, удаление и переименование команд, назначение индивидуальных аватаров и фишек.
- **Редактор заданий:** встроенный список испытаний можно свободно редактировать и дополнять собственными вопросами или активностями прямо в приложении.
- **Редактор поля:** настройка структуры маршрута и распределения специальных клеток.
- **Звуковое и визуальное оформление:** озвучка броска кубика, шагов фишек, событий атаки, телепортации и победного финала.

---

## Технический стек

- **Платформа:** Android SDK
- **Язык разработки:** Java
- **Среда разработки:** Android Studio
- **Система сборки:** Gradle
- **Архитектурные решения:**
  - Разделение логики по экранам (`SplashActivity`, `MainActivity`, `TeamEditorActivity`, `ChallengeEditorActivity`, `CellEditorActivity`).
  - Кастомные компоненты интерфейса (`PathView`, `SquareCardView`).
  - Централизованное управление звуками (`SoundManager`) и базой испытаний (`ChallengeRepository`).

---

## Сборка и установка

1. Клонируйте репозиторий:
   ```bash
   git clone [https://github.com/stnk06/KinDvinApp.git](https://github.com/stnk06/KinDvinApp.git)
   ```
2. Откройте проект в Android Studio.
3. Дождитесь завершения синхронизации Gradle.
4. Подключите Android-устройство с включенной отладкой по USB или запустите эмулятор.
5. Нажмите кнопку **Run** в среде разработки.
6. Для ручной сборки APK выполните в корне проекта команду:
   ```bash
   ./gradlew assembleDebug
   ```
   Файл APK будет сгенерирован по пути: `app/build/outputs/apk/debug/app-debug.apk`.

---

# <a id="en"></a>Kin-Dvin Board Game (English)

Kin-Dvin is a turn-based multiplayer board game developed for Android smartphones and tablets. The app is built for local multiplayer (pass-and-play) on a single screen: players split into teams, roll the dice, move tokens across the board, complete challenges, and race to reach the finish line first.

The project combines traditional roll-and-move mechanics with challenge betting systems and built-in editors that allow full customization of teams, board layout, and tasks.

---

## Game Rules

The core gameplay follows classic roll-and-move mechanics enhanced with team rivalry and interactive board events.

### 1. Game Setup
1. Players divide into two or more teams.
2. In the Team Editor, players set team names and select custom pawns.
3. All pawns start at the initial board cell.

### 2. Turn Order
- Teams take turns sequentially.
- The active player taps the dice roll button.
- The app generates a random number from 1 to 6 with matching roll animations and sound effects.
- The team's pawn advances across the board by the rolled number of steps.

### 3. Special Board Cells
The board features regular path cells as well as interactive event tiles:
- **Challenge Cells:** The team draws a random task from the pool. Players can place bets on completing the challenge to gain advantages or risk setbacks if they fail.
- **Teleports:** Instantly move the pawn several steps forward or backward along the track.
- **Attack Cells:** Trigger direct competition between teams when their movement paths intersect.

### 4. Victory Condition
The first team to land on the final cell of the board wins the match.

---

## Features

- **Single-Device Multiplayer:** No internet connection required; players pass the device around during home parties or gatherings.
- **Team Editor:** Add, remove, and rename teams with unique pawn icons and colors.
- **Challenge Editor:** Create and manage a custom database of tasks, trivia, and physical challenges directly within the app.
- **Board Editor:** Adjust grid configuration, cell types, and special event placements.
- **Audio and Visual Polish:** Custom animations and dedicated sound effects for rolling dice, pawn steps, teleports, attacks, and match victory.

---

## Tech Stack

- **Platform:** Android SDK
- **Language:** Java
- **IDE:** Android Studio
- **Build System:** Gradle
- **Architecture Highlights:**
  - Clear separation into activities (`SplashActivity`, `MainActivity`, `TeamEditorActivity`, `ChallengeEditorActivity`, `CellEditorActivity`).
  - Custom UI views (`PathView`, `SquareCardView`) and adapters for flexible grid and list rendering.
  - Dedicated utility managers for audio playback (`SoundManager`) and challenge storage (`ChallengeRepository`).

---

## How to Build and Run

1. Clone the repository:
   ```bash
   git clone [https://github.com/stnk06/KinDvinApp.git](https://github.com/stnk06/KinDvinApp.git)
   ```
2. Open the project in Android Studio.
3. Wait for Gradle sync to complete.
4. Connect an Android device via USB debugging or start an emulator.
5. Click **Run** in Android Studio.
6. To build the debug APK via CLI, run:
   ```bash
   ./gradlew assembleDebug
   ```
   The generated APK will be located at: `app/build/outputs/apk/debug/app-debug.apk`.
