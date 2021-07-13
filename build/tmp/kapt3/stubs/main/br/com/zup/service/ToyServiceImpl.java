package br.com.zup.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00142\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lbr/com/zup/service/ToyServiceImpl;", "Lbr/com/zup/service/ToyService;", "toyRepository", "Lbr/com/zup/repository/ToyRepository;", "(Lbr/com/zup/repository/ToyRepository;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "createToy", "Lbr/com/zup/model/Toy;", "toy", "deleteToyById", "", "id", "", "getAllToys", "", "name", "", "getToyById", "Ljava/util/Optional;", "updateToy", "biblio-tech"})
@javax.inject.Singleton()
public final class ToyServiceImpl implements br.com.zup.service.ToyService {
    private final org.slf4j.Logger log = null;
    private final br.com.zup.repository.ToyRepository toyRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.model.Toy createToy(@org.jetbrains.annotations.NotNull()
    br.com.zup.model.Toy toy) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.zup.model.Toy updateToy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public void deleteToyById(long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<br.com.zup.model.Toy> getAllToys(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.Optional<br.com.zup.model.Toy> getToyById(long id) {
        return null;
    }
    
    public ToyServiceImpl(@org.jetbrains.annotations.NotNull()
    br.com.zup.repository.ToyRepository toyRepository) {
        super();
    }
}