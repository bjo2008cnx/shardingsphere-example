/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.baomidou.mybatisplus.core.toolkit;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;

/**
 * Snowflake distributed primary key generator.
 *
 * <p> Use snowflake algorithm. Length is 64 bit. </p>
 *
 * <pre>
 * 1bit sign bit.
 * bits timestamp offset from 2020.07.01(ShardingSphere distributed primary key published data) to now.
 * 7bits worker process id.
 * 5bits auto increment offset in one mills
 * </pre>
 *
 * <p> Call @{@code SnowflakeShardingKeyGenerator.setWorkerId} to set worker id, default value is 0. </p>
 *
 * <p> Call @{@code SnowflakeShardingKeyGenerator.setMaxTolerateTimeDifferenceMilliseconds} to set max tolerate time difference
 * milliseconds, default value is 0. </p>
 */
@Slf4j
public final class Sequence extends SnowflakeShardingKeyGenerator {

  public synchronized long nextId() {
    return (Long) generateKey();
  }
}
