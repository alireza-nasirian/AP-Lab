public class Run {
        public static void main(String[] args) {

            Student std1 = new Student("Ehsan", "9031066");
            Student std2 = new Student("Seyed" , "9031806");
            Student std3 = new Student("Ahmad",  "9031054");
            Student std4 = new Student("Ali",  "9031060");
            Student std5 = new Student("Abbas",  "9031070");
            Student std6 = new Student("Hamed",  "9031099");
            Student std7 = new Student("Jaber",  "9031064");
            Student std8 = new Student("qasem",  "9031088");
            Student std9 = new Student("behrooz",  "9031012");

            std1.setMark(15);
            std2.setMark(11);
            std3.setMark(17);
            std4.setMark(19);
            std5.setMark(16);
            std6.setMark(12);
            std7.setMark(14);
            std8.setMark(16);
            std9.setMark(10);

            Student[] students1 = {std1,std2,std3};
            Student[] students2 = {std4,std5,std6};
            Student[] students3 = {std7,std8,std9};

            Lab myLab1 = new Lab(3,"saturday");
            myLab1.setCapacity(3);
            myLab1.setStudents(students1);

            Lab myLab2 = new Lab(3,"monday");
            myLab2.setCapacity(3);
            myLab2.setStudents(students2);

            Lab myLab3 = new Lab(3,"wednesday");
            myLab3.setCapacity(3);
            myLab3.setStudents(students3);

            Lab[] laboratories = {myLab1,myLab2,myLab3};

            College amirKabie  = new College(laboratories);
            amirKabie.setOpenDays(laboratories);
            amirKabie.setCapacity(laboratories);
            amirKabie.setAvg(laboratories);
            amirKabie.print();

        }
    }