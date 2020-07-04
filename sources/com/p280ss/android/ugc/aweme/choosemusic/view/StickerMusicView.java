package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23820a;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.StickerMusicView */
public class StickerMusicView extends ItemWidgetViewHolder {

    /* renamed from: b */
    public boolean f63294b;

    /* renamed from: c */
    private Context f63295c;

    /* renamed from: d */
    private List<MusicItemViewHolder> f63296d = new ArrayList();

    /* renamed from: e */
    private int f63297e;

    /* renamed from: f */
    private C23819a f63298f;
    LinearLayout mLlMusicContainer;
    TextView mTvwContent;
    LinearLayout mVgContainer;
    View mVwDivider;

    /* renamed from: a */
    public final void mo62155a(C23820a aVar) {
        CollectionType collectionType;
        if (!C6307b.m19566a((Collection<T>) this.f63296d)) {
            for (MusicItemViewHolder musicItemViewHolder : this.f63296d) {
                if (m78629a(musicItemViewHolder, aVar.f62882e)) {
                    MusicModel musicModel = musicItemViewHolder.f63382c;
                    if (aVar.f62881d == 1) {
                        collectionType = CollectionType.COLLECTED;
                    } else {
                        collectionType = CollectionType.NOT_COLLECTED;
                    }
                    musicModel.setCollectionType(collectionType);
                    musicItemViewHolder.mo62217d();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62153a(int i, int i2) {
        if (i >= 0 && i < this.f63296d.size()) {
            ((MusicItemViewHolder) this.f63296d.get(i)).mo62214a(false, false);
        }
    }

    /* renamed from: a */
    private static boolean m78629a(MusicItemViewHolder musicItemViewHolder, MusicModel musicModel) {
        if (musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || musicItemViewHolder.f63382c == null || !musicModel.getMusicId().equals(musicItemViewHolder.f63382c.getMusicId())) {
            return false;
        }
        return true;
    }

    public StickerMusicView(View view, int i) {
        super(view);
        this.f63295c = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f63297e = i;
        this.mTvwContent.getPaint().setFakeBoldText(true);
        if (C6399b.m19944t()) {
            float b = C9738o.m28708b(this.f63295c, 16.0f);
            this.mVgContainer.setPadding(0, 0, 0, 0);
            this.mVgContainer.setBackgroundColor(0);
            ((MarginLayoutParams) this.mVgContainer.getLayoutParams()).rightMargin = 0;
            this.mVgContainer.requestLayout();
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mTvwContent.getLayoutParams();
            marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) + b);
            ((MarginLayoutParams) this.mVwDivider.getLayoutParams()).rightMargin = (int) b;
            this.mVwDivider.setVisibility(0);
        }
        this.f63298f = new C23819a("change_music_page", "attached_song", "", C23888c.m78180a());
        this.f63298f.f62871b = "prop";
    }

    /* renamed from: a */
    public final void mo62154a(int i, boolean z) {
        if (i >= 0 && i < this.f63296d.size()) {
            ((MusicItemViewHolder) this.f63296d.get(i)).mo62214a(z, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ba  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62156a(java.util.List<com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel> r18, int r19, int r20, boolean r21, java.lang.String r22, com.p280ss.android.ugc.aweme.choosemusic.view.C23963h r23, com.p280ss.android.ugc.aweme.music.adapter.C33746f<com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c> r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r0.f63294b
            if (r2 == 0) goto L_0x0011
            android.widget.TextView r2 = r0.mTvwContent
            r3 = 2131826121(0x7f1115c9, float:1.9285117E38)
            r2.setText(r3)
            goto L_0x0024
        L_0x0011:
            if (r21 == 0) goto L_0x001c
            android.widget.TextView r2 = r0.mTvwContent
            r3 = 2131825325(0x7f1112ad, float:1.9283503E38)
            r2.setText(r3)
            goto L_0x0024
        L_0x001c:
            android.widget.TextView r2 = r0.mTvwContent
            r3 = 2131826122(0x7f1115ca, float:1.928512E38)
            r2.setText(r3)
        L_0x0024:
            int r2 = r18.size()
            android.widget.LinearLayout r3 = r0.mLlMusicContainer
            int r3 = r3.getChildCount()
            int r2 = r2 - r3
            com.ss.android.ugc.aweme.choosemusic.a r3 = r0.f63298f
            r4 = r22
            r3.f62875f = r4
            android.content.Context r3 = r0.f63295c
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r4 = 0
            r5 = 0
        L_0x003d:
            if (r5 >= r2) goto L_0x006b
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r6 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder
            r7 = 2131493840(0x7f0c03d0, float:1.8611172E38)
            android.widget.LinearLayout r8 = r0.mLlMusicContainer
            android.view.View r7 = r3.inflate(r7, r8, r4)
            int r8 = r0.f63297e
            r6.<init>(r7, r8)
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r7 = r0.f63296d
            r7.add(r6)
            boolean r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r7 != 0) goto L_0x005e
            r6.mo62215b()
            goto L_0x0061
        L_0x005e:
            r6.mo62216c()
        L_0x0061:
            android.widget.LinearLayout r7 = r0.mLlMusicContainer
            android.view.View r6 = r6.itemView
            r7.addView(r6)
            int r5 = r5 + 1
            goto L_0x003d
        L_0x006b:
            r2 = 0
        L_0x006c:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f63296d
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x00c3
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f63296d
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r3 = (com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r3
            java.lang.Object r5 = r1.get(r2)
            r7 = r5
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = (com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel) r7
            java.lang.String r8 = ""
            r9 = 0
            r5 = -2
            r15 = 1
            r14 = r19
            if (r5 != r14) goto L_0x0092
            r5 = r20
            if (r2 != r5) goto L_0x0094
            r10 = 1
            goto L_0x0095
        L_0x0092:
            r5 = r20
        L_0x0094:
            r10 = 0
        L_0x0095:
            r11 = 0
            r12 = 0
            r13 = 0
            com.ss.android.ugc.aweme.choosemusic.a r6 = r0.f63298f
            r16 = r6
            r6 = r3
            r14 = r2
            r4 = 1
            r15 = r16
            r6.mo62211a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r6 = r23
            r7 = r24
            r3.mo62210a(r6, r7)
            java.lang.Object r3 = r1.get(r2)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = (com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel) r3
            com.ss.android.ugc.aweme.choosemusic.a r8 = r0.f63298f
            if (r3 == 0) goto L_0x00ba
            java.lang.String r3 = r3.getMusicId()
            goto L_0x00bc
        L_0x00ba:
            java.lang.String r3 = ""
        L_0x00bc:
            com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c.m78185a(r8, r3, r2, r4)
            int r2 = r2 + 1
            r4 = 0
            goto L_0x006c
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.view.StickerMusicView.mo62156a(java.util.List, int, int, boolean, java.lang.String, com.ss.android.ugc.aweme.choosemusic.view.h, com.ss.android.ugc.aweme.music.adapter.f):void");
    }
}
