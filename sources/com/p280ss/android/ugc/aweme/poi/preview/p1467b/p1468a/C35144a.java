package com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1468a;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.p022v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.photo.p1451a.C34727a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35143a;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35151b;
import com.p280ss.android.ugc.aweme.poi.preview.view.indicator.NumberIndicator;
import com.p280ss.android.ugc.aweme.poi.preview.view.indicator.TitleIndicator;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.StatedButton;
import com.p280ss.android.ugc.aweme.utils.C42969bc;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b.a.a */
public final class C35144a implements C35151b {

    /* renamed from: a */
    public NumberIndicator f91916a;

    /* renamed from: b */
    public C35143a f91917b;

    /* renamed from: c */
    private View f91918c;

    /* renamed from: d */
    private TitleIndicator f91919d;

    /* renamed from: e */
    private StatedButton f91920e;

    /* renamed from: a */
    public final void mo89438a() {
        if (this.f91918c != null) {
            this.f91918c.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo89444b() {
        if (this.f91918c != null) {
            ViewGroup viewGroup = (ViewGroup) this.f91918c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f91918c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo89437a(C1592h hVar) throws Exception {
        C10761a.m31383a(this.f91917b.getActivityContext(), (int) R.string.dir).mo25750a();
        this.f91920e.mo92994c();
        return null;
    }

    /* renamed from: a */
    public final void mo89441a(String str) {
        C22477b.m74364a((Activity) this.f91917b.getActivityContext(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C35146b(this, str));
    }

    /* renamed from: a */
    public final void mo89439a(ViewPager viewPager) {
        this.f91918c.setVisibility(0);
        int i = this.f91917b.getTransferConfig().f91969F;
        this.f91916a.setRealSize(i);
        this.f91916a.setViewPager(viewPager);
        if (i <= 1) {
            this.f91916a.setVisibility(8);
        } else {
            this.f91916a.setVisibility(0);
        }
        if (this.f91920e != null && (this.f91917b.getActivityContext() instanceof Activity)) {
            if (this.f91917b == null || !this.f91917b.getTransferConfig().f91965B) {
                this.f91920e.setVisibility(8);
            } else {
                LayoutParams layoutParams = (LayoutParams) this.f91916a.getLayoutParams();
                layoutParams.addRule(9);
                this.f91916a.setLayoutParams(layoutParams);
                this.f91920e.setVisibility(0);
                this.f91920e.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        int currentItem = C35144a.this.f91916a.getCurrentItem();
                        List<String> list = C35144a.this.f91917b.getTransferConfig().f91981l;
                        if (currentItem >= 0 && currentItem < list.size()) {
                            String str = (String) list.get(currentItem);
                            if (!TextUtils.isEmpty(str)) {
                                C35144a.this.mo89441a(str);
                                return;
                            }
                            C10761a.m31399c(C35144a.this.f91917b.getActivityContext(), (int) R.string.did).mo25750a();
                        }
                    }
                });
            }
        }
        if (this.f91919d != null) {
            this.f91919d.mo89617a(viewPager, this.f91917b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo89443b(String str) throws Exception {
        String a = C23139a.m76055a(C6399b.m19921a());
        StringBuilder sb = new StringBuilder();
        sb.append(new SimpleDateFormat("yyyyMMdd_HHmmssSS", Locale.US).format(new Date()));
        sb.append(".png");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(a);
        sb3.append(File.separator);
        sb3.append(sb2);
        String sb4 = sb3.toString();
        C7276d.m22820d(C23323e.m76500a(str), sb4);
        C34727a.m112060a(this.f91917b.getActivityContext(), sb4);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo89445b(DialogInterface dialogInterface, int i) {
        C42969bc.m136401a(this.f91917b.getActivityContext());
    }

    /* renamed from: a */
    public final void mo89440a(FrameLayout frameLayout, C35143a aVar) {
        this.f91917b = aVar;
        this.f91918c = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.a_1, null);
        this.f91916a = (NumberIndicator) this.f91918c.findViewById(R.id.cj4);
        this.f91919d = (TitleIndicator) this.f91918c.findViewById(R.id.cj8);
        this.f91920e = (StatedButton) this.f91918c.findViewById(R.id.b8n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        frameLayout.addView(this.f91918c, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo89442a(String str, String[] strArr, int[] iArr) {
        if (strArr.length <= 0 || iArr[0] != 0) {
            new C10741a(this.f91917b.getActivityContext()).mo25650a((int) R.string.afp, (DialogInterface.OnClickListener) new C35149e(this)).mo25658b((int) R.string.w_, C35150f.f91928a).mo25657b((int) R.string.lb).mo25656a().mo25637a();
            return;
        }
        this.f91920e.mo92992a();
        C1592h.m7853a((Callable<TResult>) new C35147c<TResult>(this, str)).mo6876a((C1591g<TResult, TContinuationResult>) new C35148d<TResult,TContinuationResult>(this), C1592h.f5958b);
    }
}
