package net.takengo.app.dto.transformer;

import net.takengo.app.dto.TakenGoBaseDTO;
import net.takengo.app.entity.base.TakenGoAbstractEntity;

public interface BaseTransformer {
    /**
     * Converts specified entity into DTO object
     *
     * @param entity
     * @param clz
     * @return
     */
    <T extends TakenGoAbstractEntity, P extends TakenGoBaseDTO<T>> P transform(T entity, Class<P> clz);

    /**
     * Converts specified DTO object into business entity
     *
     * @param dto
     * @param clz
     * @return
     */
    <T extends TakenGoAbstractEntity, P extends TakenGoBaseDTO<T>> T untransform(P dto, Class<T> clz);

}
