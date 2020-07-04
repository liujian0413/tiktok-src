package com.p280ss.android.ugc.aweme.feed;

import com.bytedance.ies.NullValueException;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28444aa;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.feed.ag */
public final class C28202ag {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f74304a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C28202ag.class), "mModel", "getMModel()Lcom/ss/android/ugc/aweme/feed/presenter/PlayStatusModel;"))};

    /* renamed from: b */
    public static final C28202ag f74305b = new C28202ag();

    /* renamed from: c */
    private static final C7541d f74306c = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C28203a.f74307a);

    /* renamed from: com.ss.android.ugc.aweme.feed.ag$a */
    static final class C28203a extends Lambda implements C7561a<C28444aa> {

        /* renamed from: a */
        public static final C28203a f74307a = new C28203a();

        C28203a() {
            super(0);
        }

        /* renamed from: a */
        private static C28444aa m92702a() {
            return new C28444aa();
        }

        public final /* synthetic */ Object invoke() {
            return m92702a();
        }
    }

    private C28202ag() {
    }

    /* renamed from: a */
    private static int m92696a(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 1000:
            case AdError.SERVER_ERROR_CODE /*2000*/:
                return 3;
            case 1001:
            case AdError.INTERNAL_ERROR_CODE /*2001*/:
                return 4;
            case 3002:
                return 5;
            case 3003:
                return 9;
            case 4000:
                return 6;
            case 4001:
                return 8;
            case 5000:
                return 7;
            case 8000:
                return 20;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    private final C28444aa m92697a() {
        return (C28444aa) f74306c.getValue();
    }

    /* renamed from: b */
    private static Boolean m92699b() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            return a.getRealTimeReportEnable();
        } catch (NullValueException unused) {
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: a */
    public final void mo71795a(String str, int i, int i2) {
        C7573i.m23587b(str, "itemId");
        m92698a(str, i, 1, i2, -1);
    }

    /* renamed from: a */
    public final void mo71796a(String str, int i, int i2, long j) {
        C7573i.m23587b(str, "itemId");
        m92698a(str, i, 0, i2, j);
    }

    /* renamed from: a */
    private final void m92698a(String str, int i, int i2, int i3, long j) {
        if (m92699b().booleanValue()) {
            int a = m92696a(i3);
            if (a != -1) {
                m92697a().sendRequest(str, Integer.valueOf(0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(a), Long.valueOf(j));
            }
        }
    }
}
