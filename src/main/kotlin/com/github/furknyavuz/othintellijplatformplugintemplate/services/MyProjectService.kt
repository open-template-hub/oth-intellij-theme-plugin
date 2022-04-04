package com.github.furknyavuz.othintellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.furknyavuz.othintellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
