package bookcreation;

public class test {

    void go(){

        Author a1 = new Author("Hans Hansen",'M',"hans@hans.com");
        Author a2 = new Author("Anders Andersen",'M',"and@and.com");

        Books b1 = new Books("Wild Camping",521);
        Books b2 = new Books("Meditation for beginners", 242);
        Books b3 = new Books("Programming for beginners", 768);
        Books b4 = new Books("Coding for noobs", 347);
        System.out.println("BOOKS AND AUTHORS:\n"+a1.getName()+ "    "+a1.getGender()+ "    "+ a1.getEmail()
        + "\n   "+ b1.getTitle()+"         "+ b1.getNumOfPages()+
          "\n   "+ b2.getTitle()+"         "+ b2.getNumOfPages()+
                "\n"+a2.getName()+"    "+a2.getGender()+"    "+a2.getEmail()
        + "\n   "+b3.getTitle()+"         "+b3.getNumOfPages()+
                "\n   "+b4.getTitle()+"         "+b4.getNumOfPages());

    //Opret Books konstruktøren herinde og gør det samme som med Author klassen
    }

    public static void main(String[] args) {
        new test().go();
    }
}
