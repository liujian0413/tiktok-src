package com.p280ss.android.ugc.aweme.favorites.adapter;

import android.arch.lifecycle.C0043i;
import android.view.ViewGroup;
import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseSingleTypeAdapter;
import com.p280ss.android.ugc.aweme.favorites.viewholder.MediaMixViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.MediaMixListAdapter */
public final class MediaMixListAdapter extends JediBaseSingleTypeAdapter<MixStruct> {
    public MediaMixListAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "parent");
        super(iVar, null, null, 6, null);
    }

    /* renamed from: a */
    public final JediViewHolder<? extends C11501d, MixStruct> mo60559a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        return new MediaMixViewHolder<>(viewGroup);
    }
}
