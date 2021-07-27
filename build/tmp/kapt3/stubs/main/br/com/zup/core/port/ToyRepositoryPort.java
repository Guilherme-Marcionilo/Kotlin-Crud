package br.com.zup.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\rH&\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/core/port/ToyRepositoryPort;", "", "delete", "", "id", "Ljava/util/UUID;", "findById", "Lbr/com/zup/core/model/Toy;", "getAll", "", "Lbr/com/zup/entrypoint/dto/ToyDto;", "save", "toyEntity", "Lbr/com/zup/database/entity/ToyEntity;", "update", "toEntity", "biblio-tech"})
public abstract interface ToyRepositoryPort {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.core.model.Toy save(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity toyEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<br.com.zup.entrypoint.dto.ToyDto> getAll();
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.core.model.Toy findById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.core.model.Toy update(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity toEntity);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
}