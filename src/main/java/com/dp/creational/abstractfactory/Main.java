package com.dp.creational.abstractfactory;

import com.dp.creational.abstractfactory.factory.AbstractWidgetFactory;
import com.dp.creational.abstractfactory.factory.MacOSXWidgetFactory;
import com.dp.creational.abstractfactory.factory.MsWindowsWidgetFactory;

public class Main{
   public static void main(String[] args)   
   {
	  String platform = "MACOSX";
     GUIBuilder builder = new GUIBuilder();
     AbstractWidgetFactory widgetFactory = null;
     //check what platform we're on 
     if(platform.equalsIgnoreCase("MACOSX"))
     {
        widgetFactory  = new MacOSXWidgetFactory();
     }
     else
     {
           widgetFactory  = new MsWindowsWidgetFactory();
     }
     builder.buildWindow(widgetFactory); 
    }
}