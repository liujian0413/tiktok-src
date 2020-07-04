package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.PermissionSettingItem */
public class PermissionSettingItem extends PublishSettingItem implements OnClickListener {

    /* renamed from: a */
    private ArrayList<OnClickListener> f107088a;

    /* renamed from: b */
    private int f107089b;

    public int getPermission() {
        return this.f107089b;
    }

    /* renamed from: a */
    private void m131354a() {
        if (!C6399b.m19944t() || C35563c.f93260w.mo57092e() == null || !C35563c.f93260w.mo57092e().mo58561d()) {
            setSubtitle((int) R.string.d94);
        } else {
            setSubtitle((int) R.string.d95);
        }
    }

    /* renamed from: a */
    public final void mo101645a(OnClickListener onClickListener) {
        if (this.f107088a == null) {
            this.f107088a = new ArrayList<>();
        }
        this.f107088a.add(onClickListener);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (!C6307b.m19566a((Collection<T>) this.f107088a)) {
            Iterator it = this.f107088a.iterator();
            while (it.hasNext()) {
                ((OnClickListener) it.next()).onClick(view);
            }
        }
    }

    public void setPermission(int i) {
        this.f107089b = i;
        if (i == 0) {
            m131354a();
            setDrawableLeft(PublishSettingItem.m131373a(C0683b.m2903a(getContext(), (int) R.drawable.afd), ColorStateList.valueOf(C0683b.m2912c(getContext(), R.color.a5d))));
        } else if (i == 1) {
            setSubtitle((int) R.string.d5_);
            setDrawableLeft((int) R.drawable.aff);
        } else {
            setSubtitle((int) R.string.b_i);
            setDrawableLeft((int) R.drawable.aec);
        }
    }

    public PermissionSettingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDrawableLeft(C0683b.m2903a(context, (int) R.drawable.afd));
        setTitle((int) R.string.d5d);
        m131354a();
        this.f107115g.setBackground(C10774c.m31449e(context));
        if (!C35563c.f93230L.mo93342a(Property.PrivateAvailable)) {
            setVisibility(8);
        }
        setOnClickListener(this);
    }
}
