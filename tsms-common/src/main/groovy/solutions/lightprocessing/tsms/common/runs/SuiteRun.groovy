package solutions.lightprocessing.tsms.common.runs

import solutions.lightprocessing.tsms.common.cases.Suite
import solutions.lightprocessing.tsms.common.project.ProjectVersion

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "suite_runs")
class SuiteRun {
    @Id
    @GeneratedValue(generator = "id_gen")
    @SequenceGenerator(name = "id_gen", sequenceName = "id_seq")
    Long id

    @ManyToOne
    ProjectVersion projectVersion

    @ManyToOne
    Suite suite

    @Enumerated(EnumType.STRING)
    RunStatus status
}
