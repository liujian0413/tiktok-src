package com.bytedance.android.livesdk.chatroom.p220ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.C2341d;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.presenter.C5036q;
import com.bytedance.android.livesdk.chatroom.presenter.C5036q.C5037a;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9076n;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveProfileSettingDialog */
public class LiveProfileSettingDialog extends LiveDialogFragment implements OnClickListener, C5037a {

    /* renamed from: a */
    public static final String f15005a = "LiveProfileSettingDialog";

    /* renamed from: b */
    private boolean f15006b;

    /* renamed from: c */
    private C5036q f15007c;

    /* renamed from: d */
    private User f15008d;

    /* renamed from: e */
    private DataCenter f15009e;

    /* renamed from: f */
    private List<C2341d> f15010f;

    /* renamed from: g */
    private FansClubData f15011g;

    /* renamed from: h */
    private C2341d f15012h;

    /* renamed from: i */
    private View f15013i;

    /* renamed from: k */
    private TextView f15014k;

    /* renamed from: l */
    private RecyclerView f15015l;

    /* renamed from: m */
    private FansClubMedalAdapter f15016m;

    /* renamed from: n */
    private C5071a f15017n = new C5254cp(this);

    /* renamed from: o */
    private boolean f15018o;

    public void onDestroy() {
        super.onDestroy();
        this.f15006b = false;
        this.f15007c.mo8963a();
    }

    /* renamed from: a */
    public final void mo13067a() {
        if (this.f15006b) {
            C9049ap.m27022a((int) R.string.fc0);
            dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo13349b() {
        if (this.f15006b) {
            int b = C3358ac.m12520b();
            LayoutParams layoutParams = this.f15013i.getLayoutParams();
            layoutParams.width = b;
            this.f15013i.setLayoutParams(layoutParams);
            this.f15013i.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo13347a(C2341d dVar) {
        this.f15012h = dVar;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f15009e != null) {
            this.f15009e.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(this.f15008d));
        }
    }

    /* renamed from: a */
    public final void mo13068a(Throwable th) {
        if (this.f15006b) {
            if (th instanceof ApiServerException) {
                C9049ap.m27028a(((ApiServerException) th).getPrompt());
                return;
            }
            C9076n.m27095a(getContext(), th);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            if (!this.f15018o) {
                window.setGravity(8388613);
                window.setLayout(-2, -1);
                window.setBackgroundDrawable(new ColorDrawable(0));
                return;
            }
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f15018o) {
            i = R.style.xv;
        } else {
            i = R.style.xw;
        }
        setStyle(1, i);
        this.f15006b = true;
        this.f15007c = new C5036q();
        this.f15007c.mo9142a(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.cy5) {
            if (this.f15011g == null && this.f15012h != null) {
                this.f15007c.mo13065a(String.valueOf(this.f15012h.f7688a.getId()));
            } else if (this.f15011g != null && this.f15012h == null) {
                this.f15007c.mo13065a("");
            } else if (this.f15011g == null || this.f15012h == null || TextUtils.isEmpty(this.f15011g.clubName) || this.f15011g.clubName.equals(this.f15012h.f7692e.f7651a)) {
                mo13067a();
            } else {
                this.f15007c.mo13065a(String.valueOf(this.f15012h.f7688a.getId()));
            }
        }
    }

    /* renamed from: a */
    public final void mo13348a(List<C2341d> list, FansClubData fansClubData) {
        this.f15010f = list;
        this.f15011g = fansClubData;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f15014k = (TextView) view.findViewById(R.id.cy5);
        this.f15014k.setOnClickListener(this);
        this.f15015l = (RecyclerView) view.findViewById(R.id.ai4);
        this.f15015l.setLayoutManager(new GridLayoutManager(getContext(), 3));
        this.f15016m = new FansClubMedalAdapter(this.f15010f, this.f15011g, this.f15017n);
        this.f15015l.setAdapter(this.f15016m);
        if (!this.f15018o) {
            this.f15013i.post(new C5255cq(this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f15013i = layoutInflater.inflate(R.layout.aqm, viewGroup, false);
        return this.f15013i;
    }

    /* renamed from: a */
    public static final LiveProfileSettingDialog m16638a(User user, boolean z, DataCenter dataCenter, List<C2341d> list, FansClubData fansClubData) {
        LiveProfileSettingDialog liveProfileSettingDialog = new LiveProfileSettingDialog();
        liveProfileSettingDialog.f15008d = user;
        liveProfileSettingDialog.f15018o = z;
        liveProfileSettingDialog.f15010f = list;
        liveProfileSettingDialog.f15011g = fansClubData;
        liveProfileSettingDialog.f15009e = dataCenter;
        return liveProfileSettingDialog;
    }
}
