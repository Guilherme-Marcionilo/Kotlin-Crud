package br.com.zup.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u0011H\u0017J\u0012\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0001\u0010\u0018\u001a\u00020\u0019H\u0017J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0017J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0001\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0017R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lbr/com/zup/controller/ToyController;", "", "toyRepository", "Lbr/com/zup/repository/ToyRepository;", "toyServiceImpl", "Lbr/com/zup/service/ToyServiceImpl;", "(Lbr/com/zup/repository/ToyRepository;Lbr/com/zup/service/ToyServiceImpl;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getToyRepository", "()Lbr/com/zup/repository/ToyRepository;", "getToyServiceImpl", "()Lbr/com/zup/service/ToyServiceImpl;", "createToy", "Lbr/com/zup/model/Toy;", "request", "Lbr/com/zup/model/ToyRequest;", "deleteToy", "", "id", "", "getAllToys", "Lio/micronaut/http/HttpResponse;", "name", "", "getToyById", "updateToy", "biblio-tech"})
@io.micronaut.http.annotation.Controller(value = "/toy")
@io.micronaut.validation.Validated()
public class ToyController {
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.repository.ToyRepository toyRepository = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.service.ToyServiceImpl toyServiceImpl = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Get()
    public io.micronaut.http.HttpResponse<java.lang.Object> getAllToys(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue(defaultValue = "")
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> getToyById(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.CREATED)
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Post()
    public br.com.zup.model.Toy createToy(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.model.ToyRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> updateToy(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public void deleteToy(@io.micronaut.http.annotation.PathVariable()
    long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.repository.ToyRepository getToyRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.service.ToyServiceImpl getToyServiceImpl() {
        return null;
    }
    
    public ToyController(@org.jetbrains.annotations.NotNull()
    br.com.zup.repository.ToyRepository toyRepository, @org.jetbrains.annotations.NotNull()
    br.com.zup.service.ToyServiceImpl toyServiceImpl) {
        super();
    }
}