pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rupertwaldron/spring-boot-api-example'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('emoji-translator') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rupertwaldron/emoji-translator'
                    }
                    branch 'master'
                }
            }
        }
    }
}

