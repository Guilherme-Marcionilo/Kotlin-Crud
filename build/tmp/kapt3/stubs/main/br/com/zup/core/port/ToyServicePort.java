package br.com.zup.core.port;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u000e"}, d2 = {"Lbr/com/zup/core/port/ToyServicePort;", "", "create", "Lbr/com/zup/core/model/Toy;", "toy", "delete", "", "id", "Ljava/util/UUID;", "findById", "getAll", "", "Lbr/com/zup/entrypoint/dto/ToyDto;", "update", "biblio-tech"})
public abstract interface ToyServicePort {
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.core.model.Toy create(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.model.Toy toy);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<br.com.zup.entrypoint.dto.ToyDto> getAll();
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.core.model.Toy findById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract br.com.zup.core.model.Toy update(@org.jetbrains.annotations.NotNull()
    br.com.zup.core.model.Toy toy);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    java.util.UUID id);
}