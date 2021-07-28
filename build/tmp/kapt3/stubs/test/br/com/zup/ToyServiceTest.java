package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\b\u0010\u0015\u001a\u00020\u0014H\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0016"}, d2 = {"Lbr/com/zup/ToyServiceTest;", "Lio/kotest/core/spec/style/AnnotationSpec;", "()V", "toy", "Lbr/com/zup/core/model/Toy;", "getToy", "()Lbr/com/zup/core/model/Toy;", "setToy", "(Lbr/com/zup/core/model/Toy;)V", "toyEntity", "Lbr/com/zup/database/entity/ToyEntity;", "getToyEntity", "()Lbr/com/zup/database/entity/ToyEntity;", "setToyEntity", "(Lbr/com/zup/database/entity/ToyEntity;)V", "toyServicePort", "Lbr/com/zup/core/port/ToyServicePort;", "getToyServicePort", "()Lbr/com/zup/core/port/ToyServicePort;", "setUp", "", "should return toy successfully", "biblio-tech"})
@io.micronaut.test.extensions.kotest.annotation.MicronautTest()
public final class ToyServiceTest extends io.kotest.core.spec.style.AnnotationSpec {
    @org.jetbrains.annotations.NotNull()
    private final br.com.zup.core.port.ToyServicePort toyServicePort = null;
    public br.com.zup.database.entity.ToyEntity toyEntity;
    public br.com.zup.core.model.Toy toy;
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.core.port.ToyServicePort getToyServicePort() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.database.entity.ToyEntity getToyEntity() {
        return null;
    }
    
    public final void setToyEntity(@org.jetbrains.annotations.NotNull()
    br.com.zup.database.entity.ToyEntity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.zup.core.model.Toy getToy() {
        return null;
    }
    
    public final void setToy(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.model.Toy p0) {
    }
    
    @io.kotest.core.spec.style.AnnotationSpec.BeforeEach()
    public final void setUp() {
    }
    
    public ToyServiceTest() {
        super();
    }
}