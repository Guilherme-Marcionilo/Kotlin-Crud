package br.com.zup.database.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/database/service/ToyEntityService;", "Lbr/com/zup/core/port/ToyRepositoryPort;", "toyEntityRepository", "Lbr/com/zup/database/repository/ToyEntityRepository;", "(Lbr/com/zup/database/repository/ToyEntityRepository;)V", "delete", "", "id", "Ljava/util/UUID;", "findById", "Lbr/com/zup/core/model/Toy;", "getAll", "", "Lbr/com/zup/entrypoint/dto/ToyDto;", "save", "toyEntity", "Lbr/com/zup/database/entity/ToyEntity;", "update", "biblio-tech"})
@javax.inject.Singleton()
public final class ToyEntityService implements br.com.zup.core.port.ToyRepositoryPort {
    private final br.com.zup.database.repository.ToyEntityRepository toyEntityRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.core.model.Toy save(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity toyEntity) {
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
    br.com.zup.database.entity.ToyEntity toyEntity) {
        return null;
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
    }
    
    public ToyEntityService(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.repository.ToyEntityRepository toyEntityRepository) {
        super();
    }
}