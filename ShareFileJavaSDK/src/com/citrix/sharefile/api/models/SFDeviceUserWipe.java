
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

public class SFDeviceUserWipe extends SFODataObject {

	@SerializedName("WipeToken")
	private String WipeToken;
	@SerializedName("Success")
	private String Success;
	@SerializedName("ErrorMessage")
	private String ErrorMessage;

		/**
		* Wipe token
		*/
	public String getWipeToken() {
		return this.WipeToken;
	}

		/**
		* Wipe token
		*/
	public void setWipeToken(String wipetoken) {
		this.WipeToken = wipetoken;
	}
		/**
		* Success
		*/
	public String getSuccess() {
		return this.Success;
	}

		/**
		* Success
		*/
	public void setSuccess(String success) {
		this.Success = success;
	}
		/**
		* Error message
		*/
	public String getErrorMessage() {
		return this.ErrorMessage;
	}

		/**
		* Error message
		*/
	public void setErrorMessage(String errormessage) {
		this.ErrorMessage = errormessage;
	}

}