#    Multythreading 

## Глава4 - Многопоточность
    Синхронные и асинхронные операции  
    Синхронизация ресурсов - блок кода "synchronized"  
    Низкоуровневые блокировки  
    Неблокирующие алгоритмы  
  
####  Atomic Variables in Java  
    AtomicInteger, AtomicLong, AtomicBoolean, AtomicReference  
    main methods - get(), set(), lazySet(), compareAndSet(), weakCompareAndSet()  
    
####  Потокобезопасные коллекции - Concurrent Collections  
    CopyOnWriteArrayList<E>  
    CopyOnWriteArraySet<E>  - аналог "Set"  
    ConcurrentMap<K, V>  
    ConcurrentHashMap<K, V> - аналог HashMap, хранит hash ключа и связанный с ним сегмент. Volotile.
    ConcurrentNavigableMap<K,V> - отсортированный Map, испо. Iterator  
    ConcurrentSkipListMap<K, V> - аналог TreeMap
    ConcurrentSkipListSet<E> - аналог Set  
    
    ConcurrentLinkedQueue    
    ConcurrentLinkedDeque<E>  - данные можно добавлять и вытаскивать с обоих сторон
    ArrayBlockingQueue<E>  
    DelayQueue<E extends Delayed>  - позволяет вытаскивать элементы из очереди только по прошествии некоторой задержки  
    LinkedBlockingQueue<E>  -  реализация очереди основанная на «two lock queue» - один лок на добавление, др. на вытаскивание элемента.  
    PriorityBlockingQueue<E> - первым из очереди выходит самый наименьший элемент
    SynchronousQueue<E> - один вошел, один вышел. Каждая операция вставки блокирует Producer до техпор, пока Consumer не вставит элемент.  
    BlockingDeque<E> - двунаправленная очередь  
    LinkedBlockingDeque<E> - двунаправленная блокирующая очередь на связанных нодах  
    
       
####  Обзор методов, поддерживаемых Thread -
    void start();
    void interrupt();
    viod wait();
    void notify();
    void notifyAll();      
    Deprecated methods - stop(), resume(), suspend()  
  

####   Thread Pools  
     
     ThreadPoolExecutor 
     -- (реализация ExecutorService)  
        Очередь, в которой задачи собираются, если запущено больше потоков, чем threadPoolSize.  
        -- Оптимальный пул потоков = Runtime.getRuntime().availableProcessors() + 1  
     MemoryAwareThreadPoolExecutor -  пул с ограничением по памяти,  
     блокирует отправку задачи, когда в очереди слишком много задач  
     
     ScheduledPoolExecutor 
     -- (реализация ScheduledExecutorService)   - выполнение кода асихронно и периодически  
     или когда требуется выполнить код через некоторое время.  
     
     ForkJoinPool - реализация под капотом на примере IntStream.parralel().peek(......)
     описание ExecutorService executor = Executors.newWorkStealingPool();
     parallelism size (default = count of processor cores)
     
     функциональный интерфейс Callable
     
     Возвращаемый тип Future - который предоставляет информацию о задвнии - 
        isDone() - проверяем, завершено ли выполнение
        get() - блокирует поток и ждет завершения задачи, а затем возвращает результат ее выполнения.
                Для избежания зависания, можно передать timeout
        
        
     
  ----------------------------------------------------------------------------------------------------  
  
####  Практическое задание (Глава4) -    
  Написать  приложение, которое в своей логике будет использовать многопоточность.  
  При этом использовать  
  1) interrupt() для остановки  
  2) Thread pool
  
  
  
  
  
