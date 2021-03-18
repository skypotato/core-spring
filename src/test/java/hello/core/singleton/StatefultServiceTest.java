package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefultServiceTest {

    @Test
    void statefulServiceSingleton(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefultService statefulService1 = ac.getBean(StatefultService.class);
        StatefultService statefulService2 = ac.getBean(StatefultService.class);

        // ThreadA : A사용자 10000원 주문
        statefulService1.order("userA", 10000);
        // ThreadB : B사용자 20000원 주문
        statefulService1.order("userB", 20000);

        // ThreadA : A사용자 주문 금액 조회
        int price = statefulService1.getPrice();

        Assertions.assertThat(statefulService1.getPrice()).isEqualTo(20000);

    }

    static  class TestConfig{

        @Bean
        public StatefultService statefultService(){
            return new StatefultService();
        }
    }
}