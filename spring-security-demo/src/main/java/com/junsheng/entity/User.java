package com.junsheng.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    public interface UserDetailView extends UserListView{}
    public interface UserListView{}
    @JsonView(UserListView.class)
    private String username;
    @JsonView(UserDetailView.class)
    private String password;
    @JsonView(UserListView.class)
    private String sex;
    @JsonView(UserListView.class)
    private String id;
    @JsonView(UserListView.class)
    private String birthday;

    public User(String username, String password, String sex) {
        this.username = username;
        this.password = password;
        this.sex = sex;
    }
}
