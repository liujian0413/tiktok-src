package com.p280ss.android.statistic;

import android.text.TextUtils;
import com.p280ss.android.common.applog.UrlConfig;

/* renamed from: com.ss.android.statistic.Configuration */
public final class Configuration {

    /* renamed from: a */
    public String f55093a = "";

    /* renamed from: b */
    public String f55094b = "";

    /* renamed from: c */
    public BuildType f55095c = BuildType.DEBUG;

    /* renamed from: d */
    public String f55096d = "";

    /* renamed from: e */
    public String f55097e = "";

    /* renamed from: f */
    public String f55098f = "";

    /* renamed from: g */
    public int f55099g;

    /* renamed from: h */
    public int f55100h;

    /* renamed from: i */
    public UrlConfig f55101i;

    /* renamed from: j */
    public String f55102j = "";

    /* renamed from: com.ss.android.statistic.Configuration$BuildType */
    public enum BuildType {
        RELEASE,
        DEBUG
    }

    /* renamed from: com.ss.android.statistic.Configuration$a */
    public static class C20402a {

        /* renamed from: a */
        private String f55103a;

        /* renamed from: b */
        private String f55104b;

        /* renamed from: c */
        private BuildType f55105c;

        /* renamed from: d */
        private String f55106d;

        /* renamed from: e */
        private String f55107e;

        /* renamed from: f */
        private String f55108f;

        /* renamed from: g */
        private String f55109g;

        /* renamed from: h */
        private int f55110h;

        /* renamed from: i */
        private int f55111i;

        /* renamed from: j */
        private UrlConfig f55112j;

        /* renamed from: a */
        public final Configuration mo54939a() {
            Configuration configuration = new Configuration();
            if (!TextUtils.isEmpty(this.f55103a)) {
                configuration.f55093a = this.f55103a;
            }
            if (!TextUtils.isEmpty(this.f55104b)) {
                configuration.f55094b = this.f55104b;
            }
            if (this.f55105c != null) {
                configuration.f55095c = this.f55105c;
            }
            if (!TextUtils.isEmpty(this.f55106d)) {
                configuration.f55096d = this.f55106d;
            }
            if (!TextUtils.isEmpty(this.f55107e)) {
                configuration.f55097e = this.f55107e;
            }
            if (!TextUtils.isEmpty(this.f55108f)) {
                configuration.f55102j = this.f55108f;
            }
            if (!TextUtils.isEmpty(this.f55109g)) {
                configuration.f55098f = this.f55109g;
            }
            if (this.f55110h != 0) {
                configuration.f55099g = this.f55110h;
            }
            if (this.f55112j == null) {
                this.f55112j = UrlConfig.CHINA;
            }
            configuration.f55101i = this.f55112j;
            configuration.f55100h = this.f55111i;
            return configuration;
        }

        /* renamed from: a */
        public final C20402a mo54935a(int i) {
            this.f55110h = i;
            return this;
        }

        /* renamed from: b */
        public final C20402a mo54940b(int i) {
            this.f55111i = i;
            return this;
        }

        /* renamed from: c */
        public final C20402a mo54942c(String str) {
            this.f55109g = str;
            return this;
        }

        /* renamed from: a */
        public final C20402a mo54936a(BuildType buildType) {
            this.f55105c = buildType;
            return this;
        }

        /* renamed from: b */
        public final C20402a mo54941b(String str) {
            this.f55107e = str;
            return this;
        }

        /* renamed from: a */
        public final C20402a mo54937a(String str) {
            this.f55106d = str;
            return this;
        }

        /* renamed from: a */
        public final C20402a mo54938a(String str, String str2) {
            this.f55103a = str;
            this.f55104b = str2;
            return this;
        }
    }
}
