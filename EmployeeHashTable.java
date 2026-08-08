public class EmployeeHashTable
{
    private LinkedList3<Employee>[] hashArray;
    private static final int SIZE = 10;

    @SuppressWarnings("unchecked")
    public EmployeeHashTable()
    {
        hashArray = new LinkedList3[SIZE];

        for (int i = 0; i < SIZE; i++)
        {
            hashArray[i] = new LinkedList3<Employee>();
        }
    }

    private int computeHash(String name)
    {
        int hash = 0;

        for (int i = 0; i < name.length(); i++)
        {
            hash = hash + name.charAt(i);
        }

        return hash % SIZE;
    }

    public void add(Employee employee)
    {
        int index = computeHash(employee.getName());

        hashArray[index].addToStart(employee);
    }

    public Employee get(String name)
    {
        int index = computeHash(name);

        return hashArray[index].find(name);
    }

    public void displayTable()
    {
        for (int i = 0; i < SIZE; i++)
        {
            System.out.println("Bucket " + i + ":");
            hashArray[i].display();
        }
    }

    public int getHash(String name)
    {
        return computeHash(name);
    }
}