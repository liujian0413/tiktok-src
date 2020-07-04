package com.p280ss.android.ugc.aweme.poi.p335ui.upload;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.C23369a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.feed.C28410h;
import com.p280ss.android.ugc.aweme.poi.p335ui.upload.ChooseImageAdapter.C35417b;
import com.p280ss.android.ugc.aweme.views.AutoRTLTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity */
public final class ChooseImageActivity extends AmeBaseActivity implements C35417b {

    /* renamed from: a */
    private ChooseImageAdapter f92887a;

    /* renamed from: b */
    private List<String> f92888b = new ArrayList();

    /* renamed from: c */
    private ArrayList<String> f92889c = new ArrayList<>();

    /* renamed from: d */
    private String f92890d;

    /* renamed from: e */
    private HashMap f92891e;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity$a */
    static final class C35413a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseImageActivity f92892a;

        C35413a(ChooseImageActivity chooseImageActivity) {
            this.f92892a = chooseImageActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92892a.mo58711c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity$b */
    static final class C35414b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseImageActivity f92893a;

        C35414b(ChooseImageActivity chooseImageActivity) {
            this.f92893a = chooseImageActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92893a.mo59893d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity$c */
    public static final class C35415c extends C23369a {

        /* renamed from: a */
        final /* synthetic */ ChooseImageActivity f92894a;

        /* renamed from: a */
        public final void mo60691a(View view, float f) {
            C7573i.m23587b(view, "bottomSheet");
        }

        C35415c(ChooseImageActivity chooseImageActivity) {
            this.f92894a = chooseImageActivity;
        }

        /* renamed from: a */
        public final void mo60692a(View view, int i) {
            C7573i.m23587b(view, "bottomSheet");
            if (i == 5) {
                this.f92894a.mo58711c();
            }
        }
    }

    /* renamed from: b */
    private View m114387b(int i) {
        if (this.f92891e == null) {
            this.f92891e = new HashMap();
        }
        View view = (View) this.f92891e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92891e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.as;
    }

    public final void onBackPressed() {
        mo58711c();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onCreate", false);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C10994a.m32208b(this);
    }

    /* renamed from: i */
    private final void m114388i() {
        new C35428d(this).show();
    }

    /* renamed from: c */
    public final void mo58711c() {
        finish();
        overridePendingTransition(0, R.anim.t);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> m114389j() {
        /*
            r9 = this;
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r7 = 0
            r3[r7] = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            android.net.Uri r2 = android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            java.lang.String r6 = "date_added DESC"
            r8 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ Exception -> 0x004c }
            r4 = 0
            r5 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x004c }
            if (r1 != 0) goto L_0x0029
            r2 = r0
            java.util.List r2 = (java.util.List) r2     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            return r2
        L_0x0024:
            r0 = move-exception
            goto L_0x005a
        L_0x0026:
            r2 = move-exception
            r8 = r1
            goto L_0x004d
        L_0x0029:
            if (r1 == 0) goto L_0x0034
            boolean r2 = r1.moveToNext()     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            goto L_0x0035
        L_0x0034:
            r2 = r8
        L_0x0035:
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            if (r2 == 0) goto L_0x0043
            java.lang.String r2 = r1.getString(r7)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            r0.add(r2)     // Catch:{ Exception -> 0x0026, all -> 0x0024 }
            goto L_0x0029
        L_0x0043:
            if (r1 == 0) goto L_0x0057
            r1.close()
            goto L_0x0057
        L_0x0049:
            r0 = move-exception
            r1 = r8
            goto L_0x005a
        L_0x004c:
            r2 = move-exception
        L_0x004d:
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch:{ all -> 0x0049 }
            com.p280ss.android.ugc.aweme.framework.p312a.C6921a.m21559a(r2)     // Catch:{ all -> 0x0049 }
            if (r8 == 0) goto L_0x0057
            r8.close()
        L_0x0057:
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x005a:
            if (r1 == 0) goto L_0x005f
            r1.close()
        L_0x005f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.upload.ChooseImageActivity.m114389j():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59893d() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter r0 = r6.f92887a
            r1 = 0
            if (r0 == 0) goto L_0x000e
            java.util.List<java.lang.Integer> r0 = r0.f92896a
            if (r0 == 0) goto L_0x000e
            int r0 = r0.size()
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            java.util.ArrayList<java.lang.String> r2 = r6.f92889c
            r2.clear()
        L_0x0014:
            if (r1 >= r0) goto L_0x0041
            java.util.ArrayList<java.lang.String> r2 = r6.f92889c
            java.util.List<java.lang.String> r3 = r6.f92888b
            r4 = 0
            if (r3 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.ui.upload.ChooseImageAdapter r5 = r6.f92887a
            if (r5 == 0) goto L_0x002b
            java.util.List<java.lang.Integer> r5 = r5.f92896a
            if (r5 == 0) goto L_0x002b
            java.lang.Object r4 = r5.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
        L_0x002b:
            if (r4 != 0) goto L_0x0030
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0030:
            int r4 = r4.intValue()
            java.lang.Object r3 = r3.get(r4)
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
        L_0x003b:
            r2.add(r4)
            int r1 = r1 + 1
            goto L_0x0014
        L_0x0041:
            java.lang.String r0 = r6.f92890d
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = ""
        L_0x0047:
            r1 = r6
            android.app.Activity r1 = (android.app.Activity) r1
            java.util.ArrayList<java.lang.String> r2 = r6.f92889c
            com.p280ss.android.ugc.aweme.poi.p335ui.upload.PoiUploadImagePreviewActivity.C35422a.m114424a(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.upload.ChooseImageActivity.mo59893d():void");
    }

    /* renamed from: b */
    public final void mo58710b() {
        super.mo58710b();
        this.f92890d = getIntent().getStringExtra("poi_id");
        if (VERSION.SDK_INT >= 19) {
            int a = C10994a.m32204a((Context) this);
            View b = m114387b(R.id.dal);
            C7573i.m23582a((Object) b, "status_bar");
            b.getLayoutParams().height = a;
        }
        if (C28410h.m93378r()) {
            m114388i();
        }
        ((ImageView) m114387b(R.id.jo)).setOnClickListener(new C35413a(this));
        ((AutoRTLTextView) m114387b(R.id.dqc)).setOnClickListener(new C35414b(this));
        ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.m76628a((LinearLayout) m114387b(R.id.a7r));
        a2.f61460k = new C35415c(this);
        C7573i.m23582a((Object) a2, "behavior");
        a2.f61453d = true;
        Context context = this;
        a2.mo60679a(C23482j.m77095a(context) + C23482j.m77104e(context));
        RecyclerView recyclerView = (RecyclerView) m114387b(R.id.aya);
        C7573i.m23582a((Object) recyclerView, "image_grid");
        recyclerView.setLayoutManager(new GridLayoutManager(null, 4));
        ((RecyclerView) m114387b(R.id.aya)).mo5525a((C1272h) new GridSpacingItemDecoration(4, (int) C9738o.m28708b(context, 1.0f), false));
        ChooseImageAdapter chooseImageAdapter = new ChooseImageAdapter(context, 4, 1.0d, 1.5f, 0, this);
        this.f92887a = chooseImageAdapter;
        RecyclerView recyclerView2 = (RecyclerView) m114387b(R.id.aya);
        C7573i.m23582a((Object) recyclerView2, "image_grid");
        recyclerView2.setAdapter(this.f92887a);
        this.f92888b.addAll(m114389j());
        ChooseImageAdapter chooseImageAdapter2 = this.f92887a;
        if (chooseImageAdapter2 != null) {
            chooseImageAdapter2.mo90160a(this.f92888b);
        }
    }

    /* renamed from: a */
    public final void mo90155a(int i) {
        if (i > 0) {
            AutoRTLTextView autoRTLTextView = (AutoRTLTextView) m114387b(R.id.dqc);
            C7573i.m23582a((Object) autoRTLTextView, "tv_add");
            autoRTLTextView.setVisibility(0);
            AutoRTLTextView autoRTLTextView2 = (AutoRTLTextView) m114387b(R.id.dqc);
            C7573i.m23582a((Object) autoRTLTextView2, "tv_add");
            String string = getString(R.string.cln);
            C7573i.m23582a((Object) string, "getString(R.string.next_step_with_count)");
            String a = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            autoRTLTextView2.setText(a);
            return;
        }
        AutoRTLTextView autoRTLTextView3 = (AutoRTLTextView) m114387b(R.id.dqc);
        C7573i.m23582a((Object) autoRTLTextView3, "tv_add");
        autoRTLTextView3.setVisibility(8);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 17) {
            finish();
        }
    }
}
