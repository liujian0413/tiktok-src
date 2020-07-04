package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1600b;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.scene.C37299a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.C39564ap;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39567a.C39568a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39570c;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.bubble.C39584o;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40362a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1592a.C40366c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7705c;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a */
public abstract class C40474a {

    /* renamed from: f */
    public static final C40475a f105211f = new C40475a(null);

    /* renamed from: a */
    public C39584o f105212a;

    /* renamed from: b */
    public final Context f105213b;

    /* renamed from: c */
    public final C39564ap f105214c = new C39564ap();

    /* renamed from: d */
    public final View f105215d;

    /* renamed from: e */
    public final C40485e f105216e;

    /* renamed from: g */
    private final Handler f105217g = new Handler();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$a */
    public static final class C40475a {
        private C40475a() {
        }

        public /* synthetic */ C40475a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$b */
    public static final class C40476b implements C39568a {
        C40476b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$c */
    static final class C40477c implements OnDismissListener {

        /* renamed from: a */
        public static final C40477c f105218a = new C40477c();

        C40477c() {
        }

        public final void onDismiss() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.b.a$d */
    static final class C40478d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40474a f105219a;

        /* renamed from: b */
        final /* synthetic */ RectF f105220b;

        /* renamed from: c */
        final /* synthetic */ int f105221c;

        /* renamed from: d */
        final /* synthetic */ int f105222d;

        /* renamed from: e */
        final /* synthetic */ float f105223e;

        C40478d(C40474a aVar, RectF rectF, int i, int i2, float f) {
            this.f105219a = aVar;
            this.f105220b = rectF;
            this.f105221c = i;
            this.f105222d = i2;
            this.f105223e = f;
        }

        public final void run() {
            C40474a aVar = this.f105219a;
            C39584o oVar = this.f105219a.f105212a;
            if (oVar == null) {
                C7573i.m23580a();
            }
            aVar.mo100526a(oVar, this.f105220b, this.f105221c, this.f105222d, this.f105223e);
        }
    }

    /* renamed from: c */
    public abstract View mo100528c();

    /* renamed from: a */
    public final void mo100524a() {
        m129403a(false);
    }

    /* renamed from: b */
    public final void mo100527b() {
        m129403a(true);
    }

    /* renamed from: f */
    public final void mo100531f() {
        C7705c.m23799a().mo20389a((Object) this);
    }

    /* renamed from: g */
    public final void mo100532g() {
        C7705c.m23799a().mo20393c((Object) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final LinearLayout mo100529d() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f105213b);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) C9738o.m28708b(this.f105213b, 104.0f));
        linearLayout.setGravity(16);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final View mo100530e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C9738o.m28708b(this.f105213b, 0.5f));
        View view = new View(this.f105213b);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(this.f105213b.getResources().getColor(R.color.az3));
        view.setAlpha(0.2f);
        return view;
    }

    @C7709l
    public final void onDismissPopEvent(C40479b bVar) {
        C7573i.m23587b(bVar, "event");
        mo100527b();
    }

    /* renamed from: b */
    private static void m129404b(C39570c cVar) {
        cVar.mo98528a((C39568a) new C40476b());
        cVar.setOnDismissListener(C40477c.f105218a);
    }

    /* renamed from: a */
    private final void m129403a(boolean z) {
        this.f105217g.removeCallbacksAndMessages(null);
        C39584o oVar = this.f105212a;
        if (oVar != null && oVar.isShowing()) {
            if (z) {
                C39584o oVar2 = this.f105212a;
                if (oVar2 != null) {
                    oVar2.mo98554i();
                }
            } else {
                C39584o oVar3 = this.f105212a;
                if (oVar3 != null) {
                    oVar3.mo98553h();
                }
            }
        }
        this.f105212a = null;
    }

    /* renamed from: a */
    private final void m129402a(C39570c cVar) {
        cVar.mo98549c(true);
        cVar.mo98545a(200);
        cVar.mo98548b(-1);
        cVar.mo98530a(this.f105213b.getResources().getColor(R.color.lq));
        cVar.mo98531a(false);
        cVar.mo98533b(false);
        cVar.mo98527a(mo100528c());
        C40362a aVar = new C40362a(this.f105213b, 200, 200, cVar);
        cVar.mo98546a((C40366c) aVar);
        C39570c.m126416g((int) C9738o.m28708b(this.f105213b, 15.0f));
    }

    public C40474a(View view, C40485e eVar) {
        C7573i.m23587b(view, "contentView");
        this.f105215d = view;
        this.f105216e = eVar;
        Context context = this.f105215d.getContext();
        C7573i.m23582a((Object) context, "contentView.context");
        this.f105213b = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LinearLayout mo100523a(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C9738o.m28708b(this.f105213b, 44.0f));
        LinearLayout linearLayout = new LinearLayout(this.f105213b);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumWidth((int) C9738o.m28708b(this.f105213b, 104.0f));
        DmtTextView dmtTextView = new DmtTextView(this.f105213b);
        dmtTextView.setTextColor(this.f105213b.getResources().getColor(R.color.az3));
        dmtTextView.setTextSize(14.0f);
        dmtTextView.setMaxLines(1);
        dmtTextView.setGravity(16);
        dmtTextView.setText(this.f105213b.getString(i2));
        TextPaint paint = dmtTextView.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) C9738o.m28708b(this.f105213b, 4.0f);
        layoutParams2.rightMargin = (int) C9738o.m28708b(this.f105213b, 12.0f);
        if (VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) C9738o.m28708b(this.f105213b, 4.0f));
            layoutParams2.setMarginEnd((int) C9738o.m28708b(this.f105213b, 12.0f));
        }
        dmtTextView.setLayoutParams(layoutParams2);
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(this.f105213b);
        autoRTLImageView.setImageResource(i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = (int) C9738o.m28708b(this.f105213b, 12.0f);
        if (VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) C9738o.m28708b(this.f105213b, 12.0f));
        }
        autoRTLImageView.setLayoutParams(layoutParams3);
        linearLayout.addView(autoRTLImageView);
        linearLayout.addView(dmtTextView);
        if (VERSION.SDK_INT >= 17) {
            autoRTLImageView.setLayoutDirection(0);
        }
        return linearLayout;
    }

    /* renamed from: a */
    public final void mo100525a(RectF rectF, int i, int i2, float f) {
        C7573i.m23587b(rectF, "helpBoxRect");
        C7705c.m23799a().mo20394d(new C40479b());
        if (this.f105212a == null) {
            this.f105212a = new C39584o(C37299a.m119788a(this.f105213b), false);
            C39584o oVar = this.f105212a;
            if (oVar == null) {
                C7573i.m23580a();
            }
            m129402a((C39570c) oVar);
        }
        C39584o oVar2 = this.f105212a;
        if (oVar2 == null) {
            C7573i.m23580a();
        }
        m129404b(oVar2);
        Handler handler = this.f105217g;
        C40478d dVar = new C40478d(this, rectF, i, i2, f);
        handler.postDelayed(dVar, 200);
    }

    /* renamed from: a */
    public final void mo100526a(C39584o oVar, RectF rectF, int i, int i2, float f) {
        this.f105215d.getLocationOnScreen(new int[2]);
        oVar.mo98557l();
        oVar.mo98574a(rectF, i, i2, f);
        oVar.mo98575b(this.f105215d);
    }
}
