package buy.practice.lamda.service;

import buy.practice.lamda.entity.UserEntity;

/**
 * @author wangby
 * @Classname UserPrintService
 * @Description TODO
 * @Date 2019/6/20 10:58
 */
@FunctionalInterface
public interface UserPrintService {
    /**
     * 打印用户信息
     * @param userEntity
     */
    void PrintUser(UserEntity userEntity);
}
