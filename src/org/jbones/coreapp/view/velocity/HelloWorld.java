package org.jbones.coreapp.view.velocity;

import java.io.StringWriter;
import java.io.Writer;

import javax.naming.Context;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.util.Properties;
import java.util.TimeZone;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;

import org.apache.velocity.tools.generic.DateTool;
import org.apache.velocity.tools.generic.IteratorTool;
import org.apache.velocity.tools.generic.MathTool;
import org.apache.velocity.tools.generic.NumberTool;


import org.jbones.core.*;
import org.jbones.core.util.*;

public class HelloWorld {
   public static void main (String[] args) {
      HelloWorld hw = new HelloWorld();
      hw.process();
   }

   private void process () {
      try {

         Velocity.init("C:/jbones/jbones_coreapp/properties/org/jbones/coreapp/velocity/velocity.properties");

         Template template = Velocity.getTemplate("HelloWorld.vm");

         VelocityContext context = new VelocityContext();

         context.put ("str","World");
         
         context.put ("date", new java.util.Date());
         
         Map map = new HashMap();
         
         map.put ("firstname","jonathan");
         map.put ("lastname","cole");
         
         context.put ("namemap" , map);
         context.put ("companyName" , "JBONES");
         
         Collection collection = new ArrayList();
         
         collection.add("one");
         collection.add("two");
         collection.add("three");
         
         context.put ("collection" , collection);
         
         collection = new ArrayList();
         
         collection.add("1");
         collection.add("2");
         collection.add("3");
         
         context.put ("collection2" , collection);

         OrderedHashtable ohashtable = new OrderedHashtable();
         
         ohashtable.put("1","one");
         ohashtable.put("2","two");
         ohashtable.put("3","three");
         
         context.put ("orderedCollection" , ohashtable);
         
         collection = new ArrayList();
         
         Item item = new Item(1,"name1");
         collection.add(item);
         item = new Item(2,"name2");
         collection.add(item);
         item = new Item(3,"name3");
         collection.add(item);
         
         context.put("itemList",collection);
         
         context.put("numberTool" , new NumberTool());
         context.put("aNumber" , new Double(0.95));
         context.put("aLocal" , Locale.UK);

         context.put("dateTool", new DateTool());
         
         Calendar aDate = Calendar.getInstance(TimeZone.getTimeZone("PST"));
         aDate.set(2040, 11, 25);
         
         context.put("aDate",aDate);
         
         context.put("mathTool", new MathTool());
         context.put("aMathNumber" , new Double(5.5));
         
         context.put("mill" , new IteratorTool());
         
         Writer writer = new StringWriter();
         
         template.merge(context,writer);
         
         System.out.println(writer.toString());

      } catch(Exception e) {
            Log.getLog(Log.ERR).log("problem in main : " + e.getMessage());
            throw new RuntimeException(CoreException.getStackTrace(e));
      }
   }

}