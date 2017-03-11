package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.cases.TestCase

@Repository
interface TestCaseRepository extends CrudRepository<TestCase, Long> {
    List<TestCase> findByName(String name)

    List<TestCase> findBySuiteId(Long id)
}