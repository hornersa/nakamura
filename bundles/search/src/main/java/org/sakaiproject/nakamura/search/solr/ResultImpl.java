/**
 * Licensed to the Sakai Foundation (SF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The SF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.sakaiproject.nakamura.search.solr;

import org.apache.solr.common.SolrDocument;
import org.sakaiproject.nakamura.api.search.solr.Result;
import org.sakaiproject.nakamura.api.solr.SafeSolrMap;

import java.util.Collection;
import java.util.Map;

public class ResultImpl implements Result {

  private SolrDocument solrDocument;

  public ResultImpl(SolrDocument solrDocument) {
    this.solrDocument = solrDocument;
  }

  public String getPath() {
    return (String) solrDocument.getFirstValue("path");
  }

  public Map<String, Collection<Object>> getProperties() {
    return new SafeSolrMap<String, Collection<Object>>(solrDocument.getFieldValuesMap());
  }

  public Object getFirstValue(String name) {
    return solrDocument.getFirstValue(name);
  }
}
