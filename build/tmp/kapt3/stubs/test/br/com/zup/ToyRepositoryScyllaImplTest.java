package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lbr/com/zup/ToyRepositoryScyllaImplTest;", "Lio/kotest/core/spec/style/AnnotationSpec;", "()V", "cqlSession", "Lcom/datastax/oss/driver/api/core/CqlSession;", "getCqlSession", "()Lcom/datastax/oss/driver/api/core/CqlSession;", "toyEntity", "Lbr/com/zup/database/entity/ToyEntity;", "getToyEntity", "()Lbr/com/zup/database/entity/ToyEntity;", "setToyEntity", "(Lbr/com/zup/database/entity/ToyEntity;)V", "toyRepository", "Lbr/com/zup/database/repository/ToyEntityRepositoryScyllaImpl;", "getToyRepository", "()Lbr/com/zup/database/repository/ToyEntityRepositoryScyllaImpl;", "setUp", "", "should return sucess when save toy Entity", "biblio-tech"})
@io.micronaut.test.extensions.kotest.annotation.MicronautTest()
public final class ToyRepositoryScyllaImplTest extends io.kotest.core.spec.style.AnnotationSpec {
    @org.jetbrains.annotations.NotNull()
    private final com.datastax.oss.driver.api.core.CqlSession cqlSession = null;
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl toyRepository = null;
    public br.com.zup.database.entity.ToyEntity toyEntity;
    
    @org.jetbrains.annotations.NotNull()
    public final com.datastax.oss.driver.api.core.CqlSession getCqlSession() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl getToyRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.database.entity.ToyEntity getToyEntity() {
        return null;
    }
    
    public final void setToyEntity(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity p0) {
    }
    
    @io.kotest.core.spec.style.AnnotationSpec.BeforeEach()
    public final void setUp() {
    }
    
    public ToyRepositoryScyllaImplTest() {
        super();
    }
}