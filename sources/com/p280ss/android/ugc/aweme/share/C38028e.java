package com.p280ss.android.ugc.aweme.share;

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
import android.view.ViewStub;
import android.view.WindowManager.BadTokenException;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p280ss.android.ugc.aweme.commercialize.model.C25000i;
import com.p280ss.android.ugc.aweme.commercialize.model.CommerceStickerInfo;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25341ca;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25354g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout.C25742b;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25764a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.p1385g.C33022h;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import com.p280ss.android.ugc.aweme.share.p1530b.C37997a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.bar.MicroShareChannelBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.e */
public abstract class C38028e extends C37997a implements C25764a {

    /* renamed from: a */
    protected View f98985a;

    /* renamed from: b */
    protected Activity f98986b;

    /* renamed from: c */
    public LinearLayout f98987c;

    /* renamed from: d */
    public C38032a f98988d;

    /* renamed from: e */
    public int f98989e = 4000;

    /* renamed from: f */
    public boolean f98990f;

    /* renamed from: g */
    protected C38380c f98991g;

    /* renamed from: h */
    protected Aweme f98992h;

    /* renamed from: i */
    protected MicroShareChannelBar f98993i;

    /* renamed from: j */
    public long f98994j;

    /* renamed from: k */
    private RemoteImageView f98995k;

    /* renamed from: l */
    private PullUpLayout f98996l;

    /* renamed from: m */
    private View f98997m;

    /* renamed from: n */
    private RemoteImageView f98998n;

    /* renamed from: o */
    private TextView f98999o;

    /* renamed from: p */
    private View f99000p;

    /* renamed from: q */
    private LinearLayout f99001q;

    /* renamed from: r */
    private int f99002r = 49;

    /* renamed from: s */
    private int f99003s = 59;

    /* renamed from: t */
    private int f99004t = 23;

    /* renamed from: u */
    private int f99005u = 23;

    /* renamed from: com.ss.android.ugc.aweme.share.e$a */
    class C38032a implements Runnable {

        /* renamed from: b */
        private boolean f99011b;

        /* renamed from: a */
        public final void mo95670a() {
            this.f99011b = true;
        }

        /* renamed from: b */
        public final void mo95671b() {
            this.f99011b = false;
        }

        public final void run() {
            if (!this.f99011b && System.currentTimeMillis() >= C38028e.this.f98994j) {
                C38028e.this.mo74016c();
            }
        }

        private C38032a() {
        }
    }

    /* renamed from: a */
    public final void mo66884a() {
        this.f98990f = false;
        mo74016c();
    }

    /* renamed from: d */
    private void m121386d() {
        setContentView(this.f98985a);
        setWidth(C9738o.m28691a((Context) this.f98986b));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wk);
    }

    /* renamed from: c */
    public final void mo74016c() {
        if (isShowing() && !this.f98990f) {
            try {
                if (this.f98986b != null && !this.f98986b.isFinishing()) {
                    this.f98996l.mo66733a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo74014b() {
        int i;
        this.f98996l.mo66732a();
        if (this.f98986b != null && !this.f98986b.isFinishing() && !isShowing()) {
            this.f98994j = System.currentTimeMillis() + ((long) this.f98989e);
            this.f98996l.postDelayed(this.f98988d, (long) this.f98989e);
            if (this.f98985a.getParent() != null) {
                ((ViewGroup) this.f98985a.getParent()).removeView(this.f98985a);
            }
            try {
                View decorView = this.f98986b.getWindow().getDecorView();
                if (VERSION.SDK_INT >= 19) {
                    i = -C9738o.m28717e(this.f98986b);
                } else {
                    i = C9738o.m28717e(this.f98986b);
                }
                showAtLocation(decorView, 48, 0, i);
            } catch (BadTokenException unused) {
            }
        }
    }

    /* renamed from: a */
    private void m121382a(UrlModel urlModel) {
        C23323e.m76506a(this.f98995k, urlModel, (int) C9738o.m28708b((Context) this.f98986b, (float) this.f99002r), (int) C9738o.m28708b((Context) this.f98986b, (float) this.f99003s));
    }

    /* renamed from: a */
    public final void mo95667a(Aweme aweme) {
        this.f98992h = aweme;
        m121382a(aweme.getVideo().getCover());
        if (!m121384a(aweme.getCommerceStickerInfo())) {
            m121385b(aweme);
        }
    }

    /* renamed from: a */
    private void m121381a(View view) {
        this.f98995k = (RemoteImageView) view.findViewById(R.id.b_d);
        this.f98987c = (LinearLayout) view.findViewById(R.id.cuw);
        this.f98996l = (PullUpLayout) view.findViewById(R.id.clx);
        this.f98998n = (RemoteImageView) view.findViewById(R.id.b7q);
        this.f98999o = (TextView) view.findViewById(R.id.ds8);
        this.f98997m = view.findViewById(R.id.bqu);
        this.f99000p = view.findViewById(R.id.bm7);
        this.f99001q = (LinearLayout) view.findViewById(R.id.bqe);
        this.f98996l.mo66734a((View) this.f98987c, false);
        this.f98996l.setPullUpListener(this);
        this.f98987c.setLayoutParams(new LayoutParams(-1, -2));
        this.f98995k.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C38028e.this.f98992h != null) {
                    ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(C38028e.this.f98992h);
                    C7195s a = C7195s.m22438a();
                    Activity activity = C38028e.this.f98986b;
                    StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                    sb.append(C38028e.this.f98992h.getAid());
                    a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18693a("profile_enterprise_type", C38028e.this.f98992h.getEnterpriseType()).mo18694a("query_aweme_mode", "from_local").mo18694a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").mo18695a());
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(11);
                }
            }
        });
        this.f98993i = (MicroShareChannelBar) ((ViewStub) view.findViewById(R.id.d5p)).inflate().findViewById(R.id.d5o);
        this.f98996l.setInternalTouchEventListener(new C25742b() {
            /* renamed from: a */
            public final void mo66747a(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        C38028e.this.f98990f = true;
                        if (C38028e.this.f98988d != null) {
                            C38028e.this.f98988d.mo95670a();
                            return;
                        }
                        break;
                    case 1:
                        C38028e.this.f98990f = false;
                        C38028e.this.f98994j = System.currentTimeMillis() + ((long) C38028e.this.f98989e);
                        C38028e.this.f98988d.mo95671b();
                        C38028e.this.f98987c.postDelayed(C38028e.this.f98988d, (long) C38028e.this.f98989e);
                        break;
                    case 2:
                        C38028e.this.f98990f = true;
                        return;
                }
            }
        });
        if (C6399b.m19946v()) {
            this.f99001q.setBackgroundColor(this.f98986b.getResources().getColor(R.color.l0));
        } else {
            this.f99001q.setBackgroundResource(R.drawable.uq);
        }
    }

    /* renamed from: b */
    private void m121385b(final Aweme aweme) {
        C25000i a = CommerceSettingsApi.m80550a();
        if (a != null && a.f65917a != null && NonStandardAdPostExperiment.INSTANCE.notDisable()) {
            this.f99001q.setBackgroundResource(R.drawable.ur);
            ViewGroup viewGroup = (ViewGroup) this.f98985a.findViewById(R.id.cii);
            viewGroup.setVisibility(0);
            ImageView imageView = (ImageView) this.f98985a.findViewById(R.id.cil);
            Drawable a2 = C25341ca.m83271a(this.f98985a.getResources(), R.drawable.bdv);
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
            viewGroup.setOnClickListener(new C38042g(this, aweme, a));
        }
    }

    /* renamed from: a */
    private boolean m121384a(CommerceStickerInfo commerceStickerInfo) {
        if (commerceStickerInfo == null || !commerceStickerInfo.enable()) {
            this.f98997m.setVisibility(8);
            this.f99000p.setVisibility(8);
            return false;
        }
        this.f98997m.setVisibility(0);
        this.f99000p.setVisibility(0);
        C23323e.m76506a(this.f98998n, commerceStickerInfo.getIconUrl(), (int) C9738o.m28708b((Context) this.f98986b, (float) this.f99005u), (int) C9738o.m28708b((Context) this.f98986b, (float) this.f99004t));
        this.f98999o.setText(commerceStickerInfo.getLetters());
        this.f98997m.setOnClickListener(new C38036f(commerceStickerInfo));
        C6907h.m21524a("show_link", (Map) C22984d.m75611a().mo59971a("prop_id", commerceStickerInfo.getCommerceStickerId()).mo59973a("enter_from", "release").mo59973a("link_type", "web_link").f60753a);
        return true;
    }

    public C38028e(Activity activity, C38380c cVar) {
        super(activity);
        this.f98986b = activity;
        this.f98991g = cVar;
        this.f98985a = LayoutInflater.from(activity).inflate(R.layout.agv, null);
        m121381a(this.f98985a);
        this.f98988d = new C38032a();
        setBackgroundDrawable(new ColorDrawable(0));
        m121386d();
    }

    /* renamed from: a */
    static final /* synthetic */ void m121383a(CommerceStickerInfo commerceStickerInfo, View view) {
        if (!TextUtils.isEmpty(commerceStickerInfo.getOpenUrl())) {
            ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60017a(view.getContext(), commerceStickerInfo.getOpenUrl(), false);
        } else if (!TextUtils.isEmpty(commerceStickerInfo.getWebUrl())) {
            ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60016a(view.getContext(), commerceStickerInfo.getWebUrl(), commerceStickerInfo.getWebUrlTitle());
        }
        C6907h.m21524a("click_link", (Map) C22984d.m75611a().mo59971a("prop_id", commerceStickerInfo.getCommerceStickerId()).mo59973a("enter_from", "release").mo59973a("link_type", "web_link").f60753a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95668a(Aweme aweme, C25000i iVar, View view) {
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
            if (!((C33022h) ServiceManager.get().getService(C33022h.class)).mo60017a((Context) this.f98986b, iVar.f65917a.f65927c, false)) {
                ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60016a((Context) this.f98986b, iVar.f65917a.f65928d, iVar.f65917a.f65929e);
            }
        }
    }
}
