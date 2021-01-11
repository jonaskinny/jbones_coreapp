package org.jbones.coreapp.view.velocity;

public class Item {
      private int _id = -1;
      private String _name = "";
      
      public Item (int id, String name) {
         _id=id;
         _name=name;
      }
      public int getId() {
         return _id;
      }
      public String getName() {
         return _name;
      }
   }