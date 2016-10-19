package br.com.palestra.components;

import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

@RequestScoped
public class LastDateComponent {

	@Produces
	public Date getLastDate() {
		System.out.println("criando um objeto date para ser injetado");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, -1);
		return c.getTime();
	}
	
	 public void close(@Disposes Date date) {
	    if (date != null)
	    	date = null;
	 }
}
