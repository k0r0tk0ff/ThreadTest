# ThreadTest
    Multythreading 

## Глава4 - Многопоточность

  Синхронные и асинхронные операции  
  Синхронизация ресурсов - блок кода "synchronized"  
  Низкоуровневые блокировки  
  Неблокирующие алгоритмы  
  
  Atomic Variables in Java  
  AtomicInteger, AtomicLong, AtomicBoolean, AtomicReference  
  main methods - get(), set(), lazySet(), compareAndSet(), weakCompareAndSet()  
    
  Потокобезопасные коллекции - Concurrent Collections  
    CopyOnWriteArrayList<E>  
    CopyOnWriteArraySet<E>  - аналог "Set"  
    ConcurrentMap<K, V>  
    ConcurrentHashMap<K, V> - аналог HashMap, хранит hash ключа и связанный с ним сегмент. Volotile.
    ConcurrentNavigableMap<K,V> - отсортированный Map, испо. Iterator  
    ConcurrentSkipListMap<K, V> - аналог TreeMap
    ConcurrentSkipListSet<E> - аналог Set  
    
    
  Обзор методов, поддерживаемых Thread -
    void start();
    void interrupt();
    viod wait();
    void notify();
    void notifyAll();
    
  Deprecated methods - stop(), resume(), suspend()  
       
  
  Практическое задание (Глава3) -  
  Написать  приложение, которое в своей логике будет использовать многопоточность.  
  
