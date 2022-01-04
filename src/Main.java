import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = scanner.nextInt();
        String soCanDoc = "";
        switch (number) {
            case 0: {
                soCanDoc = "Zero";
                break;
            }
            case 1: {
                soCanDoc = "One";
                break;
            }
            case 2: {
                soCanDoc = "Two";
                break;
            }
            case 3: {
                soCanDoc = "Three";
                break;
            }
            case 4: {
                soCanDoc = "Four";
                break;
            }
            case 5: {
                soCanDoc = "Five";
                break;
            }
            case 6: {
                soCanDoc = "Six";
                break;
            }
            case 7: {
                soCanDoc = "Seven";
                break;
            }
            case 8: {
                soCanDoc = "Eight";
                break;
            }
            case 9: {
                soCanDoc = "Nine";
                break;
            }
            case 10: {
                soCanDoc = "Ten";
                break;
            }
            case 11: {
                soCanDoc = "Eleven";
                break;
            }
            case 12: {
                soCanDoc = "Twelve";
                break;
            }
            case 13: {
                soCanDoc = "Thirteen";
                break;
            }
            case 14: {
                soCanDoc = "Fourteen";
                break;
            }
            case 15: {
                soCanDoc = "Fiftteen";
                break;
            }
            case 16: {
                soCanDoc = "Sixteen";
                break;
            }
            case 17: {
                soCanDoc = "Seventeen";
                break;
            }
            case 18: {
                soCanDoc = "Eighteen";
                break;
            }
            case 19: {
                soCanDoc = "Nineteen";
                break;
            }
            case 20: {
                soCanDoc = "Twenty";
                break;
            }
            default:{
                soCanDoc="Không đọc được";
            }
        }
        System.out.println("Đọc là: "+soCanDoc);
    }
}