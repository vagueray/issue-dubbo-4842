package vc.issue.dubbo4842.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import vc.issue.dubbo4842.interfaces.DubboInterface;

/**
 * @author xiaolei.fu
 * @version 2019/9/12 15:13
 * @since 2019/9/12 15:13
 */
@RestController
public class DubboRestController {

    @Autowired
    private DubboInterface dubboInterface2;

    @GetMapping("{hi}")
    public String say2(@PathVariable String hi) {
        return dubboInterface2.say(hi);
    }
}
