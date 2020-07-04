package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap.Config;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.core.CircleOptions;
import com.bytedance.lighten.core.CircleOptions.C12089a;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.p280ss.android.ugc.aweme.views.CircleDraweeView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.StickerImageView */
public final class StickerImageView extends FrameLayout {

    /* renamed from: a */
    private CircleDraweeView f104819a;

    /* renamed from: b */
    private SmartImageView f104820b;

    /* renamed from: c */
    private ImageView f104821c;

    /* renamed from: d */
    private AVCircleProgressView f104822d;

    /* renamed from: e */
    private boolean f104823e;

    /* renamed from: f */
    private View f104824f;

    /* renamed from: g */
    private Drawable f104825g;

    /* renamed from: h */
    private final boolean f104826h;

    /* renamed from: i */
    private final boolean f104827i;

    /* renamed from: j */
    private final boolean f104828j;

    public StickerImageView(Context context) {
        this(context, null, false, false, false, 30, null);
    }

    public StickerImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, false, false, false, 28, null);
    }

    public StickerImageView(Context context, AttributeSet attributeSet, boolean z) {
        this(context, attributeSet, z, false, false, 24, null);
    }

    public StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        this(context, attributeSet, z, z2, false, 16, null);
    }

    /* renamed from: a */
    public final void mo100255a(String str, Config config) {
        if (!this.f104828j) {
            CircleDraweeView circleDraweeView = this.f104819a;
            if (circleDraweeView == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView.mo105124a(str, config);
        } else if (str != null) {
            C12139r b = C12133n.m35301a(str).mo29846a(true).mo29852b(true);
            SmartImageView smartImageView = this.f104820b;
            if (smartImageView == null) {
                C7573i.m23583a("smartImageView");
            }
            b.mo29844a((C12128i) smartImageView).mo29848a();
        }
    }

    /* renamed from: a */
    public final void mo100256a(boolean z) {
        if (!this.f104828j) {
            CircleDraweeView circleDraweeView = this.f104819a;
            if (circleDraweeView == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView.mo105125a(z);
        }
    }

    /* renamed from: a */
    public final void mo100257a(boolean z, boolean z2) {
        if (!this.f104828j) {
            CircleDraweeView circleDraweeView = this.f104819a;
            if (circleDraweeView == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView.mo105162a(z, z2);
        }
    }

    /* renamed from: d */
    private static CircleOptions m128928d() {
        CircleOptions a = new C12089a().mo29781a(true).mo29782a();
        C7573i.m23582a((Object) a, "builder.build()");
        return a;
    }

    /* renamed from: e */
    private final void m128929e() {
        ImageView imageView = this.f104821c;
        if (imageView == null) {
            C7573i.m23583a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f104822d;
        if (aVCircleProgressView == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo100249a() {
        ImageView imageView = this.f104821c;
        if (imageView == null) {
            C7573i.m23583a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f104822d;
        if (aVCircleProgressView == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    /* renamed from: b */
    public final void mo100258b() {
        ImageView imageView = this.f104821c;
        if (imageView == null) {
            C7573i.m23583a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f104822d;
        if (aVCircleProgressView == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView.setVisibility(0);
        AVCircleProgressView aVCircleProgressView2 = this.f104822d;
        if (aVCircleProgressView2 == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView2.setProgress(0);
    }

    /* renamed from: c */
    public final void mo100260c() {
        if (this.f104823e) {
            ImageView imageView = this.f104821c;
            if (imageView == null) {
                C7573i.m23583a("downloadImg");
            }
            imageView.setVisibility(0);
        } else {
            ImageView imageView2 = this.f104821c;
            if (imageView2 == null) {
                C7573i.m23583a("downloadImg");
            }
            imageView2.setVisibility(4);
        }
        AVCircleProgressView aVCircleProgressView = this.f104822d;
        if (aVCircleProgressView == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView.setVisibility(4);
    }

    public final void setShowDownloadIcon(boolean z) {
        this.f104823e = z;
    }

    /* renamed from: b */
    public final void mo100259b(boolean z) {
        int i;
        ImageView imageView = this.f104821c;
        if (imageView == null) {
            C7573i.m23583a("downloadImg");
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    /* renamed from: a */
    public final void mo100250a(int i) {
        ImageView imageView = this.f104821c;
        if (imageView == null) {
            C7573i.m23583a("downloadImg");
        }
        imageView.setVisibility(4);
        AVCircleProgressView aVCircleProgressView = this.f104822d;
        if (aVCircleProgressView == null) {
            C7573i.m23583a("progressView");
        }
        if (aVCircleProgressView.getVisibility() != 0) {
            AVCircleProgressView aVCircleProgressView2 = this.f104822d;
            if (aVCircleProgressView2 == null) {
                C7573i.m23583a("progressView");
            }
            aVCircleProgressView2.setVisibility(0);
        }
        AVCircleProgressView aVCircleProgressView3 = this.f104822d;
        if (aVCircleProgressView3 == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView3.setProgress(i);
    }

    public final void setIconImageViewScaleType(C13423b bVar) {
        if (this.f104828j) {
            SmartImageView smartImageView = this.f104820b;
            if (smartImageView == null) {
                C7573i.m23583a("smartImageView");
            }
            C13438a aVar = (C13438a) smartImageView.getHierarchy();
            C7573i.m23582a((Object) aVar, "smartImageView.hierarchy");
            aVar.mo32896a(bVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f104819a;
        if (circleDraweeView == null) {
            C7573i.m23583a("iconImageView");
        }
        C13438a aVar2 = (C13438a) circleDraweeView.getHierarchy();
        C7573i.m23582a((Object) aVar2, "iconImageView.hierarchy");
        aVar2.mo32896a(bVar);
    }

    public final void setImageHierarchy(C13438a aVar) {
        if (this.f104828j) {
            SmartImageView smartImageView = this.f104820b;
            if (smartImageView == null) {
                C7573i.m23583a("smartImageView");
            }
            smartImageView.setHierarchy(aVar);
            return;
        }
        CircleDraweeView circleDraweeView = this.f104819a;
        if (circleDraweeView == null) {
            C7573i.m23583a("iconImageView");
        }
        circleDraweeView.setHierarchy(aVar);
    }

    public final void setEnableUI(boolean z) {
        if (z) {
            if (this.f104828j) {
                SmartImageView smartImageView = this.f104820b;
                if (smartImageView == null) {
                    C7573i.m23583a("smartImageView");
                }
                smartImageView.clearColorFilter();
                return;
            }
            CircleDraweeView circleDraweeView = this.f104819a;
            if (circleDraweeView == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView.clearColorFilter();
        } else if (this.f104828j) {
            SmartImageView smartImageView2 = this.f104820b;
            if (smartImageView2 == null) {
                C7573i.m23583a("smartImageView");
            }
            smartImageView2.setColorFilter(R.color.dp, Mode.DST_IN);
        } else {
            CircleDraweeView circleDraweeView2 = this.f104819a;
            if (circleDraweeView2 == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView2.setColorFilter(R.color.dp, Mode.DST_IN);
        }
    }

    /* renamed from: a */
    public final void mo100252a(Drawable drawable) {
        if (this.f104828j) {
            SmartImageView smartImageView = this.f104820b;
            if (smartImageView == null) {
                C7573i.m23583a("smartImageView");
            }
            smartImageView.setImageDrawable(drawable);
            return;
        }
        CircleDraweeView circleDraweeView = this.f104819a;
        if (circleDraweeView == null) {
            C7573i.m23583a("iconImageView");
        }
        circleDraweeView.setImageDrawable(drawable);
    }

    /* renamed from: a */
    public final void mo100253a(UrlModel urlModel) {
        if (!this.f104828j) {
            CircleDraweeView circleDraweeView = this.f104819a;
            if (circleDraweeView == null) {
                C7573i.m23583a("iconImageView");
            }
            C23323e.m76524b(circleDraweeView, urlModel);
        } else if (urlModel != null) {
            C12139r a = C12133n.m35299a(C23400r.m76741a(urlModel)).mo29842a(m128928d());
            SmartImageView smartImageView = this.f104820b;
            if (smartImageView == null) {
                C7573i.m23583a("smartImageView");
            }
            a.mo29844a((C12128i) smartImageView).mo29848a();
        }
    }

    /* renamed from: a */
    public final void mo100254a(String str) {
        if (!this.f104828j) {
            CircleDraweeView circleDraweeView = this.f104819a;
            if (circleDraweeView == null) {
                C7573i.m23583a("iconImageView");
            }
            C23323e.m76514a((RemoteImageView) circleDraweeView, str);
        } else if (str != null) {
            C12139r a = C12133n.m35301a(str).mo29842a(m128928d());
            SmartImageView smartImageView = this.f104820b;
            if (smartImageView == null) {
                C7573i.m23583a("smartImageView");
            }
            a.mo29844a((C12128i) smartImageView).mo29848a();
        }
    }

    /* renamed from: a */
    public final void mo100251a(int i, int i2) {
        switch (i) {
            case 1:
                mo100249a();
                return;
            case 2:
                mo100258b();
                return;
            case 3:
                mo100260c();
                return;
            case 4:
                m128929e();
                break;
            case 5:
                mo100250a(i2);
                return;
        }
    }

    /* renamed from: a */
    private final void m128927a(Context context, AttributeSet attributeSet) {
        int i;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f104825g = obtainStyledAttributes.getDrawable(28);
            obtainStyledAttributes.recycle();
        }
        if (this.f104826h) {
            i = R.layout.a4o;
        } else if (this.f104827i) {
            i = R.layout.a4n;
        } else {
            i = R.layout.a4m;
        }
        View inflate = LayoutInflater.from(context).inflate(i, null);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(cont…).inflate(layoutId, null)");
        this.f104824f = inflate;
        View view = this.f104824f;
        if (view == null) {
            C7573i.m23583a("mRootView");
        }
        View findViewById = view.findViewById(R.id.b05);
        C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R.id.img_sticker_icon)");
        this.f104819a = (CircleDraweeView) findViewById;
        View view2 = this.f104824f;
        if (view2 == null) {
            C7573i.m23583a("mRootView");
        }
        View findViewById2 = view2.findViewById(R.id.d7g);
        C7573i.m23582a((Object) findViewById2, "mRootView.findViewById(R.id.siv_sticker_icon)");
        this.f104820b = (SmartImageView) findViewById2;
        C13438a a = new C13439b(getResources()).mo32908a();
        a.mo32900b(this.f104825g);
        a.mo32904c(this.f104825g);
        if (this.f104828j) {
            SmartImageView smartImageView = this.f104820b;
            if (smartImageView == null) {
                C7573i.m23583a("smartImageView");
            }
            smartImageView.setVisibility(0);
            CircleDraweeView circleDraweeView = this.f104819a;
            if (circleDraweeView == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView.setVisibility(8);
            SmartImageView smartImageView2 = this.f104820b;
            if (smartImageView2 == null) {
                C7573i.m23583a("smartImageView");
            }
            smartImageView2.setHierarchy(a);
        } else {
            SmartImageView smartImageView3 = this.f104820b;
            if (smartImageView3 == null) {
                C7573i.m23583a("smartImageView");
            }
            smartImageView3.setVisibility(8);
            CircleDraweeView circleDraweeView2 = this.f104819a;
            if (circleDraweeView2 == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView2.setVisibility(0);
            CircleDraweeView circleDraweeView3 = this.f104819a;
            if (circleDraweeView3 == null) {
                C7573i.m23583a("iconImageView");
            }
            circleDraweeView3.setHierarchy(a);
        }
        View view3 = this.f104824f;
        if (view3 == null) {
            C7573i.m23583a("mRootView");
        }
        View findViewById3 = view3.findViewById(R.id.b07);
        C7573i.m23582a((Object) findViewById3, "mRootView.findViewById(R.id.img_sticker_loading)");
        this.f104821c = (ImageView) findViewById3;
        View view4 = this.f104824f;
        if (view4 == null) {
            C7573i.m23583a("mRootView");
        }
        View findViewById4 = view4.findViewById(R.id.b_w);
        C7573i.m23582a((Object) findViewById4, "mRootView.findViewById(R.id.iv_loading)");
        this.f104822d = (AVCircleProgressView) findViewById4;
        if (C6399b.m19946v()) {
            AVCircleProgressView aVCircleProgressView = this.f104822d;
            if (aVCircleProgressView == null) {
                C7573i.m23583a("progressView");
            }
            aVCircleProgressView.setBgCircleColor(536870912);
        } else {
            AVCircleProgressView aVCircleProgressView2 = this.f104822d;
            if (aVCircleProgressView2 == null) {
                C7573i.m23583a("progressView");
            }
            aVCircleProgressView2.setBgCircleColor(637534208);
        }
        AVCircleProgressView aVCircleProgressView3 = this.f104822d;
        if (aVCircleProgressView3 == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView3.setProgressColor(-1);
        AVCircleProgressView aVCircleProgressView4 = this.f104822d;
        if (aVCircleProgressView4 == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView4.setMaxProgress(100);
        AVCircleProgressView aVCircleProgressView5 = this.f104822d;
        if (aVCircleProgressView5 == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView5.setCircleWidth((int) C9738o.m28708b(context, 2.0f));
        AVCircleProgressView aVCircleProgressView6 = this.f104822d;
        if (aVCircleProgressView6 == null) {
            C7573i.m23583a("progressView");
        }
        aVCircleProgressView6.setBgCircleWidth((int) C9738o.m28708b(context, 3.0f));
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        View view5 = this.f104824f;
        if (view5 == null) {
            C7573i.m23583a("mRootView");
        }
        view5.setLayoutParams(layoutParams);
        View view6 = this.f104824f;
        if (view6 == null) {
            C7573i.m23583a("mRootView");
        }
        addView(view6);
    }

    public StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        this.f104826h = z;
        this.f104827i = z2;
        this.f104828j = z3;
        m128927a(context, attributeSet);
    }

    public /* synthetic */ StickerImageView(Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, int i, C7571f fVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        AttributeSet attributeSet2 = attributeSet;
        if ((i & 4) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 8) != 0) {
            z5 = false;
        } else {
            z5 = z2;
        }
        if ((i & 16) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        this(context, attributeSet2, z4, z5, z6);
    }
}
