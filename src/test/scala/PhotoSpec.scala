import com.imadethatcow.hipchat.users.Photos
import com.typesafe.config.ConfigFactory
import org.scalatest.{Matchers, FlatSpec}

import scala.util.Try

class PhotoSpec extends FlatSpec with Matchers {

  val config = ConfigFactory.load
  val API_TOKEN_KEY = "com.imadethatcow.hipchat.auth_token"
  val EMAIL_KEY = "com.imadethatcow.hipchat.test_email"
  val apiTokenTry = Try(config.getString(API_TOKEN_KEY))
  val emailTry = Try(config.getString(EMAIL_KEY))
	val image = "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"

  if (apiTokenTry.isFailure) fail(s"Could not find $API_TOKEN_KEY in config")
  if (emailTry.isFailure) fail(s"Could not find $EMAIL_KEY in config")

  for (apiToken <- apiTokenTry; email <- emailTry) {
    val photo = new Photos(apiToken)
    "Put photo" should "return true" in {
      photo.update(email, image) shouldEqual true
    }
  }
}
