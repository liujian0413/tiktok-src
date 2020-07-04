package com.bytedance.android.livesdk.chatroom.interact;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0608j.C0610b;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4521a;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogPKInviteContract;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractButtonFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKInviteFirstPeriodFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKInviteFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKMatchFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKMatchInviteFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKTypeFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKUserListFragment;
import com.bytedance.android.livesdk.chatroom.interact.model.ChiJiPermissionData;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.p216d.C4557bb;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6311g;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkDialog extends LiveDialogFragment implements C4522b {

    /* renamed from: a */
    public int f12932a;

    /* renamed from: b */
    public DataCenter f12933b;

    /* renamed from: c */
    public C0043i f12934c;

    /* renamed from: d */
    public C4459a f12935d;

    /* renamed from: e */
    private ViewGroup f12936e;

    /* renamed from: f */
    private ViewGroup f12937f;

    /* renamed from: g */
    private ViewGroup f12938g;

    /* renamed from: h */
    private View f12939h;

    /* renamed from: i */
    private TextView f12940i;

    /* renamed from: k */
    private C4521a f12941k;

    /* renamed from: l */
    private List<Runnable> f12942l = new ArrayList();

    /* renamed from: m */
    private Stack<InteractDialogFragmentBaseContract.View> f12943m = new Stack<>();

    /* renamed from: n */
    private ValueAnimator f12944n;

    /* renamed from: o */
    private View f12945o;

    /* renamed from: p */
    private boolean f12946p = true;

    /* renamed from: q */
    private InteractDialogPKInviteContract.View f12947q;

    /* renamed from: r */
    private int f12948r;

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.LinkDialog$a */
    public static final class C4459a {

        /* renamed from: a */
        public User f12949a;

        /* renamed from: b */
        public Room f12950b;

        /* renamed from: c */
        public long f12951c;

        /* renamed from: d */
        public String f12952d;

        /* renamed from: e */
        public boolean f12953e;

        /* renamed from: f */
        public LinkAutoMatchModel f12954f;

        /* renamed from: g */
        public String f12955g;

        /* renamed from: h */
        public int f12956h;

        /* renamed from: i */
        public RivalExtraInfo f12957i;

        /* renamed from: j */
        public ChiJiPermissionData f12958j;

        /* renamed from: k */
        public ApiServerException f12959k;

        /* renamed from: l */
        private DataCenter f12960l;

        /* renamed from: m */
        private C0043i f12961m;

        /* renamed from: a */
        public final LinkDialog mo12156a() {
            return m14855a(5);
        }

        /* renamed from: b */
        public final LinkDialog mo12161b(LinkAutoMatchModel linkAutoMatchModel) {
            this.f12954f = linkAutoMatchModel;
            return m14855a(3);
        }

        /* renamed from: a */
        public final LinkDialog mo12157a(LinkAutoMatchModel linkAutoMatchModel) {
            this.f12954f = linkAutoMatchModel;
            return m14855a(2);
        }

        /* renamed from: a */
        private LinkDialog m14855a(int i) {
            LinkDialog linkDialog = new LinkDialog();
            linkDialog.f12935d = this;
            linkDialog.f12934c = this.f12961m;
            linkDialog.f12933b = this.f12960l;
            linkDialog.f12932a = i;
            return linkDialog;
        }

        /* renamed from: a */
        public final LinkDialog mo12160a(boolean z) {
            this.f12953e = z;
            return m14855a(6);
        }

        private C4459a(DataCenter dataCenter, C0043i iVar) {
            this.f12960l = dataCenter;
            this.f12961m = iVar;
        }

        /* renamed from: a */
        public final LinkDialog mo12158a(ChiJiPermissionData chiJiPermissionData, ApiServerException apiServerException) {
            this.f12958j = chiJiPermissionData;
            this.f12959k = apiServerException;
            return m14855a(4);
        }

        /* renamed from: a */
        public final LinkDialog mo12159a(Room room, String str, long j, String str2, int i, RivalExtraInfo rivalExtraInfo) {
            LinkDialog a = m14855a(1);
            this.f12950b = room;
            if (room != null) {
                this.f12949a = room.getOwner();
            }
            this.f12952d = str;
            this.f12951c = j;
            this.f12955g = str2;
            this.f12956h = i;
            this.f12957i = rivalExtraInfo;
            return a;
        }
    }

    /* renamed from: d */
    public final C0043i mo12153d() {
        return this.f12934c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo12154e() {
        m14835e(null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo12155f() {
        m14834d(m14837i());
    }

    public void onDestroy() {
        super.onDestroy();
        this.f12941k.mo12348a();
    }

    /* renamed from: i */
    private InteractDialogFragmentBaseContract.View m14837i() {
        if (this.f12943m.empty()) {
            return null;
        }
        return (InteractDialogFragmentBaseContract.View) this.f12943m.peek();
    }

    /* renamed from: a */
    public final void mo12143a() {
        if (getDialog() != null && !this.f12943m.isEmpty()) {
            this.f12946p = true;
            m14833a((Runnable) new C4526d(this));
        }
    }

    /* renamed from: c */
    public final Room mo12151c() {
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        if (currentRoom == null) {
            return new Room();
        }
        return currentRoom;
    }

    /* renamed from: k */
    private boolean m14839k() {
        if ((LinkCrossRoomDataHolder.m13782a().f11672j <= 0 || (this.f12948r != 2 && this.f12948r != 3)) && (LinkCrossRoomDataHolder.m13782a().f11672j != 0 || (this.f12948r != 1 && this.f12948r != 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private void m14840l() {
        Dialog dialog = getDialog();
        Context context = getContext();
        if (dialog != null && context != null) {
            View currentFocus = getDialog().getCurrentFocus();
            if (currentFocus != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }

    /* renamed from: b */
    public final View mo12148b() {
        if (this.f12939h == null) {
            AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
            autoRTLImageView.setLayoutParams(new LayoutParams(C3358ac.m12510a(32.0f), C3358ac.m12510a(32.0f)));
            autoRTLImageView.setImageDrawable(C3358ac.m12524c(R.drawable.c3l));
            autoRTLImageView.setOnClickListener(new C4777f(this));
            this.f12939h = autoRTLImageView;
        }
        return this.f12939h;
    }

    public void onDestroyView() {
        if (this.f12937f != null) {
            this.f12937f.removeAllViews();
        }
        if (this.f12938g != null) {
            this.f12938g.removeAllViews();
        }
        super.onDestroyView();
        if (this.f12944n != null) {
            this.f12944n.cancel();
        }
        this.f12943m.removeAllElements();
    }

    public void onResume() {
        super.onResume();
        if (!C6311g.m19573a(this.f12942l)) {
            for (Runnable run : this.f12942l) {
                run.run();
            }
        }
        this.f12942l.clear();
    }

    /* renamed from: h */
    public final boolean mo11346h() {
        if (!this.f12943m.isEmpty()) {
            if (((InteractDialogFragmentBaseContract.View) this.f12943m.peek()).mo12281d() != null) {
                ((InteractDialogFragmentBaseContract.View) this.f12943m.peek()).mo12281d().performClick();
                return true;
            } else if (this.f12943m.size() == 1) {
                if (this.f12946p) {
                    if (this.f12932a == 1 && (this.f12947q instanceof InteractPKInviteFirstPeriodFragment)) {
                        ((InteractPKInviteFirstPeriodFragment) this.f12947q).mo12740a();
                    }
                    dismiss();
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    private void m14838j() {
        switch (this.f12932a) {
            case 0:
                mo12147a((InteractDialogFragmentBaseContract.View) InteractButtonFragment.m15731a(this, this.f12933b));
                return;
            case 1:
                if (LinkCrossRoomDataHolder.m13782a().f11680r == 0) {
                    if (!TextUtils.isEmpty(this.f12935d.f12952d)) {
                        this.f12935d.f12952d = getString(R.string.evo);
                    }
                    if (m14839k()) {
                        if (this.f12935d.f12950b != null) {
                            InteractDialogPKInviteContract.View a = InteractPKInviteFirstPeriodFragment.m15739a(this, 1, this.f12935d.f12952d, this.f12935d.f12950b, this.f12935d.f12955g, this.f12935d.f12951c, 0, this.f12933b, this.f12935d.f12956h, this.f12935d.f12957i);
                            this.f12947q = a;
                            mo12147a((InteractDialogFragmentBaseContract.View) a);
                            return;
                        }
                    } else if (this.f12935d.f12949a != null) {
                        InteractPKInviteFragment a2 = InteractPKInviteFragment.m15749a(this, 1, this.f12935d.f12952d, this.f12935d.f12949a, this.f12935d.f12951c, 0, this.f12933b, this.f12935d.f12956h);
                        this.f12947q = a2;
                        mo12147a((InteractDialogFragmentBaseContract.View) a2);
                        return;
                    }
                } else {
                    if (!TextUtils.isEmpty(this.f12935d.f12952d)) {
                        this.f12935d.f12952d = getString(R.string.ew6);
                    }
                    if (this.f12935d.f12949a != null) {
                        mo12147a((InteractDialogFragmentBaseContract.View) InteractPKMatchInviteFragment.m15783a(this, 1, this.f12935d.f12952d, this.f12935d.f12949a, this.f12935d.f12951c, 0, this.f12933b, (int) LinkCrossRoomDataHolder.m13782a().f11681s));
                        return;
                    }
                }
                break;
            case 2:
                mo12147a((InteractDialogFragmentBaseContract.View) InteractPKMatchFragment.m15759a(this, this.f12935d.f12954f, 3, this.f12933b));
                return;
            case 3:
                mo12147a((InteractDialogFragmentBaseContract.View) InteractPKMatchFragment.m15759a(this, this.f12935d.f12954f, 2, this.f12933b));
                return;
            case 4:
                mo12147a((InteractDialogFragmentBaseContract.View) InteractPKTypeFragment.m15806a(this, this.f12933b, this.f12935d.f12958j, this.f12935d.f12959k));
                return;
            case 5:
                mo12147a((InteractDialogFragmentBaseContract.View) InteractPKTypeFragment.m15806a(this, this.f12933b, this.f12935d.f12958j, this.f12935d.f12959k));
                mo12147a((InteractDialogFragmentBaseContract.View) InteractPKMatchFragment.m15761a((C4522b) this, this.f12933b));
                return;
            case 6:
                mo12147a((InteractDialogFragmentBaseContract.View) InteractPKUserListFragment.m15812a((C4522b) this, 2, this.f12933b, this.f12935d.f12953e));
                break;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12144a(DialogInterface dialogInterface) {
        m14840l();
    }

    /* renamed from: a */
    private void m14833a(Runnable runnable) {
        if (isResumed()) {
            runnable.run();
        } else {
            this.f12942l.add(runnable);
        }
    }

    /* renamed from: e */
    private void m14835e(InteractDialogFragmentBaseContract.View view) {
        m14833a((Runnable) new C4809g(this, view));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12149b(View view) {
        if (this.f12946p) {
            if (this.f12932a == 1 && this.f12947q != null && (this.f12947q instanceof InteractPKInviteFirstPeriodFragment)) {
                ((InteractPKInviteFirstPeriodFragment) this.f12947q).mo12740a();
            }
            dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.z0);
        this.f12941k = new C4557bb();
        this.f12948r = ((Integer) LiveSettingKeys.PK_RECOMMEND_AND_LINEKMIC_OPTMIZE.mo10240a()).intValue();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnCancelListener(new C4464a(this));
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12145a(View view) {
        mo12143a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo12152c(InteractDialogFragmentBaseContract.View view) {
        if (this.f12943m.isEmpty() || !((InteractDialogFragmentBaseContract.View) this.f12943m.peek()).f13117b.equals(view.f13117b)) {
            m14835e(view);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    /* renamed from: d */
    private void m14834d(InteractDialogFragmentBaseContract.View view) {
        if (getDialog() != null && view != null && view.mo8989l()) {
            this.f12940i.setText(view.mo12279b());
            this.f12937f.removeAllViews();
            this.f12938g.removeAllViews();
            if (view.mo12281d() != null) {
                this.f12937f.addView(view.mo12281d());
            }
            if (view.mo12282e() != null) {
                this.f12938g.addView(view.mo12282e());
            }
        }
    }

    /* renamed from: f */
    private void m14836f(InteractDialogFragmentBaseContract.View view) {
        if (view == null) {
            if (!this.f12943m.isEmpty()) {
                view = (InteractDialogFragmentBaseContract.View) this.f12943m.peek();
                if (view == null) {
                    return;
                }
            } else {
                return;
            }
        }
        int a = C3358ac.m12510a(view.mo12280c());
        LayoutParams layoutParams = this.f12936e.getLayoutParams();
        if (!this.f12943m.empty()) {
            int i = layoutParams.height;
            if (this.f12944n != null) {
                this.f12944n.removeAllUpdateListeners();
                this.f12944n.removeAllListeners();
                this.f12944n.cancel();
            }
            this.f12944n = ValueAnimator.ofInt(new int[]{i, a});
            this.f12944n.addUpdateListener(new C4810h(this, layoutParams));
            this.f12944n.setDuration(300).start();
        } else {
            layoutParams.height = a;
            this.f12936e.setLayoutParams(layoutParams);
        }
        this.f12936e.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo12150b(InteractDialogFragmentBaseContract.View view) {
        m14840l();
        C0608j childFragmentManager = getChildFragmentManager();
        C0633q a = childFragmentManager.mo2645a();
        if (!this.f12943m.empty()) {
            a.mo2584a(R.anim.d0, R.anim.d1, R.anim.d0, R.anim.d1);
        }
        if (view != null) {
            a.mo2585a((int) R.id.aoy, (Fragment) view);
            a.mo2589a("link_dialog");
            this.f12943m.add(view);
        } else {
            childFragmentManager.mo2655c();
            Fragment a2 = childFragmentManager.mo2642a((int) R.id.aoy);
            if (a2 != null) {
                a.mo2587a(a2);
            }
            this.f12943m.pop();
        }
        a.mo2606d();
        m14836f(view);
    }

    /* renamed from: a */
    public final void mo12147a(InteractDialogFragmentBaseContract.View view) {
        if (getDialog() != null && view != null) {
            if (view instanceof InteractPKInviteFragment) {
                this.f12946p = false;
            } else if (!(view instanceof InteractPKInviteFirstPeriodFragment) || this.f12932a != 0) {
                this.f12946p = true;
            } else {
                this.f12946p = false;
            }
            m14833a((Runnable) new C4763e(this, view));
        }
    }

    /* renamed from: a */
    public static C4459a m14832a(DataCenter dataCenter, C0043i iVar) {
        return new C4459a(dataCenter, iVar);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        getChildFragmentManager().mo2650a((C0610b) new C4501c(this));
        if (this.f12943m.empty()) {
            m14838j();
        }
        C8946b.f24396aU.mo22118a(getString(R.string.ex_));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo12146a(LayoutParams layoutParams, ValueAnimator valueAnimator) {
        layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f12936e.setLayoutParams(layoutParams);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f12945o = LayoutInflater.from(getContext()).inflate(R.layout.aq5, viewGroup, false);
        this.f12940i = (TextView) this.f12945o.findViewById(R.id.e3f);
        this.f12937f = (ViewGroup) this.f12945o.findViewById(R.id.bi5);
        this.f12938g = (ViewGroup) this.f12945o.findViewById(R.id.bjg);
        this.f12936e = (ViewGroup) this.f12945o.findViewById(R.id.aoy);
        this.f12945o.findViewById(R.id.c9q).setOnClickListener(new C4491b(this));
        return this.f12945o;
    }
}
