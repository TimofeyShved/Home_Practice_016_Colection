# Абстрактные классы и интерфейсы 

7.1. Коллекция без дубликатов

Задача
--------

Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.

Решение:
--------

    public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
        return new HashSet<T>(collection); // Вот и всё!
    }