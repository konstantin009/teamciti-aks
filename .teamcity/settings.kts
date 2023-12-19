import jetbrains.buildServer.configs.kotlin.*
import jetbrains.buildServer.configs.kotlin.buildSteps.script

version = "2023.11"

project {
  buildType(HelloWorld)
}

object HelloWorld: BuildType({
    name = "Hello world"
    steps {
        script {
            scriptContent = "echo 'Hello world!'"
        }
    }
})
