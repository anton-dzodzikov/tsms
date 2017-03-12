package solutions.lightprocessing.tsms.common.runs

import solutions.lightprocessing.tsms.common.cases.TestCase

import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "test_case_runs")
class TestCaseRun {
    @Id
    @GeneratedValue(generator = "id_gen")
    @SequenceGenerator(name = "id_gen", sequenceName = "id_seq")
    Long id

    @ManyToOne
    SuiteRun suiteRun

    @ManyToOne
    TestCase testCase

    @Enumerated(EnumType.STRING)
    RunStatus status
}
