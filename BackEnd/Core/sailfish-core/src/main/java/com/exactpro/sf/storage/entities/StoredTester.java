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
package com.exactpro.sf.storage.entities;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class StoredTester {
	
	private String name;
	private String password;
	private List<StoredScriptRun> runs;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<StoredScriptRun> getRuns() {
		return runs;
	}
	
	public void setRuns(List<StoredScriptRun> runs) {
		this.runs = runs;
	}
	
	@Override
	public String toString() {
		return new ToStringBuilder(this).
				append("name", name).
				append("password", password).
				append("id", id).
				toString();
	}

}
