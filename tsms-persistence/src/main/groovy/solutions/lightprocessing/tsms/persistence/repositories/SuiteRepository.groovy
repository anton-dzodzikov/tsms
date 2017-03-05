package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.cases.Suite

@Repository
interface SuiteRepository extends CrudRepository<Suite, Long> {

}