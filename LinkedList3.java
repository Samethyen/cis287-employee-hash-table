public class LinkedList3<T>
{
    private class Node
    {
        private T item;
        private Node next;

        public Node(T item, Node next)
        {
            this.item = item;
            this.next = next;
        }
    }

    private Node head;

    public LinkedList3()
    {
        head = null;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public void addToStart(T item)
    {
        head = new Node(item, head);
    }

    public T find(String name)
    {
        Node position = head;

        while (position != null)
        {
            if (position.item instanceof Employee)
            {
                Employee employee = (Employee) position.item;

                if (employee.getName().equals(name))
                {
                    return position.item;
                }
            }

            position = position.next;
        }

        return null;
    }

    public void display()
    {
        Node position = head;

        while (position != null)
        {
            System.out.println(position.item);
            position = position.next;
        }
    }
}