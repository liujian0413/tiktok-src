package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.OperationButton;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.i */
final class C25824i {

    /* renamed from: a */
    private PopupWindow f68287a;

    /* renamed from: b */
    private View f68288b;

    /* renamed from: c */
    private View f68289c;

    /* renamed from: d */
    private View f68290d;

    /* renamed from: e */
    private List<Integer> f68291e;

    /* renamed from: f */
    private Activity f68292f;

    /* renamed from: g */
    private C25822g f68293g;

    /* renamed from: h */
    private OnClickListener f68294h = new C25825j(this);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final PopupWindow mo67140a() {
        if (this.f68287a == null) {
            View inflate = LayoutInflater.from(this.f68292f).inflate(R.layout.hv, null, false);
            this.f68288b = inflate.findViewById(R.id.cr4);
            this.f68289c = inflate.findViewById(R.id.a32);
            this.f68290d = inflate.findViewById(R.id.c8x);
            this.f68288b.setOnClickListener(this.f68294h);
            this.f68289c.setOnClickListener(this.f68294h);
            this.f68290d.setOnClickListener(this.f68294h);
            this.f68287a = new PopupWindow(inflate, -2, -2, true);
            this.f68287a.setTouchable(true);
            this.f68287a.setAnimationStyle(R.style.s1);
            this.f68287a.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.f68287a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo67143b() {
        boolean z;
        if (this.f68291e == null || this.f68291e.isEmpty()) {
            this.f68288b.setVisibility(0);
            this.f68289c.setVisibility(0);
            this.f68290d.setVisibility(0);
            return true;
        }
        if (this.f68291e.contains(Integer.valueOf(OperationButton.refresh.f68472id))) {
            C23487o.m77140a(this.f68288b, 8);
            z = false;
        } else {
            C23487o.m77140a(this.f68288b, 0);
            z = true;
        }
        if (this.f68291e.contains(Integer.valueOf(OperationButton.copylink.f68472id))) {
            this.f68289c.setVisibility(8);
        } else {
            this.f68289c.setVisibility(0);
            z = true;
        }
        if (this.f68291e.contains(Integer.valueOf(OperationButton.openwithbrowser.f68472id))) {
            this.f68290d.setVisibility(8);
        } else {
            this.f68290d.setVisibility(0);
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo67141a(View view) {
        int id = view.getId();
        C25826k.m84932a(mo67140a());
        String currentUrl = this.f68293g.mo65877f().getCurrentUrl();
        if (id == R.id.c8x) {
            C25833b.m84957a(this.f68292f, currentUrl);
        } else if (id == R.id.a32) {
            C25833b.m84965b(this.f68292f, currentUrl);
        } else {
            if (id == R.id.cr4) {
                this.f68293g.mo65877f().mo65878g();
            }
        }
    }

    C25824i(Activity activity, C25822g gVar) {
        this.f68292f = activity;
        this.f68293g = gVar;
        mo67140a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo67142a(String str, int i) {
        if (!C6319n.m19593a(str)) {
            int i2 = -1;
            OperationButton[] values = OperationButton.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                OperationButton operationButton = values[i3];
                if (TextUtils.equals(str, operationButton.key)) {
                    i2 = operationButton.f68472id;
                    break;
                }
                i3++;
            }
            if (i2 > 0) {
                C9738o.m28712b(this.f68292f.findViewById(i2), 8);
                if (this.f68291e == null) {
                    this.f68291e = new ArrayList();
                }
                if (!this.f68291e.contains(Integer.valueOf(i2))) {
                    this.f68291e.add(Integer.valueOf(i2));
                }
            }
        }
    }
}
