package br.com.zup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\rH\u0007J\b\u0010\u000f\u001a\u00020\rH\u0007R\u0018\u0010\u0003\u001a\u00020\u00048\u0002@\u0002X\u0083.\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002R\u0018\u0010\t\u001a\u00020\n8\u0002@\u0002X\u0083.\u00a2\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0002\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/ToyControllerTest;", "Lio/kotest/core/spec/style/AnnotationSpec;", "()V", "toy", "Lbr/com/zup/model/Toy;", "getToy$annotations", "toyRepository", "Lbr/com/zup/repository/ToyRepository;", "getToyRepository$annotations", "toyRequest", "Lbr/com/zup/model/ToyRequest;", "getToyRequest$annotations", "setUp", "", "should create toy with success", "should return toy with success", "biblio-tech"})
@io.micronaut.test.extensions.kotest.annotation.MicronautTest()
public final class ToyControllerTest extends io.kotest.core.spec.style.AnnotationSpec {
    private final br.com.zup.repository.ToyRepository toyRepository = null;
    private br.com.zup.model.ToyRequest toyRequest;
    private br.com.zup.model.Toy toy;
    
    @io.mockk.impl.annotations.InjectMockKs()
    @java.lang.Deprecated()
    private static void getToyRepository$annotations() {
    }
    
    @io.mockk.impl.annotations.MockK()
    @java.lang.Deprecated()
    private static void getToyRequest$annotations() {
    }
    
    @io.mockk.impl.annotations.MockK()
    @java.lang.Deprecated()
    private static void getToy$annotations() {
    }
    
    @io.kotest.core.spec.style.AnnotationSpec.BeforeEach()
    public final void setUp() {
    }
    
    public ToyControllerTest() {
        super();
    }
}