package prompthub.model;

import java.time.LocalDateTime;
import java.util.List;

public class PromptTemplate {
    private String title;
    private String description;
    private String content;  // the actual prompt text
    private List<String> variables;  // placeholders like {name}, {topic}
    private LocalDateTime createdAt;
    private LocalDateTime lastUsedAt;

    public PromptTemplate(String title, String description, String content, List<String> variables) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.variables = variables;
        this.createdAt = LocalDateTime.now();
        this.lastUsedAt = null;
    }

    // getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getVariables() {
        return variables;
    }

    public void setVariables(List<String> variables) {
        this.variables = variables;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getLastUsedAt() {
        return lastUsedAt;
    }

    public void updateLastUsed() {
        this.lastUsedAt = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "PromptTemplate{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", content='" + content + '\'' +
                ", variables=" + variables +
                ", createdAt=" + createdAt +
                ", lastUsedAt=" + lastUsedAt +
                '}';
    }
}
