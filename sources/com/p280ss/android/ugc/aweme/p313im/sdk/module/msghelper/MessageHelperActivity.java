package com.p280ss.android.ugc.aweme.p313im.sdk.module.msghelper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.SessionListAdapter;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.p1335a.C31483a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j.C6989a;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImTextTitleBar.C31980a;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity */
public class MessageHelperActivity extends AmeActivity implements C31483a<C7102a> {

    /* renamed from: a */
    private RecyclerView f82434a;

    /* renamed from: b */
    private SessionListAdapter f82435b;

    /* renamed from: c */
    private DmtStatusView f82436c;

    /* renamed from: a */
    public final void mo82168a(List<C7102a> list) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
    }

    /* renamed from: b */
    private void m102354b() {
        this.f82436c.mo25943g();
    }

    public void onDestroy() {
        super.onDestroy();
        C6978j.m21717a().mo18050b((C31483a<C7102a>) this);
        if (this.f82434a != null) {
            this.f82434a.setAdapter(null);
        }
    }

    /* renamed from: a */
    private void m102352a() {
        ImTextTitleBar imTextTitleBar = (ImTextTitleBar) findViewById(R.id.djz);
        imTextTitleBar.setOnTitlebarClickListener(new C31980a() {
            /* renamed from: b */
            public final void mo18097b() {
            }

            /* renamed from: a */
            public final void mo18096a() {
                MessageHelperActivity.this.finish();
            }
        });
        imTextTitleBar.setTitle((int) R.string.bpt);
        this.f82434a = (RecyclerView) findViewById(R.id.cxi);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.mo5427b(1);
        this.f82434a.setLayoutManager(linearLayoutManager);
        this.f82435b = new SessionListAdapter();
        this.f82434a.setAdapter(this.f82435b);
        this.f82436c = (DmtStatusView) findViewById(R.id.dav);
        this.f82436c.setBuilder(C10803a.m31631a((Context) this).mo25961a(new C10806a(this).mo25985a((int) R.drawable.b79).mo25990b((int) R.string.bpp).mo25993c(R.string.bpo).f29135a).mo25953a().mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C6978j.m21717a().mo18057h();
            }
        }));
        C6978j.m21717a().mo18044a((C31483a<C7102a>) this);
    }

    /* renamed from: a */
    public static void m102353a(Context context) {
        context.startActivity(new Intent(context, MessageHelperActivity.class));
    }

    /* renamed from: a */
    public final void mo82167a(C6989a aVar) {
        this.f82435b.mo58045a(aVar.f19730c);
        if (aVar.f19730c.isEmpty()) {
            m102354b();
        } else {
            this.f82436c.mo25939d();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ep);
        C6956a.m21633b().setupStatusBar(this);
        m102352a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.module.msghelper.MessageHelperActivity", "onCreate", false);
    }
}
