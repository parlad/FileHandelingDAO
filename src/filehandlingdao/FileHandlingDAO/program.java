/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandlingdao.FileHandlingDAO;

import com.neupane.DAO.EmployeeDAO;
import com.neupane.DAO.Impl.EmployeeDAOImpl;
import com.neupane.DAO.Impl.LeaveDAOImpl;
import com.neupane.DAO.LeaveDAO;
import com.neupane.entity.Employee;
import com.neupane.entity.Leave;
import filehandlingdao.util.CSVUtility;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author parlad
 */
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeDAO empDAO = new EmployeeDAOImpl();
        LeaveDAO leaveDAO = new LeaveDAOImpl();
        importEmployee(empDAO, input);

        System.out.println("Enter leave file name:");
        try {
            StringBuilder bulder = new StringBuilder();
            for (String s : CSVUtility.read(input.next())) {
                StringTokenizer tokens = new StringTokenizer(s, "");
                if (tokens.countTokens() >= 3) {
                    int id = Integer.parseInt(tokens.nextToken());

                    Employee emp = empDAO.getById(id);

                    if (emp != null) {
                        Leave l = new Leave();
                        l.setEmployee(emp);
                        l.setLeaveDate(tokens.nextToken());
                        l.setLeaveType(tokens.nextToken());
                        leaveDAO.insert(l);
                    } else {
                        System.out.println(" no record found of emp id" + id);
                    }

                } else {
                    System.out.println(s);
                }
            }
            leaveDAO.getAll().forEach(lv -> {
                System.out.println(lv.toString());
            });
        } catch (IOException i) {
        }
    }

    public static void importEmployee(EmployeeDAO empDAO, Scanner input) {
        System.out.println("Enter a file name");
        try {

            StringBuilder builder = new StringBuilder();

            for (String s : CSVUtility.read(input.next())) {
                StringTokenizer tokens = new StringTokenizer(s, ",");
                if (tokens.countTokens() >= 6) {
                    Employee e = new Employee();
                    e.setId(Integer.parseInt(tokens.nextToken()));
                    e.setFirstName(tokens.nextToken());
                    e.setLastName(tokens.nextToken());
                    e.setEmail(tokens.nextToken());
                    e.setContactNum(tokens.nextToken());
                    e.setStatus(Boolean.parseBoolean(tokens.nextToken()));
                    empDAO.insert(e);
                    System.out.println(e);
                } else {
                    builder.append(s).append("\r\n");
                }
            }
            empDAO.getAll().forEach(emp -> {
                System.out.println(emp.toString());
            });
            CSVUtility.write("d:/broken.txt", builder.toString());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
