package solutions.lightprocessing.tsms.common.project

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "project_versions")
class ProjectVersion {
    @Id
    @GeneratedValue
    Long id

    String name

    @ManyToOne
    Project project
}
