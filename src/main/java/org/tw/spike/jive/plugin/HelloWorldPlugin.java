package org.tw.spike.jive.plugin;

import com.jivesoftware.base.plugin.Plugin;

public class HelloWorldPlugin implements Plugin {

    @Override
    public void initPlugin() {
        System.out.println("Initializing HelloWorld plugin.....");
    }

    @Override
    public void destroy() {

    }
}
