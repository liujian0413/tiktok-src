package com.p280ss.android.ugc.aweme.p1685ug.guide;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p308ui.AnimationImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.C25755a;
import com.p280ss.android.ugc.aweme.main.p1380c.p1381a.C32923a;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a.C38268a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.e */
public final class C42698e extends C32923a {

    /* renamed from: h */
    public static final C42699a f110974h = new C42699a(null);

    /* renamed from: b */
    public final C38267a f110975b;

    /* renamed from: c */
    public final String f110976c = "swipeStrengthLayout";

    /* renamed from: d */
    public View f110977d;

    /* renamed from: e */
    public AnimationImageView f110978e;

    /* renamed from: f */
    public final String f110979f;

    /* renamed from: g */
    public final boolean f110980g;

    /* renamed from: i */
    private SwipeUpGuideStrengthenLayout f110981i;

    /* renamed from: j */
    private final ViewGroup f110982j;

    /* renamed from: k */
    private final C25755a f110983k;

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.e$a */
    public static final class C42699a {
        private C42699a() {
        }

        public /* synthetic */ C42699a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.e$b */
    static final class C42700b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f110984a;

        /* renamed from: b */
        final /* synthetic */ C42698e f110985b;

        C42700b(View view, C42698e eVar) {
            this.f110984a = view;
            this.f110985b = eVar;
        }

        public final void run() {
            this.f110984a.setVisibility(8);
            this.f110985b.f110978e = null;
            this.f110985b.f110975b.mo95906f(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.guide.e$c */
    static final class C42701c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f110986a;

        /* renamed from: b */
        final /* synthetic */ C42698e f110987b;

        C42701c(View view, C42698e eVar) {
            this.f110986a = view;
            this.f110987b = eVar;
        }

        public final void run() {
            this.f110987b.f110978e = (AnimationImageView) this.f110986a.findViewById(R.id.b9t);
            AnimationImageView animationImageView = this.f110987b.f110978e;
            if (animationImageView != null) {
                animationImageView.mo7082c(true);
            }
            AnimationImageView animationImageView2 = this.f110987b.f110978e;
            if (animationImageView2 != null) {
                animationImageView2.setAnimation(this.f110987b.f110979f);
            }
            AnimationImageView animationImageView3 = this.f110987b.f110978e;
            if (animationImageView3 != null) {
                animationImageView3.mo7078b();
            }
            if (this.f110987b.f110980g) {
                C7492s.m23295b(6000, TimeUnit.MILLISECONDS).mo19291a((C7328l<? super T>) new C7328l<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42701c f110988a;

                    {
                        this.f110988a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public boolean mo9283a(Long l) {
                        C7573i.m23587b(l, "it");
                        View view = this.f110988a.f110987b.f110977d;
                        if (view == null || view.getVisibility() != 0) {
                            return false;
                        }
                        return true;
                    }
                }).mo19304b(C47549a.m148327a()).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C42701c f110989a;

                    {
                        this.f110989a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Long l) {
                        this.f110989a.f110987b.dismiss();
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public final boolean mo104312b() {
        View view = this.f110977d;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo104311a() {
        ViewParent viewParent;
        if (this.f110977d == null) {
            m135554c();
        }
        View view = this.f110977d;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent == null) {
            this.f110982j.addView(this.f110977d);
        }
        View view2 = this.f110977d;
        if (view2 != null) {
            view2.setVisibility(0);
            view2.setAlpha(0.0f);
            view2.animate().alpha(1.0f).setDuration(300).withEndAction(new C42701c(view2, this)).start();
            if (C7573i.m23585a((Object) this.f110979f, (Object) "home_swipe_up_lottie_android.json")) {
                C6907h.m21524a("new_user_guide_show", (Map) C22984d.m75611a().mo59973a("guide_type", "slide").f60753a);
            }
            this.f110975b.mo95906f(true);
        }
    }

    public final void dismiss() {
        if (C7573i.m23585a((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            View view = this.f110977d;
            if (view != null) {
                view.animate().alpha(0.0f).setDuration(300).withEndAction(new C42700b(view, this)).start();
            }
        } else {
            String stackTraceString = Log.getStackTraceString(new Throwable("execute UI not in main Thread"));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_stack", stackTraceString);
                jSONObject.put("error_type", "UI_not_in_main");
                C6903bc.m21471L().mo57871a(jSONObject);
            } catch (Exception unused) {
                C6903bc.m21471L().mo57869a(stackTraceString);
            }
        }
    }

    /* renamed from: c */
    private final void m135554c() {
        DmtTextView dmtTextView;
        this.f110977d = LayoutInflater.from(this.f85861a.getContext()).inflate(R.layout.ak7, this.f110982j, false);
        View view = this.f110977d;
        if (view != null) {
            this.f110981i = (SwipeUpGuideStrengthenLayout) view;
            SwipeUpGuideStrengthenLayout swipeUpGuideStrengthenLayout = this.f110981i;
            if (swipeUpGuideStrengthenLayout != null) {
                swipeUpGuideStrengthenLayout.setViewPager(this.f110983k);
                new StringBuilder("viewPager ").append(this.f110983k);
            }
            View view2 = this.f110977d;
            Integer num = null;
            if (view2 != null) {
                dmtTextView = (DmtTextView) view2.findViewById(R.id.e2u);
            } else {
                dmtTextView = null;
            }
            if (C6399b.m19945u() && dmtTextView != null) {
                dmtTextView.setText(this.f85861a.getContext().getText(R.string.e4f));
            }
            if (dmtTextView != null) {
                CharSequence text = dmtTextView.getText();
                if (text != null) {
                    num = Integer.valueOf(text.length());
                }
            }
            if (num != null) {
                int intValue = num.intValue();
                if (intValue <= 0 || 20 < intValue) {
                    if (20 <= intValue && 40 >= intValue) {
                        if (dmtTextView != null) {
                            dmtTextView.setTextSize(25.0f);
                        }
                    } else if (dmtTextView != null) {
                        dmtTextView.setTextSize(20.0f);
                    }
                }
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout");
    }

    public C42698e(ViewGroup viewGroup, C25755a aVar, String str, boolean z) {
        C7573i.m23587b(viewGroup, "viewContainer");
        C7573i.m23587b(aVar, "viewPager");
        C7573i.m23587b(str, "source");
        super(viewGroup);
        this.f110982j = viewGroup;
        this.f110983k = aVar;
        this.f110979f = str;
        this.f110980g = z;
        C38268a aVar2 = C38267a.f99464d;
        Context context = this.f110982j.getContext();
        C7573i.m23582a((Object) context, "viewContainer.context");
        this.f110975b = aVar2.mo95910a(context);
    }
}
