package com.bikatoo.psyche.infrastructure.repositoryimpl.user;

import com.bikatoo.psyche.domain.user.UserEntity;
import com.bikatoo.psyche.domain.user.UserId;
import com.bikatoo.psyche.domain.user.UserOperator;
import org.springframework.stereotype.Component;

@Component
public class UserOperatorImpl implements UserOperator {

    @Override
    public void create(UserEntity userEntity) {

    }

    @Override
    public void update(UserId userId, UserEntity userEntity) {

    }

    @Override
    public void delete(UserId userId) {

    }
}
