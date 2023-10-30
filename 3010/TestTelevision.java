
public class TestTelevision {
    public static void main(String[] args) {
        Television test1 = new Television();

        test1.setScreensize(124);
        test1.adjustScreen(-4,2);
    }
}
class Television{
    private int screensize;
    void setScreensize(int value){
        screensize = value;
        System.out.println(screensize);
    }
    int adjustScreen(int addorremove, int value){
        if(addorremove>0){
         screensize += value;
        }else{
            screensize-=value;
        }
        System.out.println(screensize);
        return screensize;



    }
}
