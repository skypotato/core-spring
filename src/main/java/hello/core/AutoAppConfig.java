package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        // 탐색할 패키지의 시작위치를 지정함.
        basePackages = "hello.core.member",
        // 지정한 클래스의 패키지를 탐색 시작 위로 지정함.
        // (Default : @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작위치로 됨)
        basePackageClasses = AppConfig.class,
        // @Configuration 컴포넌트 스캔에서 제외(예제코드 충돌로 인해 제외)
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    @Bean(name = "memoryMemberRepository" )
//    MemberRepository memberRepository() {
//        return new MemoryMemberRepository();
//    }
}
