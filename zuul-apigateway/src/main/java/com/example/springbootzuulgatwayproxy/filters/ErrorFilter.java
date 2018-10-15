package com.example.springbootzuulgatwayproxy.filters;

import com.netflix.zuul.ZuulFilter;

public class ErrorFilter extends ZuulFilter {
	
	/*All methods of ErrorFilter are overriden and implemented
	 * */

  @Override
  public String filterType() {
    return "error";
  }

  @Override
  public int filterOrder() {
    return 1;
  }

  @Override
  public boolean shouldFilter() {
    return true;
  }

  @Override
  public Object run() {
   System.out.println("Inside Route Filter");

    return null;
  }

}