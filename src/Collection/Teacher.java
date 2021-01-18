package Collection;

public class Teacher {

    public void check(int score) throws  MyException {
        if (score<0||score>100){
            throw new MyException("正");
        }else {
            System.out.println("");
        }
    }
}
