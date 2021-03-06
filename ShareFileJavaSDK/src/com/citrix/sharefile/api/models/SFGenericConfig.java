
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

package com.citrix.sharefile.api.models;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.citrix.sharefile.api.*;
import com.citrix.sharefile.api.enumerations.*;
import com.citrix.sharefile.api.models.*;

public class SFGenericConfig extends SFODataObject {

	@SerializedName("User")
	private SFUser User;
	@SerializedName("ConfigName")
	private String ConfigName;
	@SerializedName("ConfigSize")
	private Integer ConfigSize;
	@SerializedName("CreationDate")
	private Date CreationDate;
	@SerializedName("ModifiedDate")
	private Date ModifiedDate;
	@SerializedName("Config")
	private String Config;

	public SFUser getUser() {
		return this.User;
	}

	public void setUser(SFUser user) {
		this.User = user;
	}
	public String getConfigName() {
		return this.ConfigName;
	}

	public void setConfigName(String configname) {
		this.ConfigName = configname;
	}
	public Integer getConfigSize() {
		return this.ConfigSize;
	}

	public void setConfigSize(Integer configsize) {
		this.ConfigSize = configsize;
	}
	public Date getCreationDate() {
		return this.CreationDate;
	}

	public void setCreationDate(Date creationdate) {
		this.CreationDate = creationdate;
	}
	public Date getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(Date modifieddate) {
		this.ModifiedDate = modifieddate;
	}
	public String getConfig() {
		return this.Config;
	}

	public void setConfig(String config) {
		this.Config = config;
	}

}