package com.github.some-body.codeanalysis.services

import com.intellij.openapi.project.Project
import com.github.some-body.codeanalysis.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
