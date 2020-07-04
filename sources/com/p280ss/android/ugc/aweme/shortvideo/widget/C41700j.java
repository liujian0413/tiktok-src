package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25764a;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.newfollow.p1423ui.C34167a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.j */
public final class C41700j extends PopupWindow implements C25764a, C41692e {

    /* renamed from: a */
    public ImageView f108544a;

    /* renamed from: b */
    public C27311c f108545b;

    /* renamed from: c */
    private View f108546c = ((LayoutInflater) AwemeApplication.m21341a().getSystemService("layout_inflater")).inflate(R.layout.abw, null);

    /* renamed from: d */
    private RelativeLayout f108547d;

    /* renamed from: e */
    private ImageView f108548e;

    /* renamed from: f */
    private ImageView f108549f;

    /* renamed from: g */
    private PullUpLayout f108550g;

    /* renamed from: h */
    private FragmentActivity f108551h;

    /* renamed from: i */
    private DraftListener f108552i;

    /* renamed from: j */
    private boolean f108553j;

    /* renamed from: a */
    public final void mo66884a() {
        dismiss();
    }

    /* renamed from: c */
    private void m132809c() {
        setContentView(this.f108546c);
        setWidth(C9738o.m28691a((Context) AwemeApplication.m21341a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.wk);
    }

    /* renamed from: d */
    private void m132811d() {
        this.f108552i = new DraftListener() {
            public final void onDraftCheckedChanged(C27311c cVar, boolean z) {
            }

            public final void onDraftClean() {
            }

            public final void onDraftUpdate(C27311c cVar) {
            }

            public final void onDraftDelete(C27311c cVar) {
                if (cVar != null && TextUtils.equals(cVar.mo70221aj(), C41700j.this.f108545b.mo70221aj())) {
                    C41700j.this.dismiss();
                }
            }
        };
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(this.f108552i);
    }

    /* renamed from: b */
    public final void mo102477b() {
        int i;
        if (!this.f108551h.isFinishing()) {
            this.f108550g.mo66732a();
            m132808a(this.f108545b);
            this.f108549f.setOnClickListener(new C41704l(this));
            m132811d();
            C6907h.m21524a("publish_retry_show", (Map) C22984d.m75611a().mo59973a("creation_id", this.f108545b.mo70303y()).f60753a);
            try {
                View decorView = this.f108551h.getWindow().getDecorView();
                if (VERSION.SDK_INT >= 19) {
                    i = -C9738o.m28717e(AwemeApplication.m21341a());
                } else {
                    i = C9738o.m28717e(AwemeApplication.m21341a());
                }
                showAtLocation(decorView, 48, 0, i);
            } catch (Exception unused) {
            }
        }
    }

    public final void dismiss() {
        if (isShowing()) {
            if (this.f108551h != null && !this.f108551h.isFinishing() && this.f108550g.hasWindowFocus()) {
                this.f108550g.mo66733a(0.0f, true);
            }
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService != null) {
                iAVService.getPublishService().setUploadRecoverPath(null);
            }
        }
        if (this.f108552i != null) {
            ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.f108552i);
            this.f108552i = null;
        }
        try {
            C41705m.m132819a(this);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m132808a(C27311c cVar) {
        C27312d.m89561a(cVar, new OnVideoCoverCallback() {
            public final void onGetVideoCoverFailed(int i) {
            }

            public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                if (C41700j.this.f108544a != null) {
                    C41700j.this.f108544a.setImageDrawable(new C34167a(bitmap));
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo102476a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        this.f108546c.setVisibility(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo102475a(View view) {
        dismiss();
        C6907h.m21524a("publish_retry", (Map) C22984d.m75611a().mo59973a("action_type", "publish").mo59973a("creation_id", this.f108545b.mo70303y()).f60753a);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getPublishService().publishFromDraft(this.f108551h, this.f108545b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo102478b(View view) {
        C6907h.m21524a("publish_retry", (Map) C22984d.m75611a().mo59973a("action_type", "cancel").mo59973a("creation_id", this.f108545b.mo70303y()).f60753a);
        dismiss();
    }

    /* renamed from: c */
    private void m132810c(View view) {
        this.f108547d = (RelativeLayout) view.findViewById(R.id.cuw);
        this.f108544a = (ImageView) view.findViewById(R.id.b7x);
        this.f108550g = (PullUpLayout) view.findViewById(R.id.clx);
        this.f108550g.mo66734a((View) this.f108547d, false);
        this.f108550g.setPullUpListener(this);
        this.f108548e = (ImageView) view.findViewById(R.id.b7g);
        this.f108548e.setOnClickListener(new C41703k(this));
        this.f108549f = (ImageView) view.findViewById(R.id.bbg);
    }

    public C41700j(FragmentActivity fragmentActivity, C27311c cVar, boolean z) {
        super(AwemeApplication.m21341a());
        this.f108551h = fragmentActivity;
        this.f108545b = cVar;
        this.f108553j = z;
        m132810c(this.f108546c);
        setBackgroundDrawable(new ColorDrawable(0));
        m132809c();
    }
}
