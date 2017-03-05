package solutions.lightprocessing.tsms.api.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import solutions.lightprocessing.tsms.persistence.repositories.*

@Controller
@RequestMapping("api/projects")
class ProjectController {
    // TODO: Delete test fields and methods
    @Autowired
    ProjectRepository projectRepository

    @Autowired
    ProjectVersionRepository projectVersionRepository

    @Autowired
    SuiteRepository suiteRepository

    @Autowired
    TestCaseRepository testCaseRepository

    @Autowired
    StepRepository stepRepository

    @Autowired
    SuiteRunRepository suiteRunRepository

    @Autowired
    TestCaseRunRepository testCaseRunRepository

    @Autowired
    StepRunRepository stepRunRepository

    @ResponseBody
    @RequestMapping("all")
    String getAll() {
        projectRepository.findAll()
    }
}
