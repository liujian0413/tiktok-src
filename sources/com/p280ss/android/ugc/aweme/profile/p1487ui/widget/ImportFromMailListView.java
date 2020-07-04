package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.ImportFromMailListView */
public class ImportFromMailListView extends LinearLayout {
    /* renamed from: b */
    private boolean m118101b() {
        if (C0683b.m2909b(getContext(), "android.permission.READ_CONTACTS") == 0) {
            return true;
        }
        ActivityCompat.m2241a((Activity) getContext(), new String[]{"android.permission.READ_CONTACTS"}, 1);
        return false;
    }

    /* renamed from: a */
    public final void mo92829a() {
        if (m118101b()) {
            ComponentName componentName = new ComponentName(getContext().getPackageName(), "com.ss.android.ugc.aweme.friends.ui.ContactsActivity");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            getContext().startActivity(intent);
            return;
        }
        C10761a.m31409e(getContext(), (int) R.string.i2).mo25750a();
    }

    public ImportFromMailListView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m118100a(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.b3f, this);
        setOrientation(1);
        setLayoutParams(new LayoutParams(-1, -2));
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                ImportFromMailListView.this.mo92829a();
            }
        });
    }

    public ImportFromMailListView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public ImportFromMailListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118100a(context);
    }
}
