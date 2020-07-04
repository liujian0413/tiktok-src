package com.p280ss.android.ugc.aweme.miniapp_api.model;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams */
public final class GlobalMicroAppParams {

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams$MediaEntity */
    public static final class MediaEntity implements Serializable {

        /* renamed from: id */
        private int f87293id;
        private int mediaType;
        private String name;
        private String parentDir;
        private String path;
        private long size;
        private long time;

        public final int getId() {
            return this.f87293id;
        }

        public final int getMediaType() {
            return this.mediaType;
        }

        public final String getName() {
            return this.name;
        }

        public final String getParentDir() {
            return this.parentDir;
        }

        public final String getPath() {
            return this.path;
        }

        public final long getSize() {
            return this.size;
        }

        public final long getTime() {
            return this.time;
        }

        public final void setId(int i) {
            this.f87293id = i;
        }

        public final void setMediaType(int i) {
            this.mediaType = i;
        }

        public final void setName(String str) {
            this.name = str;
        }

        public final void setParentDir(String str) {
            this.parentDir = str;
        }

        public final void setPath(String str) {
            this.path = str;
        }

        public final void setSize(long j) {
            this.size = j;
        }

        public final void setTime(long j) {
            this.time = j;
        }

        public MediaEntity(String str, String str2, long j, int i, long j2, int i2, String str3) {
            this.path = str;
            this.name = str2;
            this.time = j;
            this.mediaType = i;
            this.size = j2;
            this.f87293id = i2;
            this.parentDir = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams$a */
    public static final class C33448a {

        /* renamed from: a */
        public String f87294a;

        /* renamed from: b */
        public String f87295b;

        /* renamed from: c */
        public String f87296c;

        /* renamed from: d */
        public String f87297d;

        /* renamed from: e */
        public String f87298e;

        /* renamed from: f */
        public int f87299f;
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.GlobalMicroAppParams$b */
    public static final class C33449b {

        /* renamed from: a */
        public String f87300a;

        /* renamed from: b */
        public String f87301b;

        /* renamed from: c */
        public String f87302c;

        /* renamed from: d */
        public String f87303d;

        /* renamed from: e */
        public String f87304e;

        /* renamed from: f */
        public String f87305f;

        /* renamed from: g */
        public String f87306g;

        /* renamed from: h */
        public String f87307h;

        /* renamed from: i */
        public String f87308i;

        /* renamed from: j */
        public String f87309j;

        /* renamed from: k */
        public String f87310k;

        /* renamed from: l */
        public String f87311l;

        /* renamed from: m */
        public C33448a f87312m;
    }
}
