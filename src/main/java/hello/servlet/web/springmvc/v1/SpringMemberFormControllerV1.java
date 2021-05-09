package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/*
다음과 같이 컴포넌트 스캔없이 스프링빈으로 직접 등록할 수도 있음

@RequestMapping
public class SpringMemberFormControllerV1 {
 @RequestMapping("/springmvc/v1/members/new-form")
 public ModelAndView process() {
 return new ModelAndView("new-form");
 }
}

@Bean
TestController testController() {
return new TestController();
}


 */

// @Controller = @Component + @RequestMapping
@Controller
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form")
    public ModelAndView process() {
        return new ModelAndView("new-form");
    }
}
