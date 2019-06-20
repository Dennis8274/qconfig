package qunar.tc.qconfig.admin.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;
import qunar.tc.qconfig.admin.web.controller.AbstractControllerHelper;
import qunar.tc.qconfig.common.bean.JsonV2;

/**
 * Created by chenjk on 2018/6/8.
 */
@Controller
@RequestMapping("/qconfig")
public class SubenvController extends AbstractControllerHelper {

    // TODO: 2019-06-12 在前端干掉这个接口
    @RequestMapping(value = "/subenvs/{appId}/{env}", method = RequestMethod.GET)
    @ResponseBody
    public Object getGroupIdNameMap(@PathVariable("appId") String appId, @PathVariable("env") String env) {
        return JsonV2.success();
    }
}
