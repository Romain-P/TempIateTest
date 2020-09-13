package com.redpills.correction.framework.domain

interface Task {
    fun execute(): List<TaskResult>
}

interface RuntimeTask {
    fun execute(process: Process): TaskResult
}