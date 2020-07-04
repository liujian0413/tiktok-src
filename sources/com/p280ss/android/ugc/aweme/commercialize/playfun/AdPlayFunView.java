package com.p280ss.android.ugc.aweme.commercialize.playfun;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.lighten.core.C12128i;
import com.bytedance.lighten.core.C12131l;
import com.bytedance.lighten.core.C12133n;
import com.bytedance.lighten.core.C12139r;
import com.bytedance.lighten.core.p612c.C12105c;
import com.bytedance.lighten.core.p612c.C12112j;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.base.C23400r;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25175a.C25176a;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25196d;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.C25203e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.miniapp_api.model.params.C33471b.C33472a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView */
public final class AdPlayFunView extends FrameLayout implements OnTouchListener {

    /* renamed from: a */
    public C25030f f65964a;

    /* renamed from: b */
    public boolean f65965b;

    /* renamed from: c */
    public Aweme f65966c;

    /* renamed from: d */
    private SmartImageView f65967d;

    /* renamed from: e */
    private DmtTextView f65968e;

    /* renamed from: f */
    private C25028d f65969f;

    /* renamed from: g */
    private AwemePlayFunModel f65970g;

    /* renamed from: h */
    private View f65971h;

    /* renamed from: i */
    private final C25009a f65972i;

    /* renamed from: j */
    private final GestureDetector f65973j;

    /* renamed from: k */
    private final OnLayoutChangeListener f65974k;

    /* renamed from: l */
    private final C25010b f65975l;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$a */
    public static final class C25009a extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f65976a;

        C25009a(AdPlayFunView adPlayFunView) {
            this.f65976a = adPlayFunView;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return AdPlayFunView.m82332a(this.f65976a).mo65495e();
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f65976a.mo65441a();
            return AdPlayFunView.m82332a(this.f65976a).mo65495e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$b */
    public static final class C25010b extends C12105c {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f65977a;

        /* renamed from: b */
        final /* synthetic */ Context f65978b;

        C25010b(AdPlayFunView adPlayFunView, Context context) {
            this.f65977a = adPlayFunView;
            this.f65978b = context;
        }

        /* renamed from: a */
        public final void mo29812a(Uri uri, View view, Throwable th) {
            if (view != null) {
                this.f65977a.setVisibility(8);
                if (this.f65977a.f65966c != null) {
                    C24976t.m82110aW(this.f65978b, this.f65977a.f65966c);
                    C25026c.f66008a.mo65482a(this.f65977a.f65966c, false, "display", null, null);
                }
            }
        }

        /* renamed from: a */
        public final void mo29811a(Uri uri, View view, C12131l lVar, Animatable animatable) {
            if (view != null) {
                if (C25352e.m83307R(this.f65977a.f65966c) && this.f65977a.f65965b) {
                    AdPlayFunView.m82332a(this.f65977a).mo65488a();
                }
                C25026c.f66008a.mo65482a(this.f65977a.f65966c, true, "display", null, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView$c */
    static final class C25011c implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ AdPlayFunView f65979a;

        C25011c(AdPlayFunView adPlayFunView) {
            this.f65979a = adPlayFunView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            AdPlayFunView.m82332a(this.f65979a).mo65498h();
        }
    }

    public AdPlayFunView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdPlayFunView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: f */
    public final void mo65449f() {
        this.f65965b = true;
    }

    /* renamed from: c */
    public final void mo65446c() {
        m82335j();
        setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m82333h();
    }

    /* renamed from: b */
    public final void mo65445b() {
        C25030f fVar = this.f65964a;
        if (fVar == null) {
            C7573i.m23583a("stateContext");
        }
        fVar.mo65496f();
    }

    /* renamed from: d */
    public final void mo65447d() {
        C25030f fVar = this.f65964a;
        if (fVar == null) {
            C7573i.m23583a("stateContext");
        }
        fVar.mo65492b();
    }

    /* renamed from: e */
    public final void mo65448e() {
        C25030f fVar = this.f65964a;
        if (fVar == null) {
            C7573i.m23583a("stateContext");
        }
        fVar.mo65493c();
    }

    /* renamed from: g */
    public final void mo65450g() {
        this.f65965b = false;
        C25030f fVar = this.f65964a;
        if (fVar == null) {
            C7573i.m23583a("stateContext");
        }
        fVar.mo65494d();
        SmartImageView smartImageView = this.f65967d;
        if (smartImageView == null) {
            C7573i.m23583a("eggImageView");
        }
        smartImageView.setImageDisplayListener(null);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C25030f fVar = this.f65964a;
        if (fVar == null) {
            C7573i.m23583a("stateContext");
        }
        fVar.mo65494d();
        View view = this.f65971h;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.f65974k);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent != null) {
            this.f65971h = ((ViewGroup) parent).findViewById(R.id.jh);
            View view = this.f65971h;
            if (view != null) {
                view.addOnLayoutChangeListener(this.f65974k);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: h */
    private final void m82333h() {
        this.f65969f = m82334i();
        C25028d dVar = this.f65969f;
        if (dVar == null) {
            C7573i.m23583a("playFunParam");
        }
        this.f65964a = new C25030f(this, dVar);
        View findViewById = findViewById(R.id.cu);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.ad_play_fun_egg_image)");
        this.f65967d = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.cv);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.ad_play_fun_egg_title)");
        this.f65968e = (DmtTextView) findViewById2;
        SmartImageView smartImageView = this.f65967d;
        if (smartImageView == null) {
            C7573i.m23583a("eggImageView");
        }
        OnTouchListener onTouchListener = this;
        smartImageView.setOnTouchListener(onTouchListener);
        DmtTextView dmtTextView = this.f65968e;
        if (dmtTextView == null) {
            C7573i.m23583a("eggTitleView");
        }
        dmtTextView.setOnTouchListener(onTouchListener);
        SmartImageView smartImageView2 = this.f65967d;
        if (smartImageView2 == null) {
            C7573i.m23583a("eggImageView");
        }
        LayoutParams layoutParams = smartImageView2.getLayoutParams();
        C25028d dVar2 = this.f65969f;
        if (dVar2 == null) {
            C7573i.m23583a("playFunParam");
        }
        layoutParams.width = dVar2.f66014a;
        layoutParams.height = layoutParams.width;
        SmartImageView smartImageView3 = this.f65967d;
        if (smartImageView3 == null) {
            C7573i.m23583a("eggImageView");
        }
        smartImageView3.setLayoutParams(layoutParams);
    }

    /* renamed from: i */
    private final C25028d m82334i() {
        float f;
        C25028d dVar = new C25028d();
        int a = C9738o.m28691a(getContext());
        int b = C9738o.m28709b(getContext());
        float f2 = (float) a;
        dVar.f66014a = (int) (0.587f * f2);
        if (a > 720 || b > 1280) {
            f = 0.2065f;
        } else {
            dVar.f66014a = (int) (((float) dVar.f66014a) * 0.68f);
            f = 0.30042f;
        }
        float f3 = 0.247f;
        if (a >= 1080 && b >= 2340) {
            f3 = 0.26049998f;
        }
        dVar.f66016c = f * f2;
        dVar.f66015b = f3 * ((float) b);
        dVar.f66017d = C9738o.m28708b(getContext(), 86.0f) / ((float) dVar.f66014a);
        return dVar;
    }

    /* renamed from: j */
    private final void m82335j() {
        AwemePlayFunModel awemePlayFunModel = this.f65970g;
        if (awemePlayFunModel != null) {
            String tips = awemePlayFunModel.getTips();
            if (tips != null) {
                DmtTextView dmtTextView = this.f65968e;
                if (dmtTextView == null) {
                    C7573i.m23583a("eggTitleView");
                }
                dmtTextView.setText(tips);
            }
            UrlModel imageInfo = awemePlayFunModel.getImageInfo();
            if (imageInfo != null) {
                C12139r a = C12133n.m35299a(C23400r.m76741a(imageInfo)).mo29845a("AdPlayFunView");
                SmartImageView smartImageView = this.f65967d;
                if (smartImageView == null) {
                    C7573i.m23583a("eggImageView");
                }
                a.mo29844a((C12128i) smartImageView).mo29849a((C12112j) this.f65975l);
            }
        }
    }

    /* renamed from: a */
    public final void mo65441a() {
        String str;
        long j;
        Aweme aweme = this.f65966c;
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            Aweme aweme2 = this.f65966c;
            if (aweme2 == null) {
                C7573i.m23580a();
            }
            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
            if (awemeRawAd == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) awemeRawAd, "aweme!!.awemeRawAd!!");
            C25030f fVar = this.f65964a;
            if (fVar == null) {
                C7573i.m23583a("stateContext");
            }
            if (C7573i.m23585a((Object) fVar.f66021b, (Object) "EggShowState")) {
                str = "egg";
            } else {
                str = "hanging";
            }
            C24976t.m82292y(getContext(), this.f65966c, str);
            C25176a f = new C25176a().mo65765a(this.f65966c).mo65772c(awemeRawAd.getOpenUrl()).mo65777g(awemeRawAd.getMicroAppUrl()).mo65766a(new C33472a().mo85794e(C25203e.m82889a(awemeRawAd.getOpenUrl())).mo85790a()).mo65775e(awemeRawAd.getWebUrl()).mo65776f(awemeRawAd.getWebTitle());
            Long creativeId = awemeRawAd.getCreativeId();
            long j2 = 0;
            if (creativeId != null) {
                j = creativeId.longValue();
            } else {
                j = 0;
            }
            C25176a b = f.mo65764a(j).mo65770b(awemeRawAd.getLogExtra());
            Long groupId = awemeRawAd.getGroupId();
            if (groupId != null) {
                j2 = groupId.longValue();
            }
            C25175a aVar = b.mo65769b(j2).mo65778h("result_ad").mo65779i("fancy").f66436a;
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            C25196d.m82879a(context, aVar).mo65822a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C25030f m82332a(AdPlayFunView adPlayFunView) {
        C25030f fVar = adPlayFunView.f65964a;
        if (fVar == null) {
            C7573i.m23583a("stateContext");
        }
        return fVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo65442a(com.p280ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r1 = this;
            r1.f65966c = r2
            if (r2 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.getAwemeRawAd()
            if (r2 == 0) goto L_0x000f
            com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel r2 = r2.getPlayFunModel()
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            r1.f65970g = r2
            com.ss.android.ugc.aweme.commercialize.playfun.f r2 = r1.f65964a
            if (r2 != 0) goto L_0x001b
            java.lang.String r0 = "stateContext"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x001b:
            com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel r0 = r1.f65970g
            r2.f66022c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView.mo65442a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: a */
    public final void mo65443a(String str) {
        C7573i.m23587b(str, "type");
        C24976t.m82294z(getContext(), this.f65966c, str);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f65973j.onTouchEvent(motionEvent);
    }

    public AdPlayFunView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f65972i = new C25009a(this);
        this.f65973j = new GestureDetector(context, this.f65972i);
        this.f65974k = new C25011c(this);
        this.f65975l = new C25010b(this, context);
    }

    /* renamed from: a */
    public final void mo65444a(String str, Point point, Point point2) {
        C7573i.m23587b(str, "state");
        C25026c.f66008a.mo65482a(this.f65966c, true, str, point, point2);
    }

    public /* synthetic */ AdPlayFunView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
