package com.p280ss.android.ugc.aweme.utils;

import com.alibaba.fastjson.JSON;
import com.google.gson.C6600e;
import com.google.gson.C6607f;
import com.google.gson.C6717s;
import com.p280ss.android.ugc.aweme.app.api.BaseResponseObjectTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.app.api.CollectionTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.app.api.ModelCheckerTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.app.api.UserTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.net.MusicTypeAdapterFactory;
import com.p280ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.p280ss.android.ugc.aweme.typeadapter.BackgroundVideoDeserializer;

/* renamed from: com.ss.android.ugc.aweme.utils.GsonHolder */
public class GsonHolder implements GsonProvider {
    private final C6600e gson;
    private final C6600e settingGson = this.gson;

    public C6600e getGson() {
        return this.gson;
    }

    public C6600e getSettingGson() {
        return this.settingGson;
    }

    private GsonHolder() {
        C6607f createAdapterGsonBuilder = JSON.createAdapterGsonBuilder();
        createAdapterGsonBuilder.mo15985a((C6717s) new ModelCheckerTypeAdapterFactory());
        createAdapterGsonBuilder.mo15985a((C6717s) new CollectionTypeAdapterFactory());
        createAdapterGsonBuilder.mo15985a((C6717s) new MusicTypeAdapterFactory());
        createAdapterGsonBuilder.mo15985a((C6717s) new UserTypeAdapterFactory());
        createAdapterGsonBuilder.mo15986a(BackgroundVideo.class, new BackgroundVideoDeserializer());
        createAdapterGsonBuilder.mo15985a((C6717s) new BaseResponseObjectTypeAdapterFactory());
        this.gson = createAdapterGsonBuilder.mo15992f();
    }
}
