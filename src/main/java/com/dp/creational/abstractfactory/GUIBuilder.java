package com.dp.creational.abstractfactory;

import com.dp.creational.abstractfactory.factory.AbstractWidgetFactory;
import com.dp.creational.abstractfactory.obj.Window;

//Client
public class GUIBuilder
{
   public void buildWindow(AbstractWidgetFactory widgetFactory)
   {
      Window window = widgetFactory.createWindow();   
      window.setTitle("New Window");
   }
}