package controllers

import play.api.mvc._

/**
  * Created by Administrator on 24/07/2017.
  */
class HomeController extends Controller{

  def index = Action {
    Ok("Hello World")
  }

}

