package CompAssignment;

class Employee
{
    String name; float bSalary; float tSalary;
    void init(String nam1, int sal1)
   {
      name= nam1;
      bSalary = sal1;
    }
    void calc()
    {
       tSalary= (float) 50.0/100* bSalary + bSalary;
    }
    void display()
    {
       System.out.println("The employees name is" + name);
       System.out.println("The salary with 50% HRA is" + tSalary);
    }
    public static void main()
    {
       Employee obj= new Employee();
       obj.init("Harsh", 54000);
       obj.calc();
       obj.display();
    }
}


