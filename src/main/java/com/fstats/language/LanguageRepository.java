package com.fstats.language;

import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class LanguageRepository implements PanacheRepositoryBase<LanguageEntity, Integer> {

    public Uni<LanguageEntity> findByName(String languageName) {
        return find("languageName", languageName).firstResult();
    }

}
