package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
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
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import com.p280ss.android.ugc.aweme.share.p1534e.p1535a.C38033a.C38034a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.PhotoUploadSuccessPopView */
public class PhotoUploadSuccessPopView extends PopupWindow implements C25764a {

    /* renamed from: a */
    public int f98811a = 4000;

    /* renamed from: b */
    public View f98812b;

    /* renamed from: c */
    public C37948a f98813c = new C37948a();
    RemoteImageView commerceIconView;
    View commerceLineView;
    TextView commerceMsgView;
    View commerceView;

    /* renamed from: d */
    public boolean f98814d = false;

    /* renamed from: e */
    public long f98815e = 0;

    /* renamed from: f */
    private Activity f98816f;

    /* renamed from: g */
    private Aweme f98817g;

    /* renamed from: h */
    private PhotoContext f98818h;
    RelativeLayout mLayoutView;
    PullUpLayout mPullUpLayout;
    LinearLayout mRootLayout;
    LinearLayout mShareItemContainer;
    RemoteImageView mVideoCover;

    /* renamed from: com.ss.android.ugc.aweme.share.PhotoUploadSuccessPopView$a */
    class C37948a implements Runnable {

        /* renamed from: b */
        private boolean f98823b;

        /* renamed from: a */
        public final void mo95469a() {
            this.f98823b = true;
        }

        /* renamed from: b */
        public final void mo95470b() {
            this.f98823b = false;
        }

        public final void run() {
            if (!this.f98823b && System.currentTimeMillis() >= PhotoUploadSuccessPopView.this.f98815e) {
                PhotoUploadSuccessPopView.this.mo95467c();
            }
        }

        private C37948a() {
        }
    }

    /* renamed from: a */
    public final void mo66884a() {
        this.f98814d = false;
        mo95467c();
    }

    /* renamed from: e */
    private boolean m121227e() {
        if (this.f98817g == null || this.f98817g.getCommerceStickerInfo() == null || !this.f98817g.getCommerceStickerInfo().enable()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m121229g() {
        new C38034a(this.f98816f, this.f98817g, this.mShareItemContainer).mo95673a(this.f98817g, this.f98818h);
    }

    /* renamed from: c */
    public final void mo95467c() {
        if (isShowing() && !this.f98814d) {
            if (this.f98816f != null && !this.f98816f.isFinishing()) {
                this.mPullUpLayout.mo66733a(0.0f, true);
                dismiss();
            }
            this.f98816f = null;
        }
    }

    /* renamed from: f */
    private void m121228f() {
        if (m121227e()) {
            CommerceStickerInfo commerceStickerInfo = this.f98817g.getCommerceStickerInfo();
            this.commerceView.setVisibility(0);
            this.commerceLineView.setVisibility(0);
            C23323e.m76506a(this.commerceIconView, commerceStickerInfo.getIconUrl(), (int) C9738o.m28708b((Context) this.f98816f, 23.0f), (int) C9738o.m28708b((Context) this.f98816f, 23.0f));
            this.commerceMsgView.setText(commerceStickerInfo.getLetters());
            this.commerceView.setOnClickListener(new C38258t(commerceStickerInfo));
            C6907h.m21524a("show_link", (Map) C22984d.m75611a().mo59971a("prop_id", commerceStickerInfo.getCommerceStickerId()).mo59973a("enter_from", "release").mo59973a("link_type", "web_link").f60753a);
            return;
        }
        this.commerceView.setVisibility(8);
        this.commerceLineView.setVisibility(8);
        m121225a(this.f98817g);
    }

    /* renamed from: b */
    public final void mo95466b() {
        if (this.f98816f != null && !this.f98816f.isFinishing() && !isShowing()) {
            this.f98815e = System.currentTimeMillis() + ((long) this.f98811a);
            this.mPullUpLayout.postDelayed(this.f98813c, (long) this.f98811a);
            if (this.f98812b.getParent() != null) {
                ((ViewGroup) this.f98812b.getParent()).removeView(this.f98812b);
            }
            View rootView = this.f98816f.getWindow().getDecorView().getRootView();
            int i = VERSION.SDK_INT;
            showAtLocation(rootView, 48, 0, -C9738o.m28717e(C6399b.m19921a()));
        }
    }

    /* renamed from: d */
    private void m121226d() {
        int e = C9738o.m28717e(C6399b.m19921a());
        if (m121227e()) {
            setHeight(((int) C9738o.m28708b((Context) this.f98816f, 155.5f)) + e);
        } else {
            setHeight(((int) C9738o.m28708b((Context) this.f98816f, 110.0f)) + e);
        }
        setWidth(C9738o.m28691a((Context) this.f98816f));
        setContentView(this.f98812b);
        setBackgroundDrawable(this.f98816f.getResources().getDrawable(R.drawable.blk));
        LayoutParams layoutParams = (LayoutParams) this.mLayoutView.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, e, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.mLayoutView.setLayoutParams(layoutParams);
        setAnimationStyle(R.style.wk);
        setClippingEnabled(false);
        update();
        C23323e.m76514a(this.mVideoCover, Uri.fromFile(new File(this.f98818h.mPhotoLocalPath)).toString());
        this.mPullUpLayout.mo66734a((View) this.mRootLayout, false);
        this.mPullUpLayout.setPullUpListener(this);
        this.mPullUpLayout.setInternalTouchEventListener(new C25742b() {
            /* renamed from: a */
            public final void mo66747a(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        PhotoUploadSuccessPopView.this.f98814d = true;
                        if (PhotoUploadSuccessPopView.this.f98813c != null) {
                            PhotoUploadSuccessPopView.this.f98813c.mo95469a();
                            return;
                        }
                        break;
                    case 1:
                        PhotoUploadSuccessPopView.this.f98814d = false;
                        PhotoUploadSuccessPopView.this.f98815e = System.currentTimeMillis() + ((long) PhotoUploadSuccessPopView.this.f98811a);
                        PhotoUploadSuccessPopView.this.f98813c.mo95470b();
                        PhotoUploadSuccessPopView.this.f98812b.postDelayed(PhotoUploadSuccessPopView.this.f98813c, (long) PhotoUploadSuccessPopView.this.f98811a);
                        break;
                    case 2:
                        PhotoUploadSuccessPopView.this.f98814d = true;
                        return;
                }
            }
        });
        m121229g();
        m121228f();
    }

    /* access modifiers changed from: 0000 */
    public void onClick(View view) {
        C7195s a = C7195s.m22438a();
        Activity activity = this.f98816f;
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(this.f98817g.getAid());
        a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").mo18695a());
        ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setPublishStatus(11);
        mo95467c();
    }

    /* renamed from: a */
    private void m121225a(final Aweme aweme) {
        C25000i a = CommerceSettingsApi.m80550a();
        if (a != null && a.f65917a != null && NonStandardAdPostExperiment.INSTANCE.notDisable()) {
            ViewGroup viewGroup = (ViewGroup) this.f98812b.findViewById(R.id.cii);
            viewGroup.setVisibility(0);
            ImageView imageView = (ImageView) this.f98812b.findViewById(R.id.cil);
            Drawable a2 = C25341ca.m83271a(this.f98812b.getResources(), R.drawable.bdv);
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
            viewGroup.setOnClickListener(new C38259u(this, aweme, a));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m121224a(CommerceStickerInfo commerceStickerInfo, View view) {
        if (!TextUtils.isEmpty(commerceStickerInfo.getOpenUrl())) {
            ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60017a(view.getContext(), commerceStickerInfo.getOpenUrl(), false);
        } else if (!TextUtils.isEmpty(commerceStickerInfo.getWebUrl())) {
            ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60016a(view.getContext(), commerceStickerInfo.getWebUrl(), commerceStickerInfo.getWebUrlTitle());
        }
        C6907h.m21524a("click_link", (Map) C22984d.m75611a().mo59971a("prop_id", commerceStickerInfo.getCommerceStickerId()).mo59973a("enter_from", "release").mo59973a("link_type", "web_link").f60753a);
    }

    public PhotoUploadSuccessPopView(Activity activity, Aweme aweme, PhotoContext photoContext) {
        super(activity);
        this.f98817g = aweme;
        this.f98812b = LayoutInflater.from(activity).inflate(R.layout.al6, null, false);
        this.f98816f = activity;
        this.f98818h = photoContext;
        ButterKnife.bind((Object) this, this.f98812b);
        m121226d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95465a(Aweme aweme, C25000i iVar, View view) {
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
            if (!((C33022h) ServiceManager.get().getService(C33022h.class)).mo60017a((Context) this.f98816f, iVar.f65917a.f65927c, false)) {
                ((C33022h) ServiceManager.get().getService(C33022h.class)).mo60016a((Context) this.f98816f, iVar.f65917a.f65928d, iVar.f65917a.f65929e);
            }
        }
    }
}
