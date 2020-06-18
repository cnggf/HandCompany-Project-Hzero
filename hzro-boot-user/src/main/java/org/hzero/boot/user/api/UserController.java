package org.hzero.boot.user.api;

import io.choerodon.core.iam.ResourceLevel;
import io.choerodon.swagger.annotation.Permission;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.hzero.boot.user.app.service.UserService;
import org.hzero.boot.user.infra.UserTestInfo;
import org.hzero.boot.user.utils.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author GGF
 * @version 1.0
 * @date 2020/6/17 9:42
 */
@RestController
@RequestMapping(value = "/hzero/test")
//@Api(tags = "User")
public class UserController {

    @SuppressWarnings(value = "ALL")
    @Autowired
    private UserService userService;


    @PostMapping("/add/user")
    @ResponseBody
    public CommonResult<UserTestInfo> insertUser(@RequestBody UserTestInfo userTestInfo) {
        Integer count = userService.insertUser(userTestInfo);
        if (count > 0) {
            return new CommonResult<UserTestInfo>(200, "添加用户成功!!!",userTestInfo);
        } else {
            return new CommonResult<UserTestInfo>(201, "添加用户失败,请完善输入参数!!!",userTestInfo);
        }
    }

    @DeleteMapping("/del/user/{userId}")
    @ResponseBody
    public CommonResult<UserTestInfo> delUser(@RequestBody @PathVariable Long userId) {
        Integer count = userService.delUser(userId);
        if (count > 0) {
            return new CommonResult<UserTestInfo>(200, "删除用户成功!!!");
        } else {
            return new CommonResult<UserTestInfo>(201, "删除用户失败,请查看删除id是否存在!!!");
        }
    }

    @PutMapping("/update/user")
    @ResponseBody
    public CommonResult<UserTestInfo> updateUser(@RequestBody UserTestInfo userTestInfo) {
        Integer count = userService.updateUser(userTestInfo);
        if (count > 0) {
            return new CommonResult<UserTestInfo>(200, "修改用户成功!!!",userTestInfo);
        } else {
            return new CommonResult<UserTestInfo>(201, "修改用户失败,请完善输入参数!!!",userTestInfo);
        }
    }

    @GetMapping("/select/user")
    @ResponseBody
    public List<UserTestInfo> selectUser(@RequestBody UserTestInfo userTestInfo) {
        return userService.selectUser(userTestInfo);

    }
    @Permission(level = ResourceLevel.SITE)
    @ApiOperation(value = "index页面")
    @RequestMapping("/index")
    public String index() {
        return "index";

    }

    @GetMapping(value = "demo")
    public String hello() {
        return "hello hzero!";
    }
}
