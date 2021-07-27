package br.com.zup.core.mapper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lbr/com/zup/core/mapper/ToyConverter;", "", "()V", "Companion", "biblio-tech"})
public final class ToyConverter {
    @org.jetbrains.annotations.NotNull()
    public static final br.com.zup.core.mapper.ToyConverter.Companion Companion = null;
    
    public ToyConverter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004J\u0016\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0004\u00a8\u0006\u0015"}, d2 = {"Lbr/com/zup/core/mapper/ToyConverter$Companion;", "", "()V", "toDto", "Lbr/com/zup/entrypoint/dto/ToyDto;", "toy", "Lbr/com/zup/core/model/Toy;", "toEntity", "Lbr/com/zup/database/entity/ToyEntity;", "toListDto", "", "toyList", "toListToy", "toyEntityList", "", "toToy", "toyEntity", "dto", "toToytWithId", "id", "Ljava/util/UUID;", "biblio-tech"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.database.entity.ToyEntity toEntity(@org.jetbrains.annotations.NotNull()
        br.com.zup.core.model.Toy toy) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.core.model.Toy toToy(@org.jetbrains.annotations.NotNull()
        br.com.zup.entrypoint.dto.ToyDto dto) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.core.model.Toy toToy(@org.jetbrains.annotations.NotNull()
        br.com.zup.database.entity.ToyEntity toyEntity) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<br.com.zup.entrypoint.dto.ToyDto> toListDto(@org.jetbrains.annotations.NotNull()
        java.util.List<br.com.zup.entrypoint.dto.ToyDto> toyList) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<br.com.zup.entrypoint.dto.ToyDto> toListToy(@org.jetbrains.annotations.NotNull()
        java.util.List<br.com.zup.database.entity.ToyEntity> toyEntityList) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.entrypoint.dto.ToyDto toDto(@org.jetbrains.annotations.NotNull()
        br.com.zup.core.model.Toy toy) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final br.com.zup.core.model.Toy toToytWithId(@org.jetbrains.annotations.NotNull()
        java.util.UUID id, @org.jetbrains.annotations.NotNull()
        br.com.zup.entrypoint.dto.ToyDto dto) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}