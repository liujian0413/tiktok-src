package com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import com.bytedance.apm.util.C9653q;
import com.p280ss.android.ugc.aweme.filter.C29263bs;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.viewmodel.UrlPrefixViewModel */
public final class UrlPrefixViewModel extends C0063u {

    /* renamed from: a */
    public final C0052o<C29263bs<String, String>> f106559a = new C0052o<>();

    /* renamed from: a */
    public final void mo101308a(String str, List<String> list) {
        C7573i.m23587b(str, "key");
        if (list != null) {
            C29263bs bsVar = (C29263bs) this.f106559a.getValue();
            if (bsVar == null) {
                bsVar = C29263bs.m95998c();
            }
            C7573i.m23582a((Object) bsVar, "mUrlPrefix.value ?: SpecializedMultimap.create()");
            bsVar.removeAll((Object) str);
            bsVar.putAll(str, list);
            if (C9653q.m28546a()) {
                this.f106559a.setValue(bsVar);
            } else {
                this.f106559a.postValue(bsVar);
            }
        }
    }
}
