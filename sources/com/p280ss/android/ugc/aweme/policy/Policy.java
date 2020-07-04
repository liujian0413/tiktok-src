package com.p280ss.android.ugc.aweme.policy;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.policy.Policy */
public class Policy extends BaseResponse {
    public static final String ACTION_DELETE = "DELETE";
    public static final String ACTION_NORMAL = "NORMAL";
    @C6593c(mo15949a = "configs")
    private List<C35491b> configs;
    @C6593c(mo15949a = "display")
    private boolean display;

    /* renamed from: com.ss.android.ugc.aweme.policy.Policy$a */
    class C35490a {
        @C6593c(mo15949a = "title")

        /* renamed from: a */
        public String f93130a;
        @C6593c(mo15949a = "content")

        /* renamed from: b */
        public String f93131b;
        @C6593c(mo15949a = "button_text")

        /* renamed from: c */
        public String f93132c;
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.Policy$b */
    class C35491b {
        @C6593c(mo15949a = "url")

        /* renamed from: a */
        public String f93133a;
        @C6593c(mo15949a = "reject_action")

        /* renamed from: b */
        public String f93134b;
        @C6593c(mo15949a = "version")

        /* renamed from: c */
        public int f93135c;
        @C6593c(mo15949a = "extra")

        /* renamed from: d */
        public C35490a f93136d;
    }

    public List<C35491b> getConfigs() {
        return this.configs;
    }

    public boolean isDisplay() {
        return this.display;
    }

    public void setConfigs(List<C35491b> list) {
        this.configs = list;
    }

    public void setDisplay(boolean z) {
        this.display = z;
    }
}
