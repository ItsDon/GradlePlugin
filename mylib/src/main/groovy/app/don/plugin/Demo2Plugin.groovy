package app.don.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class Demo2Plugin implements Plugin<Project> {

    @Override
    void apply(Project target) {
        def ext = target.extensions.create('don', DemoExtentions);
        target.afterEvaluate {
            println('I am ' + ext.name + "And my age is " + ext.age)
        }

    }
}