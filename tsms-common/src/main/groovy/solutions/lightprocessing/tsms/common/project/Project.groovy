package solutions.lightprocessing.tsms.common.project

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "projects")
class Project {
    @Id
    @GeneratedValue
    Long id

    String name

    String description
}
