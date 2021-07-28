package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\b\u0010\u0019\u001a\u00020\u0018H\u0007J\b\u0010\u001a\u001a\u00020\u0018H\u0007R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lbr/com/zup/ToyEntityRepositoryScyllaImplTest;", "", "()V", "cqlSession", "Lcom/datastax/oss/driver/api/core/CqlSession;", "getCqlSession$annotations", "getCqlSession", "()Lcom/datastax/oss/driver/api/core/CqlSession;", "setCqlSession", "(Lcom/datastax/oss/driver/api/core/CqlSession;)V", "toyEntity", "Lbr/com/zup/database/entity/ToyEntity;", "getToyEntity", "()Lbr/com/zup/database/entity/ToyEntity;", "setToyEntity", "(Lbr/com/zup/database/entity/ToyEntity;)V", "toyEntityRepositoryScyllaImpl", "Lbr/com/zup/database/repository/ToyEntityRepositoryScyllaImpl;", "getToyEntityRepositoryScyllaImpl$annotations", "getToyEntityRepositoryScyllaImpl", "()Lbr/com/zup/database/repository/ToyEntityRepositoryScyllaImpl;", "setToyEntityRepositoryScyllaImpl", "(Lbr/com/zup/database/repository/ToyEntityRepositoryScyllaImpl;)V", "setUp", "", "should not return sucess when request find toy by id", "should return sucess when request find all toy", "biblio-tech"})
@org.junit.jupiter.api.extension.ExtendWith(value = {io.mockk.junit5.MockKExtension.class})
@org.junit.jupiter.api.Disabled()
public final class ToyEntityRepositoryScyllaImplTest {
    public br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl toyEntityRepositoryScyllaImpl;
    public com.datastax.oss.driver.api.core.CqlSession cqlSession;
    public br.com.zup.database.entity.ToyEntity toyEntity;
    
    @io.mockk.impl.annotations.InjectMockKs()
    @java.lang.Deprecated()
    public static void getToyEntityRepositoryScyllaImpl$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl getToyEntityRepositoryScyllaImpl() {
        return null;
    }
    
    public final void setToyEntityRepositoryScyllaImpl(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl p0) {
    }
    
    @io.mockk.impl.annotations.RelaxedMockK()
    @java.lang.Deprecated()
    public static void getCqlSession$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.datastax.oss.driver.api.core.CqlSession getCqlSession() {
        return null;
    }
    
    public final void setCqlSession(@org.jetbrains.annotations.NotNull()
    com.datastax.oss.driver.api.core.CqlSession p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.database.entity.ToyEntity getToyEntity() {
        return null;
    }
    
    public final void setToyEntity(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity p0) {
    }
    
    @org.junit.jupiter.api.BeforeEach()
    public final void setUp() {
    }
    
    public ToyEntityRepositoryScyllaImplTest() {
        super();
    }
}