package com.p280ss.android.ugc.aweme.mix;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.detail.DetailViewModel;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.feed.model.MixStatusStruct;
import com.p280ss.android.ugc.aweme.feed.model.MixStruct;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView;
import com.p280ss.android.ugc.aweme.music.p1410ui.CheckableImageView.C33833a;
import com.p280ss.android.ugc.aweme.poi.widget.C35481c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7585d;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.mix.e */
public final class C33539e implements C0053p<Boolean>, C27746c {

    /* renamed from: c */
    public static final C33543a f87588c = new C33543a(null);

    /* renamed from: a */
    public boolean f87589a;

    /* renamed from: b */
    public final View f87590b;

    /* renamed from: d */
    private MixStruct f87591d;

    /* renamed from: e */
    private final C27743a f87592e;

    /* renamed from: f */
    private C35481c f87593f;

    /* renamed from: g */
    private final CheckableImageView f87594g;

    /* renamed from: h */
    private final DmtTextView f87595h;

    /* renamed from: i */
    private final String f87596i;

    /* renamed from: j */
    private final String f87597j;

    /* renamed from: k */
    private final boolean f87598k;

    /* renamed from: com.ss.android.ugc.aweme.mix.e$a */
    public static final class C33543a {
        private C33543a() {
        }

        public /* synthetic */ C33543a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: d */
    public final void mo85879d() {
        C42961az.m136383d(this);
    }

    /* renamed from: e */
    private final void m108401e() {
        this.f87589a = !this.f87589a;
    }

    /* renamed from: b */
    public final void mo85877b() {
        int i;
        CheckableImageView checkableImageView = this.f87594g;
        if (checkableImageView != null) {
            if (this.f87589a) {
                i = R.drawable.alg;
            } else {
                i = R.drawable.ali;
            }
            checkableImageView.setImageResource(i);
        }
    }

    /* renamed from: c */
    public final void mo85878c() {
        int i;
        C35481c cVar = this.f87593f;
        if (cVar != null && !this.f87589a && cVar.isShowing()) {
            cVar.dismiss();
        }
        DmtTextView dmtTextView = this.f87595h;
        if (dmtTextView != null) {
            if (this.f87589a) {
                i = R.string.a67;
            } else {
                i = R.string.a60;
            }
            dmtTextView.setText(i);
        }
    }

    /* renamed from: a */
    public final void mo85875a() {
        Object obj;
        String str;
        C27743a aVar = this.f87592e;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(5);
        MixStruct mixStruct = this.f87591d;
        String str2 = null;
        if (mixStruct != null) {
            obj = mixStruct.mixId;
        } else {
            obj = null;
        }
        objArr[1] = obj;
        objArr[2] = Integer.valueOf(this.f87589a ^ true ? 1 : 0);
        aVar.mo56976a(objArr);
        m108401e();
        CheckableImageView checkableImageView = this.f87594g;
        if (checkableImageView != null) {
            checkableImageView.mo86446b();
        }
        boolean z = !this.f87589a;
        MixStruct mixStruct2 = this.f87591d;
        if (mixStruct2 != null) {
            str = mixStruct2.mixId;
        } else {
            str = null;
        }
        MixStruct mixStruct3 = this.f87591d;
        if (mixStruct3 != null) {
            User user = mixStruct3.author;
            if (user != null) {
                str2 = user.getUid();
            }
        }
        C28506u.m93706a(z, str, str2, this.f87597j, "compilation_detail", this.f87596i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Boolean bool) {
        C35481c cVar = this.f87593f;
        if (cVar != null && cVar.isShowing()) {
            cVar.dismiss();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r2.isCollected() == 1) goto L_0x0013;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo85876a(com.p280ss.android.ugc.aweme.feed.model.MixStruct r2) {
        /*
            r1 = this;
            r1.f87591d = r2
            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r1.f87591d
            r0 = 1
            if (r2 == 0) goto L_0x0012
            com.ss.android.ugc.aweme.feed.model.MixStatusStruct r2 = r2.status
            if (r2 == 0) goto L_0x0012
            int r2 = r2.isCollected()
            if (r2 != r0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            r1.f87589a = r0
            r1.mo85877b()
            r1.mo85878c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.C33539e.mo85876a(com.ss.android.ugc.aweme.feed.model.MixStruct):void");
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
        m108401e();
        mo85877b();
        mo85878c();
    }

    @C7709l
    public final void updateCollectStatus(C33545g gVar) {
        String str;
        C7573i.m23587b(gVar, "mixAddCollectEvent");
        if (gVar.f87603a != null && this.f87591d != null) {
            String str2 = gVar.f87603a;
            MixStruct mixStruct = this.f87591d;
            if (mixStruct != null) {
                str = mixStruct.mixId;
            } else {
                str = null;
            }
            if (str2.equals(str)) {
                MixStruct mixStruct2 = this.f87591d;
                if (mixStruct2 != null) {
                    MixStatusStruct mixStatusStruct = mixStruct2.status;
                    if (mixStatusStruct != null) {
                        mixStatusStruct.setCollected(gVar.f87604b);
                    }
                }
                mo85876a(this.f87591d);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
        if (r9 == null) goto L_0x00a8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61803a(com.p280ss.android.ugc.aweme.base.api.BaseResponse r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.feed.model.MixStruct r9 = r8.f87591d
            if (r9 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.feed.model.MixStatusStruct r9 = r9.status
            if (r9 == 0) goto L_0x000d
            boolean r0 = r8.f87589a
            r9.setCollected(r0)
        L_0x000d:
            com.ss.android.ugc.aweme.mix.g r9 = new com.ss.android.ugc.aweme.mix.g
            com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r8.f87591d
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = r0.mixId
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            boolean r2 = r8.f87589a
            r9.<init>(r0, r2)
            com.p280ss.android.ugc.aweme.utils.C42961az.m136380a(r9)
            boolean r9 = r8.f87589a
            if (r9 == 0) goto L_0x007f
            java.lang.String r9 = "mix_collect_remind_flag"
            boolean r9 = com.p280ss.android.ugc.aweme.feed.p1234j.C28504t.m93693a(r9)
            if (r9 != 0) goto L_0x007f
            android.view.View r9 = r8.f87590b
            if (r9 == 0) goto L_0x0079
            android.content.Context r9 = r9.getContext()
            if (r9 == 0) goto L_0x0079
            android.widget.ImageView r9 = new android.widget.ImageView
            android.view.View r0 = r8.f87590b
            android.content.Context r0 = r0.getContext()
            r9.<init>(r0)
            android.view.View r0 = r8.f87590b
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2131101970(0x7f060912, float:1.7816365E38)
            int r0 = r0.getColor(r2)
            r9.setBackgroundColor(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r9.setScaleType(r0)
            android.view.View r0 = r8.f87590b
            android.content.Context r0 = r0.getContext()
            r2 = 1086324736(0x40c00000, float:6.0)
            float r0 = com.bytedance.p073ad.symphony.util.C2202e.m9512a(r0, r2)
            int r0 = (int) r0
            r9.setPadding(r0, r0, r0, r0)
            com.p280ss.android.ugc.aweme.setting.C7213d.m22500a()
            boolean r0 = com.p280ss.android.ugc.aweme.setting.C7213d.m22502aq()
            if (r0 == 0) goto L_0x0073
            r0 = 2131233515(0x7f080aeb, float:1.808317E38)
            goto L_0x0076
        L_0x0073:
            r0 = 2131233514(0x7f080aea, float:1.8083168E38)
        L_0x0076:
            r9.setImageResource(r0)
        L_0x0079:
            java.lang.String r9 = "mix_collect_remind_flag"
            r0 = 1
            com.p280ss.android.ugc.aweme.feed.p1234j.C28504t.m93690a(r9, r0)
        L_0x007f:
            boolean r9 = r8.f87589a
            if (r9 == 0) goto L_0x00b4
            com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r8.f87595h
            if (r9 == 0) goto L_0x008b
            android.content.Context r1 = r9.getContext()
        L_0x008b:
            android.app.Activity r3 = com.p280ss.android.ugc.aweme.base.utils.C23487o.m77130a(r1)
            boolean r9 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r9 != 0) goto L_0x00b4
            if (r3 == 0) goto L_0x00b4
            android.view.View r2 = r8.f87590b
            java.lang.String r4 = "compilation"
            java.lang.String r5 = "compilation"
            com.ss.android.ugc.aweme.feed.model.MixStruct r9 = r8.f87591d
            if (r9 == 0) goto L_0x00a8
            java.lang.String r9 = r9.mixId
            if (r9 != 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r6 = r9
            goto L_0x00ab
        L_0x00a8:
            java.lang.String r9 = ""
            goto L_0x00a6
        L_0x00ab:
            boolean r7 = r8.f87598k
            com.ss.android.ugc.aweme.poi.widget.c r9 = com.p280ss.android.ugc.aweme.detail.C26051c.m85573a(r2, r3, r4, r5, r6, r7)
            r8.f87593f = r9
            return
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.mix.C33539e.mo61803a(com.ss.android.ugc.aweme.base.api.BaseResponse):void");
    }

    public C33539e(View view, CheckableImageView checkableImageView, DmtTextView dmtTextView, String str, String str2, final OnClickListener onClickListener, boolean z) {
        C7573i.m23587b(str, "mEnterMethod");
        this.f87590b = view;
        this.f87594g = checkableImageView;
        this.f87595h = dmtTextView;
        this.f87596i = str;
        this.f87597j = str2;
        this.f87598k = z;
        this.f87592e = new C27743a();
        C42961az.m136382c(this);
        View view2 = this.f87590b;
        if (view2 != null) {
            view2.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C33539e f87599a;

                {
                    this.f87599a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    IAccountUserService a = C21115b.m71197a();
                    C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
                    if (!a.isLogin()) {
                        C32656f.m105744a(C23487o.m77158e(this.f87599a.f87590b), "compilation_detail", "click_favorite_compilation", (Bundle) null, (C23305g) new C33544f(new C7561a<C7581n>(this.f87599a) {
                            public final String getName() {
                                return "requestCollect";
                            }

                            public final C7585d getOwner() {
                                return C7575l.m23595a(C33539e.class);
                            }

                            public final String getSignature() {
                                return "requestCollect()V";
                            }

                            /* renamed from: a */
                            private void m108409a() {
                                ((C33539e) this.receiver).mo85875a();
                            }

                            public final /* synthetic */ Object invoke() {
                                m108409a();
                                return C7581n.f20898a;
                            }
                        }));
                        return;
                    }
                    this.f87599a.mo85875a();
                    OnClickListener onClickListener = onClickListener;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }
        CheckableImageView checkableImageView2 = this.f87594g;
        if (checkableImageView2 != null) {
            checkableImageView2.setOnStateChangeListener(new C33833a(this) {

                /* renamed from: a */
                final /* synthetic */ C33539e f87601a;

                /* renamed from: a */
                public final void mo61810a() {
                    this.f87601a.mo85878c();
                }

                {
                    this.f87601a = r1;
                }

                /* renamed from: a */
                public final void mo61811a(int i) {
                    if (i == 1) {
                        this.f87601a.mo85877b();
                    }
                }
            });
        }
        this.f87592e.mo66537a(this);
        Activity e = C23487o.m77158e(this.f87590b);
        if (e != null) {
            NextLiveData<Boolean> nextLiveData = ((DetailViewModel) C0069x.m159a((FragmentActivity) e).mo147a(DetailViewModel.class)).f68836a;
            Activity e2 = C23487o.m77158e(this.f87590b);
            if (e2 != null) {
                nextLiveData.observe((FragmentActivity) e2, this);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public /* synthetic */ C33539e(View view, CheckableImageView checkableImageView, DmtTextView dmtTextView, String str, String str2, OnClickListener onClickListener, boolean z, int i, C7571f fVar) {
        this(view, checkableImageView, dmtTextView, str, str2, null, false);
    }
}
