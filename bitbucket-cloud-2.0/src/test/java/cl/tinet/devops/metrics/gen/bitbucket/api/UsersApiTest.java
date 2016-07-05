/**
 * Bitbucket API
 * Code against the Bitbucket API to automate simple tasks, embed Bitbucket data into your own site, build mobile or desktop apps, or even add custom UI add-ons into Bitbucket itself using the Connect framework.
 *
 * OpenAPI spec version: 2.0
 * Contact: support@bitbucket.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cl.tinet.devops.metrics.gen.bitbucket.api;

import cl.tinet.devops.metrics.gen.bitbucket.invoker.ApiException;
import cl.tinet.devops.metrics.gen.bitbucket.model.Error;
import cl.tinet.devops.metrics.gen.bitbucket.model.User;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedUsers;
import cl.tinet.devops.metrics.gen.bitbucket.model.PaginatedWebhookSubscriptions;
import cl.tinet.devops.metrics.gen.bitbucket.model.WebhookSubscription;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UsersApi
 */
public class UsersApiTest {

    private final UsersApi api = new UsersApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void teamsUsernameRepositoriesGetTest() throws ApiException {
        String username = null;
        // Error response = api.teamsUsernameRepositoriesGet(username);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userEmailsEmailGetTest() throws ApiException {
        String email = null;
        // Error response = api.userEmailsEmailGet(email);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userEmailsGetTest() throws ApiException {
        // Error response = api.userEmailsGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void userGetTest() throws ApiException {
        // User response = api.userGet();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameFollowersGetTest() throws ApiException {
        String username = null;
        String username2 = null;
        // PaginatedUsers response = api.usersUsernameFollowersGet(username, username2);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameFollowingGetTest() throws ApiException {
        String username = null;
        String username2 = null;
        // PaginatedUsers response = api.usersUsernameFollowingGet(username, username2);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameGetTest() throws ApiException {
        String username = null;
        String username2 = null;
        // User response = api.usersUsernameGet(username, username2);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameHooksGetTest() throws ApiException {
        String username = null;
        // PaginatedWebhookSubscriptions response = api.usersUsernameHooksGet(username);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameHooksPostTest() throws ApiException {
        String username = null;
        // WebhookSubscription response = api.usersUsernameHooksPost(username);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameHooksUidDeleteTest() throws ApiException {
        String username = null;
        String uid = null;
        String uid2 = null;
        // api.usersUsernameHooksUidDelete(username, uid, uid2);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameHooksUidGetTest() throws ApiException {
        String username = null;
        String uid = null;
        String uid2 = null;
        // WebhookSubscription response = api.usersUsernameHooksUidGet(username, uid, uid2);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameHooksUidPutTest() throws ApiException {
        String username = null;
        String uid = null;
        String uid2 = null;
        // WebhookSubscription response = api.usersUsernameHooksUidPut(username, uid, uid2);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void usersUsernameRepositoriesGetTest() throws ApiException {
        String username = null;
        // Error response = api.usersUsernameRepositoriesGet(username);

        // TODO: test validations
    }
    
}
