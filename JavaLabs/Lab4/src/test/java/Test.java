import com.Employee;
import com.ReadCSVtoList;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main(String[] args)// throws IOException, FileNotFoundException
    {
        List<Employee> employees = ReadCSVtoList.ReadToList();
        for (Employee emp : employees) { emp.printEmp(); }
    }
}
