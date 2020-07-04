package com.p280ss.android.ugc.aweme.choosemusic.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.choosemusic.p1088b.C23846d;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter */
public class MusicSheetAdapter extends BaseAdapter<MusicCollectionItem> {

    /* renamed from: a */
    public C23846d f62941a;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter$MusicSheetViewHolder */
    class MusicSheetViewHolder extends C1293v {

        /* renamed from: b */
        private MusicCollectionItem f62943b;
        RemoteImageView mMusicSheetCover;
        TextView mMusicSheetName;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo61898a(View view) {
            if (MusicSheetAdapter.this.f62941a != null) {
                MusicSheetAdapter.this.f62941a.mo61925a(this.f62943b, getLayoutPosition());
            }
        }

        /* renamed from: a */
        public final void mo61899a(MusicCollectionItem musicCollectionItem) {
            if (musicCollectionItem != null) {
                this.f62943b = musicCollectionItem;
                C23323e.m76524b(this.mMusicSheetCover, musicCollectionItem.cover);
                this.mMusicSheetName.setText(musicCollectionItem.mcName);
            }
        }

        MusicSheetViewHolder(View view) {
            super(view);
            ButterKnife.bind((Object) this, view);
            this.itemView.setOnClickListener(new C23842h(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.adapter.MusicSheetAdapter$MusicSheetViewHolder_ViewBinding */
    public class MusicSheetViewHolder_ViewBinding implements Unbinder {

        /* renamed from: a */
        private MusicSheetViewHolder f62944a;

        public void unbind() {
            MusicSheetViewHolder musicSheetViewHolder = this.f62944a;
            if (musicSheetViewHolder != null) {
                this.f62944a = null;
                musicSheetViewHolder.mMusicSheetCover = null;
                musicSheetViewHolder.mMusicSheetName = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }

        public MusicSheetViewHolder_ViewBinding(MusicSheetViewHolder musicSheetViewHolder, View view) {
            this.f62944a = musicSheetViewHolder;
            musicSheetViewHolder.mMusicSheetCover = (RemoteImageView) Utils.findRequiredViewAsType(view, R.id.c1w, "field 'mMusicSheetCover'", RemoteImageView.class);
            musicSheetViewHolder.mMusicSheetName = (TextView) Utils.findRequiredViewAsType(view, R.id.c1x, "field 'mMusicSheetName'", TextView.class);
        }
    }

    /* renamed from: b */
    private MusicCollectionItem m78092b(int i) {
        if (C6307b.m19566a((Collection<T>) this.f67539l) || i < 0 || i >= this.f67539l.size()) {
            return null;
        }
        return (MusicCollectionItem) this.f67539l.get(i);
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        ((MusicSheetViewHolder) vVar).mo61899a(m78092b(i));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        return new MusicSheetViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zn, viewGroup, false));
    }
}
