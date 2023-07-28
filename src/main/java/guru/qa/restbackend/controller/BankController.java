package guru.qa.restbackend.controller;

import guru.qa.restbackend.domain.LoginInfo;
import guru.qa.restbackend.domain.UserInfo;
import guru.qa.restbackend.exception.InvalidUsernameException;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
public class BankController {

    @PostMapping("user/login")
    @ApiOperation("авторизация")
    public UserInfo doLogin(@RequestBody LoginInfo loginInfo) {
        if (loginInfo.getUserName().equals("Nastya")) {
            return UserInfo.builder()
                    .loginDate(new Date())
                    .userName(loginInfo.getUserName())
                    .build();
        } else {
            throw new InvalidUsernameException();
        }
    }
    @GetMapping("user/getAll")
    @ApiOperation("Получение всех пользователей")
    public List<UserInfo> getAllUserInfo() {

    }

    }


