package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28975a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28981d;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28983e;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28935a;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7097b.C7098a;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.views.C43374j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.i */
public final class C28970i extends C43374j implements C28967f {

    /* renamed from: a */
    public LinearLayout f76322a;

    /* renamed from: b */
    public ViewGroup f76323b;

    /* renamed from: c */
    public C28933a f76324c;

    /* renamed from: d */
    private View f76325d;

    /* renamed from: e */
    private long f76326e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.i$a */
    public static final class C28971a implements C7098a {

        /* renamed from: a */
        final /* synthetic */ C28970i f76327a;

        /* renamed from: b */
        final /* synthetic */ List f76328b;

        /* renamed from: a */
        public final void mo18366a(Throwable th) {
            C7573i.m23587b(th, "t");
            this.f76327a.mo74250a(this.f76328b);
        }

        /* renamed from: a */
        public final void mo18367a(List<IMContact> list) {
            C7573i.m23587b(list, "list");
            List arrayList = new ArrayList();
            for (IMContact a : list) {
                arrayList.add(this.f76327a.f76324c.mo74226a(a));
            }
            if (arrayList.size() > 2) {
                arrayList = arrayList.subList(0, 2);
            }
            if (!list.isEmpty()) {
                this.f76328b.addAll(arrayList);
            }
            this.f76327a.mo74250a(this.f76328b);
        }

        C28971a(C28970i iVar, List list) {
            this.f76327a = iVar;
            this.f76328b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.i$b */
    static final class C28972b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C28970i f76329a;

        C28972b(C28970i iVar) {
            this.f76329a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (C28970i.m95199a(this.f76329a).getVisibility() == 0) {
                C6907h.m21524a("block_videos_click_back", (Map) C22984d.m75611a().mo59973a("click_method", "blank").mo59973a("enter_from", this.f76329a.f76324c.f76272c).mo59973a("enter_method", "long_press").f60753a);
            } else {
                this.f76329a.mo74251d();
            }
            this.f76329a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.i$c */
    public static final class C28973c implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C28970i f76330a;

        public final void onGlobalLayout() {
            if (C6399b.m19944t()) {
                int[] iArr = new int[2];
                C28970i.m95200b(this.f76330a).getLocationOnScreen(iArr);
                LayoutParams layoutParams = C28970i.m95200b(this.f76330a).getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 48;
                    if (C6776h.m20950c()) {
                        layoutParams2.topMargin = iArr[1] - C23482j.m77101d();
                    } else {
                        layoutParams2.topMargin = iArr[1];
                    }
                    C28970i.m95200b(this.f76330a).requestLayout();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
            C28970i.m95200b(this.f76330a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C28973c(C28970i iVar) {
            this.f76330a = iVar;
        }
    }

    /* renamed from: a */
    public final ViewGroup mo71375a() {
        ViewGroup viewGroup = this.f76323b;
        if (viewGroup == null) {
            C7573i.m23583a("mSecondaryLayout");
        }
        return viewGroup;
    }

    /* renamed from: b */
    public final ViewGroup mo71376b() {
        LinearLayout linearLayout = this.f76322a;
        if (linearLayout == null) {
            C7573i.m23583a("mOptionsView");
        }
        return linearLayout;
    }

    /* renamed from: e */
    private final void m95201e() {
        if (C6399b.m19944t() || !this.f76324c.mo74228b()) {
            mo74250a(this.f76324c.mo74227a());
            return;
        }
        List a = this.f76324c.mo74227a();
        IIMService g = C30553b.m99810g();
        C7573i.m23582a((Object) g, "IM.get()");
        g.getRelationService().mo18079a(2, new C28971a(this, a));
    }

    public final void onBackPressed() {
        ViewGroup viewGroup = this.f76323b;
        if (viewGroup == null) {
            C7573i.m23583a("mSecondaryLayout");
        }
        if (viewGroup != null) {
            ViewGroup viewGroup2 = this.f76323b;
            if (viewGroup2 == null) {
                C7573i.m23583a("mSecondaryLayout");
            }
            if (viewGroup2.getVisibility() == 0) {
                C28935a aVar = new C28935a(this.f76324c);
                View view = this.f76325d;
                if (view == null) {
                    C7573i.m23583a("mRootView");
                }
                aVar.mo74232b(view);
                return;
            }
        }
        super.onBackPressed();
        mo74251d();
    }

    public final void show() {
        Object obj;
        Activity a = C23487o.m77130a(getContext());
        if (a != null) {
            obj = a.getSystemService("vibrator");
        } else {
            obj = null;
        }
        if (obj != null) {
            Vibrator vibrator = (Vibrator) obj;
            if (vibrator != null) {
                vibrator.vibrate(15);
            }
            super.show();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.os.Vibrator");
    }

    /* renamed from: d */
    public final void mo74251d() {
        String str;
        String str2;
        if (!C6399b.m19944t()) {
            long currentTimeMillis = System.currentTimeMillis() - this.f76326e;
            String str3 = "exit_trans_layer";
            C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f76324c.f76272c);
            String str4 = "group_id";
            Aweme aweme = this.f76324c.f76271b;
            String str5 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            C22984d a2 = a.mo59973a(str4, str);
            String str6 = "author_id";
            Aweme aweme2 = this.f76324c.f76271b;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            } else {
                str2 = null;
            }
            C22984d a3 = a2.mo59973a(str6, str2);
            String str7 = "log_pb";
            C28199ae a4 = C28199ae.m92689a();
            Aweme aweme3 = this.f76324c.f76271b;
            if (aweme3 != null) {
                str5 = aweme3.getRequestId();
            }
            C6907h.m21524a(str3, (Map) a3.mo59973a(str7, a4.mo71791a(str5)).mo59971a("duration", currentTimeMillis).f60753a);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewGroup m95199a(C28970i iVar) {
        ViewGroup viewGroup = iVar.f76323b;
        if (viewGroup == null) {
            C7573i.m23583a("mSecondaryLayout");
        }
        return viewGroup;
    }

    /* renamed from: b */
    public static final /* synthetic */ LinearLayout m95200b(C28970i iVar) {
        LinearLayout linearLayout = iVar.f76322a;
        if (linearLayout == null) {
            C7573i.m23583a("mOptionsView");
        }
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        try {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(Integer.MIN_VALUE);
            }
        } catch (Exception e) {
            C42880h.m136156a(e.getMessage());
        }
        super.onCreate(bundle);
        setContentView(R.layout.ko);
        View findViewById = findViewById(R.id.cwi);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.root)");
        this.f76325d = findViewById;
        View findViewById2 = findViewById(R.id.c9a);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.options)");
        this.f76322a = (LinearLayout) findViewById2;
        View findViewById3 = findViewById(R.id.a9k);
        C7573i.m23582a((Object) findViewById3, "findViewById(R.id.dislike_reason_container)");
        this.f76323b = (ViewGroup) findViewById3;
        this.f76326e = System.currentTimeMillis();
        m95201e();
        View view = this.f76325d;
        if (view == null) {
            C7573i.m23583a("mRootView");
        }
        view.setOnClickListener(new C28972b(this));
        LinearLayout linearLayout = this.f76322a;
        if (linearLayout == null) {
            C7573i.m23583a("mOptionsView");
        }
        linearLayout.getViewTreeObserver().addOnGlobalLayoutListener(new C28973c(this));
    }

    /* renamed from: a */
    public final void mo74250a(List<C28968g> list) {
        LinearLayout linearLayout = this.f76322a;
        if (linearLayout == null) {
            C7573i.m23583a("mOptionsView");
        }
        linearLayout.removeAllViews();
        for (C28968g gVar : list) {
            if (gVar instanceof C28969h) {
                C28983e eVar = new C28983e(getContext());
                eVar.mo74269a((C28969h) gVar);
                LinearLayout linearLayout2 = this.f76322a;
                if (linearLayout2 == null) {
                    C7573i.m23583a("mOptionsView");
                }
                linearLayout2.addView(eVar);
            } else if (gVar instanceof C28964c) {
                C28975a aVar = new C28975a(getContext());
                aVar.mo74259a((C28964c) gVar);
                LinearLayout linearLayout3 = this.f76322a;
                if (linearLayout3 == null) {
                    C7573i.m23583a("mOptionsView");
                }
                linearLayout3.addView(aVar);
            } else if (gVar instanceof C28966e) {
                C28981d dVar = new C28981d(getContext());
                dVar.mo74267a((C28966e) gVar);
                LinearLayout linearLayout4 = this.f76322a;
                if (linearLayout4 == null) {
                    C7573i.m23583a("mOptionsView");
                }
                linearLayout4.addView(dVar);
            }
        }
        LinearLayout linearLayout5 = this.f76322a;
        if (linearLayout5 == null) {
            C7573i.m23583a("mOptionsView");
        }
        linearLayout5.requestLayout();
    }

    public C28970i(Context context, Aweme aweme, String str) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(str, "enterFrom");
        super(context, R.style.g_, true, false, false);
        this.f76324c = new C28933a(this, aweme, str);
    }
}
