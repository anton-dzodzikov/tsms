package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.SingleResponse
import solutions.lightprocessing.tsms.persistence.repositories.StepRepository

@Controller
@RequestMapping("api/step")
class StepController {
    @Autowired
    StepRepository stepRepository

    @ResponseBody
    @RequestMapping(path = "all", produces = "application/json")
    SingleResponse getAll() {
        [ stepRepository.findAll() ]
    }

    @ResponseBody
    @RequestMapping(path = "id/{id}", produces = "application/json")
    SingleResponse getById(@PathVariable String id) {
        [ stepRepository.findOne(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "testCase/{id}", produces = "application/json")
    SingleResponse getByTestCase(@PathVariable String id) {
        [ stepRepository.findByTestCaseId(id as Long) ]
    }
}
