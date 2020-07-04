package com.bytedance.ies.dmt.p262ui.widget.tablayout;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10826g;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.c */
public final class C10830c {

    /* renamed from: a */
    public static final C10830c f29313a = new C10830c();

    private C10830c() {
    }

    /* renamed from: a */
    public static final void m31774a(DmtTabLayout dmtTabLayout) {
        C7573i.m23587b(dmtTabLayout, "tabLayout");
        if (dmtTabLayout.getTabMode() == 0 && dmtTabLayout.getTabCount() > 5) {
            int tabCount = dmtTabLayout.getTabCount();
            int i = 0;
            for (int i2 = 0; i2 < tabCount; i2++) {
                C10825f b = dmtTabLayout.mo26066b(i2);
                if (b == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) b, "tabLayout.getTabAt(i)!!");
                C10826g gVar = b.f29294h;
                C7573i.m23582a((Object) gVar, "tabLayout.getTabAt(i)!!.view");
                View view = gVar;
                if (view.getVisibility() == 0) {
                    i = Math.max(view.getMeasuredWidth(), i);
                }
            }
            if (i > 0) {
                float measuredWidth = (float) (dmtTabLayout.getMeasuredWidth() - dmtTabLayout.getTabStripLeftPadding());
                if (((float) i) * 5.5f < measuredWidth) {
                    float f = measuredWidth / 5.5f;
                    int tabCount2 = dmtTabLayout.getTabCount();
                    for (int i3 = 0; i3 < tabCount2; i3++) {
                        C10825f b2 = dmtTabLayout.mo26066b(i3);
                        if (b2 == null) {
                            C7573i.m23580a();
                        }
                        C7573i.m23582a((Object) b2, "tabLayout.getTabAt(i)!!");
                        C10826g gVar2 = b2.f29294h;
                        C7573i.m23582a((Object) gVar2, "tabLayout.getTabAt(i)!!.view");
                        View view2 = gVar2;
                        if (view2.getVisibility() == 0) {
                            LayoutParams layoutParams = view2.getLayoutParams();
                            if (layoutParams != null) {
                                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                layoutParams2.width = (int) f;
                                layoutParams2.weight = 0.0f;
                                view2.setLayoutParams(layoutParams2);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            }
                        }
                    }
                }
            }
        }
    }
}
