package _Self.buildTypes

import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

object TestBuild : BuildType({
    name = "TestBuild"

    steps {
        script {
            name = "TestStep"
            id = "TestStep"
            scriptContent = """echo "Hello Test""""
        }
    }
})
