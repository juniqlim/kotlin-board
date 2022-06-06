package im.juniq.kotlinboard.board

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class BoardServiceTest(@Autowired val boardUseCase: BoardUseCase) {
    @Test
    fun test() {
        assertThat(boardUseCase.articles().size).isEqualTo(1)
    }
}