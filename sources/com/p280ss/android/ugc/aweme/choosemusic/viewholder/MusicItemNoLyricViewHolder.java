package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.content.Context;
import android.graphics.Color;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.choosemusic.C23819a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33918d;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.utils.C43012cg;
import com.p280ss.android.ugc.aweme.utils.C43109eu;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemNoLyricViewHolder */
public class MusicItemNoLyricViewHolder extends C1293v {

    /* renamed from: a */
    public MusicModel f63373a;

    /* renamed from: b */
    public int f63374b;

    /* renamed from: c */
    private Context f63375c;

    /* renamed from: d */
    private boolean f63376d;

    /* renamed from: e */
    private boolean f63377e;
    SmartImageView mIvMusicCover;
    ImageView mIvMusicMark;
    ImageView mIvMusicMask2;
    ImageView mOriginalTag;
    TextView mTvMusicDuration;
    TextView mTvMusicName;
    TextView mTvMusicSinger;
    TextView mTvNotSupportLyric;

    /* renamed from: a */
    private static int m78689a(int i) {
        switch (i) {
            case 0:
                return R.drawable.b7r;
            case 1:
                return R.drawable.b7v;
            case 2:
                return R.drawable.b7w;
            case 3:
                return R.drawable.b7x;
            case 4:
                return R.drawable.b7y;
            case 5:
                return R.drawable.b7z;
            case 6:
                return R.drawable.b80;
            case 7:
                return R.drawable.b81;
            case 8:
                return R.drawable.b82;
            case 9:
                return R.drawable.b7s;
            case 10:
                return R.drawable.b7t;
            case 11:
                return R.drawable.b7u;
            default:
                return 0;
        }
    }

    public MusicItemNoLyricViewHolder(View view) {
        super(view);
        this.f63375c = view.getContext();
        ButterKnife.bind((Object) this, view);
    }

    /* renamed from: a */
    private static void m78690a(SmartImageView smartImageView, MusicModel musicModel) {
        smartImageView.post(new C24005b(musicModel, smartImageView));
    }

    /* renamed from: a */
    static final /* synthetic */ void m78691a(MusicModel musicModel, SmartImageView smartImageView) {
        if (musicModel != null) {
            C12139r rVar = null;
            if (musicModel.getMusic() != null) {
                if (musicModel.getMusic().getCoverMedium() != null) {
                    rVar = C12133n.m35299a(C23400r.m76741a(musicModel.getMusic().getCoverMedium()));
                } else if (musicModel.getMusic().getCoverLarge() != null) {
                    rVar = C12133n.m35299a(C23400r.m76741a(musicModel.getMusic().getCoverLarge()));
                }
            }
            if (rVar == null) {
                if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
                    rVar = C12133n.m35301a(musicModel.getPicPremium());
                } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
                    rVar = C12133n.m35301a(musicModel.getPicBig());
                } else {
                    rVar = C12133n.m35298a((int) R.drawable.a61);
                }
            }
            if (smartImageView.getMeasuredHeight() > 0 && smartImageView.getMeasuredWidth() > 0) {
                rVar.mo29836a(smartImageView.getMeasuredWidth(), smartImageView.getMeasuredHeight());
            }
            rVar.mo29853b(C43012cg.m136513a(301)).mo29845a("MusicItem").mo29844a((C12128i) smartImageView).mo29848a();
        }
    }

    /* renamed from: a */
    private void m78693a(String str, boolean z) {
        String str2;
        String str3;
        if (!TextUtils.isEmpty(this.f63373a.getName())) {
            this.mTvMusicName.setText(this.f63373a.getName());
            z = true;
        }
        if (!z) {
            this.mTvMusicName.setTextColor(this.f63375c.getResources().getColor(R.color.a6n));
            TextView textView = this.mTvMusicName;
            if (!TextUtils.isEmpty(this.f63373a.getName())) {
                str3 = this.f63373a.getName();
            } else {
                str3 = "";
            }
            textView.setText(str3);
        }
        if (!C6399b.m19944t()) {
            this.mTvMusicName.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(this.f63373a.getName()) || !this.f63373a.isOriginal()) {
            this.mOriginalTag.setVisibility(8);
        } else {
            this.mOriginalTag.setVisibility(0);
        }
        C33918d.f88507a.mo86581a(this.mTvMusicName, this.f63373a.getMusic(), true);
        TextView textView2 = this.mTvMusicSinger;
        if (TextUtils.isEmpty(this.f63373a.getSinger())) {
            str2 = this.f63375c.getString(R.string.fjo);
        } else {
            str2 = this.f63373a.getSinger();
        }
        textView2.setText(str2);
        m78690a(this.mIvMusicCover, this.f63373a);
        if (this.f63373a.getMusicType() == MusicType.LOCAL) {
            this.mTvMusicDuration.setText(this.f63373a.getLocalMusicDuration());
        } else {
            this.mTvMusicDuration.setText(C43109eu.m136730a(this.f63373a.getDuration()));
        }
        if (this.f63377e) {
            this.mTvMusicName.setTextColor(Color.parseColor("#73ffffff"));
            this.mTvMusicSinger.setTextColor(Color.parseColor("#40ffffff"));
            this.mTvMusicDuration.setTextColor(Color.parseColor("#40ffffff"));
            this.mIvMusicMask2.setVisibility(0);
            this.mTvNotSupportLyric.setTextColor(Color.parseColor("#40ffffff"));
        }
    }

    /* renamed from: a */
    private void m78692a(MusicModel musicModel, String str, boolean z, boolean z2, int i) {
        this.f63373a = musicModel;
        m78693a(str, false);
        if (!this.f63376d || this.f63374b >= 12) {
            this.mIvMusicMark.setVisibility(8);
            return;
        }
        this.mIvMusicMark.setVisibility(0);
        int a = m78689a(this.f63374b);
        if (a > 0) {
            if (this.f63374b < 3) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.mIvMusicMark.getLayoutParams();
                marginLayoutParams.topMargin = (int) C9738o.m28708b(this.mIvMusicMark.getContext(), 0.0f);
                marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
            } else {
                MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.mIvMusicMark.getLayoutParams();
                marginLayoutParams2.topMargin = (int) C9738o.m28708b(this.mIvMusicMark.getContext(), 2.0f);
                marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
            }
            this.mIvMusicMark.setImageResource(a);
        }
    }

    /* renamed from: a */
    public final void mo62208a(MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, int i, int i2, int i3, C23819a aVar, boolean z4) {
        if (musicModel != null) {
            this.f63376d = z;
            this.f63374b = i3;
            this.f63377e = z4;
            m78692a(musicModel, str, z2, false, 0);
        }
    }
}
