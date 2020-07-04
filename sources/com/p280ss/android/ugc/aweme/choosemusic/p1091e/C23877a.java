package com.p280ss.android.ugc.aweme.choosemusic.p1091e;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a */
public final class C23877a extends PopupWindow {

    /* renamed from: a */
    private final Runnable f63017a = new C23878a(this);

    /* renamed from: b */
    private final RemoteImageView f63018b;

    /* renamed from: c */
    private final View f63019c;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.e.a$a */
    static final class C23878a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C23877a f63020a;

        C23878a(C23877a aVar) {
            this.f63020a = aVar;
        }

        public final void run() {
            this.f63020a.dismiss();
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            C23879b.m78164a(this);
        }
    }

    /* renamed from: a */
    private void m78161a(long j) {
        this.f63019c.removeCallbacks(this.f63017a);
        this.f63019c.postDelayed(this.f63017a, 2000);
    }

    public C23877a(Context context) {
        C7573i.m23587b(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.agl, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…added_to_favorited, null)");
        this.f63019c = inflate;
        setContentView(this.f63019c);
        View findViewById = this.f63019c.findViewById(R.id.baf);
        C7573i.m23582a((Object) findViewById, "root.findViewById(R.id.iv_music_cover)");
        this.f63018b = (RemoteImageView) findViewById;
        setWidth(-2);
        setHeight(-2);
        setAnimationStyle(R.style.gd);
        setBackgroundDrawable(new ColorDrawable(0));
        this.f63019c.measure(0, 0);
    }

    /* renamed from: a */
    public final void mo61968a(View view, MusicModel musicModel) {
        C7573i.m23587b(view, "anchor");
        C7573i.m23587b(musicModel, "musicModel");
        if (!TextUtils.isEmpty(musicModel.getPicPremium())) {
            C23323e.m76514a(this.f63018b, musicModel.getPicPremium());
        } else if (!TextUtils.isEmpty(musicModel.getPicBig())) {
            C23323e.m76514a(this.f63018b, musicModel.getPicBig());
        }
        setWidth(view.getWidth() + C23486n.m77122a(24.0d));
        if (!isShowing()) {
            showAsDropDown(view, (view.getWidth() - getWidth()) / 2, -((view.getHeight() + this.f63019c.getMeasuredHeight()) - C23486n.m77122a(16.0d)));
        }
        m78161a(2000);
    }
}
