package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25341ca;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout.C25742b;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25764a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import com.p280ss.android.ugc.aweme.share.p1530b.C37997a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ak */
public final class C28787ak extends C37997a implements OnClickListener, C25764a {

    /* renamed from: a */
    public int f75919a = 4000;

    /* renamed from: b */
    public boolean f75920b = false;

    /* renamed from: c */
    public C28790a f75921c;

    /* renamed from: d */
    public long f75922d = 0;

    /* renamed from: e */
    public Activity f75923e;

    /* renamed from: f */
    public RelativeLayout f75924f;

    /* renamed from: g */
    private PullUpLayout f75925g;

    /* renamed from: h */
    private View f75926h = ((LayoutInflater) C6399b.m19921a().getSystemService("layout_inflater")).inflate(R.layout.agw, null);

    /* renamed from: i */
    private RemoteImageView f75927i;

    /* renamed from: j */
    private Aweme f75928j;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ak$a */
    class C28790a implements Runnable {

        /* renamed from: b */
        private boolean f75933b;

        /* renamed from: a */
        public final void mo74019a() {
            this.f75933b = true;
        }

        /* renamed from: b */
        public final void mo74020b() {
            this.f75933b = false;
        }

        public final void run() {
            if (!this.f75933b && System.currentTimeMillis() >= C28787ak.this.f75922d) {
                C28787ak.this.mo74016c();
            }
        }

        private C28790a() {
        }
    }

    /* renamed from: a */
    public final void mo66884a() {
        this.f75920b = false;
        mo74016c();
    }

    /* renamed from: d */
    private void m94785d() {
        setContentView(this.f75926h);
        setWidth(C9738o.m28691a(C6399b.m19921a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wk);
    }

    public C28787ak() {
        super(C6399b.m19921a());
        m94783a(this.f75926h);
        this.f75921c = new C28790a();
        setBackgroundDrawable(new ColorDrawable(0));
        m94785d();
    }

    /* renamed from: c */
    public final void mo74016c() {
        if (isShowing() && !this.f75920b) {
            try {
                if (this.f75923e != null && !this.f75923e.isFinishing()) {
                    this.f75925g.mo66733a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f75923e = null;
        }
    }

    /* renamed from: b */
    public final void mo74014b() {
        int i;
        this.f75925g.mo66732a();
        if (this.f75923e != null && !this.f75923e.isFinishing() && !isShowing()) {
            this.f75922d = System.currentTimeMillis() + ((long) this.f75919a);
            this.f75925g.postDelayed(this.f75921c, (long) this.f75919a);
            if (this.f75926h.getParent() != null) {
                ((ViewGroup) this.f75926h.getParent()).removeView(this.f75926h);
            }
            try {
                View decorView = this.f75923e.getWindow().getDecorView();
                if (VERSION.SDK_INT >= 19) {
                    i = -C9738o.m28717e(C6399b.m19921a());
                } else {
                    i = C9738o.m28717e(C6399b.m19921a());
                }
                showAtLocation(decorView, 48, 0, i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m94784a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null || aweme.getVideo() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m94783a(View view) {
        this.f75927i = (RemoteImageView) view.findViewById(R.id.b_d);
        this.f75924f = (RelativeLayout) view.findViewById(R.id.cuw);
        this.f75925g = (PullUpLayout) view.findViewById(R.id.clx);
        this.f75925g.mo66734a((View) this.f75924f, false);
        this.f75925g.setPullUpListener(this);
        this.f75927i.setOnClickListener(this);
        this.f75925g.setInternalTouchEventListener(new C25742b() {
            /* renamed from: a */
            public final void mo66747a(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        C28787ak.this.f75920b = true;
                        if (C28787ak.this.f75921c != null) {
                            C28787ak.this.f75921c.mo74019a();
                            return;
                        }
                        break;
                    case 1:
                        C28787ak.this.f75920b = false;
                        C28787ak.this.f75922d = System.currentTimeMillis() + ((long) C28787ak.this.f75919a);
                        C28787ak.this.f75921c.mo74020b();
                        C28787ak.this.f75924f.postDelayed(C28787ak.this.f75921c, (long) C28787ak.this.f75919a);
                        break;
                    case 2:
                        C28787ak.this.f75920b = true;
                        return;
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo74015b(Aweme aweme) {
        this.f75928j = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
        C23323e.m76506a(this.f75927i, this.f75928j.getVideo().getCover(), (int) C9738o.m28708b((Context) this.f75923e, 49.0f), (int) C9738o.m28708b((Context) this.f75923e, 59.0f));
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.b_d) {
            C7195s a = C7195s.m22438a();
            Activity activity = this.f75923e;
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(this.f75928j.getAid());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("refer", "upload").mo18695a());
            ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(11);
            mo74016c();
        }
    }

    /* renamed from: c */
    public final void mo74017c(final Aweme aweme) {
        C25000i a = CommerceSettingsApi.m80550a();
        if (a != null && a.f65917a != null && NonStandardAdPostExperiment.INSTANCE.notDisable()) {
            this.f75924f.setBackgroundResource(R.drawable.ur);
            ViewGroup viewGroup = (ViewGroup) this.f75926h.findViewById(R.id.cii);
            viewGroup.setVisibility(0);
            ImageView imageView = (ImageView) this.f75926h.findViewById(R.id.cil);
            Drawable a2 = C25341ca.m83271a(this.f75926h.getResources(), R.drawable.bdv);
            if (a2 == null) {
                imageView.setImageResource(R.color.l0);
            } else {
                imageView.setImageDrawable(a2);
            }
            viewGroup.findViewById(R.id.cik).bringToFront();
            DmtTextView dmtTextView = (DmtTextView) viewGroup.findViewById(R.id.cin);
            if (TextUtils.isEmpty(a.f65917a.f65926b)) {
                dmtTextView.setVisibility(8);
            } else {
                dmtTextView.setVisibility(0);
                dmtTextView.setText(a.f65917a.f65926b);
            }
            C25354g.m83374a((RemoteImageView) viewGroup.findViewById(R.id.cim), a.f65917a.f65925a, (C13401d<C13648f>) new C13400c<C13648f>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                    HashMap hashMap = new HashMap();
                    AwemeStatus status = aweme.getStatus();
                    if (status != null) {
                        switch (status.getPrivateStatus()) {
                            case 0:
                                hashMap.put("privacy_status", "public");
                                break;
                            case 1:
                                hashMap.put("privacy_status", "private");
                                break;
                            case 2:
                                hashMap.put("privacy_status", "friend");
                                break;
                        }
                    }
                    hashMap.put("enter_from", "release");
                    C6907h.m21524a("show_ad_sticker", (Map) hashMap);
                }
            });
            viewGroup.setOnClickListener(new C28791al(this, aweme, a));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74013a(Aweme aweme, C25000i iVar, View view) {
        if (NonStandardAdPostExperiment.INSTANCE.enable()) {
            HashMap hashMap = new HashMap();
            AwemeStatus status = aweme.getStatus();
            if (status != null) {
                switch (status.getPrivateStatus()) {
                    case 0:
                        hashMap.put("privacy_status", "public");
                        break;
                    case 1:
                        hashMap.put("privacy_status", "private");
                        break;
                    case 2:
                        hashMap.put("privacy_status", "friend");
                        break;
                }
            }
            hashMap.put("enter_from", "release");
            C6907h.m21524a("click_ad_sticker", (Map) hashMap);
            if (!C24671f.m80853c().mo64688a((Context) this.f75923e, iVar.f65917a.f65927c, false)) {
                C24671f.m80853c().mo64687a((Context) this.f75923e, iVar.f65917a.f65928d, iVar.f65917a.f65929e);
            }
        }
    }
}
