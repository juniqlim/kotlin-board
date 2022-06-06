package im.juniq.kotlinboard.board

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BoardController(val boardUseCase: BoardUseCase) {
    @GetMapping("index")
    fun index(): String {
        return "index"
    }

    @GetMapping("articles")
    fun articles(): List<Article> {
        return boardUseCase.articles()
    }
}
