
public class Consumer {

    private final ItemQueue queue;
    private final String name;

    public Consumer(String name, ItemQueue queue) {
        this.name = name;
        this.queue = queue;
    }

    public void consume() throws InterruptedException {
        var item = queue.take();
        System.out.println(STR."Consumer [{}] consume item [{}] produced by [{}], \{name}, \{item.id()}, \{item.producer()}");;

    }
}