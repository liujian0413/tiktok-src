package com.p280ss.android.ugc.aweme.shortvideo.subtitle;

import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.p298ml.process.p299bl.MLConfigModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.story.shootvideo.textfont.C42039d;
import com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view.TextStickerEditText;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleTextView */
public final class SubtitleTextView extends TextStickerEditText {

    /* renamed from: a */
    public static int f106957a = ((int) C9738o.m28708b((Context) C35563c.f93238a, 6.0f));

    /* renamed from: b */
    public static int f106958b = ((int) C9738o.m28708b((Context) C35563c.f93238a, 3.0f));

    /* renamed from: c */
    public static final C41105a f106959c = new C41105a(null);

    /* renamed from: i */
    private SubtitleStyleViewModel f106960i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.SubtitleTextView$a */
    public static final class C41105a {
        private C41105a() {
        }

        public /* synthetic */ C41105a(C7571f fVar) {
            this();
        }
    }

    public SubtitleTextView(Context context) {
        this(context, null, 2, null);
    }

    public final int getScene() {
        return 1;
    }

    public final void setViewModel(SubtitleStyleViewModel subtitleStyleViewModel) {
        this.f106960i = subtitleStyleViewModel;
    }

    public final void setAligin(int i) {
        super.setAligin(i);
        if (this.f106960i != null) {
            SubtitleStyleViewModel subtitleStyleViewModel = this.f106960i;
            if (subtitleStyleViewModel == null) {
                C7573i.m23580a();
            }
            subtitleStyleViewModel.mo101543d().setValue(Integer.valueOf(i));
        }
    }

    public final void setFontType(Typeface typeface) {
        C7573i.m23587b(typeface, MLConfigModel.MODEL_TYPE_TF);
        super.setFontType(typeface);
        if (this.f106960i != null) {
            SubtitleStyleViewModel subtitleStyleViewModel = this.f106960i;
            if (subtitleStyleViewModel == null) {
                C7573i.m23580a();
            }
            subtitleStyleViewModel.mo101539a().setValue(C42039d.m133620a().mo103221a(typeface));
        }
    }

    /* renamed from: a */
    public final void mo101545a(Context context) {
        this.f109312d = f106958b;
        this.f109316h = (int) C9738o.m28708b(context, 2.0f);
        this.f109313e = new Paint();
        Paint paint = this.f109313e;
        C7573i.m23582a((Object) paint, "mBgFillPaint");
        paint.setColor(this.f109315g);
        Paint paint2 = this.f109313e;
        C7573i.m23582a((Object) paint2, "mBgFillPaint");
        paint2.setStyle(Style.FILL);
        Paint paint3 = this.f109313e;
        C7573i.m23582a((Object) paint3, "mBgFillPaint");
        paint3.setAntiAlias(true);
        Paint paint4 = this.f109313e;
        C7573i.m23582a((Object) paint4, "mBgFillPaint");
        paint4.setXfermode(new PorterDuffXfermode(Mode.DST_OVER));
        Paint paint5 = this.f109313e;
        C7573i.m23582a((Object) paint5, "mBgFillPaint");
        paint5.setPathEffect(new CornerPathEffect((float) this.f109316h));
        this.f109314f = new Path();
        setLayerType(1, null);
        setLineSpacing((float) this.f109312d, getLineSpacingMultiplier());
    }

    public SubtitleTextView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        setInputType(131072);
        setGravity(17);
        setSingleLine(false);
        setHorizontallyScrolling(false);
        setTextSize(0, 42.0f);
        int i = f106957a;
        setPadding(i, i, i, i);
        setBackground(null);
    }

    /* renamed from: a */
    public final void mo101544a(int i, int i2) {
        super.mo101544a(i, i2);
        if (this.f106960i != null) {
            SubtitleStyleViewModel subtitleStyleViewModel = this.f106960i;
            if (subtitleStyleViewModel == null) {
                C7573i.m23580a();
            }
            subtitleStyleViewModel.mo101541b().setValue(Integer.valueOf(i));
            SubtitleStyleViewModel subtitleStyleViewModel2 = this.f106960i;
            if (subtitleStyleViewModel2 == null) {
                C7573i.m23580a();
            }
            subtitleStyleViewModel2.mo101542c().setValue(Integer.valueOf(i2));
        }
    }

    public /* synthetic */ SubtitleTextView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
