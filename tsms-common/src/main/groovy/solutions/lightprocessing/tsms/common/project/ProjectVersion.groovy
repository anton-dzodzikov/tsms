package solutions.lightprocessing.tsms.common.project

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class ProjectVersion {
    @Id
    @GeneratedValue
    Long id

    String name

    @ManyToOne
    Project project
}
