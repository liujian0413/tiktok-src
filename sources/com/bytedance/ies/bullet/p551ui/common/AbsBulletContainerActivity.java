package com.bytedance.ies.bullet.p551ui.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.bullet.core.C10318a;
import com.bytedance.ies.bullet.core.C10331b;
import com.bytedance.ies.bullet.core.C10351d;
import com.bytedance.ies.bullet.core.kit.C10382g;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.bullet.core.p538a.C10328a;
import com.bytedance.ies.bullet.core.p538a.C10330c;
import com.bytedance.ies.bullet.core.p540c.C10337a;
import com.bytedance.ies.bullet.core.params.C10471n;
import com.bytedance.ies.bullet.p551ui.common.C10690e.C10691a;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10682c;
import com.bytedance.ies.bullet.p551ui.common.p553b.C10683d;
import com.bytedance.ies.bullet.p551ui.common.p554c.C10687a;
import com.bytedance.ies.bullet.p551ui.common.p554c.C10688b;
import com.bytedance.ies.bullet.p551ui.common.params.C10697a;
import com.bytedance.ies.bullet.p551ui.common.params.C10699c;
import com.bytedance.ies.bullet.p551ui.common.view.BulletTitleBar;
import com.bytedance.ies.bullet.p551ui.common.view.C10701a;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.gyf.barlibrary.ImmersionBar;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity */
public abstract class AbsBulletContainerActivity extends AbsActivity implements C10693g, C10694h {

    /* renamed from: a */
    public final C10689d f28527a = new C10667a(this, this);

    /* renamed from: b */
    public View f28528b;

    /* renamed from: c */
    public ViewGroup f28529c;

    /* renamed from: d */
    public C10403b f28530d;

    /* renamed from: e */
    public C10328a f28531e;

    /* renamed from: f */
    public Uri f28532f;

    /* renamed from: g */
    public C10697a f28533g = new C10697a();

    /* renamed from: h */
    public boolean f28534h;

    /* renamed from: i */
    private BulletContainerView f28535i;

    /* renamed from: j */
    private ImmersionBar f28536j;

    /* renamed from: k */
    private HashMap f28537k;

    /* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$a */
    public static final class C10667a extends C10677b {

        /* renamed from: a */
        final /* synthetic */ AbsBulletContainerActivity f28538a;

        C10667a(AbsBulletContainerActivity absBulletContainerActivity, Activity activity) {
            this.f28538a = absBulletContainerActivity;
            super(activity);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$b */
    public static final class C10668b implements C10691a {

        /* renamed from: a */
        final /* synthetic */ AbsBulletContainerActivity f28539a;

        C10668b(AbsBulletContainerActivity absBulletContainerActivity) {
            this.f28539a = absBulletContainerActivity;
        }

        /* renamed from: a */
        public final void mo25542a(Uri uri) {
            C7573i.m23587b(uri, "uri");
            this.f28539a.mo25535a(uri);
        }

        /* renamed from: a */
        public final void mo25545a(C10471n nVar) {
            C7573i.m23587b(nVar, "param");
            if (nVar instanceof C10697a) {
                this.f28539a.f28533g = (C10697a) nVar;
                this.f28539a.mo25538b();
            }
        }

        /* renamed from: a */
        public final void mo25544a(Uri uri, Throwable th) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(th, "e");
            this.f28539a.mo25537a(uri, th);
        }

        /* renamed from: a */
        public final void mo25543a(Uri uri, C10382g gVar, List<? extends C10682c<? extends View>> list, boolean z) {
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(gVar, "instance");
            C7573i.m23587b(list, "viewComponents");
            this.f28539a.mo25536a(uri, gVar, list, z);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.ui.common.AbsBulletContainerActivity$c */
    public static final class C10669c implements C10683d<View> {

        /* renamed from: a */
        final /* synthetic */ C10682c f28540a;

        /* renamed from: b */
        final /* synthetic */ AbsBulletContainerActivity f28541b;

        /* renamed from: a */
        public final void mo25546a(C10682c<View> cVar, Uri uri) {
            C7573i.m23587b(cVar, "viewComponent");
            C7573i.m23587b(uri, "uri");
        }

        C10669c(C10682c cVar, AbsBulletContainerActivity absBulletContainerActivity) {
            this.f28540a = cVar;
            this.f28541b = absBulletContainerActivity;
        }

        /* renamed from: b */
        public final void mo25548b(C10682c<View> cVar, Uri uri) {
            C7573i.m23587b(cVar, "viewComponent");
            C7573i.m23587b(uri, "uri");
            if (!this.f28541b.f28534h) {
                this.f28541b.f28534h = true;
                View view = this.f28541b.f28528b;
                if (!(view instanceof C10701a)) {
                    view = null;
                }
                C10701a aVar = (C10701a) view;
                if (aVar != null) {
                    aVar.mo25583b();
                }
            }
            this.f28540a.mo25561b((C10683d<T>) this);
        }

        /* renamed from: a */
        public final void mo25547a(C10682c<View> cVar, Uri uri, Throwable th) {
            C7573i.m23587b(cVar, "viewComponent");
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(th, "e");
            if (!this.f28541b.f28534h) {
                this.f28541b.f28534h = true;
                View view = this.f28541b.f28528b;
                if (!(view instanceof C10701a)) {
                    view = null;
                }
                C10701a aVar = (C10701a) view;
                if (aVar != null) {
                    aVar.mo25583b();
                }
            }
            this.f28540a.mo25561b((C10683d<T>) this);
        }
    }

    /* renamed from: g */
    private void m31147g() {
        super.onBackPressed();
    }

    /* renamed from: a */
    public View mo25533a(int i) {
        if (this.f28537k == null) {
            this.f28537k = new HashMap();
        }
        View view = (View) this.f28537k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f28537k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final ViewGroup mo25534a() {
        ViewGroup viewGroup = this.f28529c;
        if (viewGroup == null) {
            C7573i.m23583a("rootLayout");
        }
        return viewGroup;
    }

    public void onBackPressed() {
        if (!this.f28527a.mo25097f(this)) {
            m31147g();
        }
    }

    public void onPause() {
        super.onPause();
        this.f28527a.mo25093c(this);
    }

    public void onResume() {
        super.onResume();
        this.f28527a.mo25091b(this);
    }

    public void onStart() {
        super.onStart();
        this.f28527a.mo25087a(this);
    }

    public void onStop() {
        super.onStop();
        this.f28527a.mo25095d(this);
    }

    public void finish() {
        super.finish();
        if (C7573i.m23585a((Object) (Boolean) this.f28533g.f28580m.mo25251b(), (Object) Boolean.valueOf(true))) {
            super.overridePendingTransition(0, R.anim.t);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f28536j;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
        this.f28527a.mo25096e(this);
        BulletContainerView bulletContainerView = this.f28535i;
        if (bulletContainerView == null) {
            C7573i.m23583a("bulletContainerView");
        }
        bulletContainerView.mo25110a();
    }

    /* renamed from: e */
    private final void m31145e() {
        C10328a aVar;
        C10331b a = mo25565c().mo25026a();
        if (!(a instanceof C10318a)) {
            a = null;
        }
        C10318a aVar2 = (C10318a) a;
        if (aVar2 != null) {
            C10337a aVar3 = new C10337a();
            Class<Uri> cls = Uri.class;
            Uri uri = this.f28532f;
            if (uri == null) {
                C7573i.m23583a("uri");
            }
            aVar3.mo25262a(cls, uri);
            List<String> list = (List) aVar3.f28043a.mo25251b();
            if (list != null) {
                for (String str : list) {
                    C10351d dVar = (C10351d) aVar2.f27992h.get(str);
                    if (dVar != null) {
                        C10330c b = dVar.mo25117b();
                        if (b != null) {
                            aVar = (C10328a) b.mo25041a().invoke(aVar2.mo25069a());
                            this.f28531e = aVar;
                        }
                    }
                    aVar = null;
                    this.f28531e = aVar;
                }
            }
        }
    }

    /* renamed from: d */
    private final void m31144d() {
        boolean z;
        View view;
        m31145e();
        C10328a aVar = this.f28531e;
        if (aVar != null) {
            Context context = this;
            ViewGroup a = aVar.mo25085a(context);
            setContentView((View) a);
            BulletContainerView bulletContainerView = new BulletContainerView(context, null, 0, 6, null);
            this.f28535i = bulletContainerView;
            this.f28529c = a;
            ViewGroup a2 = aVar.mo25084a();
            BulletContainerView bulletContainerView2 = this.f28535i;
            if (bulletContainerView2 == null) {
                C7573i.m23583a("bulletContainerView");
            }
            a2.addView(bulletContainerView2);
            this.f28527a.mo25552a(aVar.mo25086b());
        }
        if (this.f28531e == null) {
            setContentView((int) R.layout.hw);
            BulletContainerView bulletContainerView3 = (BulletContainerView) mo25533a((int) R.id.s5);
            C7573i.m23582a((Object) bulletContainerView3, "bullet_container_view");
            this.f28535i = bulletContainerView3;
            RelativeLayout relativeLayout = (RelativeLayout) mo25533a((int) R.id.cwn);
            C7573i.m23582a((Object) relativeLayout, "root_layout");
            this.f28529c = relativeLayout;
            FrameLayout frameLayout = (FrameLayout) mo25533a((int) R.id.bu_);
            C7573i.m23582a((Object) frameLayout, "loading_view_container");
            ViewGroup viewGroup = frameLayout;
            Uri uri = this.f28532f;
            if (uri == null) {
                C7573i.m23583a("uri");
            }
            View b = mo25567b(viewGroup, uri);
            FrameLayout frameLayout2 = (FrameLayout) mo25533a((int) R.id.bu_);
            C7573i.m23582a((Object) frameLayout2, "loading_view_container");
            if (frameLayout2.getChildCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                view = b;
            } else {
                view = null;
            }
            if (view != null) {
                ((FrameLayout) mo25533a((int) R.id.bu_)).addView(view, -2, -2);
                view.setVisibility(0);
            }
            this.f28528b = b;
        }
    }

    /* renamed from: f */
    private final void m31146f() {
        if (C10688b.m31234a()) {
            C10688b.m31232a(getWindow());
            Activity activity = this;
            ImmersionBar with = ImmersionBar.with(activity);
            with.init();
            this.f28536j = with;
            if (C7573i.m23585a((Object) (Boolean) this.f28533g.f28585r.mo25251b(), (Object) Boolean.valueOf(true))) {
                C10688b.m31231a(activity, 0);
            }
            Boolean bool = (Boolean) this.f28533g.f28578k.mo25251b();
            if (bool != null) {
                C10688b.f28571a.mo25564a(activity, getWindow(), bool.booleanValue());
            }
            if ((!C7573i.m23585a((Object) (Boolean) this.f28533g.f28581n.mo25251b(), (Object) Boolean.valueOf(true)) || !C7573i.m23585a((Object) (Boolean) this.f28533g.f28583p.mo25251b(), (Object) Boolean.valueOf(true))) && (!C7573i.m23585a((Object) (Boolean) this.f28533g.f28583p.mo25251b(), (Object) Boolean.valueOf(true)) || C10687a.m31224a(this))) {
                C10699c cVar = (C10699c) this.f28533g.f28584q.mo25251b();
                if (cVar != null) {
                    C10688b.m31231a(activity, cVar.f28594a);
                    return;
                }
                return;
            }
            C10688b.m31230a(activity);
            ViewGroup viewGroup = this.f28529c;
            if (viewGroup == null) {
                C7573i.m23583a("rootLayout");
            }
            viewGroup.setPadding(0, 0, 0, 0);
        }
    }

    /* renamed from: b */
    public final void mo25538b() {
        if (C7573i.m23585a((Object) (Boolean) this.f28533g.f28580m.mo25251b(), (Object) Boolean.valueOf(true))) {
            super.overridePendingTransition(R.anim.bq, 0);
        }
        C10699c cVar = (C10699c) this.f28533g.f28579l.mo25251b();
        if (cVar != null) {
            BulletContainerView bulletContainerView = this.f28535i;
            if (bulletContainerView == null) {
                C7573i.m23583a("bulletContainerView");
            }
            bulletContainerView.setBackgroundColor(cVar.f28594a);
        }
        C10699c cVar2 = (C10699c) this.f28533g.f28588u.mo25251b();
        if (cVar2 != null) {
            ViewGroup viewGroup = this.f28529c;
            if (viewGroup == null) {
                C7573i.m23583a("rootLayout");
            }
            viewGroup.setBackgroundColor(cVar2.f28594a);
        }
        if (C7573i.m23585a((Object) (Boolean) this.f28533g.f28586s.mo25251b(), (Object) Boolean.valueOf(true))) {
            ViewGroup viewGroup2 = this.f28529c;
            if (viewGroup2 == null) {
                C7573i.m23583a("rootLayout");
            }
            viewGroup2.setPadding(0, C10688b.m31229a((Context) this), 0, 0);
        }
        if (C7573i.m23585a((Object) (Boolean) this.f28533g.f28574A.mo25251b(), (Object) Boolean.valueOf(true))) {
            getWindow().setSoftInputMode(32);
        }
        if (this.f28531e == null) {
            int i = 8;
            if (C7573i.m23585a((Object) (Boolean) this.f28533g.f28585r.mo25251b(), (Object) Boolean.valueOf(true))) {
                FrameLayout frameLayout = (FrameLayout) mo25533a((int) R.id.dk2);
                C7573i.m23582a((Object) frameLayout, "title_bar_container");
                frameLayout.setVisibility(8);
            } else {
                FrameLayout frameLayout2 = (FrameLayout) mo25533a((int) R.id.dk2);
                C7573i.m23582a((Object) frameLayout2, "title_bar_container");
                ViewGroup viewGroup3 = frameLayout2;
                Uri uri = this.f28532f;
                if (uri == null) {
                    C7573i.m23583a("uri");
                }
                mo25566a(viewGroup3, uri);
                FrameLayout frameLayout3 = (FrameLayout) mo25533a((int) R.id.dk2);
                BulletTitleBar bulletTitleBar = new BulletTitleBar(this, null, 0, 6, null);
                bulletTitleBar.mo25580a(this.f28533g);
                frameLayout3.addView(bulletTitleBar, -1, -1);
            }
            View view = this.f28528b;
            if (view != null) {
                if (C7573i.m23585a((Object) (Boolean) this.f28533g.f28582o.mo25251b(), (Object) Boolean.valueOf(false))) {
                    i = 0;
                }
                view.setVisibility(i);
            }
        }
        m31146f();
    }

    public final void setLoadingView(View view) {
        this.f28528b = view;
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f28527a.mo25094c(this, bundle);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f28527a.mo25090a((Activity) this, z);
    }

    /* renamed from: a */
    public final void mo25535a(Uri uri) {
        C7573i.m23587b(uri, "uri");
        this.f28534h = false;
        View view = this.f28528b;
        if (!(view instanceof C10701a)) {
            view = null;
        }
        C10701a aVar = (C10701a) view;
        if (aVar != null) {
            aVar.mo25582a();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        this.f28527a.mo25092b(this, bundle);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                this.f28532f = data;
            }
        }
        if (this.f28532f == null) {
            finish();
            return;
        }
        StringBuilder sb = new StringBuilder("uri:");
        Uri uri = this.f28532f;
        if (uri == null) {
            C7573i.m23583a("uri");
        }
        sb.append(uri);
        supportRequestWindowFeature(10);
        m31144d();
        BulletContainerView bulletContainerView = this.f28535i;
        if (bulletContainerView == null) {
            C7573i.m23583a("bulletContainerView");
        }
        this.f28530d = bulletContainerView.getProviderFactory();
        bulletContainerView.getProviderFactory().mo25201a(C10689d.class, this.f28527a);
        bulletContainerView.mo25098a(mo25565c());
        Uri uri2 = this.f28532f;
        if (uri2 == null) {
            C7573i.m23583a("uri");
        }
        Intent intent2 = getIntent();
        if (intent2 != null) {
            bundle2 = intent2.getExtras();
        } else {
            bundle2 = null;
        }
        bulletContainerView.mo25549a(uri2, bundle2, new C10668b(this));
        this.f28527a.mo25089a((Activity) this, bundle);
    }

    /* renamed from: a */
    public final void mo25537a(Uri uri, Throwable th) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(th, "e");
        View view = this.f28528b;
        if (!(view instanceof C10701a)) {
            view = null;
        }
        C10701a aVar = (C10701a) view;
        if (aVar != null) {
            aVar.mo25583b();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f28527a.mo25088a(this, i, i2, intent);
    }

    /* renamed from: a */
    public void mo25536a(Uri uri, C10382g gVar, List<? extends C10682c<? extends View>> list, boolean z) {
        C7573i.m23587b(uri, "uri");
        C7573i.m23587b(gVar, "instance");
        C7573i.m23587b(list, "viewComponents");
        for (C10682c cVar : list) {
            if (cVar != null) {
                cVar.mo25559a((C10683d<T>) new C10669c<T>(cVar, this));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.kit.ViewComponent<android.view.View>");
            }
        }
    }
}
