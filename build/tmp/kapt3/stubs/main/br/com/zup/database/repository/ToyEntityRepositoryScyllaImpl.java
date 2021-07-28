package br.com.zup.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/zup/database/repository/ToyEntityRepositoryScyllaImpl;", "Lbr/com/zup/database/repository/ToyEntityRepository;", "cqlSession", "Lcom/datastax/oss/driver/api/core/CqlSession;", "(Lcom/datastax/oss/driver/api/core/CqlSession;)V", "LOG", "Lorg/slf4j/Logger;", "delete", "", "id", "Ljava/util/UUID;", "findById", "Lbr/com/zup/database/entity/ToyEntity;", "getAll", "", "save", "toyEntity", "update", "biblio-tech"})
@javax.inject.Singleton()
public final class ToyEntityRepositoryScyllaImpl implements br.com.zup.database.repository.ToyEntityRepository {
    private final org.slf4j.Logger LOG = null;
    private final com.datastax.oss.driver.api.core.CqlSession cqlSession = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.database.entity.ToyEntity save(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity toyEntity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<br.com.zup.database.entity.ToyEntity> getAll() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public br.com.zup.database.entity.ToyEntity findById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.database.entity.ToyEntity update(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity toyEntity) {
        return null;
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
    }
    
    public ToyEntityRepositoryScyllaImpl(@org.jetbrains.annotations.NotNull()
    com.datastax.oss.driver.api.core.CqlSession cqlSession) {
        super();
    }
}