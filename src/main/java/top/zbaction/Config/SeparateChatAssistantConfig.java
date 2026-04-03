package top.zbaction.Config;

import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*自动生成对话ID*/
@Configuration
public class SeparateChatAssistantConfig {
    @Bean
    ChatMemoryProvider chatMemoryProvider() {
        return memoryId -> {
            System.out.println("Creating chat memory for ID: " + memoryId);
            return MessageWindowChatMemory.builder()
                    .id(memoryId)
                    .maxMessages(10)
                    .build();
        };
    }
}
