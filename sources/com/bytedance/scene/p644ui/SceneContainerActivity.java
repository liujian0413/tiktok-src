package com.bytedance.scene.p644ui;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.C12626i;
import com.bytedance.scene.C12629j;
import com.bytedance.scene.C12642n;
import com.bytedance.scene.C12701v;
import com.bytedance.scene.navigation.C12666f;
import com.bytedance.scene.p639a.C12557a;
import com.bytedance.scene.p639a.C12565c;
import com.bytedance.scene.p642b.C12586e.C12588a;
import com.bytedance.scene.p642b.C12589f;
import com.bytedance.scene.utlity.C12689a;
import com.bytedance.scene.utlity.C12691b;
import com.bytedance.scene.utlity.C12696f;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.ui.SceneContainerActivity */
public class SceneContainerActivity extends AppCompatActivity {

    /* renamed from: a */
    public static final Set<C12589f> f33659a = new HashSet();

    /* renamed from: b */
    public static final List<SceneContainerActivity> f33660b = new ArrayList();

    /* renamed from: c */
    public int f33661c = -1;

    /* renamed from: d */
    private C12642n f33662d;

    /* renamed from: e */
    private boolean f33663e;

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$1 */
    static class C126801 {
    }

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$a */
    public static class C12681a extends C12629j {
        /* renamed from: e */
        public final void mo30985e(Bundle bundle) {
            super.mo30985e(bundle);
            C12696f a = SceneContainerActivity.m36870a(mo31015v().getIntent());
            this.f33527e.mo31065a((Class) a.f33695a, (Bundle) a.f33696b, new C12588a().mo30860a((C12565c) new C12683b(null)).mo30861a((C12589f) new C12589f() {
                /* renamed from: a */
                public final void mo30864a(Object obj) {
                    C12701v.m36914a(C12681a.this.mo31015v().getIntent()).mo31158a(obj);
                    C12681a.this.mo31015v().finish();
                }
            }).mo30863a());
        }

        /* renamed from: a */
        public final View mo30923a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return new View(mo31015v());
        }
    }

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$b */
    static class C12683b extends C12565c {
        private C12683b() {
        }

        /* synthetic */ C12683b(C126801 r1) {
            this();
        }

        /* renamed from: a */
        public final void mo30840a(C12557a aVar, C12557a aVar2, Runnable runnable, C12691b bVar) {
            runnable.run();
        }

        /* renamed from: b */
        public final void mo30842b(C12557a aVar, C12557a aVar2, Runnable runnable, C12691b bVar) {
            View view = aVar.f33331b;
            View view2 = aVar2.f33331b;
            C12689a.m36889a(view);
            C12689a.m36889a(view2);
            view.setVisibility(0);
            if (VERSION.SDK_INT >= 18) {
                this.f33340a.getOverlay().add(view);
            } else {
                this.f33340a.addView(view);
            }
            runnable.run();
        }
    }

    public void onStart() {
        super.onStart();
        this.f33663e = true;
    }

    public void onStop() {
        super.onStop();
        this.f33663e = false;
    }

    public void onBackPressed() {
        if (!this.f33662d.mo30877a()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        f33660b.remove(this);
    }

    /* renamed from: a */
    public static C12696f<? extends Class<? extends C12629j>, Bundle> m36870a(Intent intent) {
        try {
            return C12696f.m36901a(Class.forName(intent.getStringExtra("class_name")), intent.getBundleExtra("arguments"));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        this.f33661c = intExtra;
        if (VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | PreloadTask.BYTE_UNIT_NUMBER);
        }
        f33660b.add(this);
        if (C12701v.m36914a(getIntent()) != null) {
            this.f33662d = C12626i.m36630a(this, bundle, new C12666f(C12681a.class, (Bundle) null), false);
            return;
        }
        C12696f a = m36870a(getIntent());
        this.f33662d = C12626i.m36630a(this, bundle, new C12666f((Class) a.f33695a, (Bundle) a.f33696b), false);
    }
}
