/* CORSの設定 */

package todo_back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedOrigins("http://localhost:3000",
        "https://my-todo-frontend-three.vercel.app" /* 本番環境用 */
        )
        .allowedMethods("GET", "POST", "PUT", "DELETE")
        .allowCredentials(true);
    }
}
