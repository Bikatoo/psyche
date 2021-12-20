package com.bikatoo.psyche.domain.base;

public interface BaseOperator<Entity, Id> {

    void create(Entity entity);

    void update(Id id, Entity entity);

    void delete(Id id);
}
