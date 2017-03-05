package solutions.lightprocessing.tsms.common.runs

import solutions.lightprocessing.tsms.common.cases.Step

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "step_runs")
class StepRun {
    @Id
    @GeneratedValue
    Long id

    @ManyToOne
    TestCaseRun testCaseRun

    @ManyToOne
    Step step

    @Enumerated(EnumType.STRING)
    RunStatus status


    String actualResult
}
