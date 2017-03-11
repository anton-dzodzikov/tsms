package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.SingleResponse
import solutions.lightprocessing.tsms.common.runs.RunStatus
import solutions.lightprocessing.tsms.persistence.repositories.SuiteRunRepository

@Controller
@RequestMapping("api/suiteRun")
class SuiteRunController {
    @Autowired
    SuiteRunRepository suiteRunRepository

    @ResponseBody
    @RequestMapping(path = "all", produces = "application/json")
    SingleResponse getAll() {
        [ suiteRunRepository.findAll() ]
    }

    @ResponseBody
    @RequestMapping(path = "id/{id}", produces = "application/json")
    SingleResponse getById(@PathVariable String id) {
        [ suiteRunRepository.findOne(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "projectVersion/{id}", produces = "application/json")
    SingleResponse getByProjectVersion(@PathVariable String id) {
        [ suiteRunRepository.findByProjectVersionId(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "suite/{id}", produces = "application/json")
    SingleResponse getBySuite(@PathVariable String id) {
        [ suiteRunRepository.findBySuiteId(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "status/{status}", produces = "application/json")
    SingleResponse getByStatus(@PathVariable String status) {
        [ suiteRunRepository.findByStatus(status as RunStatus) ]
    }
}
