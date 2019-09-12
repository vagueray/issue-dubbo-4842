package vc.issue.dubbo4842.export;

import org.springframework.stereotype.Component;
import vc.issue.dubbo4842.interfaces.DubboInterface;

/**
 * @author xiaolei.fu
 * @version 2019/9/12 15:12
 * @since 2019/9/12 15:12
 */
@Component("DubboExport")
public class DubboExport implements DubboInterface {

    @Override
    public String say(String hi) {
        return "Hello, " + hi;
    }
}
