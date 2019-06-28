package buy.practice.lamda;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangby
 * @Classname controller
 * @Description TODO
 * @Date 2019/6/24 10:35
 */
@RestController
public class PracticeController {

    @RequestMapping("/adf/dffs")
    public String getRes() {
        return "success";
    }
}
