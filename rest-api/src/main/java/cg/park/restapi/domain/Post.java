package cg.park.restapi.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
@Getter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue
    private long id;
    private String subject;
    private String content;
    @CreationTimestamp
    private ZonedDateTime createDateTime;
    @UpdateTimestamp
    private ZonedDateTime updateDateTime;
}
