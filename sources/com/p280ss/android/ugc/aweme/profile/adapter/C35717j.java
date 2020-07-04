package com.p280ss.android.ugc.aweme.profile.adapter;

import android.arch.lifecycle.C0043i;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.C11713f;
import com.bytedance.jedi.ext.adapter.multitype.C11737b;
import com.bytedance.jedi.ext.adapter.multitype.C11738c;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import com.bytedance.jedi.ext.adapter.multitype.C11743d.C11744a;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.j */
public final class C35717j implements C11737b<MediaMixListViewHolder, C11738c<MediaMixListViewHolder>> {

    /* renamed from: a */
    public final C11713f<MediaMixListViewHolder> f93668a = new C11713f<>(this.f93669b);

    /* renamed from: b */
    public final C0043i f93669b;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.j$a */
    static final class C35719a extends Lambda implements C7562b<MediaMixListState, MediaMixListState> {

        /* renamed from: a */
        final /* synthetic */ MediaMixList f93671a;

        C35719a(MediaMixList mediaMixList) {
            this.f93671a = mediaMixList;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MediaMixListState invoke(MediaMixListState mediaMixListState) {
            C7573i.m23587b(mediaMixListState, "$receiver");
            return MediaMixListState.copy$default(mediaMixListState, null, null, null, this.f93671a, null, 23, null);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C11738c mo29202b() {
        return this.f93668a;
    }

    public C35717j(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        this.f93669b = iVar;
        C11744a.m34438a((C11743d) this.f93668a, (C7562b) null, (C7563m) null, (C7562b) C357181.f93670a, 3, (Object) null);
    }

    /* renamed from: a */
    public final MediaMixListViewHolder mo90562a(ViewGroup viewGroup, MediaMixList mediaMixList) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(mediaMixList, "mediaMixList");
        MediaMixListViewHolder mediaMixListViewHolder = (MediaMixListViewHolder) this.f93668a.mo29313a(viewGroup, this.f93668a.mo29318b(0));
        mediaMixListViewHolder.f93613p = mediaMixList;
        return mediaMixListViewHolder;
    }

    /* renamed from: a */
    public final void mo90563a(MediaMixListViewHolder mediaMixListViewHolder, int i, MediaMixList mediaMixList, String str, String str2, String str3) {
        C7573i.m23587b(mediaMixListViewHolder, "holder");
        C7573i.m23587b(mediaMixList, "mediaMixList");
        if (mediaMixListViewHolder.f93613p != mediaMixList) {
            mediaMixListViewHolder.mo62390p().mo93122f(new C35719a(mediaMixList));
        }
        mediaMixListViewHolder.f93612o = str;
        if (str2 == null) {
            str2 = "";
        }
        mediaMixListViewHolder.mo90550a(str2);
        if (str3 == null) {
            str3 = "";
        }
        mediaMixListViewHolder.mo90551b(str3);
        C11713f.m34422a(mediaMixListViewHolder, C7581n.f20898a, i, null);
    }
}
