package com.venturacodes.helpdesk

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class FirstController {
    @GetMapping("/")
    fun vaiCaraio():String{
        return "Vai Caraio"
    }
}