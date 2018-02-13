package h;

import h.controller;
import h.model;
import h.view;

public class main {
public static void main(String args[]){
	
	controller c=new controller();
	model m=new model();
	
	view v=new view();
	c.addview(v);
	c.addmodel(m);
	v.addcontroller(c);
	
	c.addmodel(m);
	
}
}
