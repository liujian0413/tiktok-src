package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1613vh.VoteUserViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.adapter.VoteUserAdapter */
public final class VoteUserAdapter extends RecyclerHeaderViewAdapter<User> {
    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        if (vVar != null) {
            VoteUserViewHolder voteUserViewHolder = (VoteUserViewHolder) vVar;
            Object obj = mo62312a().get(i);
            C7573i.m23582a(obj, "data[position]");
            voteUserViewHolder.mo100990a((User) obj);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.vh.VoteUserViewHolder");
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            C7573i.m23580a();
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b4r, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…user_item, parent, false)");
        return new VoteUserViewHolder(inflate);
    }
}
