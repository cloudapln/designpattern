package com.dp.creational.abstractfactory.factory;

import com.dp.creational.abstractfactory.obj.Window;

//AbstractFactory
public interface AbstractWidgetFactory
{
   public Window createWindow();
}