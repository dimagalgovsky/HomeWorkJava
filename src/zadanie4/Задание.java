package zadanie4;

public class Задание {
    /*



Работа с массивами, Работа с дженериками, Comparable, Comparator. DataContainer:
0. Суть задания: Создать класс который может сохранять в себе почти любое количество данных
                обобщённого типа и при этом внешне,благодаря инкапусляции, не будет иметь недостатков массива:
	0.1 Данный класс умеет добавлять в себя данные обобщённого типа.
	0.2 Данный класс умеет удалять данные из себя двумя способами: по индексу и конкретный элемент.
	0.3 Данный класс умеет сортировать в себе данные. Но учитывайте что в данном функционале есть проблема.
	            Как написать универсальный код сортировки и объяснить что один объект больше другого?
		0.3.1 Короткий ответ: подсказывать нашему методу как сравнивать объекты сохранённые в нём.
		0.3.2 Полный ответ: Для того чтобы написать более универсальный код, а также не гадать
		        какого типа передадут данные и не придумывать способы сравнения этих данных,
		        мы, при вызове сортировки, заставим передать реализацию сравнения (реализацию интерфейса Comparator)
		        к которой нам нужно будет обращаться каждый раз когда нам нужно будет сравнить два объекта
		        и которая скажет какой объект больше, а какой меньше или они равны.
+ 1. Создать класс DataContainer у которого есть один дженерик (обобщение).
                Например T. Данный класс как раз и будет решать задачу поставленную перед нами: хранить неограниченное
                количество передаваемых объектов обобщённого типа.
+ 2. Внутри DataContainer должно быть поле T[] data, внутренний массив, которое предназначено
                для хранения передаваемых объектов.
+ 4. В данном классе должен быть метод int add(T item) который добавляет данные во внутреннее поле data.
	+ 4.1 Если поле data не переполнено то данные нужно добавлять в первую позицию (ячейку)
	            после последней заполненной позиции (ячейки).
		    + 4.1.1 Пример: data = [1, 2, 3, null, null, null]. Вызвали add(777).
		        Должно получиться data = [1, 2, 3, 777, null, null]. Метод add вернёт число 3.
	+ 4.2 В случае если поле data переполнено, нужно придумать механизм который будет
	            расширять пространство для новых элементов. Тут вам поможет Arrays.copyOf.
	        + 4.2.1 Пример: data = [1, 2, 3]. Вызвали add(777).
		        Должно получиться data = [1, 2, 3, 777]. Метод add вернёт число 3.
+ 5. В данном классе должен быть метод T get(int index). Данный метод получает из DataContainer'а, из поля data,
                предварительно сохранённый объект который мы передали на предыдущем шаге через метод add.
	+ 5.1 Пример: data = []. Вызвали add(9999). Получили data = [9999].
	            Метод add вернул число 0. Вызываем get(0). Метод get возвращает 9999
    + 5.2 Пример: data = [9999]. Вызываем get(01). Метод get возвращает null
+ 6. В данном классе должен быть метод T[] getItems(). Данный метод возвращает поле data.
+ 7. Добавить метод boolean delete(int index) который будет удалять элемент из нашего поля data по индексу.
	+ 7.1 Метод возвращает true если у нас получилось удалить данные.
		+ 7.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(3). Должно получиться data = [1, 2, 3].
		        Метод delete вернёт true
	+ 7.2 Метод возвращает false если нет такого индекса.
		+ 7.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(9). Должно получиться data = [1, 2, 3, 777].
		        Метод delete вернёт false
	+7.3. Освободившуюся ячейку в поеле data необходимо удалить полностью. Пустых элементов не должно быть.
		+7.3.1 Пример data = [1, 2, 3, 777]. Вызывают delete(2). Должно получиться data = [1, 2, 777].
		        Метод delete вернёт true
+ 8. Добавить метод boolean delete(E item) который будет удалять элемент из нашего поля data.
	+ 8.1 Метод возвращает true если у нас получилось удалить данные.
	+	8.1.1 Пример data = [1, 2, 3, 777]. Вызывают delete(777). Должно получиться data = [1, 2, 3].
		        Метод delete вернёт true
	+8.2 Метод возвращает false если нет такого элемента.
	+	8.2.1 Пример data = [1, 2, 3, 777]. Вызывают delete(111). Должно получиться data = [1, 2, 3, 777].
		        Метод delete вернёт false
	+8.3 Освободившуюся ячейку необходимо удалить полностью. Пустых элементов не должно быть.
	+	8.3.1 Пример data = [1, 2, 3, 777, 3]. Вызывают delete(3). Должно получиться data = [1, 2, 777, 3].
		        Метод delete вернёт true
+ 9. Добавить НЕ СТАТИЧЕСКИЙ метод void sort(Comparator<.......> comparator).
                Данный метод занимается сортировкой данных записанных в поле data используя реализацию сравнения
                из ПЕРЕДАННОГО объекта comparator.
+ 10. Переопределить метод toString() в классе и выводить содержимое data без ячеек в которых хранится null.
11.* В даном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container)
                который будет принимать объект DataContainer с дженериком extends Comparable.
                Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте DataContainer используя реализацию
                сравнения вызываемый у хранимых объектов.
12.** В данном классе должен быть СТАТИЧЕСКИЙ метод void sort(DataContainer<.............> container,
                Comparator<.......> comparator) который будет принимать объект DataContainer и реализацию
                интерфейса Comparator. Данный метод будет сортировать элементы в ПЕРЕДАННОМ объекте
                DataContainer используя реализацию сравнения из ПЕРЕДАННОГО объекта интерфейса Comparator.
     */
}
