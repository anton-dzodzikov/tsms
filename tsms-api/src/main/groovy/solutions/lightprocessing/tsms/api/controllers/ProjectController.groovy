package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.SingleResponse
import solutions.lightprocessing.tsms.common.project.Project
import solutions.lightprocessing.tsms.persistence.repositories.*
import solutions.lightprocessing.tsms.services.entities.ProjectService

import static org.springframework.web.bind.annotation.RequestMethod.DELETE
import static org.springframework.web.bind.annotation.RequestMethod.POST
import static org.springframework.web.bind.annotation.RequestMethod.PUT

@Controller
@RequestMapping("api/project")
class ProjectController {
    @Autowired
    ProjectService projectService

    @ResponseBody
    @RequestMapping(path = "all", produces = "application/json")
    SingleResponse getAll() {
        [ projectService.getAllProjects() ]
    }

    @ResponseBody
    @RequestMapping(path = "id/{id}", produces = "application/json")
    SingleResponse getById(@PathVariable String id) {
        [ projectService.getProjectById(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "name/{name}", produces = "application/json")
    SingleResponse getByName(@PathVariable String name) {
        [ projectService.getProjectByName(name) ]
    }

    @ResponseBody
    @RequestMapping(path = "", produces = "application/json", method = PUT)
    SingleResponse create(@RequestBody Project project) {
        [ projectService.createProject(project) ]
    }

    @ResponseBody
    @RequestMapping(path = "", produces = "application/json", method = POST)
    SingleResponse update(@RequestBody Project project) {
        [ projectService.updateProject(project) ]
    }

    @ResponseBody
    @RequestMapping(path = "", produces = "application/json", method = DELETE)
    SingleResponse delete(@RequestBody Project project) {
        [ projectService.deleteProject(project) ]
    }
}
