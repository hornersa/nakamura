/*
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
package org.sakaiproject.kernel.api.search;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.io.JSONWriter;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

/**
 * 
 */
public interface SearchResultProcessor {

  /**
   * The SearchServlet will already have sent a partial JSON response. This processor should continue using the JSON format.
   * @param request The request that was issued for this search.
   * @param write The JSONWriter to write the results to.
   * @param node The result node.
   * @param excerpt The excerpt retrieved from the matched property/content. This will be null if no excerpt was found or looked for.
   * @throws JSONException
   * @throws RepositoryException
   */
  void writeNode(SlingHttpServletRequest request, JSONWriter write, Node node, String excerpt) throws JSONException, RepositoryException;
}
