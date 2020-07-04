package com.bytedance.android.livesdk.rank;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentPagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.setting.C3332f;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C4431aw;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.log.p405b.C8439k;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.fragment.UserRankListContainerFragment;
import com.bytedance.android.livesdk.rank.p420b.C8817a;
import com.bytedance.android.livesdk.rank.view.UserRankListView.C8859a;
import com.bytedance.android.livesdk.user.C8976b.C8977a;
import com.bytedance.android.livesdk.user.C8980d.C8983b;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.user.C8985f;
import com.bytedance.android.livesdk.user.C8986g;
import com.bytedance.android.livesdk.user.C8987h;
import com.bytedance.android.livesdk.user.C8994k.C8997b;
import com.bytedance.android.livesdk.utils.C9049ap;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p439b.C9298a;
import com.bytedance.android.livesdkapi.p437d.C9295a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class UserRankDialog2 extends LiveDialogFragment implements C0935e, C8859a {

    /* renamed from: a */
    public boolean f23927a;

    /* renamed from: b */
    String f23928b;

    /* renamed from: c */
    public final C47562b f23929c = new C47562b();

    /* renamed from: d */
    private Room f23930d;

    /* renamed from: e */
    private boolean f23931e;

    /* renamed from: f */
    private UserRankListContainerFragment[] f23932f;

    /* renamed from: g */
    private String[] f23933g;

    /* renamed from: h */
    private long f23934h;

    /* renamed from: i */
    private long f23935i;

    /* renamed from: k */
    private boolean f23936k;

    /* renamed from: l */
    private String f23937l = "live_room_rank";

    /* renamed from: m */
    private Activity f23938m;

    /* renamed from: n */
    private String f23939n;

    /* renamed from: o */
    private boolean f23940o;

    /* renamed from: p */
    private List<String> f23941p = new ArrayList(Arrays.asList(new String[]{"live_room_rank", "weekly_rank", "totally_rank"}));

    /* renamed from: q */
    private DataCenter f23942q;

    /* renamed from: r */
    private int f23943r = 0;

    /* renamed from: s */
    private C8986g<IUser> f23944s = new C8986g<IUser>() {
        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(IUser iUser) {
            super.onNext(iUser);
            UserRankDialog2.this.mo21878b();
        }

        public final void onSubscribe(C7321c cVar) {
            super.onSubscribe(cVar);
            UserRankDialog2.this.f23929c.mo119661a(cVar);
        }
    };

    /* renamed from: com.bytedance.android.livesdk.rank.UserRankDialog2$a */
    static class C8803a extends FragmentPagerAdapter {

        /* renamed from: a */
        private final Fragment[] f23949a;

        /* renamed from: b */
        private final String[] f23950b;

        public final int getCount() {
            if (this.f23949a != null) {
                return this.f23949a.length;
            }
            return 0;
        }

        public final CharSequence getPageTitle(int i) {
            return this.f23950b[i];
        }

        /* renamed from: a */
        public final Fragment mo2423a(int i) {
            if (this.f23949a == null || i >= this.f23949a.length) {
                return null;
            }
            return this.f23949a[i];
        }

        C8803a(C0608j jVar, Fragment[] fragmentArr, String[] strArr) {
            super(jVar);
            this.f23949a = fragmentArr;
            this.f23950b = strArr;
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    /* renamed from: d */
    private int m26386d() {
        String[] stringArray = getResources().getStringArray(R.array.aq);
        if (stringArray != null && this.f23943r < stringArray.length) {
            this.f23928b = stringArray[this.f23943r];
        }
        if (!(this.f23928b == null || this.f23933g == null)) {
            for (int i = 0; i < this.f23933g.length; i++) {
                if (this.f23933g[i] != null && this.f23933g[i].equals(this.f23928b)) {
                    return i;
                }
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo21878b() {
        if (this.f11448j && TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            if (this.f23934h > 0) {
                onEvent(new C8817a(this.f23934h));
                this.f23934h = 0;
                this.f23936k = true;
                return;
            }
            for (UserRankListContainerFragment b : this.f23932f) {
                b.mo21912b();
            }
        }
    }

    public void onDestroyView() {
        String str;
        super.onDestroyView();
        this.f23929c.dispose();
        HashMap hashMap = new HashMap();
        hashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.f23935i));
        hashMap.put("type", this.f23937l);
        C8443c a = C8443c.m25663a();
        String str2 = "livesdk_contribution_ranklist_duration";
        Object[] objArr = new Object[3];
        objArr[0] = Room.class;
        C8438j b = new C8438j().mo21599b("live_interact");
        if (this.f23931e) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[1] = b.mo21598a(str).mo21600c("popup");
        objArr[2] = new C8439k();
        a.mo21606a(str2, hashMap, objArr);
    }

    /* renamed from: c */
    private void m26385c() {
        long j;
        long j2;
        char c;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j3;
        if (this.f23930d == null) {
            j = 0;
        } else {
            j = this.f23930d.getId();
        }
        if (this.f23930d == null || this.f23930d.getOwner() == null) {
            j2 = 0;
        } else {
            j2 = this.f23930d.getOwner().getId();
        }
        String[] stringArray = getResources().getStringArray(R.array.aq);
        if (this.f23927a) {
            if (m26384a(1)) {
                this.f23932f = new UserRankListContainerFragment[1];
                this.f23932f[0] = UserRankListContainerFragment.m26450a(j, j2, this.f23931e, 17, 0, this);
                this.f23933g = stringArray;
            }
            return;
        }
        ArrayList arrayList3 = new ArrayList(3);
        ArrayList arrayList4 = new ArrayList();
        if (m26384a(1)) {
            arrayList2 = arrayList4;
            arrayList = arrayList3;
            c = 1;
            arrayList.add(UserRankListContainerFragment.m26450a(j, j2, this.f23931e, 17, arrayList3.size(), this));
            arrayList2.add(stringArray[0]);
        } else {
            arrayList2 = arrayList4;
            arrayList = arrayList3;
            c = 1;
        }
        if (m26384a(2)) {
            if (this.f23930d == null) {
                j3 = 0;
            } else {
                j3 = this.f23930d.getId();
            }
            arrayList.add(UserRankListContainerFragment.m26450a(j3, j2, this.f23931e, 7, arrayList.size(), this));
            arrayList2.add(stringArray[c]);
        }
        if (m26384a(4)) {
            arrayList.add(UserRankListContainerFragment.m26450a(j, j2, this.f23931e, 9, this.f23943r, this));
            arrayList2.add(stringArray[2]);
        }
        this.f23932f = new UserRankListContainerFragment[arrayList.size()];
        this.f23932f = (UserRankListContainerFragment[]) arrayList.toArray(this.f23932f);
        this.f23933g = new String[arrayList2.size()];
        this.f23933g = (String[]) arrayList2.toArray(this.f23933g);
    }

    /* renamed from: a */
    public final void mo21877a() {
        UserRankListContainerFragment[] userRankListContainerFragmentArr;
        if (this.f23932f != null) {
            for (UserRankListContainerFragment userRankListContainerFragment : this.f23932f) {
                if (userRankListContainerFragment != null) {
                    userRankListContainerFragment.mo21911a();
                }
            }
        }
    }

    public void onEvent(C4431aw awVar) {
        if (isVisible() && awVar.f12869a == 1) {
            dismiss();
        }
    }

    /* renamed from: a */
    private <T> void m26383a(Class<T> cls) {
        this.f23929c.mo119661a(C9097a.m27146a().mo22266a(cls).mo19325f((C7326g<? super T>) new C7326g<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C8817a) {
                    UserRankDialog2.this.onEvent((C8817a) t);
                } else if (t instanceof C9298a) {
                    UserRankDialog2.this.onEvent((C9298a) t);
                } else {
                    if (t instanceof C4431aw) {
                        UserRankDialog2.this.onEvent((C4431aw) t);
                    }
                }
            }
        }));
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (this.f23940o) {
            i = R.style.xv;
        } else {
            i = R.style.xw;
        }
        setStyle(1, i);
    }

    public void onEvent(C9298a aVar) {
        if (this.f11448j && this.f23936k) {
            for (UserRankListContainerFragment b : this.f23932f) {
                b.mo21912b();
            }
        }
    }

    /* renamed from: a */
    private static boolean m26384a(int i) {
        if ((((Integer) LiveSettingKeys.LIVE_USER_RANK.mo10240a()).intValue() & i) == i) {
            return true;
        }
        return false;
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog = getDialog();
        dialog.requestWindowFeature(1);
        dialog.setCanceledOnTouchOutside(true);
        super.onActivityCreated(bundle);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            if (this.f23940o) {
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

    public void onPageSelected(int i) {
        String str;
        this.f23937l = (String) this.f23941p.get(i);
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", this.f23937l);
        C8443c a = C8443c.m25663a();
        String str2 = "livesdk_contribution_ranklist_show";
        Object[] objArr = new Object[3];
        C8438j b = new C8438j().mo21599b("live_interact");
        if (this.f23931e) {
            str = "live_take_detail";
        } else {
            str = "live_detail";
        }
        objArr[0] = b.mo21598a(str).mo21600c("popup");
        objArr[1] = new C8439k();
        objArr[2] = Room.class;
        a.mo21606a(str2, hashMap, objArr);
    }

    public void onEvent(C8817a aVar) {
        String str;
        String str2;
        if (!TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            this.f23934h = aVar.f23964a;
            TTLiveSDKContext.getHostService().mo22367h().mo22167a(this.f23938m, C8987h.m26865a().mo22189a(C3332f.m12427a()).mo22191b(C3332f.m12428b()).mo22188a(0).mo22190a()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) this.f23944s);
            return;
        }
        if (C9074l.m27086b(this.f23942q) && this.f23930d != null && aVar.f23964a == this.f23930d.author().getId()) {
            C3596c.m13172a(C9295a.class);
            C9074l.m27087c(this.f23942q);
        }
        if (aVar.f23965b) {
            C8984e h = TTLiveSDKContext.getHostService().mo22367h();
            C8977a aVar2 = (C8977a) C8985f.m26862b().mo22153a(aVar.f23964a);
            if (this.f23930d != null) {
                str2 = this.f23930d.getRequestId();
            } else {
                str2 = "";
            }
            h.mo22169a(((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) ((C8983b) aVar2.mo22154a(str2)).mo22157b("live_detail")).mo22158c("")).mo22156b(0)).mo22159d("")).mo22161a(this.f23938m)).mo22162e("live_detail")).mo22163f("follow")).mo22164c()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<FollowPair>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(FollowPair followPair) {
                    UserRankDialog2.this.onEvent(new C9298a(followPair));
                }

                public final void onError(Throwable th) {
                    if (UserRankDialog2.this.f11448j) {
                        if (th instanceof ApiServerException) {
                            C3517a.m12962a(UserRankDialog2.this.getContext(), ((ApiServerException) th).getPrompt());
                        } else {
                            C3517a.m12960a(UserRankDialog2.this.getContext(), (int) R.string.esb);
                        }
                    }
                }
            });
        } else {
            TTLiveSDKContext.getHostService().mo22367h().mo22171a(((C8997b) ((C8997b) ((C8997b) ((C8997b) ((C8997b) ((C8997b) C8985f.m26864d().mo22153a(aVar.f23964a)).mo22197a("")).mo22199b(0)).mo22196a(this.f23938m)).mo22201b("live_detail")).mo22203c("unfollow")).mo22204d()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C7498y<FollowPair>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C7321c cVar) {
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onNext(FollowPair followPair) {
                    UserRankDialog2.this.onEvent(new C9298a(followPair));
                }

                public final void onError(Throwable th) {
                    if (UserRankDialog2.this.f11448j) {
                        if (th instanceof ApiServerException) {
                            C3517a.m12962a(UserRankDialog2.this.getContext(), ((ApiServerException) th).getPrompt());
                        } else {
                            C9049ap.m27022a((int) R.string.ezj);
                        }
                    }
                }
            });
        }
        HashMap hashMap = new HashMap();
        hashMap.put("growth_deepevent", "1");
        C8443c a = C8443c.m25663a();
        String str3 = "follow";
        Object[] objArr = new Object[3];
        objArr[0] = new C8438j().mo21599b("live_interact").mo21603f("core").mo21598a("live_detail").mo21600c("popup");
        if (TextUtils.equals(this.f23937l, "live_room_rank")) {
            str = "single_room_rank";
        } else {
            str = this.f23937l;
        }
        objArr[1] = new C8431c(str, aVar.f23964a);
        objArr[2] = Room.class;
        a.mo21606a(str3, hashMap, objArr);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        UserRankListContainerFragment[] userRankListContainerFragmentArr;
        View inflate = layoutInflater.inflate(R.layout.ap8, viewGroup, false);
        ViewPager viewPager = (ViewPager) inflate.findViewById(R.id.ed4);
        m26385c();
        if (this.f23932f != null) {
            int d = m26386d();
            for (UserRankListContainerFragment userRankListContainerFragment : this.f23932f) {
                userRankListContainerFragment.f24033a = this.f23942q;
                userRankListContainerFragment.f24034b = this.f23944s;
                userRankListContainerFragment.f24038f = d;
            }
        }
        viewPager.setAdapter(new C8803a(getChildFragmentManager(), this.f23932f, this.f23933g));
        viewPager.setOffscreenPageLimit(3);
        viewPager.addOnPageChangeListener(this);
        viewPager.setCurrentItem(m26386d());
        LivePagerSlidingTabStrip livePagerSlidingTabStrip = (LivePagerSlidingTabStrip) inflate.findViewById(R.id.dfv);
        if (this.f23932f == null || this.f23932f.length < 2) {
            livePagerSlidingTabStrip.setIndicatorHeight(0);
            livePagerSlidingTabStrip.setTabBackground(R.color.ac4);
        } else {
            livePagerSlidingTabStrip.setIndicatorColorResource(R.color.ag2);
            livePagerSlidingTabStrip.setTextColorResource(R.color.apo);
        }
        livePagerSlidingTabStrip.setViewPager(viewPager);
        m26383a(C8817a.class);
        m26383a(C9298a.class);
        m26383a(C4431aw.class);
        this.f23935i = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", this.f23937l);
        C8443c.m25663a().mo21606a("contribution_ranklist_show", hashMap, new C8438j().mo21599b("live_interact").mo21598a("live_detail").mo21600c("popup"), new C8439k(), Room.class);
        return inflate;
    }

    /* renamed from: a */
    public static UserRankDialog2 m26382a(Activity activity, Room room, boolean z, boolean z2, String str, DataCenter dataCenter) {
        if (room != null) {
            UserRankDialog2 userRankDialog2 = new UserRankDialog2();
            userRankDialog2.f23938m = activity;
            userRankDialog2.f23930d = room;
            userRankDialog2.f23931e = z;
            userRankDialog2.f23939n = str;
            userRankDialog2.f23940o = z2;
            userRankDialog2.f23942q = dataCenter;
            if (((Boolean) LiveSettingKeys.LIVE_SDK_NOBLE_INTRODUCE_SHOW_ANDROID.mo10240a()).booleanValue()) {
                userRankDialog2.f23941p.add("nobility");
            }
            return userRankDialog2;
        }
        throw new IllegalArgumentException("room is null");
    }
}
