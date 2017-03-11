package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.SingleResponse
import solutions.lightprocessing.tsms.persistence.repositories.TestCaseRepository

@Controller
@RequestMapping("api/testCase")
class TestCaseController {
    @Autowired
    TestCaseRepository testCaseRepository

    @ResponseBody
    @RequestMapping(path = "all", produces = "application/json")
    SingleResponse getAll() {
        [ testCaseRepository.findAll() ]
    }

    @ResponseBody
    @RequestMapping(path = "id/{id}", produces = "application/json")
    SingleResponse getById(@PathVariable String id) {
        [ testCaseRepository.findOne(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "name/{name}", produces = "application/json")
    SingleResponse getByName(@PathVariable String name) {
        [ testCaseRepository.findByName(name) ]
    }

    @ResponseBody
    @RequestMapping(path = "suite/{id}", produces = "application/json")
    SingleResponse getBySuite(@PathVariable String id) {
        [ testCaseRepository.findBySuiteId(id as Long) ]
    }
}
