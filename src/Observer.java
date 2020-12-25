import repository.Person;

import java.util.LinkedList;
import java.util.List;

public class Observer {
    public static void main(String[] args) {

        XiaoMei xiaoMei = new XiaoMei();
        XiaoLi xiaoLi = new XiaoLi();
        XiaoWang xiaoWang = new XiaoWang();
        xiaoMei.addPerson(xiaoLi);
        xiaoMei.addPerson(xiaoWang);
        xiaoMei.notifyPerson();
    }

    static class XiaoLi implements Person{

        public void getMessage(String msg) {
            String name = "小李";
            System.out.println(name + "收到消息，内容是:" + msg);
        }
    }

    static class XiaoWang implements Person{

        public void getMessage(String msg) {
            String name = "小王";
            System.out.println(name + "收到消息，内容是:" + msg);
        }
    }

    static class XiaoMei{
        List<Person> personList = new LinkedList<>();

        void addPerson(Person person){
            personList.add(person);
        }

        void notifyPerson(){
            for (Person person:personList){
                person.getMessage("有人陪我打游戏吗？");
            }
        }
    }
}
