package hello.core.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {
    public void logic(String id) {
        System.out.println("service id = " + id);
    }
}
