package com.bikatoo.psyche.infrastructure.db.user;

import com.bikatoo.psyche.domain.user.UserEntity;
import com.bikatoo.psyche.infrastructure.db.base.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<UserEntity, UserDO> {

    @Override
    public UserDO entityTransferToDO(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity DOTransferToEntity(UserDO userDO) {
        return null;
    }
}
