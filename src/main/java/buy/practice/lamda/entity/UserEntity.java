package buy.practice.lamda.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangby
 * @Classname UserEntity
 * @Description TODO
 * @Date 2019/6/20 10:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    private String username;

    private int age;
}
