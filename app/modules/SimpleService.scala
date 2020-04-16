package modules

import javax.inject.Inject
import play.api.libs.ws.WSClient
import play.api.{Configuration}

class SimpleService @Inject()(ws: WSClient, config: Configuration) extends SimpleServiceTrait {
  override def hello(): String = "Hello"
}
