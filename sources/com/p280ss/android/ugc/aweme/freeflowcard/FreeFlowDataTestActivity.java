package com.p280ss.android.ugc.aweme.freeflowcard;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.freeflowcard.data.C29983a;
import com.p280ss.android.ugc.aweme.freeflowcard.data.entity.AppStartMode;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48056ad;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity */
public final class FreeFlowDataTestActivity extends AmeActivity implements C48056ad {

    /* renamed from: a */
    private final C47924e f78768a;

    /* renamed from: b */
    private HashMap f78769b;

    public FreeFlowDataTestActivity() {
        this(null, 1, null);
    }

    /* renamed from: a */
    private View m98256a(int i) {
        if (this.f78769b == null) {
            this.f78769b = new HashMap();
        }
        View view = (View) this.f78769b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78769b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final C47924e mo76163a() {
        return this.f78768a;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    private final void m98258b() {
        m98259c();
        m98260d();
    }

    /* renamed from: c */
    private final void m98259c() {
        boolean z;
        long[] b = C29968a.m98265b();
        int i = 0;
        List a = C29983a.m98302a().mo76177a(b[0], b[1]);
        C7573i.m23582a((Object) a, "lastMonthData");
        Iterable<AppStartMode> iterable = a;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            int i2 = 0;
            for (AppStartMode appStartMode : iterable) {
                if (appStartMode.mode == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i2++;
                    if (i2 < 0) {
                        C7525m.m23467c();
                    }
                }
            }
            i = i2;
        }
        int size = a.size() - i;
        DmtTextView dmtTextView = (DmtTextView) m98256a(R.id.bg5);
        C7573i.m23582a((Object) dmtTextView, "last_no_wifi");
        dmtTextView.setText(String.valueOf(size));
        DmtTextView dmtTextView2 = (DmtTextView) m98256a(R.id.bg8);
        C7573i.m23582a((Object) dmtTextView2, "last_wifi");
        dmtTextView2.setText(String.valueOf(i));
    }

    /* renamed from: d */
    private final void m98260d() {
        Pair a = m98257a(1, 7);
        DmtTextView dmtTextView = (DmtTextView) m98256a(R.id.eh8);
        C7573i.m23582a((Object) dmtTextView, "wifi_1");
        StringBuilder sb = new StringBuilder("1-7\n\n");
        sb.append(((Number) a.getFirst()).intValue());
        dmtTextView.setText(sb.toString());
        DmtTextView dmtTextView2 = (DmtTextView) m98256a(R.id.c4q);
        C7573i.m23582a((Object) dmtTextView2, "no_wifi_1");
        StringBuilder sb2 = new StringBuilder("1-7\n\n");
        sb2.append(((Number) a.getSecond()).intValue());
        dmtTextView2.setText(sb2.toString());
        Pair a2 = m98257a(8, 18);
        DmtTextView dmtTextView3 = (DmtTextView) m98256a(R.id.eh9);
        C7573i.m23582a((Object) dmtTextView3, "wifi_2");
        StringBuilder sb3 = new StringBuilder("8-18\n\n");
        sb3.append(((Number) a2.getFirst()).intValue());
        dmtTextView3.setText(sb3.toString());
        DmtTextView dmtTextView4 = (DmtTextView) m98256a(R.id.c4r);
        C7573i.m23582a((Object) dmtTextView4, "no_wifi_2");
        StringBuilder sb4 = new StringBuilder("8-18\n\n");
        sb4.append(((Number) a2.getSecond()).intValue());
        dmtTextView4.setText(sb4.toString());
        Pair a3 = m98257a(19, 25);
        DmtTextView dmtTextView5 = (DmtTextView) m98256a(R.id.eh_);
        C7573i.m23582a((Object) dmtTextView5, "wifi_3");
        StringBuilder sb5 = new StringBuilder("19-25\n\n");
        sb5.append(((Number) a3.getFirst()).intValue());
        dmtTextView5.setText(sb5.toString());
        DmtTextView dmtTextView6 = (DmtTextView) m98256a(R.id.c4s);
        C7573i.m23582a((Object) dmtTextView6, "no_wifi_3");
        StringBuilder sb6 = new StringBuilder("19-25\n\n");
        sb6.append(((Number) a3.getSecond()).intValue());
        dmtTextView6.setText(sb6.toString());
        Pair a4 = m98257a(26, C29968a.m98262a());
        DmtTextView dmtTextView7 = (DmtTextView) m98256a(R.id.eha);
        C7573i.m23582a((Object) dmtTextView7, "wifi_4");
        StringBuilder sb7 = new StringBuilder("26-31\n\n");
        sb7.append(((Number) a4.getFirst()).intValue());
        dmtTextView7.setText(sb7.toString());
        DmtTextView dmtTextView8 = (DmtTextView) m98256a(R.id.c4t);
        C7573i.m23582a((Object) dmtTextView8, "no_wifi_4");
        StringBuilder sb8 = new StringBuilder("26-31\n\n");
        sb8.append(((Number) a4.getSecond()).intValue());
        dmtTextView8.setText(sb8.toString());
    }

    public FreeFlowDataTestActivity(C47924e eVar) {
        C7573i.m23587b(eVar, "coroutineContext");
        this.f78768a = eVar;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bu);
        m98258b();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.freeflowcard.FreeFlowDataTestActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static Pair<Integer, Integer> m98257a(int i, int i2) {
        int i3;
        boolean z;
        long[] a = C29968a.m98264a(i, i2);
        int i4 = 0;
        List a2 = C29983a.m98302a().mo76177a(a[0], a[1]);
        if (C6307b.m19566a((Collection<T>) a2)) {
            i3 = 0;
        } else {
            C7573i.m23582a((Object) a2, "data");
            Iterable<AppStartMode> iterable = a2;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                int i5 = 0;
                for (AppStartMode appStartMode : iterable) {
                    if (appStartMode.mode == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i5++;
                        if (i5 < 0) {
                            C7525m.m23467c();
                        }
                    }
                }
                i4 = i5;
            }
            i3 = a2.size() - i4;
        }
        return new Pair<>(Integer.valueOf(i4), Integer.valueOf(i3));
    }

    public /* synthetic */ FreeFlowDataTestActivity(C47924e eVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            eVar = EmptyCoroutineContext.INSTANCE;
        }
        this(eVar);
    }
}
