package solutions.lightprocessing.tsms.common.cases

import solutions.lightprocessing.tsms.common.project.Project

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "suites")
class Suite {
    @Id
    @GeneratedValue
    Long id

    String name

    String description

    @ManyToOne
    Project project
}
