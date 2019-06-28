package buy.practice.lamda.service;

import buy.practice.lamda.entity.UserEntity;

/**
 * @author wangby
 * @Classname UserCheckService
 * @Description TODO
 * @Date 2019/6/20 10:56
 */
@FunctionalInterface
public interface UserCheckService {

    /**
     * 检查用户是否符合规范
     * @param userEntity
     * @return
     */
    boolean checkUser(UserEntity userEntity);

}
