import java.util.Date;
import java.util.Scanner;

public class Librarys
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    }
}

enum BookStatus {
    AVAILABLE,
    RESERVED,
    LOANED,
    LOST
}

abstract class Account
{
    private int id;
    private String Name, Password, Status, Email, Phone;

}

class Member extends Account
{
    private Date DateOfMemberShip;
    private int TotalBookIssued;

}

class Book
{
    private Date ReservationDate;
    private String ReservationStatus;
    private int MemberId;

}