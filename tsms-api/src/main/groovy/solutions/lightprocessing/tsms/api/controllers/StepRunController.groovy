package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.SingleResponse
import solutions.lightprocessing.tsms.common.runs.RunStatus
import solutions.lightprocessing.tsms.persistence.repositories.StepRunRepository

@Controller
@RequestMapping("api/stepRun")
class StepRunController {
    @Autowired
    StepRunRepository stepRunRepository

    @ResponseBody
    @RequestMapping(path = "all", produces = "application/json")
    SingleResponse getAll() {
        [ stepRunRepository.findAll() ]
    }

    @ResponseBody
    @RequestMapping(path = "id/{id}", produces = "application/json")
    SingleResponse getById(@PathVariable String id) {
        [ stepRunRepository.findOne(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "testCaseRun/{id}", produces = "application/json")
    SingleResponse getByTestCaseRun(@PathVariable String id) {
        [ stepRunRepository.findByTestCaseRunId(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "step/{id}", produces = "application/json")
    SingleResponse getByStep(@PathVariable String id) {
        [ stepRunRepository.findByStepId(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "status/{status}", produces = "application/json")
    SingleResponse getByStatus(@PathVariable String status) {
        [ stepRunRepository.findByStatus(status as RunStatus) ]
    }
}
