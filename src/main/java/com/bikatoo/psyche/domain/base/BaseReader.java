package com.bikatoo.psyche.domain.base;

import java.util.Map;
import java.util.Set;

public interface BaseReader<Entity, Id> {

    Entity findById(Id id);

    Map<Id, Entity> findByIds(Set<Id> ids);
}
