package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.following.model.C29574i;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationTitleViewHolder */
public final class RecommendRelationTitleViewHolder extends JediSimpleViewHolder<C29574i> {

    /* renamed from: f */
    public final View f78335f;

    /* renamed from: g */
    private final View f78336g;

    /* renamed from: j */
    private final TextView f78337j;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.RecommendRelationTitleViewHolder$a */
    static final class C29789a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendRelationTitleViewHolder f78338a;

        C29789a(RecommendRelationTitleViewHolder recommendRelationTitleViewHolder) {
            this.f78338a = recommendRelationTitleViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Map hashMap = new HashMap();
            hashMap.put("enter_from", "find_friends");
            C6907h.m21524a("click_privacy_tips", hashMap);
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            C7573i.m23582a((Object) privacyReminderH5Url, "SharePrefCache.inst().privacyReminderH5Url");
            String str = (String) privacyReminderH5Url.mo59877d();
            if (!TextUtils.isEmpty(str)) {
                Intent intent = new Intent(this.f78338a.f78335f.getContext(), CrossPlatformActivity.class);
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.putExtras(bundle);
                intent.setData(Uri.parse(str));
                this.f78338a.f78335f.getContext().startActivity(intent);
            }
        }
    }

    public RecommendRelationTitleViewHolder(View view) {
        C7573i.m23587b(view, "view");
        super(view);
        View findViewById = this.itemView.findViewById(R.id.a9o);
        C7573i.m23582a((Object) findViewById, "itemView.findViewById(R.id.divide_line)");
        this.f78336g = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.e7c);
        C7573i.m23582a((Object) findViewById2, "itemView.findViewById(R.id.txt_tips)");
        this.f78337j = (TextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.cjt);
        C7573i.m23582a((Object) findViewById3, "itemView.findViewById(R.id.privacy_reminder_image)");
        this.f78335f = findViewById3;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29209a(C29574i iVar) {
        C7573i.m23587b(iVar, "item");
        this.f78337j.setText(iVar.f77947b);
        this.f78336g.setVisibility(8);
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        if (!a.mo18742aE() || iVar.f77946a != 4) {
            this.f78335f.setVisibility(8);
            return;
        }
        this.f78335f.setVisibility(0);
        this.f78336g.setVisibility(0);
        this.f78335f.setOnClickListener(new C29789a(this));
    }
}
