/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.pinot.core.data.function;

import java.util.concurrent.TimeUnit;


/**
 * Inbuilt date time related transform functions
 * TODO: Exhaustively add all time conversion functions
 */
public class DateTimeFunctions {

  /**
   * Convert epoch millis to epoch hours
   */
  static Long toEpochHours(Long millis) {
    return TimeUnit.MILLISECONDS.toHours(millis);
  }

  /**
   * Convert epoch millis to epoch minutes, bucketed by given bucket granularity
   */
  static Long toEpochMinutes(Long millis, String bucket) {
    return TimeUnit.MILLISECONDS.toMinutes(millis) / Integer.parseInt(bucket);
  }
}
