package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.UnFavouritesDialog */
public class UnFavouritesDialog extends BottomSheetDialog implements OnClickListener, C27746c {

    /* renamed from: b */
    private String f73312b;

    /* renamed from: c */
    private Aweme f73313c;

    /* renamed from: d */
    private Context f73314d;

    /* renamed from: e */
    private C27743a f73315e;

    /* renamed from: c */
    private void m91193c() {
        m91196f();
        m91195e();
        m91194d();
    }

    /* renamed from: d */
    private void m91194d() {
        TextView textView = (TextView) findViewById(R.id.e7p);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
    }

    /* renamed from: e */
    private void m91195e() {
        View findViewById = findViewById(R.id.e7q);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
    }

    /* renamed from: g */
    private void m91197g() {
        this.f73315e = new C27743a();
        this.f73315e.mo66537a(this);
    }

    /* renamed from: f */
    private void m91196f() {
        int b = C9738o.m28709b(this.f73314d) - C9738o.m28717e(this.f73314d);
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 80;
            getWindow().setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
    }

    /* renamed from: h */
    private void m91198h() {
        if (this.f73315e != null) {
            this.f73315e.mo56976a(Integer.valueOf(2), this.f73313c.getAid(), Integer.valueOf(0));
            C6907h.m21524a("cancel_favourite_video", (Map) C22984d.m75611a().mo59973a("enter_from", this.f73312b).mo59973a("group_id", this.f73313c.getAid()).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
        C10761a.m31409e(C6399b.m19921a(), (int) R.string.we).mo25750a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.lb);
        m91193c();
        m91197g();
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
        this.f73313c.setCollectStatus(0);
        ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateCollectStatus(this.f73313c.getAid(), 0);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.e7q) {
            m91198h();
            dismiss();
            return;
        }
        if (id == R.id.e7p) {
            dismiss();
        }
    }

    public UnFavouritesDialog(Context context, Aweme aweme, String str) {
        super(context, R.style.t3);
        this.f73313c = aweme;
        this.f73314d = context;
        this.f73312b = str;
    }
}
