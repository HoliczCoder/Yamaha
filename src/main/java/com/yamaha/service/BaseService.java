package com.yamaha.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<M, D, L> {
    List<M> findAll();

    Page<M> findAll(Pageable Page);

    M findById(L id);

    M add(D dto);

    List<M> add(List<D> dto);

    M update(D dto);

    boolean deleteById(L id);

    boolean deleteByIds(List<L> id);

}
