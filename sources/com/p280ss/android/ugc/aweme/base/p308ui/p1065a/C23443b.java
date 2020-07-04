package com.p280ss.android.ugc.aweme.base.p308ui.p1065a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.ui.a.b */
public abstract class C23443b {

    /* renamed from: c */
    public final RemoteImageView f61851c;

    /* renamed from: d */
    public final DmtTextView f61852d;

    /* renamed from: e */
    public final ImageView f61853e;

    /* renamed from: f */
    public final DmtTextView f61854f;

    /* renamed from: g */
    public final DmtTextView f61855g;

    /* renamed from: h */
    public final ViewGroup f61856h;

    /* renamed from: i */
    public final DmtTextView f61857i;

    /* renamed from: j */
    public Aweme f61858j;

    /* renamed from: k */
    public JSONObject f61859k;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.a.b$a */
    static final class C23444a<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C23443b f61860a;

        C23444a(C23443b bVar) {
            this.f61860a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            this.f61860a.mo59068b();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.a.b$b */
    static final class C23445b<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C23443b f61861a;

        C23445b(C23443b bVar) {
            this.f61861a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            this.f61861a.mo59065a();
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo59065a();

    /* renamed from: b */
    public abstract void mo59068b();

    /* renamed from: c */
    public final void mo61055c() {
        mo61062f();
    }

    /* renamed from: d */
    public int mo61056d() {
        return R.drawable.lj;
    }

    /* renamed from: e */
    private final void mo61061e() {
        this.f61853e.setVisibility(8);
        this.f61854f.setVisibility(8);
        this.f61855g.setVisibility(8);
        this.f61856h.setVisibility(8);
        this.f61857i.setVisibility(8);
    }

    /* renamed from: f */
    private final void mo61062f() {
        C1592h.m7855a((Callable<TResult>) new C23445b<TResult>(this), (Executor) C6907h.m21516a());
    }

    /* renamed from: g */
    private final void m76941g() {
        C1592h.m7855a((Callable<TResult>) new C23444a<TResult>(this), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public void mo59066a(View view) {
        m76941g();
    }

    public C23443b(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        View findViewById = viewGroup.findViewById(R.id.b_z);
        C7573i.m23582a((Object) findViewById, "parent.findViewById(R.id.iv_location_special)");
        this.f61851c = (RemoteImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.buk);
        C7573i.m23582a((Object) findViewById2, "parent.findViewById(R.id.location_2)");
        this.f61852d = (DmtTextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.a9y);
        C7573i.m23582a((Object) findViewById3, "parent.findViewById(R.id.divider_top)");
        this.f61853e = (ImageView) findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.e7h);
        C7573i.m23582a((Object) findViewById4, "parent.findViewById(R.id.type_name)");
        this.f61854f = (DmtTextView) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.w4);
        C7573i.m23582a((Object) findViewById5, "parent.findViewById(R.id.city_name_or_distance_2)");
        this.f61855g = (DmtTextView) findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.cfb);
        C7573i.m23582a((Object) findViewById6, "parent.findViewById(R.id.poi_info_container)");
        this.f61856h = (ViewGroup) findViewById6;
        View findViewById7 = viewGroup.findViewById(R.id.duh);
        C7573i.m23582a((Object) findViewById7, "parent.findViewById(R.id.tv_festival_name)");
        this.f61857i = (DmtTextView) findViewById7;
    }

    /* renamed from: a */
    public void mo59067a(Aweme aweme, JSONObject jSONObject) {
        this.f61858j = aweme;
        this.f61859k = jSONObject;
        mo61061e();
    }
}
