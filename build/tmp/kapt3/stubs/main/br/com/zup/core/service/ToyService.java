package br.com.zup.core.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lbr/com/zup/core/service/ToyService;", "Lbr/com/zup/core/port/ToyServicePort;", "toyRepository", "Lbr/com/zup/core/port/ToyRepositoryPort;", "(Lbr/com/zup/core/port/ToyRepositoryPort;)V", "create", "Lbr/com/zup/core/model/Toy;", "toy", "delete", "", "id", "Ljava/util/UUID;", "findById", "getAll", "", "Lbr/com/zup/entrypoint/dto/ToyDto;", "update", "biblio-tech"})
@javax.inject.Singleton()
public final class ToyService implements br.com.zup.core.port.ToyServicePort {
    private final br.com.zup.core.port.ToyRepositoryPort toyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.core.model.Toy create(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.model.Toy toy) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<br.com.zup.entrypoint.dto.ToyDto> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.core.model.Toy findById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.core.model.Toy update(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.model.Toy toy) {
        return null;
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
    }
    
    public ToyService(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.port.ToyRepositoryPort toyRepository) {
        super();
    }
}