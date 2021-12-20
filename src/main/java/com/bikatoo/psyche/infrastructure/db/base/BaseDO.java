package com.bikatoo.psyche.infrastructure.db.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public abstract class BaseDO<DO extends BaseDO<DO>> {

    @TableId(
            value = "id",
            type = IdType.AUTO
    )
    protected Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }
}
