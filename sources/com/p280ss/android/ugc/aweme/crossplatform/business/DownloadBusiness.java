package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.download.api.model.C19400e;
import com.p280ss.android.download.api.p858b.C19384a;
import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p858b.C19388d;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.p848c.p849a.C19235b;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;
import com.p280ss.android.sdk.activity.C20102a;
import com.p280ss.android.sdk.activity.model.C20107a;
import com.p280ss.android.ugc.aweme.app.download.config.DownloaderManagerHolder;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.crossplatform.business.BusinessService.Business;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30388i;
import com.p280ss.android.ugc.aweme.hybrid.monitor.C30391k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.DownloadBusiness */
public class DownloadBusiness extends Business {

    /* renamed from: a */
    public String f68334a;

    /* renamed from: b */
    public int f68335b = 0;

    /* renamed from: c */
    public int f68336c = 0;

    /* renamed from: d */
    private C20107a f68337d = new C20107a();

    DownloadBusiness(C25856c cVar) {
        super(cVar);
    }

    /* renamed from: a */
    public final void mo67180a(Activity activity) {
        int i;
        if (this.f68335b == 0) {
            i = R.id.bq;
        } else {
            i = this.f68335b;
        }
        FrameLayout frameLayout = (FrameLayout) activity.findViewById(i);
        if (this.f68330i.f68474b.f68446a > 0) {
            if (this.f68330i.f68474b.f68449d && this.f68337d != null && !TextUtils.isEmpty(this.f68337d.f54423g)) {
                DownloaderManagerHolder.m75524a().mo51669a(this.f68337d.f54423g, frameLayout.hashCode());
            }
            DownloaderManagerHolder.m75534b().mo51036a(this.f68330i.f68474b.f68446a, frameLayout.hashCode());
        }
    }

    /* renamed from: a */
    public final void mo67181a(Activity activity, C26039m mVar) {
        int i;
        int i2;
        final Activity activity2 = activity;
        if (this.f68335b == 0) {
            i = R.id.bq;
        } else {
            i = this.f68335b;
        }
        FrameLayout frameLayout = (FrameLayout) activity2.findViewById(i);
        if (this.f68336c == 0) {
            i2 = R.id.bs;
        } else {
            i2 = this.f68336c;
        }
        final DmtTextView dmtTextView = (DmtTextView) activity2.findViewById(i2);
        if (!this.f68330i.f68474b.f68449d || TextUtils.isEmpty(this.f68330i.f68474b.f68450e) || !this.f68330i.f68474b.f68459n || !C19936f.m65765a().mo53438d() || C6399b.m19944t()) {
            frameLayout.setVisibility(8);
        } else {
            frameLayout.setVisibility(0);
        }
        this.f68337d.mo53849a(this.f68330i.f68473a.f68429b);
        C19226a c = C20107a.m66303c(this.f68337d);
        C19229b a = C20107a.m66299a(this.f68337d.f54424h);
        final C26039m mVar2 = mVar;
        C258411 r12 = new C19388d() {

            /* renamed from: e */
            private int f68342e;

            /* renamed from: a */
            public final void mo51373a() {
                dmtTextView.setText(activity2.getResources().getString(R.string.aoi));
                dmtTextView.setBackgroundResource(R.drawable.z_);
            }

            /* renamed from: a */
            private boolean m85010a(int i) {
                if (i - this.f68342e < 20 && (this.f68342e != 0 || i < 3)) {
                    return false;
                }
                this.f68342e = i;
                return true;
            }

            /* renamed from: b */
            public final void mo51377b(C19400e eVar) {
                dmtTextView.setText(activity2.getResources().getString(R.string.aok));
                dmtTextView.setBackgroundResource(R.drawable.z_);
                if (!TextUtils.isEmpty(DownloadBusiness.this.f68334a)) {
                    mVar2.mo67529a().mo53913b(DownloadBusiness.this.f68334a);
                }
            }

            /* renamed from: c */
            public final void mo51379c(C19400e eVar) {
                dmtTextView.setText(activity2.getResources().getString(R.string.aoj));
                dmtTextView.setBackgroundResource(R.drawable.z_);
                dmtTextView.setTextColor(activity2.getResources().getColor(R.color.np));
                if (!TextUtils.isEmpty(DownloadBusiness.this.f68334a)) {
                    mVar2.mo67529a().mo53913b(DownloadBusiness.this.f68334a);
                }
            }

            /* renamed from: a */
            public final void mo51375a(C19400e eVar) {
                dmtTextView.setText(activity2.getResources().getString(R.string.aom));
                dmtTextView.setBackgroundResource(R.drawable.z9);
            }

            /* renamed from: a */
            public final void mo51374a(C19387c cVar, C19384a aVar) {
                if (!TextUtils.isEmpty(DownloadBusiness.this.f68334a)) {
                    mVar2.mo67529a();
                    mVar2.mo67529a().mo53910a(DownloadBusiness.this.f68334a);
                }
            }

            /* renamed from: b */
            public final void mo51378b(C19400e eVar, int i) {
                dmtTextView.setText(activity2.getResources().getString(R.string.aou));
                dmtTextView.setBackgroundResource(R.drawable.z_);
                if (!TextUtils.isEmpty(DownloadBusiness.this.f68334a) && m85010a(i)) {
                    mVar2.mo67529a().mo53911a(DownloadBusiness.this.f68334a, i);
                }
            }

            /* renamed from: a */
            public final void mo51376a(C19400e eVar, int i) {
                dmtTextView.setBackgroundResource(R.drawable.z_);
                dmtTextView.setText(activity2.getString(R.string.avz, new Object[]{Integer.valueOf(i)}));
                if (!TextUtils.isEmpty(DownloadBusiness.this.f68334a) && m85010a(i)) {
                    mVar2.mo67529a().mo53911a(DownloadBusiness.this.f68334a, i);
                }
            }
        };
        frameLayout.setOnClickListener(new C25857d(this, c));
        if (this.f68330i.f68474b.f68449d && this.f68337d != null) {
            DownloaderManagerHolder.m75524a().mo51666a(activity2, frameLayout.hashCode(), r12, C20107a.m66300a(this.f68337d));
        }
        if (DownloaderManagerHolder.m75534b().mo51039b(this.f68330i.f68474b.f68446a)) {
            DownloaderManagerHolder.m75534b().mo51037a(activity, this.f68330i.f68474b.f68446a, this.f68330i.f68474b.f68454i, r12, frameLayout.hashCode());
        }
        SingleWebView b = mVar.mo67531b();
        C25858e eVar = new C25858e(this, mVar, activity, a, c, r12, frameLayout);
        b.setDownloadListener(eVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67182a(C19226a aVar, View view) {
        if (!this.f68330i.f68474b.f68449d || this.f68337d == null) {
            if (DownloaderManagerHolder.m75534b().mo51039b(this.f68330i.f68474b.f68446a)) {
                DownloaderManagerHolder.m75534b().mo51035a(this.f68330i.f68474b.f68446a);
            }
            return;
        }
        C19229b a = C20107a.m66299a(this.f68337d.f54424h);
        if (this.f68330i.f68474b.f68471z) {
            a = C20107a.m66302b(this.f68337d);
        }
        DownloaderManagerHolder.m75524a().mo51670a(this.f68337d.f54423g, this.f68337d.f54418b, 2, a, aVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m85004a(C26039m mVar, String str, long j) {
        if (j >= 0) {
            mVar.mo67529a().mo53910a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67183a(C19229b bVar, C19226a aVar, DialogInterface dialogInterface, int i) {
        DownloaderManagerHolder.m75524a().mo51670a(this.f68337d.f54423g, this.f68337d.f54418b, 2, bVar, aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67184a(C26039m mVar, Activity activity, C19229b bVar, C19226a aVar, C19388d dVar, FrameLayout frameLayout, String str, String str2, String str3, String str4, long j) {
        boolean z;
        String str5 = str;
        if (!C25371n.m83491g(this.f68331j, str5)) {
            C30388i monitorSession = mVar.mo67531b().getMonitorSession();
            if (monitorSession != null) {
                C30391k kVar = (C30391k) monitorSession.mo80008a(C30391k.class);
                if (kVar != null) {
                    kVar.mo79995a(str, str3, str4, j);
                }
            }
            String url = mVar.mo67531b().getUrl();
            JSONObject a = C20102a.m66290a((Context) activity, this.f68330i.f68474b.f68446a, this.f68330i.f68474b.f68454i, str, url, mVar.mo67531b().getUrl());
            if (this.f68330i.f68474b.f68457l || C6319n.m19593a(str)) {
                z = true;
            } else {
                z = false;
            }
            this.f68334a = str5;
            if (this.f68330i.f68474b.f68446a <= 0) {
                Activity activity2 = activity;
                C26039m mVar2 = mVar;
                C20102a.m66289a(activity, str, str2, str4, a, z, new C25861h(mVar, str5));
            } else if (!this.f68330i.f68474b.f68449d) {
                Activity activity3 = activity;
                C19235b b = DownloaderManagerHolder.m75534b();
                C19235b bVar2 = b;
                Activity activity4 = activity;
                String str6 = str2;
                boolean z2 = z;
                C19388d dVar2 = dVar;
                bVar2.mo51034a(activity4, str6, z2, C20107a.m66301a(this.f68330i.f68474b.f68458m, this.f68330i.f68473a.f68432e, this.f68330i.f68474b.f68454i, this.f68330i.f68474b.f68451f, str, str2, str4, a, this.f68330i.f68474b.f68464s), dVar2, frameLayout.hashCode());
            } else if (!z) {
                new C11030a(activity).mo26640a((CharSequence) this.f68337d.f54422f).mo26647b((CharSequence) "确认要下载此应用吗？").mo26641a((CharSequence) "确认", (OnClickListener) new C25859f(this, bVar, aVar)).mo26648b((CharSequence) activity.getResources().getString(R.string.bxo), C25860g.f68399a).mo26649b();
            } else {
                C19229b bVar3 = bVar;
                C19226a aVar2 = aVar;
                DownloaderManagerHolder.m75524a().mo51670a(this.f68337d.f54423g, this.f68337d.f54418b, 2, bVar, aVar);
            }
        }
    }
}
