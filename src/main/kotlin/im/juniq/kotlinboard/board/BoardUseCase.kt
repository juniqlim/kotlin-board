package im.juniq.kotlinboard.board

import org.springframework.stereotype.Service
import java.util.*

interface BoardUseCase {
    fun articles() : List<Article>
}

@Service
class BoardService : BoardUseCase {
    override fun articles(): List<Article> {
        return Arrays.asList(Article("title", "content"))
    }
}