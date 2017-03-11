package solutions.lightprocessing.tsms.persistence.repositories

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import solutions.lightprocessing.tsms.common.project.ProjectVersion

@Repository
interface ProjectVersionRepository extends CrudRepository<ProjectVersion, Long> {
    List<ProjectVersion> findByName(String name)

    List<ProjectVersion> findByProjectId(Long projectId)
}