package buy.practice.lamda;

import buy.practice.lamda.entity.UserEntity;
import buy.practice.lamda.service.MyLamdaInterface;
import buy.practice.lamda.service.UserCheckService;
import buy.practice.lamda.service.UserPrintService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * @author wangby
 * @Classname LamdaInterfaceImpl
 * @Description lamda实现一个interface
 * @Date 2019/6/20 10:06
 */
public class LamdaInterfaceImpl {

    public static void main(String [] args) {
//        MyLamdaInterface myLamdaInterface = new MyLamdaInterface() {
//            @Override
//            public void doSomeThing(String s) {
//                System.out.println(s);
//            }
//        };
//        myLamdaInterface.doSomeThing("hahah");
//        MyLamdaInterface myLamdaInterface2 = (s) -> {
//            System.out.println("测试多行code");
//            System.out.println("通过lamda实现"+s);
//        };
//        myLamdaInterface2.doSomeThing("嘻嘻");
        lamdaAsParam(s -> {
        out.println("测试多行code");
        out.println("通过lamda实现"+s);
    },"hahha lamda表达式做参数");
        listOperatorbeforeImpl();
}

    /**
     * lamda表达式
     * @param myLamdaInterface
     * @param s
     */
    public static void lamdaAsParam(MyLamdaInterface myLamdaInterface,String s) {
        myLamdaInterface.doSomeThing(s);
    }

    public static void listOperatorbefore(List<UserEntity> userEntities,
                                    UserCheckService checkService,
                                    UserPrintService printService) {
        for (UserEntity userEntity :userEntities) {
            if (checkService.checkUser(userEntity)) {
                printService.PrintUser(userEntity);
            }
        }
    }


    public static void listOperatorbeforeImpl() {
//        List<UserEntity> userEntities = Arrays.asList(
//                new UserEntity("haha",10),
//                new UserEntity("小败",15),
//                new UserEntity("lalala",20)
//        );
//        listOperatorbefore(userEntities,
//                userEntity -> userEntity.getAge()>12,
//       userEntity -> System.out.println(userEntity.toString())
//       );
//
//        userEntities.forEach(userEntity ->  {
//            if(userEntity.getAge()>12) {
//                System.out.println(userEntity.toString());
//            }
//        });
//        userEntities.forEach(i -> {
//
//        });
        Predicate<UserEntity> a = userEntity -> userEntity.getAge() >10;

        UserCheckService userCheckService = userEntity -> userEntity.getAge() >10;


    }

}
