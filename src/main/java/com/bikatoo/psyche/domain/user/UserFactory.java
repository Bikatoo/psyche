package com.bikatoo.psyche.domain.user;

import com.bikatoo.psyche.domain.base.BaseFactory;

public class UserFactory implements BaseFactory<UserEntity> {

    @Override
    public UserEntity create() {
        return new UserEntity();
    }
}
