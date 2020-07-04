package com.p280ss.android.ugc.aweme.filter;

import android.net.Uri;
import com.p280ss.android.ugc.aweme.filter.p1246e.C29290c;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.filter.x */
public final class C29339x implements C29290c {
    /* renamed from: a */
    public final void mo74963a() {
        C29341z.m96257a();
    }

    /* renamed from: c */
    public final C29296g mo74967c() {
        C29296g a = C29196ab.m95825a();
        C7573i.m23582a((Object) a, "FilterHelperCopy.makeNormalFilter()");
        return a;
    }

    /* renamed from: b */
    public final List<C29296g> mo74966b() {
        List<C29296g> b = C29196ab.m95827b();
        C7573i.m23582a((Object) b, "FilterHelperCopy.getFilterListData()");
        return b;
    }

    /* renamed from: a */
    public final C29296g mo74962a(int i) {
        C29296g a = C29196ab.m95826a(i);
        C7573i.m23582a((Object) a, "FilterHelperCopy.getFilter(index)");
        return a;
    }

    /* renamed from: b */
    public final String mo74965b(int i) {
        String b = C29341z.m96259b(i);
        if (b == null) {
            return "";
        }
        return b;
    }

    /* renamed from: d */
    public final String mo74969d(int i) {
        String d = C29341z.m96267d(i);
        if (d == null) {
            return "";
        }
        return d;
    }

    /* renamed from: e */
    public final String mo74970e(int i) {
        String a = C29340y.m96241a().mo75013a(i);
        C7573i.m23582a((Object) a, "FilterFileManager.getIns…().getFilterDir(filterId)");
        return a;
    }

    /* renamed from: f */
    public final Uri mo74971f(int i) {
        Uri e = C29341z.m96269e(i);
        C7573i.m23582a((Object) e, "FilterHelper.getThumbnailUri(index)");
        return e;
    }

    /* renamed from: g */
    public final String mo74972g(int i) {
        String a = C29341z.m96253a(i);
        if (a == null) {
            return "";
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo74964a(C29296g gVar) {
        C7573i.m23587b(gVar, "filterBean");
        return C29341z.m96266c(gVar);
    }

    /* renamed from: c */
    public final String mo74968c(int i) {
        String c = C29341z.m96264c(i);
        if (c == null) {
            return "";
        }
        return c;
    }
}
