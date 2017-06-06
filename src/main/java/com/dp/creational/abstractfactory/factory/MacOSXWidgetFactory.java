package com.dp.creational.abstractfactory.factory;

import com.dp.creational.abstractfactory.obj.MacOSXWindow;
import com.dp.creational.abstractfactory.obj.Window;

//ConcreteFactory2
public class MacOSXWidgetFactory implements AbstractWidgetFactory
{
   //create a MacOSXWindow
   public Window createWindow()
   {
      MacOSXWindow window = new MacOSXWindow();   
      return window;
   }
}