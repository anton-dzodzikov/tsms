package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.cases.Step

@Repository
interface StepRepository extends CrudRepository<Step, Long> {

}