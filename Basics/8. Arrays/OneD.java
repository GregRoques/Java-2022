class Student {
    int rollno;
    String name;

    public Student(int a, String b) {
        rollno = a;
        name = b;
    }

}

public class OneD {
    public static void main(String[] args) {
        int nums[] = new int[4]; // fixes array at 4... remember default values are 0

        nums[0] = 8;
        nums[1] = 12;
        nums[2] = 76;
        nums[3] = 54;

        // could also be written:
        // int nums[] = {8,12,76,54};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        } // print all values

        Student s1 = new Student(1, "Callie");
        Student s2 = new Student(2, "Midnight");
        Student s3 = new Student(3, "Nacheaux");

        Student s[] = { s1, s2, s3 };

        System.out.println(s[0].name);
    }
}
