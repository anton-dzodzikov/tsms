package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.runs.RunStatus
import solutions.lightprocessing.tsms.common.runs.TestCaseRun

@Repository
interface TestCaseRunRepository extends CrudRepository<TestCaseRun, Long> {
    List<TestCaseRun> findBySuiteRunId(Long id)

    List<TestCaseRun> findByTestCaseId(Long id)

    List<TestCaseRun> findByStatus(RunStatus status)
}
