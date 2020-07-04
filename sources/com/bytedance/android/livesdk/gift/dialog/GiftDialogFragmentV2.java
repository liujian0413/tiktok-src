package com.bytedance.android.livesdk.gift.dialog;

import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3387g;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.C4423ao;
import com.bytedance.android.livesdk.chatroom.event.C4441k;
import com.bytedance.android.livesdk.gift.C8263r.C8264a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7938a;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.C7939b;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.bytedance.android.livesdk.gift.panel.widget.PanelType;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GiftDialogFragmentV2 extends LiveDialogFragment {

    /* renamed from: a */
    private Context f21300a;

    /* renamed from: b */
    private boolean f21301b;

    /* renamed from: c */
    private PanelType f21302c;

    /* renamed from: d */
    private boolean f21303d;

    /* renamed from: e */
    private boolean f21304e;

    /* renamed from: f */
    private DataCenter f21305f;

    /* renamed from: g */
    private boolean f21306g;

    /* renamed from: h */
    private GiftViewModel f21307h;

    /* renamed from: i */
    private User f21308i;

    /* renamed from: k */
    private String f21309k;

    /* renamed from: l */
    private C8264a f21310l;

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f21307h != null) {
            this.f21307h.mo20795d();
            this.f21307h.mo20783a((C0043i) this);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f21307h != null) {
            this.f21307h.mo20784a((C0043i) this, (C0053p<C7939b>) new C7896a<C7939b>(this));
        }
    }

    public void dismiss() {
        float f;
        if (this.f21305f != null) {
            DataCenter dataCenter = this.f21305f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f21300a;
            if (this.f21301b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C4441k((int) C9738o.m28708b(context, f), false));
        }
        C9097a.m27146a().mo22267a((Object) new C4423ao(this.f21306g));
        super.dismiss();
    }

    public void dismissAllowingStateLoss() {
        float f;
        if (this.f21305f != null) {
            DataCenter dataCenter = this.f21305f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f21300a;
            if (this.f21301b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C4441k((int) C9738o.m28708b(context, f), false));
        }
        C9097a.m27146a().mo22267a((Object) new C4423ao(this.f21306g));
        super.dismissAllowingStateLoss();
    }

    /* renamed from: h */
    public final boolean mo11346h() {
        float f;
        if (this.f21305f != null) {
            DataCenter dataCenter = this.f21305f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f21300a;
            if (this.f21301b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C4441k((int) C9738o.m28708b(context, f), false));
        }
        C9097a.m27146a().mo22267a((Object) new C4423ao(this.f21306g));
        return super.mo11346h();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo20702a(C7939b bVar) {
        if (bVar != null && bVar.f21493a == 0) {
            dismissAllowingStateLoss();
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f21301b) {
            if (this.f21304e) {
                i = R.style.yt;
            } else {
                i = R.style.yr;
            }
            setStyle(1, i);
            return;
        }
        setStyle(1, R.style.ys);
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            if (!this.f21301b || (!this.f21303d && !C3387g.m12599a(getContext()))) {
                window.addFlags(PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                window.clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            if (this.f21301b) {
                window.setGravity(80);
            } else {
                window.setGravity(8388613);
            }
            window.setSoftInputMode(48);
            if (this.f21304e) {
                window.setLayout(-1, -2);
                LayoutParams attributes = window.getAttributes();
                attributes.width = C3358ac.m12523c();
                attributes.height = C3358ac.m12520b() - C3358ac.m12525d();
                window.setAttributes(attributes);
                return;
            }
            window.setLayout(-1, -1);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        float f;
        super.onViewCreated(view, bundle);
        this.f21306g = false;
        if (this.f21307h == null) {
            dismissAllowingStateLoss();
            return;
        }
        this.f21307h.mo20788a(this.f21305f);
        dismissAllowingStateLoss();
        this.f21307h.mo20792a(new C7938a(0, null));
        this.f21307h.f21471f = this.f21308i;
        this.f21307h.f21472g = this.f21309k;
        this.f21307h.f21473h = this.f21310l;
        if (this.f21302c == PanelType.PROP) {
            this.f21307h.mo20792a(new C7938a(5, Integer.valueOf(5)));
        } else {
            this.f21307h.mo20792a(new C7938a(5, Integer.valueOf(1)));
        }
        if (this.f21305f != null) {
            DataCenter dataCenter = this.f21305f;
            String str = "cmd_gift_dialog_switch";
            Context context = this.f21300a;
            if (this.f21301b) {
                f = 354.0f;
            } else {
                f = 0.0f;
            }
            dataCenter.lambda$put$1$DataCenter(str, new C4441k((int) C9738o.m28708b(context, f), true));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ar0, viewGroup, false);
    }

    /* renamed from: a */
    public static GiftDialogFragmentV2 m24191a(Context context, boolean z, PanelType panelType, boolean z2, User user, String str, DataCenter dataCenter, C8264a aVar, GiftViewModel giftViewModel) {
        boolean z3;
        GiftDialogFragmentV2 giftDialogFragmentV2 = new GiftDialogFragmentV2();
        giftDialogFragmentV2.f21300a = context;
        giftDialogFragmentV2.f21301b = z;
        giftDialogFragmentV2.f21302c = panelType;
        giftDialogFragmentV2.f21303d = z2;
        if (!z || (!z2 && !C3387g.m12599a(context))) {
            z3 = false;
        } else {
            z3 = true;
        }
        giftDialogFragmentV2.f21304e = z3;
        giftDialogFragmentV2.f21305f = dataCenter;
        giftDialogFragmentV2.f21308i = user;
        giftDialogFragmentV2.f21309k = str;
        giftDialogFragmentV2.f21310l = aVar;
        giftDialogFragmentV2.f21307h = giftViewModel;
        return giftDialogFragmentV2;
    }
}
