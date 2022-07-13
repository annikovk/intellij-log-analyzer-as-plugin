package com.github.annikovk.intellijloganalyzerasplugin.services

import com.intellij.openapi.project.Project
import com.github.annikovk.intellijloganalyzerasplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
