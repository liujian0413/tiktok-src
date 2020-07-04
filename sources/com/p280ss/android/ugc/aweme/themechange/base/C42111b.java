package com.p280ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService;
import com.p280ss.android.ugc.aweme.shortvideo.C38501ax;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.b */
public final class C42111b {

    /* renamed from: a */
    public static final C42111b f109618a = new C42111b();

    /* renamed from: b */
    private static final int f109619b = Color.parseColor("#FFFFFFFF");

    /* renamed from: c */
    private static final int f109620c = Color.parseColor("#FF161823");

    /* renamed from: d */
    private static final int f109621d = Color.parseColor("#FF0E0F1A");

    /* renamed from: e */
    private static final int f109622e = Color.parseColor("#FF161823");

    /* renamed from: f */
    private static final int f109623f = Color.parseColor("#D8000000");

    /* renamed from: g */
    private static final int f109624g = Color.parseColor("#80000000");

    /* renamed from: h */
    private static final int f109625h = Color.parseColor("#99000000");

    /* renamed from: i */
    private static final int f109626i = Color.parseColor("#99FFFFFF");

    /* renamed from: j */
    private static final int f109627j = Color.parseColor("#FFFFFFFF");

    /* renamed from: k */
    private static final int f109628k = Color.parseColor("#80FFFFFF");

    /* renamed from: l */
    private static final int f109629l = Color.parseColor("#D0FFFFFF");

    /* renamed from: m */
    private static final int f109630m = Color.parseColor("#80FFFFFF");

    /* renamed from: n */
    private static final int f109631n = Color.parseColor("#26FFFFFF");

    /* renamed from: o */
    private static final int f109632o = Color.parseColor("#26000000");

    /* renamed from: p */
    private static String f109633p;

    private C42111b() {
    }

    /* renamed from: a */
    public static int m134048a() {
        return f109631n;
    }

    /* renamed from: a */
    public static int m134049a(int i) {
        return (i & 16777215) | Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public static int m134053b() {
        return f109632o;
    }

    /* renamed from: d */
    public static int m134055d() {
        return f109619b;
    }

    /* renamed from: j */
    public static boolean m134057j() {
        return ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableMBlackPanel();
    }

    /* renamed from: c */
    public final int mo103547c() {
        if (!m134057j() && C6399b.m19946v()) {
            return mo103546b(false);
        }
        return 0;
    }

    /* renamed from: e */
    public final int mo103548e() {
        if (!C6399b.m19946v() || m134057j()) {
            return Color.parseColor("#22FFFFFF");
        }
        return Color.parseColor("#0F161823");
    }

    /* renamed from: f */
    public final int mo103549f() {
        if (!C6399b.m19946v() || m134057j()) {
            return Color.parseColor("#22FFFFFF");
        }
        return Color.parseColor("#07161823");
    }

    /* renamed from: g */
    public final int mo103550g() {
        if (!C6399b.m19946v() || m134057j()) {
            return Color.parseColor("#52FFFFFF");
        }
        return Color.parseColor("#22161823");
    }

    /* renamed from: h */
    public final int mo103551h() {
        if (!C6399b.m19946v() || m134057j()) {
            return -1;
        }
        return Color.parseColor("#52161823");
    }

    /* renamed from: i */
    public static int m134056i() {
        if (!C6399b.m19946v()) {
            Object service = ServiceManager.get().getService(IMainService.class);
            C7573i.m23582a(service, "ServiceManager.get().get…IMainService::class.java)");
            if (!((IMainService) service).isTiktokWhite()) {
                return Color.parseColor("#E6FACE15");
            }
        }
        return Color.parseColor("#FF20E5DC");
    }

    /* renamed from: a */
    public static void m134052a(String str) {
        f109633p = str;
    }

    /* renamed from: b */
    public final int mo103546b(boolean z) {
        return (mo103541a(z) & 16777215) | Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final int mo103541a(boolean z) {
        if (C6399b.m19946v()) {
            CharSequence charSequence = f109633p;
            IEffectService effectService = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService();
            C7573i.m23582a((Object) effectService, "ServiceManager.get().get…ass.java).effectService()");
            if (TextUtils.equals(charSequence, effectService.getLiveStickerPannel())) {
                return f109619b;
            }
        }
        if (m134057j()) {
            return f109619b;
        }
        if (!C6399b.m19946v() || z) {
            return f109619b;
        }
        return f109620c;
    }

    /* renamed from: a */
    public static Drawable m134051a(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C7573i.m23582a((Object) mutate, "wrappedDrawable");
        mutate.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public final Drawable mo103544a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        int dimension = (int) obtainStyledAttributes.getDimension(29, 0.0f);
        boolean z2 = obtainStyledAttributes.getBoolean(26, false);
        boolean z3 = obtainStyledAttributes.getBoolean(5, false);
        boolean z4 = obtainStyledAttributes.getBoolean(30, false);
        boolean z5 = obtainStyledAttributes.getBoolean(3, false);
        boolean z6 = obtainStyledAttributes.getBoolean(34, false);
        boolean z7 = obtainStyledAttributes.getBoolean(42, false);
        int a = mo103542a(z3, z4, z5, z2, z6);
        if (z7) {
            a = mo103541a(z2);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            a = obtainStyledAttributes.getColor(0, a);
        }
        obtainStyledAttributes.recycle();
        if (z) {
            return C38501ax.m123065a(a, a, 0);
        }
        return C38501ax.m123066a(a, a, 0, dimension);
    }

    /* renamed from: a */
    public final Drawable mo103545a(Drawable drawable, boolean z) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C7573i.m23582a((Object) mutate, "wrappedDrawable");
        mutate.setColorFilter(new PorterDuffColorFilter(mo103541a(z), Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public final Drawable mo103543a(Context context, int i, boolean z) {
        if (context != null && i > 0) {
            return mo103545a(context.getResources().getDrawable(i), z);
        }
        return null;
    }

    /* renamed from: a */
    private static int m134050a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return f109631n;
        }
        if (z) {
            if (z2) {
                return f109622e;
            }
            return f109621d;
        } else if (z2) {
            if (z3) {
                return f109632o;
            }
            return f109624g;
        } else if (z3) {
            return f109625h;
        } else {
            return f109623f;
        }
    }

    /* renamed from: b */
    private static int m134054b(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return f109632o;
        }
        if (z) {
            if (z2) {
                return f109628k;
            }
            return f109627j;
        } else if (z2) {
            if (z3) {
                return f109631n;
            }
            return f109630m;
        } else if (z3) {
            return f109626i;
        } else {
            return f109629l;
        }
    }

    /* renamed from: a */
    public final int mo103542a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        if (m134057j() || !C6399b.m19946v()) {
            return m134050a(z, z2, z3, z5);
        }
        if (!z4) {
            return m134054b(z, z2, z3, z5);
        }
        if (z2) {
            return f109624g;
        }
        return f109623f;
    }
}
