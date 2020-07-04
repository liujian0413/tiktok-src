package com.facebook.appevents;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;

public class AppEventsLogger {

    /* renamed from: a */
    private static final String f34749a = AppEventsLogger.class.getCanonicalName();

    /* renamed from: b */
    private C13159g f34750b;

    public enum FlushBehavior {
        AUTO,
        EXPLICIT_ONLY
    }

    public enum ProductAvailability {
        IN_STOCK,
        OUT_OF_STOCK,
        PREORDER,
        AVALIABLE_FOR_ORDER,
        DISCONTINUED
    }

    public enum ProductCondition {
        NEW,
        REFURBISHED,
        USED
    }

    /* renamed from: c */
    public static void m38361c() {
        C13159g.m38469c();
    }

    /* renamed from: b */
    public final void mo32285b() {
        C13159g.m38467b();
    }

    /* renamed from: a */
    public static FlushBehavior m38355a() {
        return C13159g.m38459a();
    }

    /* renamed from: d */
    public static String m38362d() {
        return C13120b.m38369b();
    }

    /* renamed from: e */
    public static String m38363e() {
        return C13192m.m38566b();
    }

    /* renamed from: b */
    public static String m38360b(Context context) {
        return C13159g.m38460a(context);
    }

    /* renamed from: a */
    public static AppEventsLogger m38356a(Context context) {
        return new AppEventsLogger(context, null, null);
    }

    /* renamed from: a */
    public static void m38359a(String str) {
        C13159g.m38464a(str);
    }

    /* renamed from: a */
    public static void m38357a(Application application, String str) {
        C13159g.m38461a(application, str);
    }

    /* renamed from: a */
    public static void m38358a(Context context, String str) {
        C13159g.m38462a(context, str);
    }

    /* renamed from: a */
    public final void mo32284a(String str, Bundle bundle) {
        this.f34750b.mo32330a(str, bundle);
    }

    private AppEventsLogger(Context context, String str, AccessToken accessToken) {
        this.f34750b = new C13159g(context, (String) null, (AccessToken) null);
    }
}
