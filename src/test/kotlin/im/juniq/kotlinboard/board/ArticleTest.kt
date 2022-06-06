package im.juniq.kotlinboard.board

import org.assertj.core.api.Assertions.assertThatCode
import org.junit.jupiter.api.Test

internal class ArticleTest {
    @Test
    fun 생성() {
        assertThatCode { Article("제목", "내용") }.doesNotThrowAnyException()
    }
}