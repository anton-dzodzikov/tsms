package solutions.lightprocessing.tsms.common.cases

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "test_cases")
class TestCase {
    @Id
    @GeneratedValue
    Long id

    @ManyToOne
    Suite suite

    String name
}
