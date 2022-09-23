package com.yamaha.model;

import com.yamaha.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private Long id;
    private String username;
    private String password;

    public UserEntity modelToEntity ( UserModel userModel){
        return UserEntity.builder().id(userModel.getId()).password(userModel.getPassword()).username(userModel.getUsername()).build();
    }
}
