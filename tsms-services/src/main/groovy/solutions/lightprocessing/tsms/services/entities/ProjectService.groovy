package solutions.lightprocessing.tsms.services.entities

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import solutions.lightprocessing.tsms.common.project.Project
import solutions.lightprocessing.tsms.persistence.repositories.ProjectRepository

@Service
class ProjectService {
    @Autowired
    ProjectRepository projectRepository

    List<Project> getAllProjects() {
        projectRepository.findAll().asList()
    }

    Project getProjectById(Long id) {
        projectRepository.findOne(id)
    }

    Project getProjectByName(String name) {
        projectRepository.findByName(name)
    }

    Project createProject(Project project) {
        projectRepository.save(project)
    }

    Project updateProject(Project project) {
        projectRepository.findOne(project.id).with {
            if (it == null) {
                throw new IllegalArgumentException("You can not update non-existing entity")
            }

            it
        }.with {
            name = project.name
            description = project.description

            it
        }.with {
            projectRepository.save(it)
        }
    }

    void deleteProject(Project project) {
        projectRepository.delete(project)
    }
}
