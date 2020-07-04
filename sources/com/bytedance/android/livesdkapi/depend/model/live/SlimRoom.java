package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.p458j.p459a.C9494e;
import com.google.gson.p276a.C6593c;

public class SlimRoom {
    @C6593c(mo15949a = "client_version")
    String clientVersion;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    long f25601id;
    @C6593c(mo15949a = "live_type_screenshot")
    public boolean isScreenshot;
    @C6593c(mo15949a = "live_type_third_party")
    public boolean isThirdParty;
    @C6593c(mo15949a = "common_label_list")
    String labels;
    @C6593c(mo15949a = "layout")
    public long layout;
    @C6593c(mo15949a = "live_type_audio")
    boolean liveTypeAudio;
    @C6593c(mo15949a = "orientation")
    int orientation;
    @C6593c(mo15949a = "owner_user_id")
    long ownerUserId;
    @C6593c(mo15949a = "os_type")
    int platform;
    @C6593c(mo15949a = "private_info")
    String privateInfo;
    @C6593c(mo15949a = "stream_url")
    StreamUrl streamUrl;

    public String getClientVersion() {
        return this.clientVersion;
    }

    public long getId() {
        return this.f25601id;
    }

    public String getLabels() {
        return this.labels;
    }

    public long getLayout() {
        return this.layout;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public long getOwnerUserId() {
        return this.ownerUserId;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getPrivateInfo() {
        return this.privateInfo;
    }

    public StreamUrl getStreamUrl() {
        return this.streamUrl;
    }

    public String buildPullUrl() {
        if (this.streamUrl == null) {
            return null;
        }
        return buildPullUrl(this.streamUrl.f25619r);
    }

    public String getSdkParams() {
        if (this.streamUrl == null) {
            return null;
        }
        return getSdkParams(this.streamUrl.f25619r);
    }

    public C9383t getStreamUrlExtra() {
        if (this.streamUrl == null) {
            return null;
        }
        return this.streamUrl.f25613l;
    }

    public C9383t getStreamUrlExtraSafely() {
        C9383t streamUrlExtra = getStreamUrlExtra();
        if (streamUrlExtra == null) {
            return new C9383t();
        }
        return streamUrlExtra;
    }

    public void init() {
        if (this.streamUrl != null) {
            this.streamUrl.mo23051b();
            if (this.streamUrl.f25616o != null) {
                this.streamUrl.mo23052c();
            }
        }
    }

    public String getMultiStreamData() {
        if (this.streamUrl == null || this.streamUrl.f25616o == null || this.streamUrl.f25616o.getPullData() == null) {
            return null;
        }
        return this.streamUrl.f25616o.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        if (this.streamUrl == null || this.streamUrl.f25616o == null || this.streamUrl.f25616o.getDefaultQuality() == null) {
            return null;
        }
        return this.streamUrl.f25616o.getDefaultQuality().sdkKey;
    }

    public LiveMode getStreamType() {
        if (this.layout == 1) {
            return LiveMode.OFFICIAL_ACTIVITY;
        }
        if (this.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        if (this.isThirdParty) {
            return LiveMode.THIRD_PARTY;
        }
        if (this.liveTypeAudio) {
            return LiveMode.AUDIO;
        }
        return LiveMode.VIDEO;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setId(long j) {
        this.f25601id = j;
    }

    public void setLabels(String str) {
        this.labels = str;
    }

    public void setLayout(long j) {
        this.layout = j;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public void setOwnerUserId(long j) {
        this.ownerUserId = j;
    }

    public void setPlatform(int i) {
        this.platform = i;
    }

    public void setPrivateInfo(String str) {
        this.privateInfo = str;
    }

    public void setStreamUrl(StreamUrl streamUrl2) {
        this.streamUrl = streamUrl2;
    }

    public String getSdkParams(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        return (String) this.streamUrl.sdkParamsMap.get(str);
    }

    public String buildPullUrl(String str) {
        if (this.streamUrl == null) {
            return null;
        }
        String str2 = (String) this.streamUrl.qualityMap.get(str);
        if (str2 == null) {
            return null;
        }
        C9494e eVar = new C9494e(str2);
        eVar.mo23523a("anchor_device_platform", this.platform);
        eVar.mo23525a("anchor_version", this.clientVersion);
        eVar.mo23524a("room_id", this.f25601id);
        eVar.mo23524a("anchor_id", this.ownerUserId);
        return eVar.mo23522a();
    }
}
