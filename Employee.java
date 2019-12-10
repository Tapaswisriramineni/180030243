class Employee extends Person
      {
        double salary;
        int year;
        String national_insurance;
          Employee(double salary,int year,String national_insurance,String name)
             {
               super(name);
               this.salary=salary;
               this.year=year;
               this.national_insurance=national_insurance;
             }
            double getSalary()
                {
                  return salary;
                  }
            int getYear()
                 {
                   return year;
                 }
           String getNational_insurance()
                 {
                  return national_insurance;
                 }
       }
