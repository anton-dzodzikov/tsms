package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.runs.StepRun

@Repository
interface StepRunRepository extends CrudRepository<StepRun, Long> {
}
