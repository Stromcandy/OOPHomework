import java.util.Scanner;

public class TutoSchool {
    private String location;
    private String headMasterName;
    private String headMasterIC;

    public void inputTuitionCenterDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the location of the tuition center: ");
        setLocation(scanner.nextLine());

        System.out.print("Enter the name of the head master: ");
        setHeadMasterName(scanner.nextLine());

        System.out.print("Enter the IC number of the head master: ");
        setHeadMasterIC(scanner.nextLine());
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHeadMasterName() {
        return headMasterName;
    }

    public void setHeadMasterName(String headMasterName) {
        this.headMasterName = headMasterName;
    }

    public String getHeadMasterIC() {
        return headMasterIC;
    }

    public void setHeadMasterIC(String headMasterIC) {
        this.headMasterIC = headMasterIC;
    }
}
