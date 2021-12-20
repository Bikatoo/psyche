package com.bikatoo.psyche.interfaces.user;

import com.bikatoo.psyche.domain.user.UserEntity;
import com.bikatoo.psyche.interfaces.base.Assembler;

public class UserAssembler implements Assembler<UserDTO, UserEntity> {

    @Override
    public UserDTO entityToDTO(UserEntity userEntity) {
        return null;
    }

    @Override
    public UserEntity dtoToEntity(UserDTO userDTO) {
        return null;
    }
}
