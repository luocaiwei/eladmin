/*
*  Copyright 2019-2020 Zheng Jie
*
*  Licensed under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License.
*  You may obtain a copy of the License at
*
*  http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software
*  distributed under the License is distributed on an "AS IS" BASIS,
*  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*  See the License for the specific language governing permissions and
*  limitations under the License.
*/
package com.ylz.base.service.dto;

import com.ylz.annotation.Query;
import lombok.Data;

/**
* @website https://el-admin.vip
* @author lcw
* @date 2020-12-25
**/
@Data
public class SysAreaFjzlQueryCriteria{

    /** 机构名称 */
    @Query(propName="areaName", type = Query.Type.INNER_LIKE)
    private String areaName;
}
