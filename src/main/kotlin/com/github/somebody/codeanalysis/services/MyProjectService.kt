package com.github.somebody.codeanalysis.services

import com.intellij.openapi.project.Project
import com.github.somebody.codeanalysis.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
