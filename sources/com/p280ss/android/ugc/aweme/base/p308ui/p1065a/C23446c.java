package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Anchor;
import com.p280ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.c */
public final class C23446c extends C23443b {

    /* renamed from: a */
    public final Activity f61862a;

    /* renamed from: b */
    public final String f61863b;

    /* renamed from: l */
    private String f61864l;

    /* renamed from: a */
    public final void mo59065a() {
        boolean z;
        String str;
        CharSequence charSequence = this.f61864l;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            C33336b bVar = C33336b.f87069a;
            Aweme aweme = this.f61858j;
            if (aweme != null) {
                Anchor anchor = aweme.getAnchor();
                if (anchor != null) {
                    AnchorCommonStruct anchorInfo = anchor.getAnchorInfo();
                    if (anchorInfo != null) {
                        str = anchorInfo.getUrl();
                        this.f61864l = bVar.mo85484b(str);
                    }
                }
            }
            str = null;
            this.f61864l = bVar.mo85484b(str);
        }
        String str3 = "mp_show";
        C22984d a = C22984d.m75611a().mo59973a("mp_id", this.f61864l).mo59973a("enter_from", "homepage_hot").mo59973a("position", "in_video_tag").mo59973a("_param_for_special", "game_station").mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210");
        String str4 = "group_id";
        Aweme aweme2 = this.f61858j;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
    }

    /* renamed from: b */
    public final void mo59068b() {
        boolean z;
        String str;
        CharSequence charSequence = this.f61864l;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            C33336b bVar = C33336b.f87069a;
            Aweme aweme = this.f61858j;
            if (aweme != null) {
                Anchor anchor = aweme.getAnchor();
                if (anchor != null) {
                    AnchorCommonStruct anchorInfo = anchor.getAnchorInfo();
                    if (anchorInfo != null) {
                        str = anchorInfo.getUrl();
                        this.f61864l = bVar.mo85484b(str);
                    }
                }
            }
            str = null;
            this.f61864l = bVar.mo85484b(str);
        }
        String str3 = "mp_click";
        C22984d a = C22984d.m75611a().mo59973a("mp_id", this.f61864l).mo59973a("enter_from", "homepage_hot").mo59973a("position", "in_video_tag").mo59973a("_param_for_special", "game_station").mo59973a("params_for_special", "game_platform").mo59973a("target_app_id", "2210");
        String str4 = "group_id";
        Aweme aweme2 = this.f61858j;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        }
        C6907h.m21524a(str3, (Map) a.mo59973a(str4, str2).f60753a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59066a(android.view.View r1) {
        /*
            r0 = this;
            super.mo59066a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.f61858j
            if (r1 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.Anchor r1 = r1.getAnchor()
            if (r1 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = r1.getAnchorInfo()
            if (r1 == 0) goto L_0x0018
            java.lang.String r1 = r1.getUrl()
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 == 0) goto L_0x001e
            com.p280ss.android.ugc.aweme.miniapp.anchor.C33336b.m107786a(r1)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.base.p308ui.p1065a.C23446c.mo59066a(android.view.View):void");
    }

    /* renamed from: a */
    public final void mo59067a(Aweme aweme, JSONObject jSONObject) {
        String str;
        super.mo59067a(aweme, jSONObject);
        this.f61851c.setImageResource(R.drawable.a2c);
        DmtTextView dmtTextView = this.f61852d;
        if (aweme != null) {
            Anchor anchor = aweme.getAnchor();
            if (anchor != null) {
                AnchorCommonStruct anchorInfo = anchor.getAnchorInfo();
                if (anchorInfo != null) {
                    str = anchorInfo.getKeyword();
                    dmtTextView.setText(str);
                }
            }
        }
        str = null;
        dmtTextView.setText(str);
    }

    public C23446c(ViewGroup viewGroup, Activity activity, String str) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(str, "eventType");
        super(viewGroup);
        this.f61862a = activity;
        this.f61863b = str;
    }
}
