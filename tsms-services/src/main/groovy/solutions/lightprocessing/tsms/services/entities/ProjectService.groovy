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
        Project existingProject = projectRepository.findOne(project.id)

        if (existingProject == null) {
            throw new IllegalArgumentException("You can not update non-existing entity")
        }

        existingProject.with {
            name = project.name
            description = project.description
        }

        projectRepository.save(existingProject)
    }
}
