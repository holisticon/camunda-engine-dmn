/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.dmn.engine.impl;

import org.camunda.commons.logging.BaseLogger;

public class DmnLogger extends BaseLogger {

 public static final String PROJECT_CODE = "DMN";
 public static final String PROJECT_LOGGER= "org.camunda.dmn";

 public static DmnEngineLogger ENGINE_LOGGER = createLogger(DmnEngineLogger.class, PROJECT_CODE, PROJECT_LOGGER, "01");
 public static DmnParseLogger PARSE_LOGGER = createLogger(DmnParseLogger.class, PROJECT_CODE, PROJECT_LOGGER, "02");
 public static DmnExpressionLogger EXPRESSION_LOGGER = createLogger(DmnExpressionLogger.class, PROJECT_CODE, PROJECT_LOGGER, "03");

}
