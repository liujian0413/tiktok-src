package com.bytedance.android.live.broadcast.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ToggleButton;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.floatwindow.C7851i;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.widget.C9239c;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.dialog.h */
public final class C2533h extends C9239c implements OnCheckedChangeListener {

    /* renamed from: a */
    private boolean f8165a;

    /* renamed from: c */
    private boolean f8166c;

    /* renamed from: d */
    private ToggleButton f8167d;

    /* renamed from: e */
    private ToggleButton f8168e;

    /* renamed from: f */
    private ToggleButton f8169f;

    /* renamed from: g */
    private boolean f8170g;

    /* renamed from: h */
    private boolean f8171h;

    /* renamed from: a */
    public final int mo9100a() {
        return R.layout.ao9;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getWindow() != null && !C3358ac.m12529f()) {
            getWindow().setLayout(C3358ac.m12510a(376.0f), C3358ac.m12510a(230.0f));
            getWindow().setGravity(8388693);
        }
        this.f8167d = (ToggleButton) findViewById(R.id.dl2);
        this.f8168e = (ToggleButton) findViewById(R.id.dl4);
        this.f8169f = (ToggleButton) findViewById(R.id.dl3);
        this.f8167d.setChecked(this.f8165a);
        this.f8168e.setChecked(this.f8166c);
        this.f8169f.setChecked(this.f8171h);
        this.f8167d.setOnCheckedChangeListener(this);
        this.f8168e.setOnCheckedChangeListener(this);
        this.f8169f.setOnCheckedChangeListener(this);
        findViewById(R.id.dl3).setVisibility(8);
        this.f8169f.setVisibility(8);
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int id = compoundButton.getId();
        if (id == R.id.dl2) {
            this.f8165a = z;
            C8946b.f24408ag.mo22118a(Boolean.valueOf(this.f8165a));
        } else if (id == R.id.dl4) {
            this.f8166c = z;
            C8946b.f24409ah.mo22118a(Boolean.valueOf(this.f8166c));
        } else if (id == R.id.dl3) {
            this.f8171h = z;
            C8946b.f24409ah.mo22118a(Boolean.valueOf(this.f8171h));
        }
        if (z && !C7851i.m24074a(getContext())) {
            new C9249a(getContext(), 0).mo22710a((int) R.string.fc3).mo22718b((int) R.string.eyr).mo22722b(0, (int) R.string.f96, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C7851i.m24077b(C2533h.this.getContext());
                    dialogInterface.dismiss();
                }
            }).mo22722b(1, (int) R.string.ecm, (OnClickListener) new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            }).mo22720b().show();
        }
    }

    public C2533h(Context context, boolean z, boolean z2, boolean z3, boolean z4) {
        super(context);
        this.f8165a = z;
        this.f8166c = z2;
        this.f8170g = z4;
        this.f8171h = z3;
    }
}
