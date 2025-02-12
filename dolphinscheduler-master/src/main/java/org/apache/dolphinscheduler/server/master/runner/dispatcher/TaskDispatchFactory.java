/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.server.master.runner.dispatcher;

import org.apache.dolphinscheduler.dao.entity.TaskInstance;
import org.apache.dolphinscheduler.plugin.task.api.utils.TaskTypeUtils;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TaskDispatchFactory {

    @Autowired
    private MasterTaskDispatcher masterTaskDispatcher;

    @Autowired
    private WorkerTaskDispatcher workerTaskDispatcher;

    public TaskDispatcher getTaskDispatcher(String taskType) {
        if (TaskTypeUtils.isLogicTask(taskType)) {
            return masterTaskDispatcher;
        }
        return workerTaskDispatcher;
    }

    public TaskDispatcher getTaskDispatcher(TaskInstance taskInstance) {
        return getTaskDispatcher(taskInstance.getTaskType());
    }

}
