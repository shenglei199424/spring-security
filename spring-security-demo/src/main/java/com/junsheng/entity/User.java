package com.junsheng.entity;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    public interface UserDetailView extends UserListView{}
    public interface UserListView{}
    @JsonView(UserListView.class)
    private String username;
    @JsonView(UserDetailView.class)
    private String password;
    @JsonView(UserListView.class)
    private String sex;
}
