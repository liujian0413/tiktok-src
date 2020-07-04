package com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1615a;

import android.support.p022v4.util.C0902i;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.C40942b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1616b.C40943a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1616b.C40946b;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.tabguide.p1616b.C40946b.C40948b;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.a.a */
public final class C40939a implements C40941b<C0902i<EffectCategoryModel, Object>> {

    /* renamed from: a */
    public static final C40940a f106449a = new C40940a(null);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.tabguide.a.a$a */
    public static final class C40940a {
        private C40940a() {
        }

        /* renamed from: a */
        public static C40941b<C0902i<EffectCategoryModel, Object>> m130785a() {
            return new C40939a<>(null);
        }

        public /* synthetic */ C40940a(C7571f fVar) {
            this();
        }
    }

    private C40939a() {
    }

    public /* synthetic */ C40939a(C7571f fVar) {
        this();
    }

    /* renamed from: a */
    private static UrlModel m130782a(List<String> list) {
        boolean z;
        if (list == null) {
            return null;
        }
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            CharSequence charSequence = (String) next;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        if (list2.isEmpty()) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(list2);
        return urlModel;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C40946b mo101228a(C0902i<EffectCategoryModel, Object> iVar) {
        EffectCategoryModel effectCategoryModel;
        List list;
        boolean z;
        C40942b bVar = null;
        if (iVar != null) {
            effectCategoryModel = (EffectCategoryModel) iVar.f3154a;
        } else {
            effectCategoryModel = null;
        }
        if (iVar != null) {
            list = iVar.f3155b;
        } else {
            list = null;
        }
        if (!(list instanceof List)) {
            list = null;
        }
        UrlModel a = m130782a(list);
        if (iVar == null || effectCategoryModel == null || a == null) {
            return new C40948b();
        }
        CharSequence charSequence = effectCategoryModel.extra;
        boolean z2 = false;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            bVar = (C40942b) C35574k.m114859a().mo70085S().mo15974a(effectCategoryModel.extra, C40942b.class);
        }
        if (bVar != null) {
            CharSequence charSequence2 = bVar.f106450a;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return new C40943a(bVar, a);
            }
        }
        return new C40948b();
    }
}
