package br.com.zup.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0017J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017J\u001e\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00140\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\u0016H\u0017J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0017J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0017R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lbr/com/zup/controller/ToyController;", "", "toyService", "Lbr/com/zup/service/ToyService;", "(Lbr/com/zup/service/ToyService;)V", "log", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getToyService", "()Lbr/com/zup/service/ToyService;", "createToy", "Lio/micronaut/http/HttpResponse;", "Lbr/com/zup/model/Toy;", "request", "Lbr/com/zup/model/ToyRequest;", "deleteToy", "", "id", "", "getAllToys", "", "name", "", "getToyById", "updateToy", "biblio-tech"})
@io.micronaut.http.annotation.Controller(value = "/toy")
@io.micronaut.validation.Validated()
public class ToyController {
    private final org.slf4j.Logger log = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.zup.service.ToyService toyService = null;
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @io.micronaut.http.annotation.Get()
    public io.micronaut.http.HttpResponse<java.util.List<br.com.zup.model.Toy>> getAllToys(@org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.QueryValue(defaultValue = "")
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Get(value = "/{id}")
    public io.micronaut.http.HttpResponse<java.lang.Object> getToyById(@io.micronaut.http.annotation.PathVariable()
    long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @io.micronaut.http.annotation.Post()
    public io.micronaut.http.HttpResponse<br.com.zup.model.Toy> createToy(@org.jetbrains.annotations.NotNull()
    @javax.validation.Valid()
    @io.micronaut.http.annotation.Body()
    br.com.zup.model.ToyRequest request) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.micronaut.http.annotation.Put(value = "/{id}")
    public io.micronaut.http.HttpResponse<br.com.zup.model.Toy> updateToy(@io.micronaut.http.annotation.PathVariable()
    long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @io.micronaut.http.annotation.Delete(value = "/{id}")
    public void deleteToy(@io.micronaut.http.annotation.PathVariable()
    long id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public br.com.zup.service.ToyService getToyService() {
        return null;
    }
    
    public ToyController(@org.jetbrains.annotations.NotNull()
    br.com.zup.service.ToyService toyService) {
        super();
    }
}