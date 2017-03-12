package solutions.lightprocessing.tsms.common.cases

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.SequenceGenerator
import javax.persistence.Table

@Entity
@Table(name = "steps")
class Step {
    @Id
    @GeneratedValue(generator = "id_gen")
    @SequenceGenerator(name = "id_gen", sequenceName = "id_seq")
    Long id

    @ManyToOne
    TestCase testCase

    Long order

    String action

    String expectedResult
}
