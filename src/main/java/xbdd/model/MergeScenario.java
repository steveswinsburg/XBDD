/**
 * Copyright (C) 2015 Orion Health (Orchestral Development Ltd)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package xbdd.model;

import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * Merge Scenario represents a Scenario across multiple builds, containing all of the statuses for that scenario in all previous builds
 * ordered most recent to least recent as well as a merged status as the first element of the list.
 */
public class MergeScenario {

	private String id;
	private String name;
	private List<String> statuses;

	public DBObject toDBObject() {
		final DBObject returnObject = new BasicDBObject();
		returnObject.put("id", this.id);
		returnObject.put("name", this.name);
		returnObject.put("statuses", this.statuses);
		return returnObject;
	}

	public MergeScenario setId(final String id) {
		this.id = id;
		return this;
	}

	public MergeScenario setName(final String name) {
		this.name = name;
		return this;
	}

	public MergeScenario setStatuses(final List<String> statuses) {
		this.statuses = statuses;
		return this;
	}

	public List<String> getStatuses() {
		return this.statuses;
	}

}
