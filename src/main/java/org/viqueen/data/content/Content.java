package org.viqueen.data.content;

import lombok.Getter;
import lombok.Setter;
import org.viqueen.data.SoftRemoved;
import org.viqueen.data.Tenant;
import org.viqueen.data.Tenanted;
import org.viqueen.data.Timestamped;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Date;

@Setter
@Getter
@Entity
public class Content implements Timestamped, SoftRemoved, Tenanted {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    @ManyToOne
    private Tenant tenant;

    @Column(nullable = false)
    private Date createdAt;
    @Column
    private Date updatedAt;
    @Column(nullable = false)
    private Date removedAt;
    @Column
    private boolean removed;

    @Column
    private String title;
    @Column(nullable = false)
    private Long version;
    @Column(nullable = false)
    private ContentStatus contentStatus;
    @ManyToOne
    private ContentType contentType;

    @OneToMany
    private Collection<ContentBody> contentBodies;
}
