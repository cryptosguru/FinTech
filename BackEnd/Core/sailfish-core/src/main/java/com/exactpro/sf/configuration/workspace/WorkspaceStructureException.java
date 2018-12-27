/******************************************************************************
 * Copyright 2009-2018 Exactpro (Exactpro Systems Limited)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
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
 ******************************************************************************/
package com.exactpro.sf.configuration.workspace;

import java.io.IOException;

/**
 * @author nikita.smirnov
 *
 */
public class WorkspaceStructureException extends IOException {

    private static final long serialVersionUID = -676166860617349217L;

    public WorkspaceStructureException() {
    }

    public WorkspaceStructureException(String message) {
        super(message);
    }

    public WorkspaceStructureException(Throwable cause) {
        super(cause);
    }

    public WorkspaceStructureException(String message, Throwable cause) {
        super(message, cause);
    }
}
