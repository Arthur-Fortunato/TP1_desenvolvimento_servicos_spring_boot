package com.example.calculo.controller;

import com.example.calculo.service.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculo")
public class CalculoController {
    @Autowired
    public CalculoService calculoService;

    @RequestMapping(value = "/adicao/{num1}/{num2}", method =  {RequestMethod.GET, RequestMethod.POST})
    public int adicao(@PathVariable int num1, @PathVariable int num2) {
        return calculoService.adicao(num1, num2);
    }
    @RequestMapping(value = "/subtracao/{num1}/{num2}", method =  {RequestMethod.GET, RequestMethod.POST})
    public int subtracao(@PathVariable int num1, @PathVariable int num2) {
        return calculoService.subtracao(num1, num2);
    }
    @RequestMapping(value = "/multiplicacao/{num1}/{num2}", method =  {RequestMethod.GET, RequestMethod.POST})
    public int multiplicacao(@PathVariable int num1, @PathVariable int num2) {
        return calculoService.multiplicacao(num1, num2);
    }
    @RequestMapping(value = "/divisao/{num1}/{num2}", method =  {RequestMethod.GET, RequestMethod.POST})
    public int divisao(@PathVariable int num1, @PathVariable int num2) {
        return calculoService.divisao(num1, num2);
    }
    @RequestMapping(value = "/potenciacao/{num1}/{num2}", method =  {RequestMethod.GET, RequestMethod.POST})
    public int potencia(@PathVariable int num1, @PathVariable int num2) {
        return calculoService.potenciacao(num1, num2);
    }
}
