package com.bytedance.android.live.wallet.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.live.wallet.adapter.MyWalletAdapter;
import com.bytedance.android.live.wallet.api.WalletApi;
import com.bytedance.android.live.wallet.model.C3824j;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

public class MyWalletFragment extends BaseFragment {

    /* renamed from: a */
    RecyclerView f11282a;

    /* renamed from: b */
    LoadingStatusView f11283b;

    /* renamed from: c */
    MyWalletAdapter f11284c;

    public void onResume() {
        super.onResume();
        mo11283a();
    }

    /* renamed from: a */
    public final void mo11283a() {
        this.f11283b.mo10830c();
        this.f11283b.setVisibility(0);
        ((C3245ad) ((WalletApi) C3458e.m12798a().mo10440a(WalletApi.class)).getWalletBindInfo().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10183a(new C7326g<C3479d<C3824j>>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C3479d<C3824j> dVar) throws Exception {
                if (dVar == null || dVar.data == null) {
                    MyWalletFragment.this.f11283b.setVisibility(0);
                    MyWalletFragment.this.f11283b.mo10832e();
                    return;
                }
                MyWalletFragment.this.f11283b.mo10828a();
                MyWalletFragment.this.f11283b.setVisibility(8);
                MyWalletFragment.this.f11284c.mo11062a((C3824j) dVar.data);
            }
        }, new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                MyWalletFragment.this.f11283b.setVisibility(0);
                MyWalletFragment.this.f11283b.mo10832e();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.aqy, viewGroup, false);
        m13551a(inflate, layoutInflater, viewGroup);
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", "wallet");
        C8443c.m25663a().mo21606a("livesdk_withdraw_page_show", hashMap, C8438j.class, Room.class);
        return inflate;
    }

    /* renamed from: a */
    private void m13551a(View view, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f11283b = (LoadingStatusView) view.findViewById(R.id.bu2);
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.aub, viewGroup, false);
        inflate.setBackgroundColor(Color.parseColor("#ffffff"));
        inflate.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                MyWalletFragment.this.mo11283a();
            }
        });
        if (!(getContext() == null || getContext().getResources() == null)) {
            i = getContext().getResources().getDimensionPixelSize(R.dimen.oa);
        }
        this.f11283b.setBuilder(C3555a.m13075a(view.getContext()).mo10839c(inflate).mo10834a(i));
        this.f11282a = (RecyclerView) view.findViewById(R.id.co8);
        this.f11282a.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f11284c = new MyWalletAdapter(getContext());
        this.f11282a.setAdapter(this.f11284c);
    }
}
