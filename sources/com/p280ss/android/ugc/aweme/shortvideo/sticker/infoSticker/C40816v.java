package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.v */
public final class C40816v {

    /* renamed from: a */
    public ProviderEffect f106146a;

    /* renamed from: b */
    public int f106147b;

    /* renamed from: c */
    public int f106148c;

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: b */
    private static int m130435b(ProviderEffect providerEffect) {
        if (m130434a(providerEffect)) {
            return 1;
        }
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f106146a.equals(((C40816v) obj).f106146a);
    }

    /* renamed from: a */
    public static List<C40816v> m130433a(List<ProviderEffect> list) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (ProviderEffect providerEffect : list) {
            arrayList.add(new C40816v(providerEffect, m130435b(providerEffect)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m130434a(ProviderEffect providerEffect) {
        if (providerEffect != null && TextUtils.isEmpty(providerEffect.path)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C35574k.m114861b().getFilesDir());
            sb.append(File.separator);
            sb.append("effect");
            sb.append(File.separator);
            sb.append(providerEffect.f113502id);
            sb.append(".gif");
            providerEffect.path = sb.toString();
        }
        if (providerEffect == null || !C7276d.m22812b(providerEffect.path)) {
            return false;
        }
        return true;
    }

    private C40816v(ProviderEffect providerEffect, int i) {
        this.f106146a = providerEffect;
        this.f106147b = i;
    }
}
