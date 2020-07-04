package com.bytedance.android.livesdk.utils;

import com.bytedance.android.livesdk.TTLiveSDKContext;
import java.util.HashMap;

public final class V3Utils {

    public enum BELONG {
        VIDEO_INTERACT("video_interact"),
        VIDEO("video"),
        LIVE("live"),
        LIVE_INTERACT("live_interact"),
        LIVE_FUNC("live_function"),
        LIVE_TAKE("live_take"),
        RELATION("relation"),
        LIVE_VIEW("live_view");
        
        public String mBelong;

        private BELONG(String str) {
            this.mBelong = str;
        }
    }

    public enum PLATFORM {
        WX("weixin"),
        WXCIRCLE("weixin_moment"),
        QQ("qq"),
        QZONE("qzone"),
        WEIBO("weibo"),
        COPY_LINK("copy_link");
        
        public String platForm;

        private PLATFORM(String str) {
            this.platForm = str;
        }
    }

    public enum TYPE {
        CORE("core"),
        SHOW("show"),
        PV("pv"),
        OTHER("other"),
        CLICK("click");
        
        public String mType;

        public final String getType() {
            return this.mType;
        }

        private TYPE(String str) {
            this.mType = str;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.utils.V3Utils$a */
    public static class C9019a {

        /* renamed from: a */
        private HashMap<String, String> f24665a;

        /* renamed from: b */
        private boolean f24666b;

        private C9019a() {
            this.f24665a = new HashMap<>();
        }

        /* renamed from: a */
        public final void mo22225a(String str) {
            if (!this.f24666b) {
                TTLiveSDKContext.getHostService().mo22363d().mo23269a(str, this.f24665a);
            }
        }

        /* renamed from: a */
        public final C9019a mo22224a(String str, String str2) {
            this.f24665a.put(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C9019a mo22223a(String str, long j) {
            this.f24665a.put(str, String.valueOf(j));
            return this;
        }

        private C9019a(String str, String str2, String str3) {
            this.f24665a = new HashMap<>();
            this.f24665a.put("event_type", str);
            this.f24665a.put("event_belong", str2);
            this.f24665a.put("event_page", str3);
        }
    }

    /* renamed from: a */
    public static C9019a m26945a(TYPE type, String str, String str2) {
        return new C9019a(type.mType, str, str2);
    }
}
