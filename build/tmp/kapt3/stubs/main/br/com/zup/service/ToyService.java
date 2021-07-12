package br.com.zup.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lbr/com/zup/service/ToyService;", "", "createToy", "Lbr/com/zup/model/Toy;", "toy", "deleteToyById", "", "id", "", "biblio-tech"})
@javax.inject.Singleton()
public abstract interface ToyService {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.model.Toy createToy(@org.jetbrains.annotations.NotNull()
    br.com.zup.model.Toy toy);
    
    public abstract void deleteToyById(long id);
}