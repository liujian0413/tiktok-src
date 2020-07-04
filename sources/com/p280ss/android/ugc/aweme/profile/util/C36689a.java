package com.p280ss.android.ugc.aweme.profile.util;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13396a;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p280ss.android.ugc.aweme.utils.C43070ds;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.util.a */
public final class C36689a {

    /* renamed from: k */
    public static final C36690a f96315k = new C36690a(null);

    /* renamed from: a */
    public C32961dd f96316a;

    /* renamed from: b */
    public boolean f96317b = C29132a.m95560a();

    /* renamed from: c */
    public String f96318c = "";

    /* renamed from: d */
    public String f96319d = "";

    /* renamed from: e */
    public final Context f96320e;

    /* renamed from: f */
    public final FrameLayout f96321f;

    /* renamed from: g */
    public final RemoteImageView f96322g;

    /* renamed from: h */
    public final DmtTextView f96323h;

    /* renamed from: i */
    public final ImageView f96324i;

    /* renamed from: j */
    public final ImageView f96325j;

    /* renamed from: com.ss.android.ugc.aweme.profile.util.a$a */
    public static final class C36690a {
        private C36690a() {
        }

        public /* synthetic */ C36690a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.a$b */
    static final class C36691b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36689a f96326a;

        C36691b(C36689a aVar) {
            this.f96326a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FrameLayout frameLayout = this.f96326a.f96321f;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            this.f96326a.f96316a.mo60478j(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.a$c */
    static final class C36692c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C36689a f96327a;

        /* renamed from: b */
        final /* synthetic */ LinkInfo f96328b;

        /* renamed from: c */
        final /* synthetic */ boolean f96329c;

        C36692c(C36689a aVar, LinkInfo linkInfo, boolean z) {
            this.f96327a = aVar;
            this.f96328b = linkInfo;
            this.f96329c = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f96327a.f96325j != null) {
                this.f96327a.f96325j.setVisibility(8);
            }
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).jumpToH5(this.f96328b.url, this.f96327a.f96320e);
            if (this.f96329c) {
                this.f96327a.f96316a.mo60459b("true");
            }
            if (!C7573i.m23585a((Object) this.f96327a.f96318c, (Object) "others_homepage")) {
                C22984d a = C22984d.m75611a();
                a.mo59973a("enter_from", "personal_homepage");
                if (this.f96327a.f96317b) {
                    a.mo59973a("gen", C29132a.m95567d());
                }
                C6907h.m21524a("h5_enter_detail", (Map) a.f60753a);
            }
            if (this.f96327a.f96317b && C7573i.m23585a((Object) this.f96327a.f96318c, (Object) "others_homepage")) {
                C22984d a2 = C22984d.m75611a();
                a2.mo59973a("enter_from", this.f96327a.f96318c);
                a2.mo59973a("to_user_id", this.f96327a.f96319d);
                a2.mo59973a("gen", C29132a.m95567d());
                C6907h.m21524a("xmas_banner_click", (Map) a2.f60753a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.util.a$d */
    public static final class C36693d extends C13400c<C13648f> {

        /* renamed from: a */
        final /* synthetic */ C36689a f96330a;

        /* renamed from: b */
        final /* synthetic */ LayoutParams f96331b;

        /* renamed from: c */
        final /* synthetic */ LinkInfo f96332c;

        C36693d(C36689a aVar, LayoutParams layoutParams, LinkInfo linkInfo) {
            this.f96330a = aVar;
            this.f96331b = layoutParams;
            this.f96332c = linkInfo;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            super.onFinalImageSet(str, fVar, animatable);
            ImageView imageView = this.f96330a.f96324i;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            this.f96331b.gravity = 17;
            this.f96330a.f96323h.setLayoutParams(this.f96331b);
            this.f96330a.f96323h.setTextColor(Color.parseColor(this.f96332c.fontColor));
        }
    }

    /* renamed from: a */
    public final void mo93031a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f96319d = str;
    }

    /* renamed from: b */
    private final boolean m118336b(LinkInfo linkInfo) {
        if (C6399b.m19944t()) {
            return false;
        }
        String c = this.f96316a.mo60462c("");
        if (TextUtils.equals("true", this.f96316a.mo60455a(""))) {
            return false;
        }
        try {
            int i = linkInfo.closeAfter;
            if (i < 0) {
                return false;
            }
            Long valueOf = Long.valueOf(c);
            long currentTimeMillis = System.currentTimeMillis();
            C7573i.m23582a((Object) valueOf, "firstShowTime");
            if (currentTimeMillis - valueOf.longValue() > ((long) i) * 86400000) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo93030a(LinkInfo linkInfo) {
        ViewGroup.LayoutParams layoutParams;
        if (linkInfo != null) {
            FrameLayout frameLayout = this.f96321f;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
            if (this.f96317b && C7573i.m23585a((Object) this.f96318c, (Object) "others_homepage")) {
                C22984d a = C22984d.m75611a();
                a.mo59973a("enter_from", this.f96318c);
                a.mo59973a("gen", C29132a.m95567d());
                a.mo59973a("to_user_id", this.f96319d);
                C6907h.m21524a("xmas_banner_show", (Map) a.f60753a);
            }
            if (!C7573i.m23585a((Object) this.f96318c, (Object) "others_homepage")) {
                C22984d a2 = C22984d.m75611a();
                a2.mo59973a("enter_from", "personal_homepage");
                if (this.f96317b) {
                    a2.mo59973a("gen", C29132a.m95567d());
                }
                C6907h.m21524a("h5_show_detail", (Map) a2.f60753a);
            }
            DmtTextView dmtTextView = this.f96323h;
            C13386a aVar = null;
            if (dmtTextView != null) {
                layoutParams = dmtTextView.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                if (VERSION.SDK_INT >= 21) {
                    RemoteImageView remoteImageView = this.f96322g;
                    if (remoteImageView != null) {
                        remoteImageView.setOutlineProvider(new C43070ds(C23486n.m77122a(2.0d)));
                    }
                    RemoteImageView remoteImageView2 = this.f96322g;
                    if (remoteImageView2 != null) {
                        remoteImageView2.setClipToOutline(true);
                    }
                }
                if (m118336b(linkInfo) && this.f96325j != null) {
                    this.f96325j.setVisibility(0);
                    this.f96325j.setOnClickListener(new C36691b(this));
                }
                boolean equals = true ^ TextUtils.equals(this.f96316a.mo60455a(""), "true");
                if (C6399b.m19944t() || equals || !linkInfo.disappearAfterClicked) {
                    ImageRequest b = ImageRequestBuilder.m40865a(Uri.parse(linkInfo.backgroundUrl)).mo33476b();
                    C13382e a3 = C13380c.m39166a();
                    RemoteImageView remoteImageView3 = this.f96322g;
                    if (remoteImageView3 != null) {
                        aVar = remoteImageView3.getController();
                    }
                    C13396a c = ((C13382e) ((C13382e) ((C13382e) a3.mo32729b(aVar)).mo32743a((C13401d<? super INFO>) new C36693d<Object>(this, layoutParams2, linkInfo))).mo32748b(b)).mo32730f();
                    RemoteImageView remoteImageView4 = this.f96322g;
                    if (remoteImageView4 != null) {
                        remoteImageView4.setController(c);
                    }
                } else {
                    ImageView imageView = this.f96324i;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    layoutParams2.gravity = 16;
                    RemoteImageView remoteImageView5 = this.f96322g;
                    if (remoteImageView5 != null) {
                        remoteImageView5.setBackgroundColor(R.color.a4l);
                    }
                    DmtTextView dmtTextView2 = this.f96323h;
                    if (dmtTextView2 != null) {
                        dmtTextView2.setLayoutParams(layoutParams2);
                    }
                }
                DmtTextView dmtTextView3 = this.f96323h;
                if (dmtTextView3 != null) {
                    dmtTextView3.setText(linkInfo.text);
                }
                FrameLayout frameLayout2 = this.f96321f;
                if (frameLayout2 != null) {
                    frameLayout2.setOnClickListener(new C36692c(this, linkInfo, equals));
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        } else {
            FrameLayout frameLayout3 = this.f96321f;
            if (frameLayout3 != null) {
                frameLayout3.setVisibility(8);
            }
        }
    }

    public C36689a(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2) {
        C7573i.m23587b(context, "context");
        this.f96320e = context;
        this.f96321f = frameLayout;
        this.f96322g = remoteImageView;
        this.f96323h = dmtTextView;
        this.f96324i = imageView;
        this.f96325j = imageView2;
        Object a = C23336d.m76560a(this.f96320e, C32961dd.class);
        C7573i.m23582a(a, "SharedPreferencesHelper.…bPreferences::class.java)");
        this.f96316a = (C32961dd) a;
    }
}
