package com.p280ss.android.ugc.playerkit.videoview;

import com.p280ss.android.ugc.aweme.player.sdk.api.C34972b;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44947a;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44948b;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44952f;

/* renamed from: com.ss.android.ugc.playerkit.videoview.CommonWidget */
public enum CommonWidget {
    INSTANCE;
    
    private C44947a bitrateManager;
    private C44948b httpsHelper;
    private C44937b mCacheChecker;
    private C34972b mPlayInfoCallback;
    private C44952f playUrlBuilder;

    public final C44937b cacheChecker() {
        return this.mCacheChecker;
    }

    public final C44947a getBitrateManager() {
        return this.bitrateManager;
    }

    public final C44948b getHttpsHelper() {
        return this.httpsHelper;
    }

    public final C44952f getPlayUrlBuilder() {
        return this.playUrlBuilder;
    }

    public final C34972b playInfoCallback() {
        return this.mPlayInfoCallback;
    }

    public final CommonWidget setBitrateManager(C44947a aVar) {
        this.bitrateManager = aVar;
        return this;
    }

    public final CommonWidget setCacheChecker(C44937b bVar) {
        this.mCacheChecker = bVar;
        return this;
    }

    public final CommonWidget setHttpsHelper(C44948b bVar) {
        this.httpsHelper = bVar;
        return this;
    }

    public final CommonWidget setPlayInfoCallback(C34972b bVar) {
        this.mPlayInfoCallback = bVar;
        return this;
    }

    public final CommonWidget setPlayUrlBuilder(C44952f fVar) {
        this.playUrlBuilder = fVar;
        return this;
    }
}
