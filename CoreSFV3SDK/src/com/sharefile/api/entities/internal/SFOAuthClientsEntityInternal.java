
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2014 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.sharefile.api.entities.internal;

import com.sharefile.api.entities.*;
import com.sharefile.api.models.*;
import com.sharefile.api.models.internal.*;
import com.sharefile.api.models.internal.SFOAuthClient;
import com.sharefile.api.SFApiQuery;
import com.sharefile.api.interfaces.ISFQuery;
import com.sharefile.api.models.SFAppCodes;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 




import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;

public class SFOAuthClientsEntityInternal extends SFODataEntityBase
{
    /**
	* Get List of OAuthClients for the Current Account
	* @return List of OAuthClients
    */
	public ISFQuery<SFODataFeed<SFOAuthClient>> get()
	{
		SFApiQuery<SFODataFeed<SFOAuthClient>> sfApiQuery = new SFApiQuery<SFODataFeed<SFOAuthClient>>();
		sfApiQuery.setFrom("OAuthClients");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get OAuthClient
	* @param url 	
	* @return a single OAuthClient
    */
	public ISFQuery<SFOAuthClient> get(URI url)
	{
		SFApiQuery<SFOAuthClient> sfApiQuery = new SFApiQuery<SFOAuthClient>();
		sfApiQuery.setFrom("OAuthClients");
		sfApiQuery.addIds(url);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Get List of OAuthClients for the Specified Account
	* @param accountId 	
	* @return List of OAuthClients
    */
	public ISFQuery<SFODataFeed<SFOAuthClient>> byAccount(String accountId)
	{
		SFApiQuery<SFODataFeed<SFOAuthClient>> sfApiQuery = new SFApiQuery<SFODataFeed<SFOAuthClient>>();
		sfApiQuery.setFrom("OAuthClients");
		sfApiQuery.setAction("ByAccount");
		sfApiQuery.addQueryString("accountId", accountId);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Create OAuthClient
    * {
    * "Name":"App Name",
    * "RedirectUrls":["https:///redirectUrl1", "https:///redirectUrl2"],
    * "ToolUrl":"https:///toolUrl"
    * }
	* @param oauthClient 	
	* @return created OAuthClient
    */
	public ISFQuery<SFOAuthClient> create(SFOAuthClient oauthClient, Boolean singlePlane)
	{
		SFApiQuery<SFOAuthClient> sfApiQuery = new SFApiQuery<SFOAuthClient>();
		sfApiQuery.setFrom("OAuthClients");
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setBody(oauthClient);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

    /**
	* Update OAuthClient
    * {
    * "State":"Revoked",
    * "Name":"Updated App Name",
    * "RedirectUrls":["https:///redirectUrl1", "https:///redirectUrl2"],
    * "ToolUrl":"https:///toolUrl"
    * }
	* @param url 	
	* @return updated OAuthClient
    */
	public ISFQuery<SFOAuthClient> update(URI url, SFOAuthClient oauthClient, Boolean singlePlane)
	{
		SFApiQuery<SFOAuthClient> sfApiQuery = new SFApiQuery<SFOAuthClient>();
		sfApiQuery.setFrom("OAuthClients");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setBody(oauthClient);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* Delete OAuthClient
	* @return no data
    */
	public ISFQuery delete(URI url, Boolean singlePlane)
	{
		SFApiQuery sfApiQuery = new SFApiQuery();
		sfApiQuery.setFrom("OAuthClients");
		sfApiQuery.addIds(url);
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

    /**
	* get an OAuth code to be used to exchange for a OAuth token
	* @param appCode 	
	* @return OAuth code
    */
	public ISFQuery<SFOAuthCode> getOAuthCode(SFSafeEnum<SFAppCodes> appCode)
	{
		SFApiQuery<SFOAuthCode> sfApiQuery = new SFApiQuery<SFOAuthCode>();
		sfApiQuery.setFrom("OAuthClients");
		sfApiQuery.setAction("GetOAuthCode");
		sfApiQuery.addQueryString("appCode", appCode);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

