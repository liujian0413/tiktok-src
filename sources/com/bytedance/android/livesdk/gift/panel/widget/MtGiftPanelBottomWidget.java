package com.bytedance.android.livesdk.gift.panel.widget;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.p030a.p031a.C1065a;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.live.wallet.C3693c;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8262q;
import com.bytedance.android.livesdk.gift.p373c.C7885d;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p393h.C8296e;
import com.bytedance.android.livesdk.schema.interfaces.C8931a;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import p346io.reactivex.C7494t;

public class MtGiftPanelBottomWidget extends FakeMtGiftPanelBottomWidget implements OnClickListener {

    /* renamed from: a */
    private TextView f22591a;

    /* renamed from: b */
    private TextView f22592b;

    /* renamed from: c */
    private GiftDialogViewModel f22593c;

    /* renamed from: d */
    private TextView f22594d;

    public int getLayoutId() {
        return R.layout.ann;
    }

    public void onCreate() {
        super.onCreate();
        this.f22593c = (GiftDialogViewModel) this.dataCenter.get("data_gift_dialog_view_model");
        m25235a();
        m25241c();
    }

    public void onResume() {
        super.onResume();
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }

    /* renamed from: c */
    private void m25241c() {
        m25236a(((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11155b());
        ((C3245ad) ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11152a().mo19297a((C7494t<T, ? extends R>) autoDispose())).mo10183a(new C8230al(this), C8231am.f22607a);
    }

    /* renamed from: d */
    private void m25242d() {
        if (isViewValid()) {
            C3693c walletCenter = ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter();
            if (!TextUtils.isEmpty(walletCenter.mo11161f())) {
                this.f22592b.setText(walletCenter.mo11161f());
            } else {
                this.f22592b.setText(R.string.fdw);
            }
            m25236a(walletCenter.mo11155b());
        }
    }

    /* renamed from: e */
    private void m25243e() {
        if (!((Boolean) LiveSettingKeys.LIVE_MT_USER_CAN_RECHARGE.mo10240a()).booleanValue()) {
            new C9249a(getContext(), 0).mo22716a(true).mo22727c((CharSequence) C1642a.m8034a(getContext().getResources().getString(R.string.edt), new Object[]{LiveSettingKeys.LIVE_MT_LOW_AGE_USER_LIMIT.mo10240a()})).mo22722b(0, (int) R.string.ehy, (DialogInterface.OnClickListener) new C8232an(this)).mo22722b(1, (int) R.string.ehz, C8233ao.f22609a).mo22720b().show();
            return;
        }
        this.f22593c.f22468p.postValue(Boolean.valueOf(true));
    }

    /* renamed from: a */
    private void m25235a() {
        this.f22591a = (TextView) this.contentView.findViewById(R.id.dtc);
        this.f22592b = (TextView) this.contentView.findViewById(R.id.v5);
        this.f22594d = (TextView) this.contentView.findViewById(R.id.c08);
        this.f22594d.setOnClickListener(this);
        this.f22592b.setOnClickListener(this);
        if (((Boolean) LiveSettingKeys.HIDE_CHARGE_ICON_FOR_USER.mo10240a()).booleanValue()) {
            this.f22592b.setVisibility(4);
        }
        Drawable b = C1065a.m4641b(this.context, R.drawable.c41);
        if (b != null) {
            b.setBounds(new Rect(0, 0, (int) C9051ar.m27035b(this.context, 16.0f), (int) C9738o.m28708b(this.context, 16.0f)));
        }
        if (C3519c.m12965a(this.context)) {
            this.f22591a.setCompoundDrawables(null, null, b, null);
        } else {
            this.f22591a.setCompoundDrawables(b, null, null, null);
        }
        m25239b();
        this.f22593c.f22441C.observe(this, new C8229ak(this));
    }

    /* renamed from: b */
    private void m25239b() {
        this.f22592b.setTextColor(getContext().getResources().getColor(C7885d.m24168a().mo20675e()));
        this.f22591a.setTextColor(getContext().getResources().getColor(C7885d.m24168a().mo20676f()));
        if (C3519c.m12965a(this.context)) {
            Drawable b = C1065a.m4641b(this.context, R.drawable.c1q);
            if (b != null) {
                b.setBounds(new Rect(0, 0, (int) C9051ar.m27035b(this.context, 12.0f), (int) C9738o.m28708b(this.context, 12.0f)));
            }
            this.f22592b.setCompoundDrawables(b, null, null, null);
            this.f22594d.setCompoundDrawables(b, null, null, null);
            return;
        }
        Drawable b2 = C1065a.m4641b(this.context, C7885d.m24168a().mo20677g());
        if (b2 != null) {
            b2.setBounds(new Rect(0, 0, (int) C9051ar.m27035b(this.context, 12.0f), (int) C9738o.m28708b(this.context, 12.0f)));
        }
        this.f22592b.setCompoundDrawables(null, null, b2, null);
        this.f22594d.setCompoundDrawables(null, null, b2, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21388a(Long l) throws Exception {
        m25242d();
    }

    public void onEvent(C8296e eVar) {
        ((IWalletService) C3596c.m13172a(IWalletService.class)).walletCenter().mo11160e();
    }

    /* renamed from: a */
    private void m25236a(long j) {
        TextView textView = this.f22591a;
        if (!((C3592a) C3596c.m13172a(C3592a.class)).user().mo22182c()) {
            j = 0;
        }
        textView.setText(String.valueOf(j));
    }

    public void onClick(View view) {
        if (view.getId() == R.id.v5) {
            m25243e();
            return;
        }
        if (view.getId() == R.id.c08) {
            this.f22593c.f22442D.postValue("more_prop");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo21389a(boolean z) {
        int i;
        int i2;
        TextView textView;
        TextView textView2 = this.f22594d;
        int i3 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView2.setVisibility(i);
        if (((Boolean) LiveSettingKeys.HIDE_CHARGE_ICON_FOR_USER.mo10240a()).booleanValue()) {
            textView = this.f22592b;
            i2 = 4;
        } else {
            textView = this.f22592b;
            if (z) {
                i2 = 8;
            } else {
                i2 = 0;
            }
        }
        textView.setVisibility(i2);
        TextView textView3 = this.f22591a;
        if (!z) {
            i3 = 0;
        }
        textView3.setVisibility(i3);
        if (z) {
            GiftDialogViewModel.m25111e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21390b(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        String str = (String) LiveSettingKeys.LIVE_MT_LOW_AGE_REPORT_URL.mo10240a();
        if (TextUtils.isEmpty(str)) {
            str = C8262q.m25252b();
        }
        ((C8931a) C3596c.m13172a(C8931a.class)).handle(this.context, str);
        if (C3596c.m13172a(C3592a.class) != null && ((C3592a) C3596c.m13172a(C3592a.class)).user() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(((C3592a) C3596c.m13172a(C3592a.class)).user().mo22179b()));
            C8443c.m25663a().mo21606a("livesdk_user_click_contact_us", hashMap, Room.class, new C8438j());
        }
    }
}
