package com.p280ss.android.ugc.aweme.recommend.widget;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.widget.Widget;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.PrivacyReminderWidget */
public final class PrivacyReminderWidget extends Widget {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f97301g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PrivacyReminderWidget.class), "mPrivacyReminderIv", "getMPrivacyReminderIv()Landroid/widget/ImageView;"))};

    /* renamed from: h */
    private final C7541d f97302h = C7546e.m23569a(new C37187b(this));

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.PrivacyReminderWidget$a */
    static final class C37186a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PrivacyReminderWidget f97303a;

        C37186a(PrivacyReminderWidget privacyReminderWidget) {
            this.f97303a = privacyReminderWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            SharePrefCache inst = SharePrefCache.inst();
            C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
            C22903bl privacyReminderH5Url = inst.getPrivacyReminderH5Url();
            C7573i.m23582a((Object) privacyReminderH5Url, "SharePrefCache.inst().privacyReminderH5Url");
            String str = (String) privacyReminderH5Url.mo59877d();
            if (str != null) {
                Intent intent = new Intent(this.f97303a.mo93705a(), CrossPlatformActivity.class);
                intent.putExtra("show_load_dialog", true);
                intent.putExtra("hide_nav_bar", false);
                intent.putExtra("use_webview_title", true);
                intent.setData(Uri.parse(str));
                this.f97303a.mo93705a().startActivity(intent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.widget.PrivacyReminderWidget$b */
    static final class C37187b extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ PrivacyReminderWidget f97304a;

        C37187b(PrivacyReminderWidget privacyReminderWidget) {
            this.f97304a = privacyReminderWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f97304a.mo31582g().findViewById(R.id.cjt);
        }
    }

    /* renamed from: b */
    private final ImageView m119529b() {
        return (ImageView) this.f97302h.getValue();
    }

    /* renamed from: h */
    public final int mo31583h() {
        return R.layout.b3x;
    }

    /* renamed from: i */
    public final void mo31584i() {
        super.mo31584i();
        m119530c();
    }

    /* renamed from: c */
    private void m119530c() {
        m119529b().setOnClickListener(new C37186a(this));
    }

    /* renamed from: a */
    public final Context mo93705a() {
        Context context = mo31582g().getContext();
        C7573i.m23582a((Object) context, "container.context");
        return context;
    }
}
