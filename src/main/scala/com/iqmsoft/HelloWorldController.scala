package x.h.p.m

import org.springframework.web.bind.annotation._

import scala.beans.BeanProperty


object HelloWorldController{

  class Foo(){
    @BeanProperty var str:String = _
  }

}
@RestController
@RequestMapping(value = Array("/scala"))
class HelloWorldController {

  @RequestMapping(value = Array("/"))
  def helloWorld(str: String) = "hello world spring boot scala : " + str

  @RequestMapping(value = Array("/post"),method = Array(RequestMethod.POST))
  def post(foo: x.h.p.m.HelloWorldController.Foo) = "hello world: "+foo.getStr


  @RequestMapping(value = Array("/postRequest"),method = Array(RequestMethod.POST))
  def postRequest(@RequestBody foo: x.h.p.m.HelloWorldController.Foo) = "hello world: "+foo.getStr
}
