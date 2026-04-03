import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.zbaction.Main;

@SpringBootTest(classes = Main.class)
public class LLMTest {

    /**
     * 整合SpringBoot
     */
    @Autowired
    private OpenAiChatModel openAiChatModel;
    @Test
    public void testSpringBoot() {
        //向模型提问
        String answer = openAiChatModel.chat("你好");
        //输出结果
        System.out.println(answer);
    }

}
