package calculator;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
@Scope("session")
@org.springframework.stereotype.Controller
public class Begin {
    @RequestMapping(value = "/calc")//, method = RequestMethod.POST)
    public String calculate(@RequestParam(required = false, value = "number1") Double num1, @RequestParam(required = false, value = "number2") Double num2,
                            @RequestParam(required = false, value = "action") Character ch, HttpSession session) {
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
     //   System.out.println("result = " + num);


  session.setAttribute("num", num);

        return "result";
    }
}
