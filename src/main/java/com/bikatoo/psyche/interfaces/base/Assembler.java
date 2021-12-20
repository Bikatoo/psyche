package com.bikatoo.psyche.interfaces.base;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface Assembler<D, E> {

    D entityToDTO(E e);

    E dtoToEntity(D d);

    default List<D> entityToDTOForList(List<E> entityList) {

        if (entityList == null || entityList.isEmpty()) {
            return new ArrayList<>();
        }
        return entityList.stream().map(this::entityToDTO).collect(Collectors.toList());
    }

    default List<E> DTOToEntityForList(List<D> dtoList) {

        if (dtoList == null || dtoList.isEmpty()) {
            return new ArrayList<>();
        }
        return dtoList.stream().map(this::dtoToEntity).collect(Collectors.toList());
    }

    default PageInfo<D> DTOTransferToEntityForPage(PageInfo<E> ePageInfo) {

        if (ePageInfo.getSize() <= 0 && (ePageInfo.getList() == null || !ePageInfo.getList().isEmpty())) {
            return PageInfo.of(new ArrayList<>());
        }
        PageInfo<D> result = new PageInfo<>();
        BeanUtils.copyProperties(ePageInfo, result);
        result.setList(entityToDTOForList(ePageInfo.getList()));
        return result;
    }

}
