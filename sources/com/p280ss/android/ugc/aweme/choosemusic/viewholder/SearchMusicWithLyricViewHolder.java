package com.p280ss.android.ugc.aweme.choosemusic.viewholder;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23890e;
import com.p280ss.android.ugc.aweme.discover.model.Position;
import com.p280ss.android.ugc.aweme.music.experiment.MusicSearchCardExperiment;
import com.p280ss.android.ugc.aweme.music.p1406ab.C33703a;
import com.p280ss.android.ugc.aweme.music.p1410ui.p1411a.C33918d;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.utils.C43109eu;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.viewholder.SearchMusicWithLyricViewHolder */
public class SearchMusicWithLyricViewHolder extends MusicItemViewHolder {
    TextView mTvLyric;

    public SearchMusicWithLyricViewHolder(View view, int i) {
        super(view, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62213a(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        if (!TextUtils.isEmpty(this.f63382c.getName())) {
            this.mTvMusicName.setText(this.f63382c.getName());
            z = true;
        }
        if (!z) {
            this.mTvMusicName.setTextColor(this.f63381b.getResources().getColor(R.color.a6n));
            TextView textView = this.mTvMusicName;
            if (!TextUtils.isEmpty(this.f63382c.getName())) {
                str4 = this.f63382c.getName();
            } else {
                str4 = "";
            }
            textView.setText(str4);
        }
        if (!C6399b.m19944t()) {
            this.mTvMusicName.getPaint().setFakeBoldText(true);
        }
        if (TextUtils.isEmpty(this.f63382c.getName()) || !this.f63382c.isOriginal()) {
            this.mOriginalTag.setVisibility(8);
        } else {
            this.mOriginalTag.setVisibility(0);
        }
        C33918d.f88507a.mo86581a(this.mTvMusicName, this.f63382c.getMusic(), true);
        TextView textView2 = this.mTvMusicSinger;
        if (TextUtils.isEmpty(this.f63382c.getSinger())) {
            str2 = this.f63381b.getString(R.string.fjo);
        } else {
            str2 = this.f63382c.getSinger();
        }
        textView2.setText(str2);
        m78697a(this.mIvMusicCover, this.f63382c);
        if (this.f63382c.getMusicType() == MusicType.LOCAL) {
            str3 = this.f63382c.getLocalMusicDuration();
        } else if (C33703a.m108723g()) {
            str3 = C43109eu.m136730a(this.f63382c.getPresenterDuration());
        } else {
            str3 = C43109eu.m136730a(this.f63382c.getDuration());
        }
        String a = C23890e.m78223a((long) this.f63382c.getUserCount());
        this.mTvMusicDuration.setText(this.f63381b.getResources().getString(R.string.ch8, new Object[]{str3, a}));
        int a2 = C6384b.m19835a().mo15287a(MusicSearchCardExperiment.class, true, "music_card_style", C6384b.m19835a().mo15295d().music_card_style, 0);
        if (a2 == 0 || a2 == 2) {
            this.mTvLyric.setVisibility(8);
        } else if (TextUtils.isEmpty(this.f63382c.getLyricShort())) {
            this.mTvLyric.setVisibility(8);
        } else {
            this.mTvLyric.setVisibility(0);
            this.mTvLyric.setText(m78747a(this.f63381b, this.f63381b.getResources().getString(R.string.c77, new Object[]{this.f63382c.getLyricShort()}), this.f63382c.getLyricShortPosition(), 3, R.color.wl));
        }
    }

    /* renamed from: a */
    private static SpannableString m78748a(SpannableString spannableString, int i, int i2, int i3) {
        int max = Math.max(0, i);
        if (TextUtils.isEmpty(spannableString) || max > i2 || max >= spannableString.length() || i2 > spannableString.length()) {
            return spannableString;
        }
        spannableString.setSpan(new ForegroundColorSpan(i3), max, i2, 17);
        return spannableString;
    }

    /* renamed from: a */
    private static SpannableString m78747a(Context context, String str, List<Position> list, int i, int i2) {
        if (str == null) {
            str = "";
        }
        if (context == null || TextUtils.isEmpty(str) || C6307b.m19566a((Collection<T>) list)) {
            return new SpannableString(str);
        }
        SpannableString spannableString = new SpannableString(str);
        int color = context.getResources().getColor(R.color.wl);
        for (Position position : list) {
            if (position != null) {
                spannableString = m78748a(spannableString, position.getBegin() + 3, position.getEnd() + 3, color);
            }
        }
        return spannableString;
    }
}
