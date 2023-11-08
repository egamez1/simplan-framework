/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.intuit.data.simplan.common.github;

import java.io.Serializable;

/**
 * @author Abraham, Thomas - tabraham1
 * Created on 09-Oct-2023 at 5:49 PM
 */
public class GithubCommitResponse implements Serializable {

    String branch;
    String sha;
    String message;

    public String getBranch() {
        return branch;
    }

    public GithubCommitResponse setBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public String getSha() {
        return sha;
    }

    public GithubCommitResponse setSha(String sha) {
        this.sha = sha;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public GithubCommitResponse setMessage(String message) {
        this.message = message;
        return this;
    }
}
