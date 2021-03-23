package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 탐색할 패키지의 시작위치를 지정함.
        basePackages = "hello.core.member",
        // @Configuration 컴포넌트 스캔에서 제외(예제코드 충돌로 인해 제외)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
