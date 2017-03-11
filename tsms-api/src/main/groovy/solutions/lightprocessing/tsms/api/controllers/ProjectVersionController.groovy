package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.SingleResponse
import solutions.lightprocessing.tsms.persistence.repositories.ProjectVersionRepository

@Controller
@RequestMapping("api/projectVersion")
class ProjectVersionController {
    @Autowired
    ProjectVersionRepository projectVersionRepository

    @ResponseBody
    @RequestMapping(path = "all", produces = "application/json")
    SingleResponse getAll() {
        [ projectVersionRepository.findAll() ]
    }

    @ResponseBody
    @RequestMapping(path = "id/{id}", produces = "application/json")
    SingleResponse getById(@PathVariable String id) {
        [ projectVersionRepository.findOne(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "name/{name}", produces = "application/json")
    SingleResponse getByName(@PathVariable String name) {
        [ projectVersionRepository.findByName(name) ]
    }

    @ResponseBody
    @RequestMapping(path = "project/{id}", produces = "application/json")
    SingleResponse getByProject(@PathVariable String id) {
        [ projectVersionRepository.findByProjectId(id as Long) ]
    }
}
