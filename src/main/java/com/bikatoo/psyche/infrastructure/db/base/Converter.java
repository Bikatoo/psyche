package com.bikatoo.psyche.infrastructure.db.base;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface Converter<E, D> {

    D entityTransferToDO(E e);

    E DOTransferToEntity(D d);

    default List<D> entityTransferToDOForList(List<E> eList) {
        if (eList == null || eList.isEmpty()) {
            return new ArrayList<>();
        }
        return eList.stream().map(this::entityTransferToDO).collect(Collectors.toList());
    }

    default List<E> DOTransferToEntityForList(List<D> doList) {
        if (doList == null || doList.isEmpty()) {
            return new ArrayList<>();
        }
        return doList.stream().map(this::DOTransferToEntity).collect(Collectors.toList());
    }

    default PageInfo<E> DOTransferToEntityForPage(PageInfo<D> doPageInfo) {
        if (doPageInfo.getSize() <= 0 && (doPageInfo.getList() == null || doPageInfo.getList().isEmpty())) {
            return PageInfo.of(new ArrayList<>());
        }
        PageInfo<E> result = new PageInfo<>();
        BeanUtils.copyProperties(doPageInfo, result);
        result.setList(DOTransferToEntityForList(doPageInfo.getList()));
        return result;
    }
}
