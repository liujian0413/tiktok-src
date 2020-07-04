package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Switch;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract.C4512a;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract.View;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4540al;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.sharedpref.C8947c;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.IPropertyCache;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class InteractPKSettingFragment extends View implements OnClickListener, OnCheckedChangeListener {

    /* renamed from: e */
    private TextView f13655e;

    /* renamed from: f */
    private Switch f13656f;

    /* renamed from: g */
    private Switch f13657g;

    /* renamed from: h */
    private ViewGroup f13658h;

    /* renamed from: i */
    private IPropertyCache f13659i;

    /* renamed from: c */
    public final float mo12280c() {
        return 216.0f;
    }

    /* renamed from: b */
    public final String mo12279b() {
        return getString(R.string.ewa);
    }

    /* renamed from: h */
    public final void mo12315h() {
        int i;
        if (this.f10103o) {
            C8947c<Integer> cVar = C8946b.f24488r;
            if (this.f13657g.isChecked()) {
                i = 2;
            } else {
                i = 1;
            }
            cVar.mo22118a(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public final void mo12310a() {
        if (this.f10103o) {
            if (!this.f13656f.isChecked()) {
                C8946b.f24488r.mo22118a(Integer.valueOf(0));
            } else if (!this.f13657g.isChecked()) {
                C8946b.f24488r.mo22118a(Integer.valueOf(1));
            } else {
                C8946b.f24488r.mo22118a(Integer.valueOf(2));
            }
        }
    }

    /* renamed from: d */
    public final android.view.View mo12281d() {
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
        autoRTLImageView.setLayoutParams(new LayoutParams(C3358ac.m12510a(32.0f), C3358ac.m12510a(32.0f)));
        autoRTLImageView.setImageDrawable(C3358ac.m12524c(R.drawable.c3l));
        autoRTLImageView.setOnClickListener(new C4804h(this));
        return autoRTLImageView;
    }

    /* renamed from: a */
    public static InteractPKSettingFragment m15789a(C4522b bVar) {
        InteractPKSettingFragment interactPKSettingFragment = new InteractPKSettingFragment();
        interactPKSettingFragment.f13118c = new C4540al(interactPKSettingFragment);
        interactPKSettingFragment.f13116a = bVar;
        return interactPKSettingFragment;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12754a(android.view.View view) {
        C8946b.f24396aU.mo22118a(((C4512a) this.f13118c).mo12322e());
        this.f13116a.mo12143a();
    }

    public void onClick(android.view.View view) {
        if (view.getId() == R.id.e3_) {
            this.f13116a.mo12147a(InteractPKTimeFragment.m15800a(this.f13116a, this, ((C4512a) this.f13118c).mo12321d()));
        }
    }

    /* renamed from: b */
    public final void mo12314b(Throwable th) {
        if (this.f10103o) {
            C9076n.m27095a(getContext(), th);
            this.f13657g.setOnCheckedChangeListener(null);
            this.f13657g.setChecked(!this.f13657g.isClickable());
            this.f13657g.setOnCheckedChangeListener(this);
        }
    }

    /* renamed from: a */
    public final void mo12311a(int i) {
        if (this.f10103o) {
            this.f13655e.setText(C9078p.m27100a(getContext().getString(R.string.eo9), Integer.valueOf(i)));
        }
    }

    /* renamed from: a */
    public final void mo12313a(Throwable th) {
        if (this.f10103o) {
            C9076n.m27095a(getContext(), th);
            this.f13656f.setOnCheckedChangeListener(null);
            this.f13656f.setChecked(!this.f13656f.isClickable());
            this.f13656f.setOnCheckedChangeListener(null);
        }
    }

    /* renamed from: a */
    public final void mo12312a(int i, int i2) {
        ((C4512a) this.f13118c).mo12316a(i, i2);
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        if (compoundButton.getId() == R.id.deq) {
            C8946b.f24394aS.mo22118a(Boolean.valueOf(z));
        } else if (compoundButton.getId() == R.id.deo) {
            C8946b.f24395aT.mo22118a(Boolean.valueOf(z));
        } else if (compoundButton.getId() == R.id.dem) {
            ViewGroup viewGroup = this.f13658h;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            viewGroup.setVisibility(i);
            if (!z) {
                this.f13657g.setOnCheckedChangeListener(null);
                this.f13657g.setChecked(false);
                this.f13657g.setOnCheckedChangeListener(this);
            }
            ((C4512a) this.f13118c).mo12318a(z);
        } else if (compoundButton.getId() == R.id.den) {
            ((C4512a) this.f13118c).mo12319b(z);
        } else {
            if (compoundButton.getId() != R.id.dep && compoundButton.getId() == R.id.dez) {
                C8946b.f24350B.mo22118a(Boolean.valueOf(z));
            }
        }
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        android.view.View inflate = layoutInflater.inflate(R.layout.aq_, viewGroup, false);
        this.f13655e = (TextView) inflate.findViewById(R.id.e3_);
        inflate.findViewById(R.id.deq);
        inflate.findViewById(R.id.deo);
        this.f13658h = (ViewGroup) inflate.findViewById(R.id.alt);
        this.f13656f = (Switch) inflate.findViewById(R.id.dem);
        this.f13657g = (Switch) inflate.findViewById(R.id.den);
        int intValue = ((Integer) C8946b.f24488r.mo22117a()).intValue();
        if (intValue == 0) {
            this.f13656f.setChecked(false);
            this.f13658h.setVisibility(8);
        } else if (intValue == 1) {
            this.f13656f.setChecked(true);
        } else if (intValue == 2) {
            this.f13656f.setChecked(true);
            this.f13657g.setChecked(true);
        }
        this.f13656f.setOnCheckedChangeListener(this);
        this.f13657g.setOnCheckedChangeListener(this);
        this.f13659i = TTLiveSDKContext.getHostService().mo22361b().mo23190b();
        this.f13655e.setOnClickListener(this);
        this.f13655e.setText(C9078p.m27100a(getContext().getString(R.string.eo9), Integer.valueOf(((C4512a) this.f13118c).mo12320c())));
        ((C4512a) this.f13118c).mo12317a((String) C8946b.f24396aU.mo22117a());
        return inflate;
    }
}
