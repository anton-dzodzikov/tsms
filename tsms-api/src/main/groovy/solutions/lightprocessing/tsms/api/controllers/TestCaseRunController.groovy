package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.api.response.SingleResponse
import solutions.lightprocessing.tsms.common.runs.RunStatus
import solutions.lightprocessing.tsms.persistence.repositories.TestCaseRunRepository

@Controller
@RequestMapping("api/testCaseRun")
class TestCaseRunController {
    @Autowired
    TestCaseRunRepository testCaseRunRepository

    @ResponseBody
    @RequestMapping(path = "all", produces = "application/json")
    SingleResponse getAll() {
        [ testCaseRunRepository.findAll() ]
    }

    @ResponseBody
    @RequestMapping(path = "id/{id}", produces = "application/json")
    SingleResponse getById(@PathVariable String id) {
        [ testCaseRunRepository.findOne(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "suiteRun/{id}", produces = "application/json")
    SingleResponse getBySuiteRun(@PathVariable String id) {
        [ testCaseRunRepository.findBySuiteRunId(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "testCase/{id}", produces = "application/json")
    SingleResponse getByTestCase(@PathVariable String id) {
        [ testCaseRunRepository.findByTestCaseId(id as Long) ]
    }

    @ResponseBody
    @RequestMapping(path = "status/{status}", produces = "application/json")
    SingleResponse getByStatus(@PathVariable String status) {
        [ testCaseRunRepository.findByStatus(status as RunStatus) ]
    }
}
