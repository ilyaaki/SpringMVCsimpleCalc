package calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/", method = {RequestMethod.POST, RequestMethod.GET})
    public String calculate(@RequestParam(required = false, value = "number1") Double num1, @RequestParam(required = false, value = "number2") Double num2,
                            @RequestParam(required = false, value = "action") Character ch, HttpSession session) {
        if (num1 == null && num2 == null) {
            return "calc";
        } else {
            Double num = new Double(0);
            if (ch == '+') {
                num = num1 + num2;
            } else if (ch == '-') {
                num = num1 - num2;
            } else if (ch == '/') {
                num = num1 / num2;
            } else if (ch == 'x') {
                num = num1 * num2;
            }
            //     System.out.println("result = " + num);
            session.setAttribute("num", num);
            return "result";
        }
    }
}
