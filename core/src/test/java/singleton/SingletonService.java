package singleton;

public class SingletonService {

    //static : class lv에 존재하므로 딱 하나만 존재하게 된다.
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance(){
        return instance;
    }

    private SingletonService(){
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
