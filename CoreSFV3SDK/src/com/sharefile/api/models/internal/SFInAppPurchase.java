
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

package com.sharefile.api.models.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.google.gson.annotations.SerializedName;
import com.sharefile.api.enumerations.SFSafeEnum;
import com.sharefile.api.models.*;

public class SFInAppPurchase extends SFODataObject {

	@SerializedName("ProductID")
	private String ProductID;
	@SerializedName("AppStore")
	private String AppStore;
	@SerializedName("SharedSecret")
	private String SharedSecret;
	@SerializedName("ReceiptData")
	private String ReceiptData;
	@SerializedName("UnitPrice")
	private Double UnitPrice;
	@SerializedName("Currency")
	private String Currency;

	public String getProductID() {
		return this.ProductID;
	}

	public void setProductID(String productid) {
		this.ProductID = productid;
	}
	public String getAppStore() {
		return this.AppStore;
	}

	public void setAppStore(String appstore) {
		this.AppStore = appstore;
	}
	public String getSharedSecret() {
		return this.SharedSecret;
	}

	public void setSharedSecret(String sharedsecret) {
		this.SharedSecret = sharedsecret;
	}
	public String getReceiptData() {
		return this.ReceiptData;
	}

	public void setReceiptData(String receiptdata) {
		this.ReceiptData = receiptdata;
	}
	public Double getUnitPrice() {
		return this.UnitPrice;
	}

	public void setUnitPrice(Double unitprice) {
		this.UnitPrice = unitprice;
	}
	public String getCurrency() {
		return this.Currency;
	}

	public void setCurrency(String currency) {
		this.Currency = currency;
	}

}