package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.project.Project

@Repository
interface ProjectRepository extends CrudRepository<Project, Long> {
    Project findByName(String name)
}