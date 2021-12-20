package com.bikatoo.psyche.domain.user;

import com.bikatoo.psyche.domain.base.BaseId;
import lombok.Getter;

import java.util.UUID;

@Getter
public class UserId extends BaseId {

    public UserId(UUID id) {
        this.id = id;
    }

    public UserId(String id) {
        this.id = UUID.fromString(id);
    }
}
