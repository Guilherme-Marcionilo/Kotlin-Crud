package br.com.zup.pub;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0017J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0017J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0017J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0001\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lbr/com/zup/pub/ToyController;", "", "toyRepository", "Lbr/com/zup/pub/ToyRepository;", "(Lbr/com/zup/pub/ToyRepository;)V", "getToyRepository", "()Lbr/com/zup/pub/ToyRepository;", "createToy", "Lio/micronaut/http/HttpResponse;", "request", "Lbr/com/zup/pub/ToyRequest;", "deleteToy", "id", "", "getAllToys", "name", "", "getToyById", "updateToy", "biblio-tech"})
@io.micronaut.http.annotation.Controller(value = "/toy")
@io.micronaut.validation.Validated()
public class ToyController {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.pub.ToyRepository toyRepository = null;
    
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
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.HttpResponse<java.lang.Object> createToy(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.pub.ToyRequest request) {
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
    
    @org.jetbrains.annotations.NotNull()
    @javax.transaction.Transactional()
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> deleteToy(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.pub.ToyRepository getToyRepository() {
        return null;
    }
    
    public ToyController(@org.jetbrains.annotations.NotNull()
    br.com.zup.pub.ToyRepository toyRepository) {
        super();
    }
}