
// ------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//  
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
//     
//	   Copyright (c) 2016 Citrix ShareFile. All rights reserved.
// </auto-generated>
// ------------------------------------------------------------------------------

package com.citrix.sharefile.api.entities;

import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.entities.*;
import com.citrix.sharefile.api.models.*;
import com.citrix.sharefile.api.SFApiQuery;
import com.citrix.sharefile.api.interfaces.ISFQuery;


import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
 
import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.enumerations.SFSafeEnum;
import com.citrix.sharefile.api.enumerations.SFSafeEnumFlags;
import com.citrix.sharefile.api.interfaces.ISFApiClient;
import com.citrix.sharefile.api.exceptions.InvalidOrMissingParameterException;

public class SFAccountsEntity extends SFEntitiesBase
{
	public SFAccountsEntity(ISFApiClient client) {
		super(client);
	}

	/**
	* Get current Account
	* Retrieves information about the Account defined in the call subdomain
	* @param id  (default: null)	 	
	* @return The subdomain account information
	*/
	public ISFQuery<SFAccount> get(String id) throws InvalidOrMissingParameterException 	{
		if (id == null) {
			throw new InvalidOrMissingParameterException("id");
		}

		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.addQueryString("id", id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get current Account
	* Retrieves information about the Account defined in the call subdomain
	* @return The subdomain account information
	*/
	public ISFQuery<SFAccount> get()	{

		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get current Account branding
	* Retrievs Branding information about the subdomain account.
	* This operation does not require authentication.
	* @return Branding information for a given sharefile account
	*/
	public ISFQuery<SFAccount> getBranding()	{

		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Branding");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Modify the Branding for this account
	* Modifies Branding information about the subdomain account.
	* This operation requires authentication.
	* @return Branding information for a given sharefile account
	*/
	public ISFQuery<SFAccount> updateBranding(SFAccount account) throws InvalidOrMissingParameterException 	{
		if (account == null) {
			throw new InvalidOrMissingParameterException("account");
		}

		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Branding");
		sfApiQuery.setBody(account);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	/**
	* Get List of current Account Employees
	* Retrives the list of Employees in the Account
	* Employees are named users in the Account.
	* @return A Feed containing all Employees Contacts in the account
	*/
	public ISFQuery<SFODataFeed<SFContact>> getEmployees()	{

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Employees");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get List of current Account Clients
	* Retrieves the list of Clients in the Account.
	* Clients are restricted users of an Account, that can receive and send files
	* to Employees, but have no other permissions besides basic sharing with Employees.
	* @return A Feed containing all Clients in the account
	*/
	public ISFQuery<SFODataFeed<SFContact>> getClients()	{

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Clients");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account AddressBooks
	* Retrieves an address book from the account.
	* Address Books are the contacts of Eployees and Clients, maintained on a personal or
	* account-wide basis (shared).
	* @param type  (default: "personal")	 	
	* @param searchTerm  (default: "")	 	
	* @return A Feed of Contact objects representing the Address Book retrieved
	*/
	public ISFQuery<SFODataFeed<SFContact>> getAddressBook(String type, String searchTerm) throws InvalidOrMissingParameterException 	{
		if (type == null) {
			throw new InvalidOrMissingParameterException("type");
		}
		if (searchTerm == null) {
			throw new InvalidOrMissingParameterException("searchTerm");
		}

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("AddressBook");
		sfApiQuery.addQueryString("type", type);
		sfApiQuery.addQueryString("searchTerm", searchTerm);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account AddressBooks
	* Retrieves an address book from the account.
	* Address Books are the contacts of Eployees and Clients, maintained on a personal or
	* account-wide basis (shared).
	* @param type  (default: "personal")	 	
	* @return A Feed of Contact objects representing the Address Book retrieved
	*/
	public ISFQuery<SFODataFeed<SFContact>> getAddressBook(String type) throws InvalidOrMissingParameterException 	{
		if (type == null) {
			throw new InvalidOrMissingParameterException("type");
		}

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("AddressBook");
		sfApiQuery.addQueryString("type", type);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account AddressBooks
	* Retrieves an address book from the account.
	* Address Books are the contacts of Eployees and Clients, maintained on a personal or
	* account-wide basis (shared).
	* @return A Feed of Contact objects representing the Address Book retrieved
	*/
	public ISFQuery<SFODataFeed<SFContact>> getAddressBook()	{

		SFApiQuery<SFODataFeed<SFContact>> sfApiQuery = new SFApiQuery<SFODataFeed<SFContact>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("AddressBook");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account Mobile Security Settings
	* Returns the Mobile device configuration settings for this account
	* @return The current mobile security configuration for this account
	*/
	public ISFQuery<SFMobileSecuritySettings> getMobileSecuritySettings()	{

		SFApiQuery<SFMobileSecuritySettings> sfApiQuery = new SFApiQuery<SFMobileSecuritySettings>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("MobileSecuritySettings");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account Product Defaults
	* @return Account defaults
	*/
	public ISFQuery<SFProductDefaults> getProductDefaults()	{

		SFApiQuery<SFProductDefaults> sfApiQuery = new SFApiQuery<SFProductDefaults>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("ProductDefaults");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account Preferences
	* @return Account preferences
	*/
	public ISFQuery<SFAccountPreferences> getPreferences()	{

		SFApiQuery<SFAccountPreferences> sfApiQuery = new SFApiQuery<SFAccountPreferences>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Preferences");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account Single Sign-On Configuration
	* Retrieve the Single Sign-on configuration for the Account
	* @param provider  (default: "saml")	 	
	* @param idpEntityId  (default: null)	 	
	*/
	public ISFQuery<SFSSOAccountProvider> getSSO(String provider, String idpEntityId) throws InvalidOrMissingParameterException 	{
		if (provider == null) {
			throw new InvalidOrMissingParameterException("provider");
		}
		if (idpEntityId == null) {
			throw new InvalidOrMissingParameterException("idpEntityId");
		}

		SFApiQuery<SFSSOAccountProvider> sfApiQuery = new SFApiQuery<SFSSOAccountProvider>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("SSO");
		sfApiQuery.addQueryString("provider", provider);
		sfApiQuery.addQueryString("idpEntityId", idpEntityId);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account Single Sign-On Configuration
	* Retrieve the Single Sign-on configuration for the Account
	* @param provider  (default: "saml")	 	
	*/
	public ISFQuery<SFSSOAccountProvider> getSSO(String provider) throws InvalidOrMissingParameterException 	{
		if (provider == null) {
			throw new InvalidOrMissingParameterException("provider");
		}

		SFApiQuery<SFSSOAccountProvider> sfApiQuery = new SFApiQuery<SFSSOAccountProvider>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("SSO");
		sfApiQuery.addQueryString("provider", provider);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get Account Single Sign-On Configuration
	* Retrieve the Single Sign-on configuration for the Account
	*/
	public ISFQuery<SFSSOAccountProvider> getSSO()	{

		SFApiQuery<SFSSOAccountProvider> sfApiQuery = new SFApiQuery<SFSSOAccountProvider>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("SSO");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Update Account Single Sign-On Configuration
    * {
    * "LogoutUrl":"",
    * "LoginUrl":"https://idp.com/signin",
    * "IPRestrictions":"+all",
    * "ForceSSO":true,
    * "EntityID":"http://account.sf-api.com/saml/info",
    * "SFEntityID":"http://idp.com/saml/info",
    * "SPInitatedAuthContext":"exact",
    * "SPInitatedAuthMethod":"urn:oasis:names:tc:SAML:2.0:ac:classes:PasswordProtectedTransport"
    * }
	* Modifies the Single Sign-on Configuration for this account.
	* @param sso 	 	
	* @param provider  (default: "saml")	 	
	*/
	public ISFQuery<SFSSOAccountProvider> updateSSO(SFSSOAccountProvider sso, String provider) throws InvalidOrMissingParameterException 	{
		if (sso == null) {
			throw new InvalidOrMissingParameterException("sso");
		}
		if (provider == null) {
			throw new InvalidOrMissingParameterException("provider");
		}

		SFApiQuery<SFSSOAccountProvider> sfApiQuery = new SFApiQuery<SFSSOAccountProvider>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("SSO");
		sfApiQuery.addQueryString("provider", provider);
		sfApiQuery.setBody(sso);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	/**
	* Update Account Single Sign-On Configuration
    * {
    * "LogoutUrl":"",
    * "LoginUrl":"https://idp.com/signin",
    * "IPRestrictions":"+all",
    * "ForceSSO":true,
    * "EntityID":"http://account.sf-api.com/saml/info",
    * "SFEntityID":"http://idp.com/saml/info",
    * "SPInitatedAuthContext":"exact",
    * "SPInitatedAuthMethod":"urn:oasis:names:tc:SAML:2.0:ac:classes:PasswordProtectedTransport"
    * }
	* Modifies the Single Sign-on Configuration for this account.
	* @param sso 	 	
	*/
	public ISFQuery<SFSSOAccountProvider> updateSSO(SFSSOAccountProvider sso) throws InvalidOrMissingParameterException 	{
		if (sso == null) {
			throw new InvalidOrMissingParameterException("sso");
		}

		SFApiQuery<SFSSOAccountProvider> sfApiQuery = new SFApiQuery<SFSSOAccountProvider>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("SSO");
		sfApiQuery.setBody(sso);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	/**
	* Get List of Accounts for User
    * {
    * "password":"password"
    * }
	* Retrieve the list of Accounts associated with a given user
	* All parameters to this call may be passed in the Post body as root JSON parameters, or in the URI -
	* with the exception of password that must be provided in the POST body.
	* This operation does not require authentication
	* @param username 	 	
	* @param employeesonly  (default: false)	 	
	* @param requirehomefolders  (default: false)	 	
	* @param singleplane  (default: false)	 	
	* @return The list of Accounts associated with this username/password.
	*/
	public ISFQuery<SFODataFeed<SFAccount>> getByUser(SFODataObject parameters, String username, Boolean employeesonly, Boolean requirehomefolders, Boolean singleplane) throws InvalidOrMissingParameterException 	{
		if (parameters == null) {
			throw new InvalidOrMissingParameterException("parameters");
		}
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}
		if (employeesonly == null) {
			throw new InvalidOrMissingParameterException("employeesonly");
		}
		if (requirehomefolders == null) {
			throw new InvalidOrMissingParameterException("requirehomefolders");
		}
		if (singleplane == null) {
			throw new InvalidOrMissingParameterException("singleplane");
		}

		SFApiQuery<SFODataFeed<SFAccount>> sfApiQuery = new SFApiQuery<SFODataFeed<SFAccount>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("GetByUser");
		parameters.addProperty("username", username);
		parameters.addProperty("employeesonly", employeesonly);
		parameters.addProperty("requirehomefolders", requirehomefolders);
		parameters.addProperty("singleplane", singleplane);
		sfApiQuery.setBody(parameters);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Get List of Accounts for User
    * {
    * "password":"password"
    * }
	* Retrieve the list of Accounts associated with a given user
	* All parameters to this call may be passed in the Post body as root JSON parameters, or in the URI -
	* with the exception of password that must be provided in the POST body.
	* This operation does not require authentication
	* @param username 	 	
	* @param employeesonly  (default: false)	 	
	* @param requirehomefolders  (default: false)	 	
	* @return The list of Accounts associated with this username/password.
	*/
	public ISFQuery<SFODataFeed<SFAccount>> getByUser(SFODataObject parameters, String username, Boolean employeesonly, Boolean requirehomefolders) throws InvalidOrMissingParameterException 	{
		if (parameters == null) {
			throw new InvalidOrMissingParameterException("parameters");
		}
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}
		if (employeesonly == null) {
			throw new InvalidOrMissingParameterException("employeesonly");
		}
		if (requirehomefolders == null) {
			throw new InvalidOrMissingParameterException("requirehomefolders");
		}

		SFApiQuery<SFODataFeed<SFAccount>> sfApiQuery = new SFApiQuery<SFODataFeed<SFAccount>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("GetByUser");
		parameters.addProperty("username", username);
		parameters.addProperty("employeesonly", employeesonly);
		parameters.addProperty("requirehomefolders", requirehomefolders);
		sfApiQuery.setBody(parameters);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Get List of Accounts for User
    * {
    * "password":"password"
    * }
	* Retrieve the list of Accounts associated with a given user
	* All parameters to this call may be passed in the Post body as root JSON parameters, or in the URI -
	* with the exception of password that must be provided in the POST body.
	* This operation does not require authentication
	* @param username 	 	
	* @param employeesonly  (default: false)	 	
	* @return The list of Accounts associated with this username/password.
	*/
	public ISFQuery<SFODataFeed<SFAccount>> getByUser(SFODataObject parameters, String username, Boolean employeesonly) throws InvalidOrMissingParameterException 	{
		if (parameters == null) {
			throw new InvalidOrMissingParameterException("parameters");
		}
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}
		if (employeesonly == null) {
			throw new InvalidOrMissingParameterException("employeesonly");
		}

		SFApiQuery<SFODataFeed<SFAccount>> sfApiQuery = new SFApiQuery<SFODataFeed<SFAccount>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("GetByUser");
		parameters.addProperty("username", username);
		parameters.addProperty("employeesonly", employeesonly);
		sfApiQuery.setBody(parameters);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Get List of Accounts for User
    * {
    * "password":"password"
    * }
	* Retrieve the list of Accounts associated with a given user
	* All parameters to this call may be passed in the Post body as root JSON parameters, or in the URI -
	* with the exception of password that must be provided in the POST body.
	* This operation does not require authentication
	* @param username 	 	
	* @return The list of Accounts associated with this username/password.
	*/
	public ISFQuery<SFODataFeed<SFAccount>> getByUser(SFODataObject parameters, String username) throws InvalidOrMissingParameterException 	{
		if (parameters == null) {
			throw new InvalidOrMissingParameterException("parameters");
		}
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}

		SFApiQuery<SFODataFeed<SFAccount>> sfApiQuery = new SFApiQuery<SFODataFeed<SFAccount>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("GetByUser");
		parameters.addProperty("username", username);
		sfApiQuery.setBody(parameters);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Email List of Accounts to User
	* Sends the list of accounts to the specified email address
	* This operation does not require authentication
	* @param email 	 	
	*/
	public ISFQuery sendToEmail(String email) throws InvalidOrMissingParameterException 	{
		if (email == null) {
			throw new InvalidOrMissingParameterException("email");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("SendToEmail");
		sfApiQuery.addQueryString("email", email);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Get the Login Access Control List of domains
	* Retrieve the list of domains that are allowed or disallowed to login.
	* Whether the list is an allow or disallow list
	* is configured by the AccessControlType property. The domain names are checked against the domains of all the
	* email addresses of the user that attempts to log in to the Account.
	* @return The Login Access Control List of domains for the Account.
	*/
	public ISFQuery<SFAccessControlDomains> getLoginAccessControlDomains()	{

		SFApiQuery<SFAccessControlDomains> sfApiQuery = new SFApiQuery<SFAccessControlDomains>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("LoginAccessControlDomains");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get the Folder Access Control List of domains
	* Retrieve the list of domains that are allowed or disallowed to have access to folders. Whether the list is an allow or disallow list
	* is configured by the AccessControlType property.
	* 
	* The list blocks user access to folders by preventing adding a user to distribution groups or folders.
	* The domain names are checked against the domains of all the email addresses of the user.
	* This is an account-wide setting.
	* @return The Folder Access Control List of domains for the Account, e.g.  { "AccessControlType" : "AllowedDomains", "Domains": ["domainA", "domainB", ...] }
	*/
	public ISFQuery<SFAccessControlDomains> getFolderAccessControlDomains()	{

		SFApiQuery<SFAccessControlDomains> sfApiQuery = new SFApiQuery<SFAccessControlDomains>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("FolderAccessControlDomains");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Create or replace the Login Access Control List of domains
    * {
    * "AccessControlType" : "AllowedDomains",
    * "Domains": ["domainA", "domainB", ...]
    * }
	* @return The new Login Access Control List of domains for the Account
	*/
	public ISFQuery<SFAccessControlDomains> createLoginAccessControlDomains(SFAccessControlDomains accessControlDomains) throws InvalidOrMissingParameterException 	{
		if (accessControlDomains == null) {
			throw new InvalidOrMissingParameterException("accessControlDomains");
		}

		SFApiQuery<SFAccessControlDomains> sfApiQuery = new SFApiQuery<SFAccessControlDomains>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("LoginAccessControlDomains");
		sfApiQuery.setBody(accessControlDomains);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Create or replace the Folder Access Control List of domains
    * {
    * "AccessControlType" : "AllowedDomains",
    * "Domains": ["domainA", "domainB", ...]
    * }
	* @return The new Folder Access Control List of domains for the Account
	*/
	public ISFQuery<SFAccessControlDomains> createFolderAccessControlDomains(SFAccessControlDomains accessControlDomains) throws InvalidOrMissingParameterException 	{
		if (accessControlDomains == null) {
			throw new InvalidOrMissingParameterException("accessControlDomains");
		}

		SFApiQuery<SFAccessControlDomains> sfApiQuery = new SFApiQuery<SFAccessControlDomains>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("FolderAccessControlDomains");
		sfApiQuery.setBody(accessControlDomains);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Update the Login Access Control List of domains
    * {
    * "AccessControlType" : "AllowedDomains",
    * "Domains": ["domainA", "domainB", ...]
    * }
	* Merges the specified domains with existing domains in the list, and/or updates the AccessControlType. One of the parameters needs to be specified.
	* @return The updated Login Access Control List of domains for the Account
	*/
	public ISFQuery<SFAccessControlDomains> updateLoginAccessControlDomains(SFAccessControlDomains accessControlDomains) throws InvalidOrMissingParameterException 	{
		if (accessControlDomains == null) {
			throw new InvalidOrMissingParameterException("accessControlDomains");
		}

		SFApiQuery<SFAccessControlDomains> sfApiQuery = new SFApiQuery<SFAccessControlDomains>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("LoginAccessControlDomains");
		sfApiQuery.setBody(accessControlDomains);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	/**
	* Update the Folder Access Control List of domains
    * {
    * "AccessControlType" : "AllowedDomains",
    * "Domains": ["domainA", "domainB", ...]
    * }
	* Merges the specified domains with existing domains in the list, and/or updates the AccessControlType. One of the parameters needs to be specified. It
	* allows to add new domains to the list.
	* @return The updated Folder Access Control List of domains for the Account
	*/
	public ISFQuery<SFAccessControlDomains> updateFolderAccessControlDomains(SFAccessControlDomains accessControlDomains) throws InvalidOrMissingParameterException 	{
		if (accessControlDomains == null) {
			throw new InvalidOrMissingParameterException("accessControlDomains");
		}

		SFApiQuery<SFAccessControlDomains> sfApiQuery = new SFApiQuery<SFAccessControlDomains>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("FolderAccessControlDomains");
		sfApiQuery.setBody(accessControlDomains);
		sfApiQuery.setHttpMethod("PATCH");
		return sfApiQuery;
	}

	/**
	* Delete domains from the Logins Access Control List of domains
    * {
    * "AccessControlType" : "AllowedDomains",
    * "Domains": ["domainA", "domainB", ...]
    * }
	* Deletes the specified domains from the list.
	* @return No content
	*/
	public ISFQuery deleteLoginAccessControlDomains(SFAccessControlDomains accessControlDomains) throws InvalidOrMissingParameterException 	{
		if (accessControlDomains == null) {
			throw new InvalidOrMissingParameterException("accessControlDomains");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("LoginAccessControlDomains");
		sfApiQuery.setBody(accessControlDomains);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	/**
	* Delete domains from the Folder Access Control List of domains
    * {
    * "AccessControlType" : "AllowedDomains",
    * "Domains": ["domainA", "domainB", ...]
    * }
	* Deletes the specified domains from the list.
	* @return No content
	*/
	public ISFQuery deleteFolderAccessControlDomains(SFAccessControlDomains accessControlDomains) throws InvalidOrMissingParameterException 	{
		if (accessControlDomains == null) {
			throw new InvalidOrMissingParameterException("accessControlDomains");
		}

		SFApiQuery sfApiQuery = new SFApiQuery(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("FolderAccessControlDomains");
		sfApiQuery.setBody(accessControlDomains);
		sfApiQuery.setHttpMethod("DELETE");
		return sfApiQuery;
	}

	/**
	* Check if WebPop is required
	* @param subdomain 	 	
	* @param username  (default: null)	 	
	* @param singlePlane  (default: false)	 	
	* @return RequireWebPopResult
	*/
	public ISFQuery<SFRequireWebPopResult> requireWebPop(String subdomain, String username, Boolean singlePlane) throws InvalidOrMissingParameterException 	{
		if (subdomain == null) {
			throw new InvalidOrMissingParameterException("subdomain");
		}
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}
		if (singlePlane == null) {
			throw new InvalidOrMissingParameterException("singlePlane");
		}

		SFApiQuery<SFRequireWebPopResult> sfApiQuery = new SFApiQuery<SFRequireWebPopResult>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("RequireWebPop");
		sfApiQuery.addQueryString("subdomain", subdomain);
		sfApiQuery.addQueryString("username", username);
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Check if WebPop is required
	* @param subdomain 	 	
	* @param username  (default: null)	 	
	* @return RequireWebPopResult
	*/
	public ISFQuery<SFRequireWebPopResult> requireWebPop(String subdomain, String username) throws InvalidOrMissingParameterException 	{
		if (subdomain == null) {
			throw new InvalidOrMissingParameterException("subdomain");
		}
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}

		SFApiQuery<SFRequireWebPopResult> sfApiQuery = new SFApiQuery<SFRequireWebPopResult>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("RequireWebPop");
		sfApiQuery.addQueryString("subdomain", subdomain);
		sfApiQuery.addQueryString("username", username);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Check if WebPop is required
	* @param subdomain 	 	
	* @return RequireWebPopResult
	*/
	public ISFQuery<SFRequireWebPopResult> requireWebPop(String subdomain) throws InvalidOrMissingParameterException 	{
		if (subdomain == null) {
			throw new InvalidOrMissingParameterException("subdomain");
		}

		SFApiQuery<SFRequireWebPopResult> sfApiQuery = new SFApiQuery<SFRequireWebPopResult>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("RequireWebPop");
		sfApiQuery.addQueryString("subdomain", subdomain);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Check if subdomain is required
	* @param username 	 	
	* @param singlePlane  (default: false)	 	
	* @return RequireSubdomainResult
	*/
	public ISFQuery<SFRequireSubdomainResult> requireSubdomain(String username, Boolean singlePlane) throws InvalidOrMissingParameterException 	{
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}
		if (singlePlane == null) {
			throw new InvalidOrMissingParameterException("singlePlane");
		}

		SFApiQuery<SFRequireSubdomainResult> sfApiQuery = new SFApiQuery<SFRequireSubdomainResult>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("RequireSubdomain");
		sfApiQuery.addQueryString("username", username);
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Check if subdomain is required
	* @param username 	 	
	* @return RequireSubdomainResult
	*/
	public ISFQuery<SFRequireSubdomainResult> requireSubdomain(String username) throws InvalidOrMissingParameterException 	{
		if (username == null) {
			throw new InvalidOrMissingParameterException("username");
		}

		SFApiQuery<SFRequireSubdomainResult> sfApiQuery = new SFApiQuery<SFRequireSubdomainResult>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("RequireSubdomain");
		sfApiQuery.addQueryString("username", username);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Find Subdomain
    * {
    * "UsernameShort":"usernameShort",
    * "Password":"pass",
    * "EmployeeOnly":false
    * }
	* Find the user account information based on the short username
	* @param findSubdomainParams 	 	
	* @param singlePlane  (default: false)	 	
	* @return FindSubdomainResult
	*/
	public ISFQuery<SFFindSubdomainResult> findSubdomain(SFFindSubdomainParams findSubdomainParams, Boolean singlePlane) throws InvalidOrMissingParameterException 	{
		if (findSubdomainParams == null) {
			throw new InvalidOrMissingParameterException("findSubdomainParams");
		}
		if (singlePlane == null) {
			throw new InvalidOrMissingParameterException("singlePlane");
		}

		SFApiQuery<SFFindSubdomainResult> sfApiQuery = new SFApiQuery<SFFindSubdomainResult>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("FindSubdomain");
		sfApiQuery.addQueryString("singlePlane", singlePlane);
		sfApiQuery.setBody(findSubdomainParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Find Subdomain
    * {
    * "UsernameShort":"usernameShort",
    * "Password":"pass",
    * "EmployeeOnly":false
    * }
	* Find the user account information based on the short username
	* @param findSubdomainParams 	 	
	* @return FindSubdomainResult
	*/
	public ISFQuery<SFFindSubdomainResult> findSubdomain(SFFindSubdomainParams findSubdomainParams) throws InvalidOrMissingParameterException 	{
		if (findSubdomainParams == null) {
			throw new InvalidOrMissingParameterException("findSubdomainParams");
		}

		SFApiQuery<SFFindSubdomainResult> sfApiQuery = new SFApiQuery<SFFindSubdomainResult>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("FindSubdomain");
		sfApiQuery.setBody(findSubdomainParams);
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

	/**
	* Get Outlook Information
	* @return OutlookInformation
	*/
	public ISFQuery<SFOutlookInformation> getOutlookInformation()	{

		SFApiQuery<SFOutlookInformation> sfApiQuery = new SFApiQuery<SFOutlookInformation>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("OutlookInformation");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get SSO Info
	* @param subdomain 	 	
	* @return SSOInfo
	*/
	public ISFQuery<SFSSOInfo> getSSOInfo(String subdomain) throws InvalidOrMissingParameterException 	{
		if (subdomain == null) {
			throw new InvalidOrMissingParameterException("subdomain");
		}

		SFApiQuery<SFSSOInfo> sfApiQuery = new SFApiQuery<SFSSOInfo>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("SSOInfo");
		sfApiQuery.addQueryString("subdomain", subdomain);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get the tenants of a partner account
	* @return List of tenant accounts managed by this partner account, if any
	*/
	public ISFQuery<SFODataFeed<SFAccount>> getTenants()	{

		SFApiQuery<SFODataFeed<SFAccount>> sfApiQuery = new SFApiQuery<SFODataFeed<SFAccount>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Tenants");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	public ISFQuery<SFAccount> getTenants(String id) throws InvalidOrMissingParameterException 	{
		if (id == null) {
			throw new InvalidOrMissingParameterException("id");
		}

		SFApiQuery<SFAccount> sfApiQuery = new SFApiQuery<SFAccount>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Tenants");
		sfApiQuery.addActionIds(id);
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Get list of multi-tenant zones assigned to a tenant.
	* @param parentid 	 	
	* @return List of multi-tenant zones assigned to the tenant
	*/
	public ISFQuery<SFODataFeed<SFZone>> getZones(String parentid) throws InvalidOrMissingParameterException 	{
		if (parentid == null) {
			throw new InvalidOrMissingParameterException("parentid");
		}

		SFApiQuery<SFODataFeed<SFZone>> sfApiQuery = new SFApiQuery<SFODataFeed<SFZone>>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("Tenants");
		sfApiQuery.addActionIds(parentid);
		sfApiQuery.addSubAction("Zones");
		sfApiQuery.setHttpMethod("GET");
		return sfApiQuery;
	}

	/**
	* Create a one-time use login Uri for the Web App.
	* @return Redirection populated with link in Uri field
	*/
	public ISFQuery<SFRedirection> webAppAdmin()	{

		SFApiQuery<SFRedirection> sfApiQuery = new SFApiQuery<SFRedirection>(this.client);
		sfApiQuery.setFrom("Accounts");
		sfApiQuery.setAction("WebAppAdmin");
		sfApiQuery.setHttpMethod("POST");
		return sfApiQuery;
	}

}

