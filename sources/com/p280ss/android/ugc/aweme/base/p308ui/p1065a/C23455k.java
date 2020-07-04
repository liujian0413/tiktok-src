package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Anchor;
import com.p280ss.android.ugc.aweme.feed.model.AnchorShopLinkStruct;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.k */
public final class C23455k extends C23443b {

    /* renamed from: a */
    public final Activity f61901a;

    /* renamed from: b */
    public final String f61902b;

    /* renamed from: a */
    public final void mo59065a() {
    }

    /* renamed from: e */
    private final void m77014e() {
        String str;
        boolean z;
        try {
            str = C30199h.m98861a().getShopLinkAnchorDisclaimer();
        } catch (Exception unused) {
            str = "";
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m77013a(str);
        }
    }

    /* renamed from: b */
    public final void mo59068b() {
        String str;
        String str2 = "enter_product_detail";
        C22984d a = C22984d.m75611a();
        String str3 = "enter_from";
        String str4 = this.f61902b;
        if (str4 == null) {
            str4 = "";
        }
        C22984d a2 = a.mo59973a(str3, str4);
        String str5 = "author_id";
        Aweme aweme = this.f61858j;
        String str6 = null;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        C22984d a3 = a2.mo59973a(str5, str);
        String str7 = "group_id";
        Aweme aweme2 = this.f61858j;
        if (aweme2 != null) {
            str6 = aweme2.getAid();
        }
        C6907h.m21524a(str2, (Map) a3.mo59973a(str7, str6).f60753a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59066a(android.view.View r3) {
        /*
            r2 = this;
            super.mo59066a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r2.f61858j
            if (r3 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.Anchor r3 = r3.getAnchor()
            if (r3 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.AnchorShopLinkStruct r3 = r3.getShopLinkStruct()
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = r3.getUrl()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            r2.m77014e()
            android.app.Activity r0 = r2.f61901a
            android.content.Context r0 = (android.content.Context) r0
            java.lang.String r1 = ""
            com.p280ss.android.ugc.aweme.commercialize.utils.C25371n.m83459a(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23455k.mo59066a(android.view.View):void");
    }

    /* renamed from: a */
    private static void m77013a(String str) {
        Context a = C6399b.m19921a();
        Toast toast = new Toast(a);
        toast.setDuration(1);
        toast.setGravity(55, 0, 0);
        Object systemService = a.getSystemService("layout_inflater");
        if (systemService != null) {
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.aah, null);
            View findViewById = inflate.findViewById(R.id.dsf);
            C7573i.m23582a((Object) findViewById, "contentView.findViewById…extView>(R.id.tv_content)");
            ((DmtTextView) findViewById).setText(str);
            toast.setView(inflate);
            C23456l.m77019a(toast);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* renamed from: a */
    public final void mo59067a(Aweme aweme, JSONObject jSONObject) {
        String str;
        super.mo59067a(aweme, jSONObject);
        this.f61851c.setImageResource(R.drawable.aow);
        DmtTextView dmtTextView = this.f61852d;
        if (aweme != null) {
            Anchor anchor = aweme.getAnchor();
            if (anchor != null) {
                AnchorShopLinkStruct shopLinkStruct = anchor.getShopLinkStruct();
                if (shopLinkStruct != null) {
                    str = shopLinkStruct.getKeyword();
                    dmtTextView.setText(str);
                }
            }
        }
        str = null;
        dmtTextView.setText(str);
    }

    public C23455k(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(activity, "activity");
        super(viewGroup);
        this.f61901a = activity;
        this.f61902b = str;
    }
}
