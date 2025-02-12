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

package org.apache.dolphinscheduler.dao.entity;

import org.apache.dolphinscheduler.common.enums.AlertEvent;
import org.apache.dolphinscheduler.common.enums.AlertWarnLevel;
import org.apache.dolphinscheduler.common.enums.CommandType;
import org.apache.dolphinscheduler.common.enums.Flag;
import org.apache.dolphinscheduler.common.enums.WorkflowExecutionStatus;
import org.apache.dolphinscheduler.plugin.task.api.enums.TaskExecutionStatus;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(Include.NON_NULL)
public class WorkflowAlertContent implements Serializable {

    @JsonProperty("projectId")
    private Integer projectId;

    @JsonProperty("projectCode")
    private Long projectCode;

    @JsonProperty("projectName")
    private String projectName;

    @JsonProperty("owner")
    private String owner;

    @JsonProperty("workflowInstanceId")
    private Integer workflowInstanceId;

    @JsonProperty("workflowDefinitionCode")
    private Long workflowDefinitionCode;

    @JsonProperty("workflowInstanceName")
    private String workflowInstanceName;

    @JsonProperty("commandType")
    private CommandType commandType;

    @JsonProperty("workflowExecutionStatus")
    private WorkflowExecutionStatus workflowExecutionStatus;

    @JsonProperty("modifyBy")
    private String modifyBy;

    @JsonProperty("recovery")
    private Flag recovery;

    @JsonProperty("runTimes")
    private Integer runTimes;

    @JsonProperty("workflowStartTime")
    private Date workflowStartTime;

    @JsonProperty("workflowEndTime")
    private Date workflowEndTime;

    @JsonProperty("workflowHost")
    private String workflowHost;

    @JsonProperty("taskCode")
    private Long taskCode;

    @JsonProperty("taskName")
    private String taskName;

    @JsonProperty("event")
    private AlertEvent event;

    @JsonProperty("warnLevel")
    private AlertWarnLevel warnLevel;

    @JsonProperty("taskType")
    private String taskType;

    @JsonProperty("retryTimes")
    private Integer retryTimes;

    @JsonProperty("taskState")
    private TaskExecutionStatus taskState;

    @JsonProperty("taskStartTime")
    private Date taskStartTime;

    @JsonProperty("taskEndTime")
    private Date taskEndTime;

    @JsonProperty("taskHost")
    private String taskHost;

    @JsonProperty("taskPriority")
    private String taskPriority;

    @JsonProperty("logPath")
    private String logPath;

}
