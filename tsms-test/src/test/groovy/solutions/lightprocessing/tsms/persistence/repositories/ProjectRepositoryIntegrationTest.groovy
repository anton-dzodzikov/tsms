package solutions.lightprocessing.tsms.persistence.repositories

import com.github.springtestdbunit.DbUnitTestExecutionListener
import com.github.springtestdbunit.annotation.DatabaseSetup
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener
import org.springframework.test.context.transaction.TransactionalTestExecutionListener
import solutions.lightprocessing.tsms.application.Application
import solutions.lightprocessing.tsms.common.project.Project

import static org.assertj.core.api.Assertions.*

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@TestExecutionListeners([
        DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class
])
@DatabaseSetup("/db-unit/repository-test/project-repository-dataset.xml")
class ProjectRepositoryIntegrationTest {
    @Autowired
    ProjectRepository projectRepository

    @Test
    void findAllReturnsAllEntities() {
        assertThat(projectRepository.findAll()).hasSize(3)
    }

    @Test
    void findOneReturnsEntityWithGivenId() {
        Project result = projectRepository.findOne(1L)

        assertThat(result).isNotNull()
        assertThat(result.name).isEqualTo("First project")
    }

    @Test
    void findOneReturnsNullWhenEntityWithGivenIdDoesNotExist() {
        assertThat(projectRepository.findOne(10L)).isNull()
    }

    @Test
    void findByNameReturnsEntityWithGivenName() {
        Project result = projectRepository.findByName("Second project")

        assertThat(result).isNotNull()
        assertThat(result.description).isEqualTo("Second project description")
    }

    @Test
    void findByNameReturnsNullWhenEntityWithGivenNameDoesNotExist() {
        assertThat(projectRepository.findByName("Not existing project")).isNull()
    }
}
