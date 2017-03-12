package solutions.lightprocessing.tsms.common.project

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "project_versions")
class ProjectVersion {
    @Id
    @GeneratedValue(generator = "id_gen")
    @SequenceGenerator(name = "id_gen", sequenceName = "id_seq")
    Long id

    String name

    @ManyToOne
    Project project
}
