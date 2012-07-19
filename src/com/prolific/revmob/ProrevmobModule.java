/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.prolific.revmob;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;

import com.revmob.RevMobAds;


@Kroll.module(name="Prorevmob", id="com.prolific.revmob")
public class ProrevmobModule extends KrollModule
{

	// Standard Debugging variables
	private static final String LCAT = "ProrevmobModule";
	private static final boolean DBG = TiConfig.LOGD;
	public static String APP_ID;
	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public ProrevmobModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		Log.d(LCAT, "inside onAppCreate");
		// put module init code that needs to run when the application is created
	}
	
	@Kroll.method
	public void showFullScreenAd(String appId)
	{
		RevMobAds.showFullscreenAd(TiApplication.getAppCurrentActivity(), appId);
	}
	
	@Kroll.method
	public void showPopupAd(String appId)
	{
		RevMobAds.showPopup(TiApplication.getAppCurrentActivity(), appId);
	}
	
	@Kroll.method
	public void openAdLink(String appId)
	{
		RevMobAds.openAdLink(TiApplication.getAppCurrentActivity(), appId);
	}
	
}

