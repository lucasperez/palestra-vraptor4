package br.com.palestra.interceptor;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.Accepts;
import br.com.caelum.vraptor.AfterCall;
import br.com.caelum.vraptor.AroundCall;
import br.com.caelum.vraptor.BeforeCall;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.controller.ControllerMethod;
import br.com.caelum.vraptor.interceptor.SimpleInterceptorStack;
import br.com.palestra.domain.Public;

@Intercepts
@RequestScoped
public class Log {
	
	@Inject
	private HttpServletRequest request;
	
	@BeforeCall
	public void before() {
		System.out.println("antes da chamada: " + new Date());
	}
	
	@AfterCall
	public void after() {
		System.out.println("após a chamada: " + new Date());
	}
	
	@Accepts
    public boolean accepts(ControllerMethod method) {
        return method.containsAnnotation(Public.class);
    }
	
	@AroundCall
    public void intercept(SimpleInterceptorStack stack) {
        System.out.println("Interceptando: " + request.getRequestURI());
        stack.next();
    }
}
