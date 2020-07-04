package com.p280ss.android.ugc.aweme.activity;

import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.NewYearConfig;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.activity.a */
public final class C22368a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59675a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22368a.class), "disabled", "getDisabled()Z"))};

    /* renamed from: b */
    public static final C22368a f59676b = new C22368a();

    /* renamed from: c */
    private static C22370b f59677c;

    /* renamed from: d */
    private static final C7541d f59678d = C7546e.m23569a(C22369a.f59681a);

    /* renamed from: e */
    private static boolean f59679e;

    /* renamed from: f */
    private static boolean f59680f;

    /* renamed from: com.ss.android.ugc.aweme.activity.a$a */
    static final class C22369a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C22369a f59681a = new C22369a();

        C22369a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m74069a();
        }

        /* renamed from: a */
        private static Boolean m74069a() {
            NewYearConfig newYearConfig;
            Boolean bool;
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                newYearConfig = a.getNewyearConfig();
            } catch (NullValueException unused) {
                newYearConfig = null;
            }
            if (newYearConfig == null) {
                return Boolean.valueOf(true);
            }
            try {
                bool = newYearConfig.getDisabled();
            } catch (NullValueException unused2) {
                bool = Boolean.valueOf(false);
            }
            return bool;
        }
    }

    private C22368a() {
    }

    /* renamed from: a */
    public static C22370b m74065a() {
        return f59677c;
    }

    /* renamed from: c */
    public static boolean m74066c() {
        return f59679e;
    }

    /* renamed from: d */
    public static boolean m74067d() {
        return f59680f;
    }

    /* renamed from: b */
    public final boolean mo58795b() {
        return ((Boolean) f59678d.getValue()).booleanValue();
    }
}
