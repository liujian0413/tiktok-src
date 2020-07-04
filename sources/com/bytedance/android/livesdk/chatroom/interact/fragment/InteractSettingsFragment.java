package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract.C4516a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogSettingContract.View;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4558bc;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.C9076n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class InteractSettingsFragment extends View implements OnCheckedChangeListener {

    /* renamed from: e */
    private Switch f13691e;

    /* renamed from: f */
    private Switch f13692f;

    /* renamed from: g */
    private Switch f13693g;

    /* renamed from: h */
    private android.view.View f13694h;

    /* renamed from: c */
    public final float mo12280c() {
        return 216.0f;
    }

    /* renamed from: b */
    public final String mo12279b() {
        return getString(R.string.ewa);
    }

    /* renamed from: d */
    public final android.view.View mo12281d() {
        return this.f13116a.mo12148b();
    }

    /* renamed from: h */
    public final void mo12334h() {
        int i;
        if (this.f10103o) {
            C8947c<Integer> cVar = C8946b.f24488r;
            if (this.f13692f.isChecked()) {
                i = 2;
            } else {
                i = 1;
            }
            cVar.mo22118a(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo12331a() {
        if (this.f10103o) {
            if (!this.f13691e.isChecked()) {
                C8946b.f24488r.mo22118a(Integer.valueOf(0));
            } else if (!this.f13692f.isChecked()) {
                C8946b.f24488r.mo22118a(Integer.valueOf(1));
            } else {
                C8946b.f24488r.mo22118a(Integer.valueOf(2));
            }
        }
    }

    /* renamed from: a */
    public static InteractSettingsFragment m15828a(C4522b bVar) {
        InteractSettingsFragment interactSettingsFragment = new InteractSettingsFragment();
        interactSettingsFragment.f13118c = new C4558bc(interactSettingsFragment);
        interactSettingsFragment.f13116a = bVar;
        return interactSettingsFragment;
    }

    /* renamed from: b */
    public final void mo12333b(Throwable th) {
        if (this.f10103o) {
            C9076n.m27095a(getContext(), th);
            this.f13692f.setOnCheckedChangeListener(null);
            this.f13692f.setChecked(!this.f13692f.isClickable());
            this.f13692f.setOnCheckedChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo12332a(Throwable th) {
        if (this.f10103o) {
            C9076n.m27095a(getContext(), th);
            this.f13691e.setOnCheckedChangeListener(null);
            this.f13691e.setChecked(!this.f13691e.isClickable());
            this.f13691e.setOnCheckedChangeListener(null);
        }
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        int id = compoundButton.getId();
        if (id == R.id.dem) {
            android.view.View view = this.f13694h;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (!z) {
                this.f13692f.setOnCheckedChangeListener(null);
                this.f13692f.setChecked(false);
                this.f13692f.setOnCheckedChangeListener(this);
            }
            ((C4516a) this.f13118c).mo12335a(z);
        } else if (id == R.id.den) {
            ((C4516a) this.f13118c).mo12336b(z);
        } else {
            if (id == R.id.der) {
                C8946b.f24350B.mo22118a(Boolean.valueOf(z));
            }
        }
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(R.layout.aqb, viewGroup, false);
        this.f13691e = (Switch) inflate.findViewById(R.id.dem);
        this.f13692f = (Switch) inflate.findViewById(R.id.den);
        this.f13693g = (Switch) inflate.findViewById(R.id.der);
        this.f13694h = inflate.findViewById(R.id.alt);
        int intValue = ((Integer) C8946b.f24488r.mo22117a()).intValue();
        if (intValue == 0) {
            this.f13691e.setChecked(false);
            this.f13694h.setVisibility(8);
        } else if (intValue == 1) {
            this.f13691e.setChecked(true);
        } else if (intValue == 2) {
            this.f13691e.setChecked(true);
            this.f13692f.setChecked(true);
        }
        this.f13693g.setChecked(((Boolean) C8946b.f24350B.mo22117a()).booleanValue());
        this.f13691e.setOnCheckedChangeListener(this);
        this.f13692f.setOnCheckedChangeListener(this);
        this.f13693g.setOnCheckedChangeListener(new C4808l(this));
        return inflate;
    }
}
