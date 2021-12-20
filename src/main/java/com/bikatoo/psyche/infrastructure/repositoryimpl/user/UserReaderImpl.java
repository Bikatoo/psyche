package com.bikatoo.psyche.infrastructure.repositoryimpl.user;

import com.bikatoo.psyche.domain.user.UserEntity;
import com.bikatoo.psyche.domain.user.UserId;
import com.bikatoo.psyche.domain.user.UserReader;
import com.bikatoo.psyche.infrastructure.db.user.UserConverter;
import com.bikatoo.psyche.infrastructure.db.user.UserMapper;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;
import java.util.Set;

@Component
public class UserReaderImpl implements UserReader {

    @Resource
    private UserMapper userMapper;
    @Resource
    private UserConverter userConverter;

    @Override
    public UserEntity findById(UserId userId) {
        return null;
    }

    @Override
    public Map<UserId, UserEntity> findByIds(Set<UserId> userIds) {
        return null;
    }
}
