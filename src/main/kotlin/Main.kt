package org.example

import mu.KLogging
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@SpringBootApplication
class BootApplication{

    companion object: KLogging()


    @RequestMapping("/")
    fun home():String{
        val name="앤디"
        logger.info {"[${name}"}
        return "안녕 스프링 부트"
    }
}

fun main(args:Array<String>){

}