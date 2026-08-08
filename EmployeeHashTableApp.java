public class EmployeeHashTableApp
{
    public static void main(String[] args)
    {
        EmployeeHashTable table = new EmployeeHashTable();

        Employee employee1 =
            new Employee("John Smith", "January 10, 2020");

        Employee employee2 =
            new Employee("Jane Doe", "March 15, 2021");

        Employee employee3 =
            new Employee("Michael Brown", "June 20, 2019");

        Employee employee4 =
            new Employee("Sarah Johnson", "August 5, 2022");

        Employee employee5 =
            new Employee("David Lee", "September 12, 2020");

        Employee employee6 =
            new Employee("Emily Davis", "November 1, 2023");

        table.add(employee1);
        table.add(employee2);
        table.add(employee3);
        table.add(employee4);
        table.add(employee5);
        table.add(employee6);

        System.out.println("Employee Hash Table");
        System.out.println("-------------------");

        System.out.println("Added 6 employees.");
        System.out.println();

        System.out.println("Hash for John Smith: "
                + table.getHash("John Smith"));

        System.out.println("Hash for David Lee: "
                + table.getHash("David Lee"));

        System.out.println();

        System.out.println("Testing collision:");
        System.out.println("John Smith and David Lee are both in bucket 8.");
        System.out.println();

        System.out.println("Getting John Smith:");
        System.out.println(table.get("John Smith"));

        System.out.println();

        System.out.println("Getting Jane Doe:");
        System.out.println(table.get("Jane Doe"));

        System.out.println();

        System.out.println("Getting Michael Brown:");
        System.out.println(table.get("Michael Brown"));

        System.out.println();

        System.out.println("Getting David Lee:");
        System.out.println(table.get("David Lee"));

        System.out.println();

        System.out.println("Getting employee who does not exist:");
        Employee notFound = table.get("Tom Wilson");

        if (notFound == null)
        {
            System.out.println("Tom Wilson was not found.");
        }
        else
        {
            System.out.println(notFound);
        }

        System.out.println();
        System.out.println("Complete Hash Table:");
        table.displayTable();
    }
}