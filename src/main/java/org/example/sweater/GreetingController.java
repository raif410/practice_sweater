package org.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

//Контроллер - это Программный модуль который по пути /greeting слушает запросы и возвращет данные
//В текущей ситуации он будет возсращать файл шаблона, который пока не описан.
@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping //означает что при входе на локалхост я буду сразу получать результат который оговорю здесь
    public String main(Map<String, Object> model)
    {
        model.put("some", "hello, letsCode!");
        return "main";
    }
}
