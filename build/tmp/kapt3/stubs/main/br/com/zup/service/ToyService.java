package br.com.zup.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e2\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\u0010"}, d2 = {"Lbr/com/zup/service/ToyService;", "", "createToy", "Lbr/com/zup/model/Toy;", "toy", "deleteToyById", "", "id", "", "getAllToys", "", "name", "", "getToyById", "Ljava/util/Optional;", "updateToy", "biblio-tech"})
@javax.inject.Singleton()
public abstract interface ToyService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.model.Toy createToy(@org.jetbrains.annotations.NotNull()
    br.com.zup.model.Toy toy);
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.model.Toy updateToy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    public abstract void deleteToyById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<br.com.zup.model.Toy> getAllToys(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<br.com.zup.model.Toy> getToyById(long id);
}