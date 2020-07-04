package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.story.shootvideo.p1655a.C42010a;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42038c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerInputLayout;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.p1663b.C42077a;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditTypeLayout */
public final class SubtitleEditTypeLayout extends TextStickerInputLayout {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleEditTypeLayout$a */
    public static final class C41028a implements C42077a {

        /* renamed from: a */
        final /* synthetic */ SubtitleEditTypeLayout f106764a;

        /* renamed from: a */
        public final void mo101456a() {
        }

        /* renamed from: a */
        public final void mo101459a(String str) {
            C7573i.m23587b(str, "alignStr");
        }

        C41028a(SubtitleEditTypeLayout subtitleEditTypeLayout) {
            this.f106764a = subtitleEditTypeLayout;
        }

        /* renamed from: a */
        public final void mo101457a(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(i));
            C42962b.f111525a.mo104671a("select_text_color", C42010a.m133556a(this.f106764a.f109331h, this.f106764a.f109332i, this.f106764a.f109333j, this.f106764a.f109334k, this.f106764a.f109335l).mo59973a("color", sb.toString()).mo59970a("is_subtitle", 1).f60753a);
        }

        /* renamed from: b */
        public final void mo101460b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            C42962b.f111525a.mo104671a("select_text_style", C42010a.m133556a(this.f106764a.f109331h, this.f106764a.f109332i, this.f106764a.f109333j, this.f106764a.f109334k, this.f106764a.f109335l).mo59973a("text_style", sb.toString()).mo59970a("is_subtitle", 1).f60753a);
        }

        /* renamed from: a */
        public final void mo101458a(C42038c cVar) {
            C7573i.m23587b(cVar, "type");
            C42962b.f111525a.mo104671a("select_text_font", C42010a.m133556a(this.f106764a.f109331h, this.f106764a.f109332i, this.f106764a.f109333j, this.f106764a.f109334k, this.f106764a.f109335l).mo59973a(" font", cVar.f109186d).mo59970a("is_subtitle", 1).f60753a);
        }
    }

    public final int getLayoutRes() {
        return R.layout.ak4;
    }

    public final int getScene() {
        return 1;
    }

    public final int getTopMargin() {
        return 0;
    }

    /* renamed from: a */
    public final C42077a mo101450a() {
        return new C41028a(this);
    }

    public SubtitleEditTypeLayout(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    /* renamed from: a */
    public final void mo101451a(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        this.f109336m = 0;
    }

    public SubtitleEditTypeLayout(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attributes");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo101452a(String str, int i, int i2, int i3, String str2, boolean z) {
        this.f109327d = -1;
        mo103357i();
        this.f109325b.mo103313a(z, i2);
        if (z) {
            C42039d.m133620a().mo103229b(getScene());
            mo103347e();
        } else {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                this.f109324a.setText(charSequence);
                this.f109324a.setSelection(str.length());
            }
            this.f109325b.setSelectColorView(i2);
            this.f109326c = i;
            this.f109328e = i3;
            this.f109329f = i2;
            C42039d.m133620a().mo103223a(str2, getScene());
        }
        mo103344d();
        this.f109324a.setFontType(C42039d.m133620a().mo103236d(getScene()));
        this.f109324a.mo101544a(i, i2);
        this.f109324a.setAligin(this.f109328e);
        this.f109330g.mo103203a();
        mo103337b();
        mo103334a(C42039d.m133620a().mo103239f(getScene()));
    }
}
