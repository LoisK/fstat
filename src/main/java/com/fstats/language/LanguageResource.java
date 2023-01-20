package com.fstats.language;

import io.quarkus.hibernate.reactive.panache.common.runtime.ReactiveTransactional;
import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.reactive.ResponseStatus;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("language")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LanguageResource {

    @Inject
    LanguageRepository languageRepository;

    @GET
    public Uni<LanguageEntity> getLanguage(@QueryParam("languageName") String languageName) {
        return languageRepository.findByName(languageName);
    }

    @POST
    @ResponseStatus(201)
    @ReactiveTransactional
    public Uni<LanguageEntity> createLanguage(LanguageEntity language) {
        return LanguageEntity.persist(language).replaceWith(language);
    }
}
