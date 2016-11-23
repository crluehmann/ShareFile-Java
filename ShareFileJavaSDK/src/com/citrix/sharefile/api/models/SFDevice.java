
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

public class SFDevice extends SFODataObject {

	@SerializedName("Tool")
	private SFSafeEnum<SFSFTool> Tool;
	@SerializedName("ToolRaw")
	private String ToolRaw;
	@SerializedName("Owner")
	private SFUser Owner;
	@SerializedName("Created")
	private Date Created;
	@SerializedName("ToolVersion")
	private String ToolVersion;
	@SerializedName("JustRegistered")
	private Boolean JustRegistered;
	@SerializedName("IsRemoteWipeReady")
	private Boolean IsRemoteWipeReady;

	public SFSafeEnum<SFSFTool> getTool() {
		return this.Tool;
	}

	public void setTool(SFSafeEnum<SFSFTool> tool) {
		this.Tool = tool;
	}
	public String getToolRaw() {
		return this.ToolRaw;
	}

	public void setToolRaw(String toolraw) {
		this.ToolRaw = toolraw;
	}
	public SFUser getOwner() {
		return this.Owner;
	}

	public void setOwner(SFUser owner) {
		this.Owner = owner;
	}
	public Date getCreated() {
		return this.Created;
	}

	public void setCreated(Date created) {
		this.Created = created;
	}
	public String getToolVersion() {
		return this.ToolVersion;
	}

	public void setToolVersion(String toolversion) {
		this.ToolVersion = toolversion;
	}
	public Boolean getJustRegistered() {
		return this.JustRegistered;
	}

	public void setJustRegistered(Boolean justregistered) {
		this.JustRegistered = justregistered;
	}
	public Boolean getIsRemoteWipeReady() {
		return this.IsRemoteWipeReady;
	}

	public void setIsRemoteWipeReady(Boolean isremotewipeready) {
		this.IsRemoteWipeReady = isremotewipeready;
	}

}