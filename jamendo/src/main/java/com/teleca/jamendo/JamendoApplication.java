/*
 * Copyright (C) 2009 Teleca Poland Sp. z o.o. <android@teleca.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.teleca.jamendo;

import java.util.ArrayList;

import android.content.Context;
import android.preference.PreferenceManager;

import com.teleca.jamendo.api.JamendoGet2Api;
import com.teleca.jamendo.api.util.RequestCache;
import com.teleca.jamendo.util.ImageCache;
import com.teleca.jamendo.util.download.DownloadJob;

/**
 * Singleton with hooks to Player and Download Service
 * 
 * @author Lukasz Wisniewski
 */
public class JamendoApplication {

	public Context application;
	public static String TAG = "jamendo";

	/**
	 * Singleton pattern
	 */
	private static JamendoApplication instance;

	/**
	 * Image cache, one for all activities and orientations
	 */
	private static ImageCache mImageCache;

	@SuppressWarnings("static-access")
	public void application(Context application, ImageCache mImageCache,
			RequestCache mRequestCache,
			ArrayList<DownloadJob> mQueuedDownloads,
			ArrayList<DownloadJob> mCompletedDownloads) {
		this.application = application;
		this.mImageCache = mImageCache;
		JamendoApplication.instance = this;
	}

	public static JamendoApplication getInstance() {
		return instance;
	}
 
	public ImageCache getImageCache() {
		return mImageCache;
	}

	public String getDownloadFormat() {
		return PreferenceManager.getDefaultSharedPreferences(application)
				.getString("download_format", JamendoGet2Api.ENCODING_MP3);
	}

	public String getStreamEncoding() {
		// http://groups.google.com/group/android-developers/msg/c546760177b22197
		// According to JBQ: ogg files are supported but not streamable
		return JamendoGet2Api.ENCODING_MP3;
	}

}
