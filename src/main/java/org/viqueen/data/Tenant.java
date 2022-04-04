package org.viqueen.data;

import lombok.Getter;
import lombok.Setter;
import org.viqueen.data.content.Content;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Setter
@Getter
@Entity
public class Tenant implements Timestamped, SoftRemoved {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @Column(nullable = false)
    private Date createdAt;
    @Column
    private Date updatedAt;
    @Column(nullable = false)
    private Date removedAt;
    @Column
    private boolean removed;

    @Column(nullable = false)
    private String name;

    @OneToMany
    private Collection<Content> contents;
}
