package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.runs.RunStatus
import solutions.lightprocessing.tsms.common.runs.StepRun

@Repository
interface StepRunRepository extends CrudRepository<StepRun, Long> {
    List<StepRun> findByTestCaseRunId(Long id)

    List<StepRun> findByStepId(Long id)

    List<StepRun> findByStatus(RunStatus status)
}
