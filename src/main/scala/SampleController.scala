//Importing external libraries
import org.springframework.web.bind.annotation._;
import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot._;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure._;
import org.springframework.web.bind.annotation.{RequestMapping, RestController}
@RestController
@EnableAutoConfiguration
@ComponentScan
class SampleController {

   @RequestMapping(Array("/"))
   def mapResponse() = "Hello world running on Spring boot"
}

object SampleWebController {

    def main(args: Array[String]) {
    SpringApplication.run(classOf[SampleController]);
	}
}
