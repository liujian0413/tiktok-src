package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C1642a;
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
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView */
public class ChallengeMusicView extends ItemWidgetViewHolder {

    /* renamed from: b */
    int f63269b;

    /* renamed from: c */
    C23819a f63270c;

    /* renamed from: d */
    private Context f63271d;

    /* renamed from: e */
    private List<MusicItemViewHolder> f63272e = new ArrayList();
    LinearLayout mLlMusicContainer;
    TextView mTvwContent;
    LinearLayout mVgContainer;
    View mVwDivider;

    /* renamed from: a */
    public final void mo62117a(C23820a aVar) {
        CollectionType collectionType;
        if (!C6307b.m19566a((Collection<T>) this.f63272e)) {
            for (MusicItemViewHolder musicItemViewHolder : this.f63272e) {
                if (m78597a(musicItemViewHolder, aVar.f62882e)) {
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
    public final void mo62119a(final String str) {
        String str2;
        SpannableString spannableString;
        int measuredWidth = this.mTvwContent.getMeasuredWidth();
        if (measuredWidth == 0) {
            this.mTvwContent.post(new Runnable() {
                public final void run() {
                    ChallengeMusicView.this.mo62119a(str);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(str);
        String sb2 = sb.toString();
        TextPaint paint = this.mTvwContent.getPaint();
        String string = this.f63271d.getString(R.string.dbw);
        float measureText = ((float) measuredWidth) - paint.measureText(string.replace("%s", ""));
        if (paint.measureText(sb2) > measureText) {
            str2 = C1642a.m8034a(string, new Object[]{TextUtils.ellipsize(sb2, paint, measureText, TruncateAt.END)});
            spannableString = new SpannableString(str2);
        } else {
            str2 = C1642a.m8034a(string, new Object[]{sb2});
            spannableString = new SpannableString(str2);
        }
        spannableString.setSpan(new StyleSpan(1), string.indexOf("%s"), ((string.indexOf("%s") + 2) + str2.length()) - string.length(), 17);
        this.mTvwContent.setText(spannableString);
    }

    /* renamed from: a */
    public final void mo62115a(int i, int i2) {
        if (i >= 0 && i < this.f63272e.size()) {
            ((MusicItemViewHolder) this.f63272e.get(i)).mo62214a(false, false);
        }
    }

    /* renamed from: a */
    private static boolean m78597a(MusicItemViewHolder musicItemViewHolder, MusicModel musicModel) {
        if (musicModel == null || TextUtils.isEmpty(musicModel.getMusicId()) || musicItemViewHolder.f63382c == null || !musicModel.getMusicId().equals(musicItemViewHolder.f63382c.getMusicId())) {
            return false;
        }
        return true;
    }

    public ChallengeMusicView(View view, int i) {
        super(view);
        this.f63271d = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f63269b = i;
        if (C6399b.m19944t()) {
            float b = C9738o.m28708b(this.f63271d, 16.0f);
            this.mVgContainer.setPadding(0, 0, 0, 0);
            this.mVgContainer.setBackgroundColor(0);
            ((MarginLayoutParams) this.mVgContainer.getLayoutParams()).rightMargin = 0;
            this.mVgContainer.requestLayout();
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mTvwContent.getLayoutParams();
            marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) + b);
            ((MarginLayoutParams) this.mVwDivider.getLayoutParams()).rightMargin = (int) b;
            this.mVwDivider.setVisibility(0);
        }
        this.f63270c = new C23819a("change_music_page", "attached_song", "", C23888c.m78180a());
    }

    /* renamed from: a */
    public final void mo62116a(int i, boolean z) {
        if (i >= 0 && i < this.f63272e.size()) {
            ((MusicItemViewHolder) this.f63272e.get(i)).mo62214a(z, true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo62118a(com.p280ss.android.ugc.aweme.discover.model.Challenge r18, java.util.List<com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel> r19, int r20, int r21, java.lang.String r22, com.p280ss.android.ugc.aweme.choosemusic.view.C23963h r23, com.p280ss.android.ugc.aweme.music.adapter.C33746f<com.p280ss.android.ugc.aweme.choosemusic.p1087a.C23822c> r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            if (r18 != 0) goto L_0x0007
            return
        L_0x0007:
            android.content.Context r3 = r0.f63271d
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            java.lang.String r2 = r18.getChallengeName()
            r0.mo62119a(r2)
            com.ss.android.ugc.aweme.choosemusic.a r2 = r0.f63270c
            r4 = r22
            r2.f62876g = r4
            int r2 = r19.size()
            android.widget.LinearLayout r4 = r0.mLlMusicContainer
            int r4 = r4.getChildCount()
            int r2 = r2 - r4
            r4 = 0
            r5 = 0
        L_0x0027:
            if (r5 >= r2) goto L_0x0055
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r6 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder
            r7 = 2131493840(0x7f0c03d0, float:1.8611172E38)
            android.widget.LinearLayout r8 = r0.mLlMusicContainer
            android.view.View r7 = r3.inflate(r7, r8, r4)
            int r8 = r0.f63269b
            r6.<init>(r7, r8)
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r7 = r0.f63272e
            r7.add(r6)
            boolean r7 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r7 != 0) goto L_0x0048
            r6.mo62215b()
            goto L_0x004b
        L_0x0048:
            r6.mo62216c()
        L_0x004b:
            android.widget.LinearLayout r7 = r0.mLlMusicContainer
            android.view.View r6 = r6.itemView
            r7.addView(r6)
            int r5 = r5 + 1
            goto L_0x0027
        L_0x0055:
            r2 = 0
        L_0x0056:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f63272e
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x00ad
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r3 = r0.f63272e
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r3 = (com.p280ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r3
            java.lang.Object r5 = r1.get(r2)
            r7 = r5
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7 = (com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel) r7
            java.lang.String r8 = ""
            r9 = 0
            r5 = -2
            r15 = 1
            r14 = r20
            if (r14 != r5) goto L_0x007c
            r5 = r21
            if (r2 != r5) goto L_0x007e
            r10 = 1
            goto L_0x007f
        L_0x007c:
            r5 = r21
        L_0x007e:
            r10 = 0
        L_0x007f:
            r11 = 0
            r12 = 0
            r13 = 0
            com.ss.android.ugc.aweme.choosemusic.a r6 = r0.f63270c
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
            com.ss.android.ugc.aweme.choosemusic.a r8 = r0.f63270c
            if (r3 == 0) goto L_0x00a4
            java.lang.String r3 = r3.getMusicId()
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r3 = ""
        L_0x00a6:
            com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c.m78185a(r8, r3, r2, r4)
            int r2 = r2 + 1
            r4 = 0
            goto L_0x0056
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.mo62118a(com.ss.android.ugc.aweme.discover.model.Challenge, java.util.List, int, int, java.lang.String, com.ss.android.ugc.aweme.choosemusic.view.h, com.ss.android.ugc.aweme.music.adapter.f):void");
    }
}
