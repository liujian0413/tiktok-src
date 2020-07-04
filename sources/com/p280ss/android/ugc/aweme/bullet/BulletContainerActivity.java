package com.p280ss.android.ugc.aweme.bullet;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9729e;
import com.bytedance.ies.bullet.core.C10331b.C10333b;
import com.bytedance.ies.bullet.core.kit.BulletKitType;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.kit.bridge.C10375f;
import com.bytedance.ies.bullet.core.kit.bridge.IBridge;
import com.bytedance.ies.bullet.p551ui.common.AbsBulletContainerActivity;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10682c;
import com.bytedance.ies.bullet.p551ui.common.p554c.C10688b;
import com.bytedance.ies.bullet.p551ui.common.view.C10701a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.jsbridge2.C11174p;
import com.p280ss.android.ugc.aweme.commerce.service.p1113g.C24450b.C24451a;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29962c;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C43020co;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.bullet.BulletContainerActivity */
public final class BulletContainerActivity extends AbsBulletContainerActivity implements C9729e {

    /* renamed from: i */
    private C29962c f62148i;

    /* renamed from: j */
    private final C10333b f62149j = C23563b.m77362a().getBulletCoreProvider();

    /* renamed from: k */
    private HashMap f62150k;

    /* renamed from: com.ss.android.ugc.aweme.bullet.BulletContainerActivity$BulletLoadView */
    public static final class BulletLoadView extends DmtStatusView implements C10701a {
        /* renamed from: a */
        public final void mo25582a() {
            mo25942f();
        }

        /* renamed from: b */
        public final void mo25583b() {
            mo25939d();
        }

        public BulletLoadView(Context context, AttributeSet attributeSet, int i) {
            C7573i.m23587b(context, "context");
            super(context, attributeSet, i);
        }

        public /* synthetic */ BulletLoadView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
            this(context, null, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.BulletContainerActivity$a */
    static final class C23555a extends Lambda implements C7563m<String, IBridge, C7581n> {

        /* renamed from: a */
        final /* synthetic */ List f62151a;

        C23555a(List list) {
            this.f62151a = list;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m77356a((String) obj, (IBridge) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m77356a(String str, IBridge iBridge) {
            C7573i.m23587b(str, "s");
            C7573i.m23587b(iBridge, "iBridge");
            if (C23558a.f62163a[iBridge.mo25126b().ordinal()] == 1) {
                this.f62151a.add(str);
            }
        }
    }

    /* renamed from: a */
    public final View mo25533a(int i) {
        if (this.f62150k == null) {
            this.f62150k = new HashMap();
        }
        View view = (View) this.f62150k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f62150k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final View mo25566a(ViewGroup viewGroup, Uri uri) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(uri, "uri");
        return null;
    }

    /* renamed from: c */
    public final C10333b mo25565c() {
        return this.f62149j;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C29962c cVar = this.f62148i;
        if (cVar != null) {
            cVar.mo76117a();
        }
    }

    public final void onPause() {
        super.onPause();
        C29962c cVar = this.f62148i;
        if (cVar != null) {
            cVar.mo76122b();
        }
    }

    /* renamed from: d */
    private final boolean m77348d() {
        if (isFinishing()) {
            return false;
        }
        if (this.f62148i == null) {
            this.f62148i = new C29962c(this);
            C29962c cVar = this.f62148i;
            if (cVar != null) {
                cVar.f78760g = false;
            }
        }
        return true;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", true);
        super.onResume();
        C29962c cVar = this.f62148i;
        if (cVar != null) {
            cVar.mo76125c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onResume", false);
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", true);
        super.onCreate(bundle);
        getLifecycle().mo55a(new BulletEventObserver(this.f28530d));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.bullet.BulletContainerActivity", "onCreate", false);
    }

    public final void showCustomToast(String str) {
        C7573i.m23587b(str, "text");
        if (m77348d()) {
            C29962c cVar = this.f62148i;
            if (cVar != null) {
                cVar.mo76120a(str);
            }
        }
    }

    public final void showCustomLongToast(int i, String str) {
        C7573i.m23587b(str, "text");
        if (m77348d()) {
            C29962c cVar = this.f62148i;
            if (cVar != null) {
                cVar.mo76118a(i, str);
            }
        }
    }

    /* renamed from: b */
    public final View mo25567b(ViewGroup viewGroup, Uri uri) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(uri, "uri");
        BulletLoadView bulletLoadView = new BulletLoadView(this, null, 0, 6, null);
        bulletLoadView.setBuilder(C10803a.m31631a(bulletLoadView.getContext()));
        return bulletLoadView;
    }

    public final void showCustomToast(int i, String str, int i2, int i3) {
        C7573i.m23587b(str, "text");
        if (m77348d()) {
            C29962c cVar = this.f62148i;
            if (cVar != null) {
                cVar.mo76119a(i, str, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo25536a(Uri uri, C10382g gVar, List<? extends C10682c<? extends View>> list, boolean z) {
        boolean z2;
        BulletContainerActivity bulletContainerActivity;
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(gVar, "instance");
        C7573i.m23587b(list, "viewComponents");
        super.mo25536a(uri, gVar, list, z);
        boolean z3 = true;
        if (gVar.mo25162d() == BulletKitType.WEB) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            bulletContainerActivity = this;
        } else {
            bulletContainerActivity = null;
        }
        BulletContainerActivity bulletContainerActivity2 = bulletContainerActivity;
        if (bulletContainerActivity2 != null) {
            bulletContainerActivity2.mo25534a().setPadding(0, C10688b.m31229a((Context) bulletContainerActivity2), 0, 0);
        }
        Activity activity = this;
        if (!C7212bb.m22495a(activity, R.color.a3z) && C6399b.m19946v()) {
            C43020co.m136533a(activity, C24451a.m80376a(this, R.color.a5o));
        }
        if (gVar.mo25162d() != BulletKitType.WEB) {
            z3 = false;
        }
        if (!z3) {
            gVar = null;
        }
        if (gVar != null) {
            List arrayList = new ArrayList();
            C10375f c = gVar.mo25161c();
            if (c != null) {
                c.mo25143a(new C23555a(arrayList));
            }
            C11174p.m32715b(arrayList);
        }
    }
}
