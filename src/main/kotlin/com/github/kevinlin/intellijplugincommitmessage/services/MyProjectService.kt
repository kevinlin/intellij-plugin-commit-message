package com.github.kevinlin.intellijplugincommitmessage.services

import com.intellij.openapi.project.Project
import com.github.kevinlin.intellijplugincommitmessage.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
