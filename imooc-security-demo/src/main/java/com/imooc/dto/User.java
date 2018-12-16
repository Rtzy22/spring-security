package com.imooc.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.validator.MyConstraint;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by 钟宇雷 on 2018/10/22.
 */
@Data
public class User {

    public interface UserSimpleView {};
    public interface UserDetailView extends UserSimpleView{};

    private String id;

    @JsonView(UserSimpleView.class)
    @MyConstraint(message = "这是一个自定义注解")
    private String username;

//    @JsonIgnore     //若启用此注解，自动忽略该属性
    @JsonView(UserDetailView.class)
    @NotBlank(message = "密码不能为空")
    private String password;

    @JsonView(UserSimpleView.class)
    @Past
    private Date birthday;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username) {
        this.username = username;
    }


}
