package com.p280ss.android.ugc.aweme.commercialize.egg;

import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.CommerceEggConfig;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.i */
public final class C24664i {

    /* renamed from: a */
    public static final C24664i f65031a = new C24664i();

    private C24664i() {
    }

    /* renamed from: a */
    public static final boolean m80832a() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            CommerceEggConfig commerceEggConfig = a.getCommerceEggConfig();
            if (commerceEggConfig == null) {
                return false;
            }
            Boolean enableDiggEggRefactor = commerceEggConfig.getEnableDiggEggRefactor();
            if (enableDiggEggRefactor != null) {
                return enableDiggEggRefactor.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m80833b() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            CommerceEggConfig commerceEggConfig = a.getCommerceEggConfig();
            if (commerceEggConfig == null) {
                return false;
            }
            Boolean enableCommentEggRefactor = commerceEggConfig.getEnableCommentEggRefactor();
            if (enableCommentEggRefactor != null) {
                return enableCommentEggRefactor.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m80834c() {
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            CommerceEggConfig commerceEggConfig = a.getCommerceEggConfig();
            if (commerceEggConfig == null) {
                return false;
            }
            Boolean enableSearchEggRefactor = commerceEggConfig.getEnableSearchEggRefactor();
            if (enableSearchEggRefactor != null) {
                return enableSearchEggRefactor.booleanValue();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
