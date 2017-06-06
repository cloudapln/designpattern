package com.dp.creational.abstractfactory.factory;

import com.dp.creational.abstractfactory.obj.MSWindow;
import com.dp.creational.abstractfactory.obj.Window;

//ConcreteFactory1
public class MsWindowsWidgetFactory implements AbstractWidgetFactory
{
   //create an MSWindow
   public Window createWindow()
   {
      MSWindow window = new MSWindow();   
      return window;
   }
}