package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
    public static Result index() {
    	String[] mas = {"zaķis","kaķis"};
    	int a = (int)(Math.random() * 50 + 1);
        return ok(index.render(mas, a));
    }
    
    public static Result task() {
    	return TODO;
    }
  
}
