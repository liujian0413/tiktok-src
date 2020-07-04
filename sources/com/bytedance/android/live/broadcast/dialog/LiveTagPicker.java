package com.bytedance.android.live.broadcast.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.uikit.layout.WrapLineFlowLayout;
import com.bytedance.android.livesdk.chatroom.model.C4884aq;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;

public class LiveTagPicker extends DialogFragment implements OnClickListener {

    /* renamed from: a */
    public OnDismissListener f8123a;

    /* renamed from: b */
    private int f8124b = -1;

    /* renamed from: c */
    private WrapLineFlowLayout f8125c;

    /* renamed from: d */
    private View f8126d;

    /* renamed from: e */
    private List<TextView> f8127e = new ArrayList();

    /* renamed from: f */
    private int f8128f = -1;

    /* renamed from: g */
    private List<C4884aq> f8129g;

    /* renamed from: h */
    private boolean f8130h = false;

    /* renamed from: com.bytedance.android.live.broadcast.dialog.LiveTagPicker$a */
    public interface C2521a {
        /* renamed from: a */
        void mo9099a(C4884aq aqVar);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f8130h = false;
    }

    public void onResume() {
        super.onResume();
        m10442b();
    }

    /* renamed from: b */
    private void m10442b() {
        if (this.f8129g != null) {
            this.f8125c.post(new C2538k(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9096a() {
        int i;
        int i2;
        if (this.f8125c.getChildCount() != this.f8129g.size() && this.f8130h) {
            boolean z = true;
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                i = (int) ((((float) this.f8125c.getWidth()) - C9738o.m28708b(getContext(), 24.0f)) / 4.0f);
            } else {
                i = (this.f8125c.getWidth() - ((int) C9738o.m28708b(getContext(), 45.0f))) / 4;
            }
            for (int i3 = 0; i3 < this.f8129g.size(); i3++) {
                LayoutInflater from = LayoutInflater.from(getActivity());
                if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                    i2 = R.layout.asn;
                } else {
                    i2 = R.layout.asm;
                }
                TextView textView = (TextView) from.inflate(i2, this.f8125c, false);
                C4884aq aqVar = (C4884aq) this.f8129g.get(i3);
                textView.setText(aqVar.f13994b);
                textView.setTag(Integer.valueOf(i3));
                textView.setOnClickListener(this);
                textView.setWidth(i);
                this.f8125c.addView(textView);
                this.f8127e.add(textView);
                if (this.f8128f == -1 && aqVar.f13993a == this.f8124b) {
                    this.f8128f = i3;
                    textView.setSelected(true);
                }
            }
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 0) {
                View view = this.f8126d;
                if (this.f8128f == -1) {
                    z = false;
                }
                view.setEnabled(z);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8123a != null) {
            this.f8123a.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    /* renamed from: a */
    public static LiveTagPicker m10440a(int i) {
        LiveTagPicker liveTagPicker = new LiveTagPicker();
        Bundle bundle = new Bundle();
        bundle.putInt("INIT_TAG_ID", i);
        liveTagPicker.setArguments(bundle);
        return liveTagPicker;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9097a(C3478c cVar) throws Exception {
        if (cVar != null && !C6311g.m19573a(cVar.f10296b)) {
            this.f8129g = cVar.f10296b;
            if (isAdded()) {
                m10442b();
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-1, -1);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, 16973841);
        if (getArguments() != null) {
            this.f8124b = getArguments().getInt("INIT_TAG_ID", -1);
        }
        ((C3245ad) C2515f.m10417f().mo9076c().mo9169d().getRoomTags().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C3255e.m12294a((Fragment) this))).mo10183a(new C2536i(this), C2537j.f8175a);
    }

    public void onClick(View view) {
        boolean z;
        if (view.getId() == R.id.ei2) {
            for (Fragment fragment : this.mFragmentManager.mo2658f()) {
                if (fragment instanceof C2521a) {
                    if (this.f8128f != -1) {
                        ((C2521a) fragment).mo9099a((C4884aq) this.f8129g.get(this.f8128f));
                    } else {
                        ((C2521a) fragment).mo9099a(null);
                    }
                }
            }
            dismiss();
        } else if (view.getId() == R.id.cc5) {
            dismiss();
        } else {
            boolean z2 = !view.isSelected();
            int intValue = ((Integer) view.getTag()).intValue();
            if (!(intValue == this.f8128f || this.f8128f == -1)) {
                ((TextView) this.f8127e.get(this.f8128f)).setSelected(false);
            }
            view.setSelected(z2);
            if (!z2) {
                intValue = -1;
            }
            this.f8128f = intValue;
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 0) {
                View view2 = this.f8126d;
                if (this.f8128f != -1) {
                    z = true;
                } else {
                    z = false;
                }
                view2.setEnabled(z);
            }
            if (this.f8128f != -1) {
                HashMap hashMap = new HashMap();
                hashMap.put("room_tag", ((C4884aq) this.f8129g.get(this.f8128f)).f13994b);
                C8443c.m25663a().mo21606a("room_tag_click", hashMap, new C8438j().mo21600c("bottom_tab").mo21599b("live").mo21598a("live_take_page").mo21603f("click"));
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8130h = true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
            i = R.layout.au1;
        } else {
            i = R.layout.au0;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.f8126d = inflate.findViewById(R.id.ei2);
        this.f8126d.setOnClickListener(this);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 0) {
            inflate.findViewById(R.id.cc5).setOnClickListener(this);
        }
        this.f8125c = (WrapLineFlowLayout) inflate.findViewById(R.id.dgg);
        return inflate;
    }
}
