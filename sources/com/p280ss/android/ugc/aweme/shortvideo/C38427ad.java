package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38562h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ad */
public final class C38427ad {

    /* renamed from: a */
    public static final C38427ad f99866a = new C38427ad();

    /* renamed from: b */
    private static final String f99867b;

    /* renamed from: c */
    private static final String f99868c;

    /* renamed from: d */
    private static final String f99869d;

    private C38427ad() {
    }

    /* renamed from: a */
    public static String m122855a() {
        return f99868c;
    }

    /* renamed from: b */
    public static String m122856b() {
        return f99869d;
    }

    /* renamed from: c */
    public static boolean m122857c() {
        return C35563c.f93231M.mo93305a(Property.UsingMixRecordButton);
    }

    /* renamed from: d */
    public static boolean m122858d() {
        if (!TextUtils.isEmpty(C35563c.f93230L.mo93346e(AVSettings.Property.StatusTabKey))) {
            return true;
        }
        return false;
    }

    static {
        String string = C35563c.f93238a.getString(R.string.dck);
        C7573i.m23582a((Object) string, "AVEnv.application.getStr….record_mode_combine_tag)");
        f99867b = string;
        String string2 = C35563c.f93238a.getString(R.string.dci);
        C7573i.m23582a((Object) string2, "AVEnv.application.getStr…cord_mode_combine_15_tag)");
        f99868c = string2;
        String string3 = C35563c.f93238a.getString(R.string.dcj);
        C7573i.m23582a((Object) string3, "AVEnv.application.getStr…cord_mode_combine_60_tag)");
        f99869d = string3;
    }

    /* renamed from: e */
    public final boolean mo96334e() {
        boolean a = C35563c.f93231M.mo93305a(Property.LongDurationRecordAsTab);
        if (C6399b.m19946v()) {
            if (!m122857c() || !a) {
                return false;
            }
            return true;
        } else if (!C38562h.m123246b() || !m122857c() || !a) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public static int m122854a(String str) {
        C7573i.m23587b(str, "tag");
        if (C7573i.m23585a((Object) str, (Object) f99868c)) {
            return 10;
        }
        if (C7573i.m23585a((Object) str, (Object) f99869d)) {
            return 11;
        }
        return 8;
    }
}
