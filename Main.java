public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.push(2005);
        queue.push(2006);
        queue.push(2007);
        queue.push(2008);
        queue.push(2009);
        queue.push(1917);
        queue.display();
        System.out.println("Удаляем элемент из очереди: " + queue.delete());
        queue.display();
    }
}
