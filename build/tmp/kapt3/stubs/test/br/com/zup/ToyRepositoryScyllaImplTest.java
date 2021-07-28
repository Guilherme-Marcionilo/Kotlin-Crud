package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lbr/com/zup/ToyRepositoryScyllaImplTest;", "Lio/kotest/core/spec/style/AnnotationSpec;", "()V", "cqlSession", "Lcom/datastax/oss/driver/api/core/CqlSession;", "toyEntity", "Lbr/com/zup/database/entity/ToyEntity;", "toyRepository", "Lbr/com/zup/database/repository/ToyEntityRepositoryScyllaImpl;", "setUp", "", "should return ", "should return sucess when save toy Entity", "biblio-tech"})
@io.micronaut.test.extensions.kotest.annotation.MicronautTest()
public final class ToyRepositoryScyllaImplTest extends io.kotest.core.spec.style.AnnotationSpec {
    private final com.datastax.oss.driver.api.core.CqlSession cqlSession = null;
    private final br.com.zup.database.repository.ToyEntityRepositoryScyllaImpl toyRepository = null;
    private br.com.zup.database.entity.ToyEntity toyEntity;
    
    @io.kotest.core.spec.style.AnnotationSpec.BeforeEach()
    public final void setUp() {
    }
    
    public ToyRepositoryScyllaImplTest() {
        super();
    }
}