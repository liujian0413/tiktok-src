package com.p280ss.android.ugc.aweme.watermark;

import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.watermark.d */
public final class C43404d {

    /* renamed from: a */
    public final int f112417a;

    /* renamed from: b */
    public final String f112418b;

    /* renamed from: com.ss.android.ugc.aweme.watermark.d$a */
    public static final class C43405a {

        /* renamed from: a */
        private int f112419a = R.drawable.b2s;

        /* renamed from: b */
        private String f112420b;

        /* renamed from: a */
        public final C43404d mo105314a() {
            return new C43404d(this.f112419a, this.f112420b);
        }

        /* renamed from: a */
        public final C43405a mo105313a(String str) {
            C7573i.m23587b(str, "waterPicDir");
            C43405a aVar = this;
            aVar.f112420b = str;
            return aVar;
        }
    }

    public C43404d(int i, String str) {
        this.f112417a = i;
        this.f112418b = str;
    }
}
