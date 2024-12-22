# Java

**ИКБО-11-23 Амбарцумян Арик**

**Домашние задания**

**№ 9**

**Задание 1**
  ### 1. `ArrayUtils.java`
   - **Описание**:
   Служебный класс, ориентированный на операции с массивами, специально разработанный для обработки массивов окружностей (объектов "Circle").
   - **Ключевой метод**:
   - `findLargestCircle(Circle[] круги)`: Находит и возвращает наибольшую окружность из массива объектов `Circle` на основе их радиуса. Если входной массив равен `null` или пуст, метод возвращает `null`.

  ### 2. `Main.java`
  - **Описание**:
   Основная отправная точка для тестирования и демонстрации служебных классов.
  - **Функциональность**:
   - Демонстрирует использование `CollectionUtils`, `SearchUtils`, `ArrayUtils` и `MultiArrayUtils`.
  - **Тестовые сценарии**:
   1. **Удаление дубликатов из списка**:
    - Использует CollectionUtils.removeDuplicates для удаления повторяющихся элементов из списка целых чисел.
   2. **Линейный поиск в массиве**:
    - Использует SearchUtils.Линейный поиск` для поиска целевого значения в массиве целых чисел.
   3. **Поиск наибольшего круга в массиве**:
    - Тесты `ArrayUtils.findLargestCi

### 3.`Circle.java`

Класс Circle моделирует объект circle с радиусом и реализует интерфейс Comparable<Окружность>. Это позволяет сравнивать окружности на основе их радиуса.

#### Конструктор
- `Окружность (двойной радиус)`: Создает новую окружность с указанным радиусом.

#### Методы
- `double getRadius()`: Возвращает радиус окружности.
- `int compareTo(окружность другая)`: Сравнивает эту окружность с другой окружностью на основе их радиуса.
- `String toString()`: Возвращает строковое представление окружности, отформатированное как `Окружность с радиусом: <radius>`.

### 4.`SearchUtils.java`

Класс `SearchUtils` включает статический метод `linearSearch`, который позволяет выполнять поиск в целочисленном массиве по определенному целевому значению. Он выполняет ** линейный поиск**, что означает, что он последовательно проверяет каждый элемент в массиве.

#### Метод

- **`static int linearSearch(int[] array, int target)`**: Этот метод выполняет поиск по массиву в поисках заданного целевого значения. Он возвращает индекс целевого объекта, если он найден, или `-1`, если целевой объект отсутствует в массиве.

#### Параметры:
- `array`: массив целых чисел, в котором выполняется поиск.
- `target`: целочисленное значение для поиска в массиве.

#### Return:
- Возвращает индекс "цели", если она найдена.
- Возвращает значение "-1", если "цель` не найдена в массиве.
### 5.`MultiArrayUtils.java`

Класс `MultiArrayUtils` предоставляет статический метод `findLargestIn2DArray`, который находит и возвращает круг с наибольшим радиусом из всех элементов в двумерном массиве объектов типа `Circle`.

#### Метод

- **`static Circle findLargestIn2DArray(Circle[][] array)`**: Метод ищет наибольший круг в двумерном массиве `Circle`. Он сравнивает каждый элемент массива и возвращает круг с максимальным радиусом.

#### Параметры:
- `array`: Двумерный массив объектов типа `Circle`, в котором будет произведен поиск.

#### Возвращаемое значение:
- Возвращает объект `Circle`, который имеет наибольший радиус среди всех элементов в массиве.
- Если массив пустой или равен `null`, метод возвращает `null` (или можно выбросить исключение, в зависимости от реализации).
### 6.`SearchUtils.java` 

Класс `SearchUtils` предоставляет статический метод для выполнения линейного поиска в массиве целых чисел. Метод проверяет каждый элемент массива по очереди и возвращает индекс целевого элемента, если он найден. Если элемент не найден, метод возвращает `-1`.

#### Метод

- **`static int linearSearch(int[] array, int target)`**: Этот метод выполняет линейный поиск в массиве целых чисел. Он последовательно проверяет каждый элемент массива и возвращает индекс элемента, если он совпадает с целевым значением. Если элемент не найден, метод возвращает `-1`.

#### Параметры:
- `array`: Массив целых чисел, в котором нужно искать.
- `target`: Целевое значение, которое нужно найти в массиве.

#### Возвращаемое значение:
- Возвращает индекс первого вхождения целевого элемента в массиве, если он найден.
- Возвращает `-1`, если элемент не найден в массиве.

**Задание 2**

### `1.Main.java`

Класс `Main` является точкой входа в программу. Он предоставляет пользователю возможность ввести 5 строк, которые затем помещаются в стек, и выводит эти строки в обратном порядке.

#### Основные шаги программы:
1. Создание объекта `ArrayStack`.
2. Ввод 5 строк с помощью `Scanner`.
3. Помещение строк в стек.
4. Извлечение строк из стека и вывод их в обратном порядке.

### `2.GenericStack.java` 

`GenericStack` — это обобщенный класс, реализующий стек, который может хранить элементы любого типа, используя обобщения. Он предоставляет основные операции стека: добавление элемента (push), удаление элемента (pop), просмотр верхнего элемента (peek), а также методы для проверки состояния стека.

#### Методы класса:

- **`push(E value)`**: Добавляет элемент в стек.
- **`pop()`**: Удаляет и возвращает верхний элемент стека.
- **`peek()`**: Возвращает верхний элемент стека, не удаляя его.
- **`isEmpty()`**: Проверяет, пуст ли стек.
- **`getSize()`**: Возвращает текущий размер стека.
- **`toString()`**: Возвращает строковое представление стека.

#### Внутреннее расширение массива:

Если стек заполняется, метод `expandCapacity()` увеличивает размер внутреннего массива в два раза, чтобы вместить новые элементы.
### `3.ArrayStack.java`

Класс `ArrayStack` наследуется от `ArrayList` и предоставляет основные операции для работы со стеком:

- **push(E o)**: Добавляет элемент в стек.
- **pop()**: Удаляет и возвращает верхний элемент стека.
- **peek()**: Возвращает верхний элемент стека, не удаляя его.
- **isEmpty()**: Проверяет, пуст ли стек.
- **getSize()**: Возвращает текущий размер стека.
- **toString()**: Возвращает строковое представление стека.

### Методы класса:

- **`push(E o)`**: Добавляет элемент в стек, используя метод `add` из `ArrayList`.
- **`pop()`**: Извлекает и удаляет верхний элемент стека, используя метод `remove` из `ArrayList`.
- **`peek()`**: Возвращает верхний элемент стека, но не удаляет его, используя метод `get` из `ArrayList`.
- **`isEmpty()`**: Проверяет, пуст ли стек, используя метод `isEmpty` из `ArrayList`.
- **`getSize()`**: Возвращает текущий размер стека с использованием метода `size` из `ArrayList`.

**№ 10**

**Задание 1**

### `1.MyStack.java`
Этот класс реализует основные операции для работы со стеком:
- **Добавление элемента (`push`)**.
- **Извлечение последнего элемента (`pop`)**.
- **Просмотр последнего элемента без удаления (`peek`)**.
- **Проверка, пуст ли стек (`isEmpty`)**.
- **Получение количества элементов в стеке (`getSize`)**.

#### Основные характеристики:
- Реализован на основе композиции с использованием `ArrayList`.
- Исключения (`IllegalStateException`) обрабатывают случаи обращения к пустому стеку.


### `2.MyStackClient.java`
Это клиентская программа, которая демонстрирует функциональность стека. Пользователь вводит пять строк, которые сохраняются в стек, а затем извлекаются и выводятся в консоль в обратном порядке.

#### Ход выполнения программы:
1. Пользователь вводит 5 строк с клавиатуры.
2. Программа сохраняет строки в стек с использованием метода `push`.
3. Программа извлекает строки методом `pop` и выводит их на экран в порядке, обратном вводу.

**Задание 2**

### 1. Класс `MyStack.java` (Наследование)
Этот класс расширяет функциональность стандартного класса `ArrayList` и добавляет методы для работы со стеком:
- **Добавление элемента (`push`)**.
- **Извлечение последнего элемента (`pop`)**.
- **Просмотр последнего элемента без удаления (`peek`)**.
- **Проверка, пуст ли стек (`isEmpty`)**.
- **Получение количества элементов в стеке (`getSize`)**.

#### Основные характеристики:
- Наследуется от `ArrayList`, что избавляет от необходимости реализовывать стандартные операции с массивами (например, добавление или удаление элементов).
- Исключения (`IllegalStateException`) защищают от ошибок при попытке извлечения элемента из пустого стека.

### `2.MyStackClient.java`
Это клиентская программа, демонстрирующая использование стека (`MyStack`). Пользователь вводит пять строк, которые сохраняются в стек, а затем извлекаются и выводятся в консоль в обратном порядке.

#### Ход выполнения программы:
1. Пользователь вводит 5 строк с клавиатуры.
2. Строки добавляются в стек методом `push`.
3. Программа извлекает строки методом `pop` и выводит их на экран в порядке, обратном вводу.

**Задание 3**

### `1.MyStack.java`
Класс реализует стек с использованием композиции (`ArrayList`) и предоставляет следующие методы:
- **Добавление элемента (`push`)**.
- **Извлечение последнего элемента (`pop`)**.
- **Просмотр последнего элемента без удаления (`peek`)**.
- **Проверка, пуст ли стек (`isEmpty`)**.
- **Получение количества элементов в стеке (`getSize`)**.
- **Создание глубокой копии стека (`deepCopy`)**.

#### Основные характеристики:
- Композиция с `ArrayList` для хранения элементов.
- Исключения (`IllegalStateException`) обрабатывают случаи обращения к пустому стеку.
- Метод `deepCopy` создает новый экземпляр `MyStack` и копирует в него все элементы исходного стека.

### `2.MyStackClient.java`
Этот класс демонстрирует использование `MyStack`. Пользователь вводит строки, которые сохраняются в стек, затем программа извлекает строки и выводит их в обратном порядке.

#### Ход выполнения программы:
1. Пользователь вводит 5 строк с клавиатуры.
2. Строки добавляются в стек методом `push`.
3. Программа извлекает строки методом `pop` и выводит их в порядке, обратном вводу.

**№ 11**

### `1.StackOnQueue.java`
Реализация стека через две очереди (`queue1` и `queue2`) для выполнения следующих операций:
- **Добавление элемента (`push`)** — добавляет элемент в конец `queue1`.
- **Удаление верхнего элемента (`pop`)** — переносит все элементы, кроме последнего, из `queue1` в `queue2`, возвращая и удаляя последний элемент.
- **Получение верхнего элемента без удаления (`top`)** — аналогично методу `pop`, но возвращает верхний элемент без удаления.
- **Проверка на пустоту (`empty`)** — возвращает `true`, если стек пуст.
- **Вывод всех элементов стека (`toString`)** — предоставляет строковое представление текущего состояния стека.

#### Основные характеристики:
- Использование двух очередей для реализации стека.
- Демонстрация принципа LIFO (Last In, First Out) через методы работы с очередями.
- Обработка ошибок при попытке работы с пустым стеком через исключение `IllegalStateException`.

### `2.TestStackOnQueue.java`
Клиентская программа для тестирования функциональности стека на основе очередей. 

#### Ход выполнения программы:
1. Создается стек через `StackOnQueue`.
2. В стек добавляются элементы с помощью метода `push`.
3. Демонстрируются методы `top`, `pop`, и `empty`.
4. Выводится содержимое стека с использованием переопределенного метода `toString`.

**№ 12**

### `1.DeliveryService.java` (Абстрактный)
Абстрактный класс, предоставляющий методы:
- **`createOrder`** (абстрактный) — создание заказа, реализация которого зависит от подкласса.
- **`deliver`** — доставка заказа с выводом деталей.

Этот класс задает общий интерфейс для всех служб доставки.


### `2.PizzaDelivery.java` и `GroceryDelivery.java`
Эти классы наследуют `DeliveryService` и реализуют метод `createOrder`:
- **`PizzaDelivery`** — создает заказ с типом "Пицца".
- **`GroceryDelivery`** — создает заказ с типом "Продукты".


### `3.Order.java`
Класс описывает структуру заказа, содержащий:
- Тип заказа (`orderType`).
- Название товара (`itemName`).
- Количество (`quantity`).
- Цена за единицу (`price`).

#### Методы:
- **`calculateTotalPrice`** — рассчитывает общую стоимость заказа.

### `4.FactoryMethodDemo.java`
Тестовый класс, демонстрирующий работу службы доставки:
1. Создаются службы доставки (`PizzaDelivery`, `GroceryDelivery`).
2. Создаются заказы через фабричный метод `createOrder`.
3. Выполняется доставка заказов через метод `deliver`.

**№ 13**

### 1. Интерфейс `FileComponent`
Общий интерфейс для файлов и директорий. Определяет методы:
- **`add(FileComponent component)`** — добавление дочернего компонента (поддерживается только для директорий).
- **`remove(FileComponent component)`** — удаление дочернего компонента (поддерживается только для директорий).
- **`display(int indentation)`** — отображение структуры компонента с учетом уровня вложенности.

### `2.File.java`
Представляет отдельный файл:
- Не поддерживает добавление или удаление дочерних компонентов.
- Отображает свое имя с учетом заданного уровня отступов.

### `3.Directory.java`
Представляет директорию, которая может содержать как файлы, так и вложенные директории:
- Содержит список дочерних компонентов (`FileComponent`).
- Поддерживает добавление и удаление компонентов.
- Рекурсивно отображает свою структуру и структуру всех вложенных компонентов.


### `4.FileSystemDemo.java`
Основной класс для демонстрации работы файловой системы.

**№ 14**

### 1. Интерфейс `State`
Общий интерфейс для всех состояний. Содержит метод:
- **`handle()`** — выполняет действия, связанные с текущим состоянием объекта.

### 2. Конкретные состояния
Каждое состояние реализует интерфейс `State`:
- **`NewOrderState`** — представляет состояние "Новый заказ". 
  - Метод `handle()` выводит сообщение о начале обработки нового заказа.
- **`ProcessingState`** — представляет состояние "Заказ в процессе обработки". 
  - Метод `handle()` выводит сообщение о текущей обработке.
- **`ShippedState`** — представляет состояние "Заказ отправлен". 
  - Метод `handle()` выводит сообщение о том, что заказ отправлен.

### `3.Order.java`
Класс, представляющий заказ. Управляет текущим состоянием заказа:
- Содержит поле `currentState` — текущее состояние объекта.
- Методы:
  - **`setState(State state)`** — изменяет текущее состояние объекта.
  - **`processOrder()`** — вызывает метод `handle()` текущего состояния.

### `4.StatePatternDemo.java`
Демонстрационный класс, который показывает, как работает паттерн "Состояние":
1. Создается объект `Order` с начальным состоянием `NewOrderState`.
2. Переход между состояниями осуществляется с помощью метода `setState()`.
3. Метод `processOrder()` вызывает соответствующее поведение текущего состояния.
