package com.p280ss.android.agilelogger;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.agilelogger.p837a.C19162a;
import com.p280ss.android.agilelogger.utils.C19195a;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;

/* renamed from: com.ss.android.agilelogger.a */
public final class C19159a {

    /* renamed from: a */
    public int f51787a;

    /* renamed from: b */
    public int f51788b;

    /* renamed from: c */
    public String f51789c;

    /* renamed from: d */
    public String f51790d;

    /* renamed from: e */
    public boolean f51791e;

    /* renamed from: f */
    public boolean f51792f;

    /* renamed from: g */
    public int f51793g;

    /* renamed from: h */
    public int f51794h;

    /* renamed from: i */
    public int f51795i;

    /* renamed from: com.ss.android.agilelogger.a$a */
    public static class C19161a {

        /* renamed from: a */
        private int f51796a = C19162a.f51807c;

        /* renamed from: b */
        private int f51797b = C19162a.f51806b;

        /* renamed from: c */
        private int f51798c = VideoPreloadSizeExperiment.DEFAULT;

        /* renamed from: d */
        private int f51799d = 3;

        /* renamed from: e */
        private String f51800e;

        /* renamed from: f */
        private String f51801f;

        /* renamed from: g */
        private boolean f51802g = true;

        /* renamed from: h */
        private boolean f51803h = true;

        /* renamed from: i */
        private int f51804i = 3;

        /* renamed from: a */
        public final C19159a mo50874a() {
            String str;
            String str2;
            C19159a aVar = new C19159a();
            aVar.f51787a = this.f51796a;
            aVar.f51788b = this.f51797b;
            if (TextUtils.isEmpty(this.f51800e)) {
                str = C19195a.m62912c(ALog.m20846a());
            } else {
                str = this.f51800e;
            }
            aVar.f51789c = str;
            aVar.f51794h = this.f51798c;
            if (TextUtils.isEmpty(this.f51801f)) {
                str2 = C19195a.m62910a(ALog.m20846a()).getAbsolutePath();
            } else {
                str2 = this.f51801f;
            }
            aVar.f51790d = str2;
            aVar.f51791e = this.f51802g;
            aVar.f51792f = this.f51803h;
            aVar.f51793g = this.f51799d;
            aVar.f51795i = this.f51804i;
            return aVar;
        }

        /* renamed from: a */
        public final C19161a mo50872a(int i) {
            this.f51796a = i;
            return this;
        }

        /* renamed from: a */
        public final C19161a mo50873a(String str) {
            this.f51801f = str;
            return this;
        }

        /* renamed from: b */
        public final C19161a mo50875b(int i) {
            this.f51797b = 2097152;
            return this;
        }

        public C19161a(Context context) {
            if (context != null) {
                ALog.m20852a(context.getApplicationContext());
                return;
            }
            throw new RuntimeException("context must not be null");
        }
    }

    private C19159a() {
        this.f51793g = 3;
    }
}
