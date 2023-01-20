package com.fstats.language;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_language")
public class LanguageEntity extends PanacheEntityBase {

    @Id
    @Column(name = "id", nullable = false)
    public String id;
    @Column(name = "languageName", nullable = false, length = 50)
    public String languageName;
}
