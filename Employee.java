public class Employee
{
    private String name;
    private String hireDate;

    public Employee()
    {
        name = "No name";
        hireDate = "January 1, 1000";
    }

    public Employee(String theName, String theHireDate)
    {
        if (theName == null || theHireDate == null)
        {
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }

        name = theName;
        hireDate = theHireDate;
    }

    public Employee(Employee originalObject)
    {
        name = originalObject.name;
        hireDate = originalObject.hireDate;
    }

    public String getName()
    {
        return name;
    }

    public String getHireDate()
    {
        return hireDate;
    }

    public void setName(String newName)
    {
        if (newName == null)
        {
            System.out.println("Fatal Error setting employee name.");
            System.exit(0);
        }
        else
        {
            name = newName;
        }
    }

    public void setHireDate(String newHireDate)
    {
        if (newHireDate == null)
        {
            System.out.println("Fatal Error setting employee hire date.");
            System.exit(0);
        }
        else
        {
            hireDate = newHireDate;
        }
    }

    public String toString()
    {
        return name + " " + hireDate;
    }

    public boolean equals(Employee otherEmployee)
    {
        return name.equals(otherEmployee.name)
                && hireDate.equals(otherEmployee.hireDate);
    }
}