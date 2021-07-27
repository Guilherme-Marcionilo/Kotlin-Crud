package br.com.zup.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/database/repository/ToyEntityRepository;", "", "delete", "", "id", "Ljava/util/UUID;", "findById", "Lbr/com/zup/database/entity/ToyEntity;", "getAll", "", "save", "toyEntity", "update", "biblio-tech"})
public abstract interface ToyEntityRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.database.entity.ToyEntity save(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity toyEntity);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<br.com.zup.database.entity.ToyEntity> getAll();
    
    @org.jetbrains.annotations.Nullable()
    public abstract br.com.zup.database.entity.ToyEntity findById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.database.entity.ToyEntity update(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity toyEntity);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
}