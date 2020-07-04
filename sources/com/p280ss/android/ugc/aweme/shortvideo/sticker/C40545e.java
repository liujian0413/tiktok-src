package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.port.p1479in.C35590t;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p280ss.android.ugc.aweme.utils.C42962b;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e */
public final class C40545e {

    /* renamed from: b */
    public static final C40546a f105360b = new C40546a(null);

    /* renamed from: a */
    public DmtTextView f105361a;

    /* renamed from: c */
    private RemoteImageView f105362c;

    /* renamed from: d */
    private final LinearLayout f105363d;

    /* renamed from: e */
    private final Context f105364e;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e$a */
    public static final class C40546a {
        private C40546a() {
        }

        public /* synthetic */ C40546a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.e$b */
    static final class C40547b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C40545e f105365a;

        /* renamed from: b */
        final /* synthetic */ FaceStickerBean f105366b;

        /* renamed from: c */
        final /* synthetic */ String f105367c;

        C40547b(C40545e eVar, FaceStickerBean faceStickerBean, String str) {
            this.f105365a = eVar;
            this.f105366b = faceStickerBean;
            this.f105367c = str;
        }

        public final void onClick(View view) {
            Context context;
            String str;
            Context context2;
            String str2;
            ClickInstrumentation.onClick(view);
            C42962b.f111525a.mo104671a("click_transform_link", C22984d.m75611a().mo59971a("prop_id", this.f105366b.getStickerId()).mo59973a("shoot_way", this.f105367c).mo59973a("carrier_type", "prop_panel").f60753a);
            C35590t C = C35574k.m114859a().mo70069C();
            DmtTextView dmtTextView = this.f105365a.f105361a;
            if (dmtTextView != null) {
                context = dmtTextView.getContext();
            } else {
                context = null;
            }
            FaceStickerCommerceBean faceStickerCommerceBean = this.f105366b.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null) {
                str = faceStickerCommerceBean.f108865b;
            } else {
                str = null;
            }
            if (!C.mo83174a(context, str, false)) {
                C35590t C2 = C35574k.m114859a().mo70069C();
                DmtTextView dmtTextView2 = this.f105365a.f105361a;
                if (dmtTextView2 != null) {
                    context2 = dmtTextView2.getContext();
                } else {
                    context2 = null;
                }
                FaceStickerCommerceBean faceStickerCommerceBean2 = this.f105366b.getFaceStickerCommerceBean();
                if (faceStickerCommerceBean2 != null) {
                    str2 = faceStickerCommerceBean2.f108864a;
                } else {
                    str2 = null;
                }
                C2.mo83173a(context2, C40545e.m129625a(str2, "commerce_sticker_tag"), (String) null);
            }
        }
    }

    /* renamed from: a */
    private final void m129626a(LinearLayout linearLayout) {
        this.f105362c = (RemoteImageView) linearLayout.findViewById(R.id.a0j);
        this.f105361a = (DmtTextView) linearLayout.findViewById(R.id.a0l);
    }

    public C40545e(LinearLayout linearLayout, Context context) {
        C7573i.m23587b(linearLayout, "commerceStickerGoodsLayout");
        C7573i.m23587b(context, "context");
        this.f105363d = linearLayout;
        this.f105364e = context;
        m129626a(this.f105363d);
    }

    /* renamed from: a */
    public static String m129625a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return Uri.parse(str).buildUpon().appendQueryParameter("commerce_enter_from", str2).build().toString();
        }
        return str;
    }

    /* renamed from: a */
    private final void m129627a(FaceStickerBean faceStickerBean, String str) {
        String str2;
        C42962b.f111525a.mo104671a("show_transform_link", C22984d.m75611a().mo59971a("prop_id", faceStickerBean.getStickerId()).mo59973a("shoot_way", str).mo59973a("carrier_type", "prop_panel").f60753a);
        this.f105363d.setVisibility(0);
        RemoteImageView remoteImageView = this.f105362c;
        UrlModel iconUrl = faceStickerBean.getIconUrl();
        C7573i.m23582a((Object) iconUrl, "bean.iconUrl");
        C23323e.m76514a(remoteImageView, (String) iconUrl.getUrlList().get(0));
        DmtTextView dmtTextView = this.f105361a;
        if (dmtTextView != null) {
            FaceStickerCommerceBean faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null) {
                str2 = faceStickerCommerceBean.f108866c;
            } else {
                str2 = null;
            }
            dmtTextView.setText(str2);
        }
        if (C6399b.m19944t()) {
            DmtTextView dmtTextView2 = this.f105361a;
            if (dmtTextView2 != null) {
                dmtTextView2.setFontType("ProximaNova-Semibold");
            }
        } else {
            DmtTextView dmtTextView3 = this.f105361a;
            if (dmtTextView3 != null) {
                dmtTextView3.setFontType("PingFangSC-Medium");
            }
        }
        this.f105363d.setOnClickListener(new C40547b(this, faceStickerBean, str));
    }

    /* renamed from: a */
    public final boolean mo100619a(Effect effect, String str) {
        FaceStickerBean a = C40376ag.m129117a(effect);
        C7573i.m23582a((Object) a, "StickerConfig.covert(effect)");
        if (effect != null && effect.isBusiness()) {
            FaceStickerCommerceBean faceStickerCommerceBean = a.getFaceStickerCommerceBean();
            if (faceStickerCommerceBean != null && 1 == faceStickerCommerceBean.f108867d) {
                m129627a(a, str);
                return true;
            }
        }
        this.f105363d.setVisibility(8);
        return false;
    }
}
