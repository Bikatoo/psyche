package com.bikatoo.psyche.domain.user;

import com.bikatoo.psyche.domain.base.BaseEntity;

public class UserEntity implements BaseEntity<UserId> {

    private UserId userId;

    @Override
    public UserId getId() {
        return userId;
    }
}
