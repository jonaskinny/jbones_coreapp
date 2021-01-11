package org.jbones.coreapp.controller.stripes.action;

import java.util.Date;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;

import org.jbones.coreapp.view.velocity.CoreAppVelocityViewServlet;

public class HelloActionBean extends BaseActionBean implements ActionBean {

   private ActionBeanContext ctx;
   private Date date;
   private static final String VIEW = "/CoreApp/view/Hello";
   public ActionBeanContext getContext() {
      return ctx;
   }
   public void setContext(ActionBeanContext context) {
      ctx = context;
   }
   public Date getDate() {
      return date;
   }
   @DefaultHandler
   public Resolution currentDate() {
      System.out.println("in HelloActionBean.currentDate()");
      date = new Date();
      return new ForwardResolution(VIEW);
   }
}