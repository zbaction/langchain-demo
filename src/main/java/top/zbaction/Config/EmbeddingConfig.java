package top.zbaction.Config;

import dev.langchain4j.community.model.zhipu.ZhipuAiEmbeddingModel;
import dev.langchain4j.model.embedding.EmbeddingModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class EmbeddingConfig {
    @Bean
    public EmbeddingModel embeddingModel() {
        return ZhipuAiEmbeddingModel.builder()
                .baseUrl("https://open.bigmodel.cn")
                .apiKey(System.getenv("ZHIPU_API_KEY"))
                .model("embedding-3")
                .callTimeout(Duration.ofSeconds(60))
                .connectTimeout(Duration.ofSeconds(60))
                .readTimeout(Duration.ofSeconds(60))
                .writeTimeout(Duration.ofSeconds(60))
                .build();
    }

}
