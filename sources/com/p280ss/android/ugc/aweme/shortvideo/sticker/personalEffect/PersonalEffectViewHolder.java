package com.p280ss.android.ugc.aweme.shortvideo.sticker.personalEffect;

import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtImageTextView;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.PersonalEffectViewHolder */
public final class PersonalEffectViewHolder extends C1293v {

    /* renamed from: a */
    public final C40902c f106372a;

    /* renamed from: b */
    private AVDmtImageTextView f106373b;

    /* renamed from: c */
    private final AppCompatActivity f106374c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.personalEffect.PersonalEffectViewHolder$a */
    static final class C40899a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PersonalEffectViewHolder f106375a;

        /* renamed from: b */
        final /* synthetic */ int f106376b;

        C40899a(PersonalEffectViewHolder personalEffectViewHolder, int i) {
            this.f106375a = personalEffectViewHolder;
            this.f106376b = i;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f106375a.f106372a.mo101176a(this.f106376b);
        }
    }

    /* renamed from: a */
    private final void m130686a() {
        this.f106373b.mo103502a(false, 8388693);
        this.f106373b.setShowDownloadIcon(false);
        this.f106373b.mo103509d();
    }

    /* renamed from: b */
    private final void m130688b() {
        this.f106373b.setShowDownloadIcon(false);
        this.f106373b.mo103509d();
        this.f106373b.mo103502a(true, 8388693);
    }

    /* renamed from: c */
    private final void m130689c() {
        this.f106373b.mo103502a(false, 8388693);
        this.f106373b.setShowDownloadIcon(true);
        this.f106373b.mo103513f();
    }

    /* renamed from: a */
    private final void m130687a(int i) {
        switch (i) {
            case 1:
                m130686a();
                return;
            case 2:
                m130688b();
                return;
            case 3:
                m130689c();
                break;
        }
    }

    public PersonalEffectViewHolder(AppCompatActivity appCompatActivity, View view, C40902c cVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(view, "itemView");
        C7573i.m23587b(cVar, "listener");
        super(view);
        this.f106374c = appCompatActivity;
        this.f106372a = cVar;
        View findViewById = view.findViewById(R.id.db2);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.sticker_img_view)");
        this.f106373b = (AVDmtImageTextView) findViewById;
    }

    /* renamed from: a */
    public final void mo101179a(int i, StickerWrapper stickerWrapper, boolean z) {
        String str;
        C7573i.m23587b(stickerWrapper, "stickerWrapper");
        this.f106373b.mo103501a(z);
        m130687a(stickerWrapper.f104910c);
        AVDmtImageTextView aVDmtImageTextView = this.f106373b;
        Effect effect = stickerWrapper.f104908a;
        if (effect != null) {
            UrlModel iconUrl = effect.getIconUrl();
            if (iconUrl != null) {
                List urlList = iconUrl.getUrlList();
                if (urlList != null) {
                    str = (String) urlList.get(0);
                    aVDmtImageTextView.mo103499a(str);
                    this.itemView.setOnClickListener(new C40899a(this, i));
                }
            }
        }
        str = null;
        aVDmtImageTextView.mo103499a(str);
        this.itemView.setOnClickListener(new C40899a(this, i));
    }
}
