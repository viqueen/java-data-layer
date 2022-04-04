package org.viqueen.data.content;

import lombok.Getter;
import lombok.Setter;
import org.viqueen.data.SoftRemoved;
import org.viqueen.data.Timestamped;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Setter
@Getter
@Entity
public class ContentType implements Timestamped, SoftRemoved {
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

    @Column
    private String name;
}
