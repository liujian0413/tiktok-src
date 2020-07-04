package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23320c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.tools.C42341f;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.controller.f */
public abstract class C39614f {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo98725a(String str, int i);

    /* renamed from: a */
    private static void m126776a(ViewGroup viewGroup, View[] viewArr) {
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null) {
                viewGroup.addView(view, i);
            }
        }
    }

    /* renamed from: a */
    private static View[] m126777a(View view, ViewGroup viewGroup) {
        View[] viewArr = new View[viewGroup.getChildCount()];
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            if (viewGroup.getChildAt(childCount) != view) {
                viewArr[childCount] = viewGroup.getChildAt(childCount);
                viewGroup.removeViewAt(childCount);
            }
        }
        return viewArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C39613e mo98750a(String str, C1592h hVar) throws Exception {
        C39613e eVar;
        if (C42341f.m134636a(((C39618j) hVar.mo6890e()).f102926a, new File(str), 100, CompressFormat.PNG)) {
            eVar = new C39613e(str, ((C39618j) hVar.mo6890e()).f102927b.intValue());
        } else {
            eVar = null;
        }
        C42341f.m134634a(((C39618j) hVar.mo6890e()).f102926a);
        return eVar;
    }

    /* renamed from: a */
    private <R> R m126775a(ViewGroup viewGroup, View view, C23320c<ViewGroup, R> cVar) {
        View[] a = m126777a(view, viewGroup);
        int visibility = view.getVisibility();
        if (visibility != 0) {
            view.setVisibility(0);
        }
        view.invalidate();
        viewGroup.invalidate();
        R a2 = cVar.mo60606a(viewGroup);
        if (visibility != 0) {
            view.setVisibility(visibility);
        }
        m126776a(viewGroup, a);
        return a2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C39618j mo98751a(int i, int i2, View view, View view2, int i3, int i4) throws Exception {
        if (i == 0) {
            i = C35563c.f93254q.getVideoWidth();
        }
        if (i2 == 0) {
            i2 = C35563c.f93254q.getVideoHeight();
        }
        ViewGroup viewGroup = (ViewGroup) view;
        return new C39618j((Bitmap) m126775a(viewGroup, view2, new C39617i(i, i2, i3, i4)), Integer.valueOf(viewGroup.indexOfChild(view2)));
    }

    /* renamed from: b */
    private C1592h<C39613e> m126778b(View view, View view2, String str, int i, int i2, int i3, int i4) {
        View view3 = view;
        String str2 = str;
        String a = mo98725a(str, ((ViewGroup) view2).indexOfChild(view));
        File file = new File(a);
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    C42973bg.m136431c(a);
                } else {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
        C7276d.m22803a(a, true);
        return m126779c(view, view2, a, i, i2, i3, i4);
    }

    /* renamed from: c */
    private C1592h<C39613e> m126779c(View view, View view2, String str, int i, int i2, int i3, int i4) {
        C39615g gVar = new C39615g(this, i, i2, view2, view, i3, i4);
        String str2 = str;
        return C1592h.m7855a((Callable<TResult>) gVar, C1592h.f5958b).mo6886c(new C39616h(this, str), C1592h.f5957a);
    }

    /* renamed from: a */
    public final C1592h<C39613e> mo98749a(View view, View view2, String str, int i, int i2, int i3, int i4) {
        if (view != null && view2 != null && !TextUtils.isEmpty(str)) {
            return m126778b(view, view2, str, i, i2, i3, i4);
        }
        StringBuilder sb = new StringBuilder("stickerView = ");
        sb.append(view);
        sb.append(", stickerLayout = ");
        sb.append(view2);
        sb.append("draftDir = ");
        sb.append(str);
        return C1592h.m7850a((Exception) new NullPointerException(sb.toString()));
    }
}
