package modules

import com.google.inject.AbstractModule
import net.codingwell.scalaguice.ScalaModule

import scala.concurrent.ExecutionContext

class AppContext extends AbstractModule with ScalaModule {

  override def configure() = {
    implicit val ec: ExecutionContext = ExecutionContext.global

    bind[SimpleServiceTrait].to[SimpleService]
  }
}
