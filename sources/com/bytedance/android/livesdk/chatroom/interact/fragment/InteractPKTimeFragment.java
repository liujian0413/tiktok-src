package com.bytedance.android.livesdk.chatroom.interact.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKSettingContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKTimeContract.View;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4545aq;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.widget.WheelPicker;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

public class InteractPKTimeFragment extends View {

    /* renamed from: e */
    private WheelPicker f13660e;

    /* renamed from: f */
    private Button f13661f;

    /* renamed from: g */
    private InteractDialogPKSettingContract.View f13662g;

    /* renamed from: h */
    private int[] f13663h = {120, C34943c.f91128x, 600, 900};

    /* renamed from: i */
    private int f13664i;

    /* renamed from: c */
    public final float mo12280c() {
        return 144.0f;
    }

    /* renamed from: b */
    public final String mo12279b() {
        return getString(R.string.ew9);
    }

    /* renamed from: d */
    public final android.view.View mo12281d() {
        return this.f13116a.mo12148b();
    }

    public InteractPKTimeFragment() {
        if (((Boolean) LiveConfigSettingKeys.PK_TEST_TIME.mo10240a()).booleanValue()) {
            this.f13663h = new int[]{10, 120, C34943c.f91128x, 600, 900};
        }
    }

    /* renamed from: e */
    public final android.view.View mo12282e() {
        if (this.f13661f == null) {
            this.f13661f = new Button(getContext());
            this.f13661f.setLayoutParams(new LayoutParams((int) C9738o.m28708b(getContext(), 32.0f), (int) C9738o.m28708b(getContext(), 32.0f)));
            this.f13661f.setBackgroundResource(R.drawable.bzn);
            this.f13661f.setOnClickListener(new C4805i(this));
        }
        return this.f13661f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12757a(android.view.View view) {
        int currentItemPosition = this.f13660e.getCurrentItemPosition();
        if (currentItemPosition >= 0 && currentItemPosition < this.f13663h.length) {
            this.f13662g.mo12312a(this.f13663h[currentItemPosition], currentItemPosition);
            this.f13116a.mo12143a();
        }
    }

    /* renamed from: a */
    public static InteractPKTimeFragment m15800a(C4522b bVar, InteractDialogPKSettingContract.View view, int i) {
        InteractPKTimeFragment interactPKTimeFragment = new InteractPKTimeFragment();
        interactPKTimeFragment.f13118c = new C4545aq(interactPKTimeFragment);
        interactPKTimeFragment.f13116a = bVar;
        interactPKTimeFragment.f13662g = view;
        interactPKTimeFragment.f13664i = i;
        return interactPKTimeFragment;
    }

    public android.view.View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        for (int i : this.f13663h) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("s");
            arrayList.add(sb.toString());
        }
        if (this.f13664i < 0 || this.f13664i >= arrayList.size()) {
            this.f13664i = 1;
        }
        this.f13660e = new WheelPicker(getContext());
        this.f13660e.setData(arrayList);
        this.f13660e.setIndicator(true);
        this.f13660e.setIndicatorSize(3);
        this.f13660e.setItemTextSize((int) C9738o.m28708b(getContext(), 16.0f));
        this.f13660e.setSelectItemTextSize((int) C9738o.m28708b(getContext(), 18.0f));
        this.f13660e.setItemTextColor(Color.parseColor("#a0404040"));
        this.f13660e.setSelectedItemTextColor(Color.parseColor("#404040"));
        this.f13660e.setBackgroundColor(Color.parseColor("#f7f7f7"));
        this.f13660e.mo22642a(this.f13664i, false);
        return this.f13660e;
    }
}
