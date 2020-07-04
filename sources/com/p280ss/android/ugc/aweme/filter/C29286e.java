package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabItemView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTabLayout.C42107a;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.filter.e */
public final class C29286e {
    /* renamed from: a */
    public static List<C29296g> m96049a(Map<EffectCategoryResponse, List<C29296g>> map) {
        ArrayList arrayList = new ArrayList();
        for (Entry value : map.entrySet()) {
            boolean z = false;
            for (C29296g add : (List) value.getValue()) {
                arrayList.add(add);
                z = true;
            }
            if (z) {
                C29296g gVar = new C29296g();
                gVar.f77267b = "LINE";
                gVar.f77266a = -1;
                arrayList.add(gVar);
            }
        }
        if (arrayList.size() > 0 && ((C29296g) arrayList.get(arrayList.size() - 1)).f77267b.equals("LINE")) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m96047a(BaseAdapter<C29296g> baseAdapter, int i) {
        if (baseAdapter == null) {
            return 0;
        }
        List a = baseAdapter.mo62312a();
        int i2 = 0;
        for (int i3 = 0; i3 < a.size(); i3++) {
            if (i == i2) {
                return i3;
            }
            if (((C29296g) a.get(i3)).f77267b.equals("LINE")) {
                i2++;
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static int m96050b(BaseAdapter<C29296g> baseAdapter, int i) {
        int i2 = 0;
        if (baseAdapter == null) {
            return 0;
        }
        List a = baseAdapter.mo62312a();
        int i3 = 0;
        while (i2 < a.size() && i2 < i) {
            if (((C29296g) a.get(i2)).f77267b.equals("LINE")) {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: c */
    public static int m96051c(BaseAdapter<C29296g> baseAdapter, int i) {
        int i2 = 0;
        if (baseAdapter == null) {
            return 0;
        }
        List a = baseAdapter.mo62312a();
        int i3 = 0;
        while (i2 < a.size() && i2 < i) {
            if (((C29296g) a.get(i2)).f77267b.equals("LINE")) {
                i3++;
            }
            i2++;
        }
        return i3;
    }

    /* renamed from: a */
    public static View m96048a(Context context, int i, EffectCategoryResponse effectCategoryResponse, C29240bc bcVar) {
        final AVDmtTabItemView a = C42107a.m134028a(context);
        a.mo103521a();
        if (TextUtils.isEmpty(effectCategoryResponse.icon_normal_url)) {
            a.setText(effectCategoryResponse.name);
        } else {
            a.mo103523a(effectCategoryResponse.icon_normal_url, 0);
        }
        if (!(bcVar == null || i == 0)) {
            bcVar.mo74869a(effectCategoryResponse.f113500id, effectCategoryResponse.tags, effectCategoryResponse.tagsUpdateTime, new C43765o() {
                /* renamed from: a */
                public final void mo9278a() {
                    a.mo103525b(true);
                }

                /* renamed from: b */
                public final void mo9279b() {
                    a.mo103525b(false);
                }
            });
        }
        return a;
    }
}
