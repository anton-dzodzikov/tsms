package solutions.lightprocessing.tsms.persistence.repositories

import com.github.springtestdbunit.DbUnitTestExecutionListener
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestExecutionListeners
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener
import org.springframework.test.context.transaction.TransactionalTestExecutionListener
import solutions.lightprocessing.tsms.application.Application

import static org.assertj.core.api.Assertions.assertThat

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@TestExecutionListeners([
        DependencyInjectionTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class
])
class ProjectRepositoryIntegrationTest {
    @Test
    void test() {
        assertThat(true).isEqualTo(true)
    }
}
