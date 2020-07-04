package com.bytedance.android.livesdk.rank;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.DialogFragment;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.bytedance.android.live.uikit.rtl.RtlViewPager;
import com.bytedance.android.livesdk.C3916b;
import com.bytedance.android.livesdk.browser.p193c.C3979c;
import com.bytedance.android.livesdk.chatroom.event.C4434d;
import com.bytedance.android.livesdk.chatroom.event.C4443m;
import com.bytedance.android.livesdk.chatroom.event.C4445o;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.model.C8852a;
import com.bytedance.android.livesdk.rank.p419a.C8805a.C8806a;
import com.bytedance.android.livesdk.rank.p419a.C8805a.C8807b;
import com.bytedance.android.livesdk.rank.p420b.C8819c;
import com.bytedance.android.livesdk.rank.p421c.C8825e;
import com.bytedance.android.livesdk.rank.view.C8864e;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p348d.C7326g;

public class DailyRankDialog extends BaseDialogFragmentV2 implements OnClickListener, C8807b {

    /* renamed from: a */
    public static final String f23895a = "DailyRankDialog";

    /* renamed from: A */
    private View f23896A;

    /* renamed from: B */
    private C0935e f23897B = new C0935e() {
        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        public final void onPageSelected(int i) {
            if (!DailyRankDialog.this.f23899c) {
                DailyRankDialog.this.f23899c = true;
                return;
            }
            DailyRankDialog.this.f23904h = i;
            DailyRankDialog.this.mo21865a();
        }
    };

    /* renamed from: b */
    final int f23898b = 375;

    /* renamed from: c */
    public boolean f23899c = true;

    /* renamed from: d */
    protected LoadingStatusView f23900d;

    /* renamed from: e */
    public String f23901e = "float";

    /* renamed from: f */
    public int f23902f;

    /* renamed from: g */
    public boolean f23903g;

    /* renamed from: h */
    public int f23904h;

    /* renamed from: i */
    private View f23905i;

    /* renamed from: j */
    private RtlViewPager f23906j;

    /* renamed from: k */
    private boolean f23907k;

    /* renamed from: l */
    private Room f23908l;

    /* renamed from: m */
    private C8852a f23909m;

    /* renamed from: n */
    private DataCenter f23910n;

    /* renamed from: o */
    private boolean f23911o;

    /* renamed from: p */
    private LivePagerSlidingTabStrip f23912p;

    /* renamed from: q */
    private C8806a f23913q;

    /* renamed from: r */
    private List<C8864e> f23914r;

    /* renamed from: s */
    private boolean f23915s;

    /* renamed from: t */
    private C8798a f23916t;

    /* renamed from: u */
    private boolean f23917u = true;

    /* renamed from: v */
    private ViewStub f23918v;

    /* renamed from: w */
    private View f23919w;

    /* renamed from: x */
    private C47562b f23920x;

    /* renamed from: y */
    private boolean f23921y;

    /* renamed from: z */
    private View f23922z;

    /* renamed from: com.bytedance.android.livesdk.rank.DailyRankDialog$a */
    class C8798a extends PagerAdapter {

        /* renamed from: a */
        List<C8864e> f23925a;

        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        public final int getCount() {
            if (this.f23925a == null) {
                return 0;
            }
            return this.f23925a.size();
        }

        public final CharSequence getPageTitle(int i) {
            return ((C8864e) this.f23925a.get(i)).f24163a;
        }

        C8798a(List<C8864e> list) {
            this.f23925a = list;
        }

        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            if (this.f23925a == null) {
                return super.instantiateItem(viewGroup, i);
            }
            C8864e eVar = (C8864e) this.f23925a.get(i);
            viewGroup.addView(eVar);
            return eVar;
        }

        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (obj instanceof View) {
                viewGroup.removeView((View) obj);
            }
        }
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: a */
    public final void mo21870a(C8852a aVar, int i) {
        if (aVar != null && this.f23914r != null) {
            if (this.f23902f == 2 || this.f23902f == 3) {
                this.f23909m = aVar;
                if (this.f23911o) {
                    m26368c();
                    return;
                }
                return;
            }
            if (this.f23914r != null) {
                ((C8864e) this.f23914r.get(i == 16 ? 1 : 0)).mo21888a(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo21869a(C8852a aVar) {
        this.f23909m = aVar;
        if (this.f23911o) {
            m26368c();
        }
    }

    /* renamed from: a */
    public final void mo21871a(Exception exc) {
        if (this.f23911o) {
            this.f23900d.setVisibility(0);
            this.f23900d.mo10832e();
        }
    }

    /* renamed from: a */
    public final void mo21872a(boolean z) {
        this.f23903g = z;
        if (!z) {
            mo21865a();
        }
    }

    /* renamed from: f */
    private void m26371f() {
        if (getContext() != null) {
        }
    }

    public Context getContext() {
        return super.getContext();
    }

    /* renamed from: e */
    private void m26370e() {
        this.f23900d.setVisibility(0);
        this.f23900d.mo10830c();
        this.f23913q.mo21882a();
    }

    /* renamed from: g */
    private String m26372g() {
        switch (this.f23902f) {
            case 0:
                return "hourly";
            case 1:
                return "regional";
            case 2:
                return "last_hourly";
            case 3:
                return "last_regional";
            default:
                return "";
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f23920x.dispose();
        this.f23911o = false;
        if (this.f23913q != null) {
            this.f23913q.mo21884b();
        }
    }

    /* renamed from: b */
    private void m26367b() {
        this.f23906j = (RtlViewPager) this.f23905i.findViewById(R.id.ed4);
        this.f23912p = (LivePagerSlidingTabStrip) this.f23905i.findViewById(R.id.c_4);
        this.f23918v = (ViewStub) this.f23905i.findViewById(R.id.a2t);
        this.f23919w = this.f23918v.inflate();
        this.f23919w.setOnClickListener(new C8816b(this));
        this.f23900d = (LoadingStatusView) this.f23905i.findViewById(R.id.a63);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.au2, null);
        inflate.setOnClickListener(new C8820c(this));
        this.f23900d.setBuilder(C3555a.m13075a(getContext()).mo10839c(inflate).mo10834a(getResources().getDimensionPixelSize(R.dimen.oa)));
        this.f23900d.setVisibility(0);
        this.f23900d.mo10830c();
        this.f23922z = this.f23905i.findViewById(R.id.jw);
        this.f23896A = this.f23905i.findViewById(R.id.cx0);
        this.f23922z.setOnClickListener(this);
        this.f23896A.setOnClickListener(this);
        m26371f();
    }

    /* renamed from: d */
    private void m26369d() {
        if (this.f23909m != null && getContext() != null) {
            String str = this.f23909m.f24082o;
            if (str != null && !str.isEmpty()) {
                if (this.f23917u) {
                    C9178j.m27302j().mo22374c().mo11535a(getContext(), C3979c.m13952b(str).mo11551a(true).mo11553b(true));
                    return;
                }
                int c = C9051ar.m27037c(getContext(), (float) C9051ar.m27033a(getContext()));
                BaseDialogFragment.m12686a(getActivity(), (DialogFragment) C9178j.m27302j().mo22374c().mo11533a(C3979c.m13951a(str).mo11555a(c + 16).mo11560b(c).mo11556a(8, 8, 8, 8).mo11561b(true).mo11562c(8).mo11566e(8388613).mo11565d(false)));
            }
        }
    }

    /* renamed from: c */
    private void m26368c() {
        if (this.f23909m != null) {
            this.f23914r = new ArrayList();
            if (this.f23902f == 0 || this.f23902f == 1) {
                if (m26366a(1)) {
                    this.f23914r.add(C8864e.m26545a(this.f23909m, this.f23908l, this.f23907k, this.f23909m.f24074g, 1, this.f23910n, getContext(), false));
                }
                String str = this.f23909m.f24077j;
                if (m26366a(2) && !TextUtils.isEmpty(str)) {
                    this.f23914r.add(C8864e.m26545a(null, this.f23908l, this.f23907k, str, 2, this.f23910n, getContext(), false));
                    this.f23913q.mo21883a(16);
                    this.f23921y = true;
                }
                C8851m.m26478a(this.f23907k);
            } else if (this.f23902f == 2) {
                this.f23914r.add(C8864e.m26545a(this.f23909m, this.f23908l, this.f23907k, this.f23909m.f24074g, 1, this.f23910n, getContext(), true));
            } else if (this.f23902f == 3) {
                this.f23914r.add(C8864e.m26545a(this.f23909m, this.f23908l, this.f23907k, this.f23909m.f24074g, 2, this.f23910n, getContext(), true));
            }
            this.f23906j.setVisibility(0);
            this.f23900d.setVisibility(8);
            this.f23916t = new C8798a(this.f23914r);
            this.f23906j.setAdapter(this.f23916t);
            this.f23906j.addOnPageChangeListener(this.f23897B);
            if (this.f23914r.size() < 2) {
                this.f23912p.setIndicatorHeight(0);
            } else {
                this.f23912p.mo22458a((int) R.layout.au_, (int) R.id.dfw);
            }
            this.f23912p.setViewPager(this.f23906j);
            if (this.f23902f == 2 || this.f23902f == 3) {
                this.f23922z.setVisibility(0);
            }
            if (!this.f23921y || this.f23902f != 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("event_belong", "live");
                hashMap.put("event_type", "show");
                hashMap.put("event_page", "live_detail");
                hashMap.put("event_module", "popup");
                hashMap.put("request_id", this.f23908l.getRequestId());
                hashMap.put("log_pb", this.f23908l.getLog_pb());
                hashMap.put("room_id", String.valueOf(this.f23908l.getId()));
                hashMap.put("type", m26372g());
                hashMap.put("click_position", String.valueOf(this.f23901e));
                C8443c.m25663a().mo21606a("live_rank_show", hashMap, new C8438j().mo21598a("live_detail").mo21600c("popup").mo21599b("live").mo21603f("show"), Room.class);
                return;
            }
            this.f23906j.setCurrentItem(1);
            return;
        }
        throw new IllegalArgumentException("not found DailyRankResult data");
    }

    /* renamed from: a */
    public final void mo21865a() {
        String str;
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "show");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "popup");
        hashMap.put("request_id", this.f23908l.getRequestId());
        hashMap.put("log_pb", this.f23908l.getLog_pb());
        hashMap.put("room_id", String.valueOf(this.f23908l.getId()));
        String str2 = "type";
        if (this.f23904h == 0) {
            str = "hourly";
        } else {
            str = "regional";
        }
        hashMap.put(str2, str);
        C8443c.m25663a().mo21606a("live_rank_show", hashMap, new C8438j().mo21598a("live_detail").mo21600c("popup").mo21599b("live").mo21603f("show"), Room.class);
    }

    /* renamed from: a */
    private void m26363a(C8806a aVar) {
        this.f23913q = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21866a(DialogInterface dialogInterface) {
        this.f23915s = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21873b(View view) {
        this.f23919w.setVisibility(8);
    }

    /* renamed from: a */
    private boolean m26366a(int i) {
        if ((C8851m.m26478a(this.f23907k) & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private <T> void m26364a(Class<T> cls) {
        this.f23920x.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (!DailyRankDialog.this.f23903g) {
                    if (t instanceof C4434d) {
                        DailyRankDialog.this.onEvent((C4434d) t);
                        return;
                    }
                    if (t instanceof C4443m) {
                        DailyRankDialog.this.onEvent((C4443m) t);
                    }
                }
            }
        }));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.jw) {
            dismissAllowingStateLoss();
            return;
        }
        if (id == R.id.cx0) {
            m26369d();
        }
    }

    public void onEvent(C4443m mVar) {
        if (mVar != null) {
            if (mVar.f12896a) {
                this.f23919w.setVisibility(0);
            } else {
                this.f23919w.setVisibility(8);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C3916b.m13813a().mo11466c();
        this.f23899c = false;
        this.f23906j.setCurrentItem(0);
        if (this.f23902f == 2 || this.f23902f == 3) {
            C8819c cVar = new C8819c();
            cVar.f23967b = false;
            C9097a.m27146a().mo22267a((Object) cVar);
        }
        super.onDismiss(dialogInterface);
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f23917u) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                int a = C9051ar.m27033a(getContext());
                window.setGravity(8388629);
                LayoutParams attributes = window.getAttributes();
                if (getContext() != null) {
                    attributes.horizontalMargin = C9051ar.m27035b(getContext(), 8.0f) / ((float) C9051ar.m27036b(getContext()));
                }
                window.setAttributes(attributes);
                window.setLayout(a, a - ((int) C9051ar.m27035b(getContext(), 16.0f)));
            }
            LayoutParams attributes2 = window.getAttributes();
            attributes2.dimAmount = 0.0f;
            window.setAttributes(attributes2);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f23902f == 2 || this.f23902f == 3 || !this.f23917u) {
            i = R.style.xw;
        } else {
            i = R.style.xv;
        }
        setStyle(1, i);
        C8448g.m25682a(getContext());
        C8448g.m25682a(getContext());
        if (this.f23920x != null) {
            this.f23920x.mo119660a();
            this.f23920x.dispose();
        }
        this.f23920x = new C47562b();
        this.f23920x.mo119660a();
        m26364a(C4434d.class);
        m26364a(C4443m.class);
    }

    /* renamed from: a */
    private void m26362a(C4434d dVar) {
        if (dVar != null) {
            dismiss();
            Bundle bundle = new Bundle();
            bundle.putString("source", dVar.f12878e);
            bundle.putString("enter_from", "live_detail");
            bundle.putString("source", dVar.f12878e);
            if (dVar.f12874a != null) {
                bundle.putLong("anchor_id", dVar.f12874a.getId());
            }
            C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
            if (!(a == null || a.mo21568a() == null)) {
                bundle.putString("enter_from_merge", "live_detail");
                bundle.putString("enter_method", dVar.f12878e);
            }
            bundle.putString("starlight_rank", String.valueOf(dVar.f12877d));
            Bundle bundle2 = new Bundle();
            bundle2.putString("live.intent.extra.ENTER_LIVE_SOURCE_V1", dVar.f12878e);
            bundle.putBundle("live.intent.extra.ENTER_LIVE_EXTRA_V1", bundle2);
            if (dVar.f12874a != null) {
                bundle.putLong("anchor_id", dVar.f12874a.getId());
            }
            bundle.putInt("back_source", 3);
            bundle.putLongArray("live.intent.extra.ENTER_ROOM_IDS", dVar.f12876c);
            C8804a.m26400c(this.f23910n, bundle);
            C9097a.m27146a().mo22267a((Object) new C4445o(dVar.f12875b, "live_detail", bundle));
        }
    }

    public void onEvent(C4434d dVar) {
        int i;
        int i2;
        if (this.f23911o && !this.f23915s) {
            long j = dVar.f12875b;
            this.f23915s = true;
            long j2 = 0;
            if (this.f23907k) {
                if (j <= 0 || j == this.f23908l.getId()) {
                    C9097a a = C9097a.m27146a();
                    if (dVar.f12874a != null) {
                        j2 = dVar.f12874a.getId();
                    }
                    a.mo22267a((Object) new UserProfileEvent(j2));
                } else {
                    C9049ap.m27024a(getContext(), (int) R.string.f61);
                }
            } else if (j > 0 && j != this.f23908l.getId()) {
                boolean a2 = C8804a.m26394a();
                if (!a2 || ((Boolean) C8946b.f24399aX.mo22117a()).booleanValue()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("toast_type", "hourly_rank");
                    Context context = getContext();
                    if (a2) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                    C9249a b = new C9249a(context, i).mo22716a(false).mo22727c((CharSequence) getContext().getString(R.string.eja, new Object[]{dVar.f12874a.getNickName()}));
                    if (a2) {
                        i2 = R.string.edr;
                    } else {
                        i2 = R.string.ecj;
                    }
                    b.mo22722b(0, i2, (DialogInterface.OnClickListener) new C8840d(this, dVar, hashMap, a2)).mo22722b(1, (int) R.string.eci, (DialogInterface.OnClickListener) new C8841e(hashMap)).mo22713a((OnDismissListener) new C8842f(this)).mo22729d();
                    C8443c.m25663a().mo21606a("livesdk_toast_show", hashMap, Room.class);
                } else {
                    m26362a(dVar);
                    return;
                }
            } else if (dVar.f12874a != null) {
                C9097a.m27146a().mo22267a((Object) new UserProfileEvent(dVar.f12874a.getId()));
            }
            this.f23915s = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21867a(View view) {
        m26370e();
    }

    public void show(C0608j jVar, String str) {
        C3916b.m13813a().mo11465b();
        this.f23899c = true;
        try {
            Field declaredField = jVar.getClass().getDeclaredField("mAdded");
            declaredField.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField.get(jVar);
            if (arrayList != null && arrayList.contains(this)) {
                return;
            }
        } catch (Exception | IllegalAccessException | NoSuchFieldException unused) {
        }
        super.show(jVar, str);
    }

    /* renamed from: a */
    static final /* synthetic */ void m26365a(HashMap hashMap, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        hashMap.put("choose_type", "cancel");
        C8443c.m25663a().mo21606a("livesdk_toast_click", hashMap, Room.class);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f23913q != null) {
            if (this.f23902f == 0 || this.f23902f == 1) {
                this.f23913q.mo21882a();
            } else if (this.f23902f == 2) {
                this.f23913q.mo21883a(13);
            } else if (this.f23902f == 3) {
                this.f23913q.mo21883a(20);
            }
        }
        this.f23905i = layoutInflater.inflate(R.layout.an7, viewGroup, false);
        this.f23911o = true;
        C8850l.m26466a();
        m26367b();
        return this.f23905i;
    }

    /* renamed from: a */
    public static DailyRankDialog m26361a(Room room, boolean z, boolean z2, DataCenter dataCenter, int i) {
        DailyRankDialog dailyRankDialog = new DailyRankDialog();
        dailyRankDialog.f23908l = room;
        dailyRankDialog.f23907k = z;
        dailyRankDialog.f23917u = z2;
        dailyRankDialog.f23910n = dataCenter;
        dailyRankDialog.f23902f = i;
        C8825e eVar = new C8825e(dailyRankDialog, room.getId(), room.getOwner().getId());
        dailyRankDialog.m26363a((C8806a) eVar);
        return dailyRankDialog;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21868a(C4434d dVar, HashMap hashMap, boolean z, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        m26362a(dVar);
        hashMap.put("choose_type", "yes_never");
        C8443c.m25663a().mo21606a("livesdk_toast_click", hashMap, Room.class);
        if (z) {
            C8946b.f24399aX.mo22118a(Boolean.valueOf(false));
        }
    }
}
