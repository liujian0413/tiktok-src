package com.p280ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.Space;
import android.widget.TabHost.TabSpec;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23464d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.p1290ui.HomePageUIFrameService;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager */
public class TabChangeManager extends C0063u {

    /* renamed from: a */
    public String f85773a;

    /* renamed from: b */
    public boolean f85774b;

    /* renamed from: c */
    public C32854a f85775c;

    /* renamed from: d */
    private FragmentTabHost f85776d;

    /* renamed from: e */
    private String f85777e;

    /* renamed from: f */
    private List<C23464d> f85778f = new ArrayList();

    /* renamed from: g */
    private int f85779g = 0;

    /* renamed from: h */
    private C0608j f85780h;

    /* renamed from: com.ss.android.ugc.aweme.main.TabChangeManager$a */
    public interface C32854a {
        /* renamed from: a */
        void mo79785a(String str);
    }

    /* renamed from: b */
    private boolean m106434b() {
        if (this.f85776d != null) {
            return true;
        }
        return false;
    }

    public void onCleared() {
        this.f85776d = null;
        this.f85778f.clear();
    }

    /* renamed from: a */
    public final Fragment mo84567a() {
        if (!m106434b()) {
            return null;
        }
        return this.f85776d.getCurrentFragment();
    }

    /* renamed from: a */
    public final TabChangeManager mo84568a(C0608j jVar) {
        this.f85780h = jVar;
        return this;
    }

    /* renamed from: a */
    public final TabChangeManager mo84569a(FragmentTabHost fragmentTabHost) {
        this.f85774b = true;
        this.f85776d = fragmentTabHost;
        return this;
    }

    /* renamed from: a */
    public static TabChangeManager m106432a(FragmentActivity fragmentActivity) {
        return (TabChangeManager) C0069x.m159a(fragmentActivity).mo147a(TabChangeManager.class);
    }

    /* renamed from: b */
    public final Fragment mo84577b(String str) {
        if (this.f85780h == null) {
            return null;
        }
        return this.f85780h.mo2644a(str);
    }

    /* renamed from: a */
    public final TabChangeManager mo84570a(C23464d dVar) {
        this.f85778f.add(dVar);
        if (dVar instanceof C0043i) {
            ((C0043i) dVar).getLifecycle().mo55a(new TabChangeManager$$Lambda$0(this, dVar));
        }
        return this;
    }

    /* renamed from: b */
    public final void mo84579b(Bundle bundle) {
        if (bundle != null) {
            if (this.f85773a == null) {
                this.f85773a = bundle.getString("cur_fragment");
                if (this.f85775c != null) {
                    this.f85775c.mo79785a(this.f85773a);
                }
            }
            if (this.f85777e == null) {
                this.f85777e = bundle.getString("last_fragment");
            }
        }
    }

    /* renamed from: a */
    public final void mo84571a(Bundle bundle) {
        bundle.putString("cur_fragment", this.f85773a);
        bundle.putString("last_fragment", this.f85777e);
    }

    /* renamed from: a */
    public final void mo84574a(String str) {
        mo84575a(str, false);
    }

    /* renamed from: a */
    public final void mo84575a(String str, boolean z) {
        int i = this.f85779g + 1;
        this.f85779g = i;
        mo84576a(str, z, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Void mo84578b(Class cls, String str, Bundle bundle) throws Exception {
        mo84573a(cls, str, bundle);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo84572a(C23464d dVar, C0043i iVar, Event event) {
        if (event == Event.ON_DESTROY) {
            this.f85778f.remove(dVar);
        }
    }

    /* renamed from: a */
    public final void mo84573a(Class cls, String str, Bundle bundle) {
        if (!m106434b()) {
            C1592h.m7855a((Callable<TResult>) new C32991dm<TResult>(this, cls, str, bundle), C1592h.f5958b);
            return;
        }
        TabSpec newTabSpec = this.f85776d.newTabSpec(str);
        if (C6399b.m19944t()) {
            Space space = new Space(this.f85776d.getContext());
            space.setMinimumHeight(0);
            space.setMinimumWidth(0);
            newTabSpec.setIndicator(space);
        } else {
            newTabSpec.setIndicator(str);
        }
        try {
            this.f85776d.mo26965a(newTabSpec, cls, bundle);
        } catch (Exception e) {
            C6921a.m21554a(e);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo84576a(String str, boolean z, int i, boolean z2) {
        if (!TextUtils.equals("HOME", str)) {
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
        }
        if (!m106434b() && TextUtils.equals("HOME", str) && this.f85773a == null) {
            this.f85777e = this.f85773a;
            this.f85773a = str;
        }
        if (!m106434b()) {
            C32992dn dnVar = new C32992dn(this, str, z, i, z2);
            C6726a.m20844b(dnVar);
        } else if (this.f85779g <= i) {
            this.f85776d.setCurrentTabByTag(((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).getTagForCurrentTabInMainPageFragment(this, this.f85776d.getCurrentTabTag(), str));
            this.f85777e = this.f85773a;
            this.f85773a = str;
            if (this.f85775c != null) {
                this.f85775c.mo79785a(this.f85773a);
            }
            for (C23464d a : this.f85778f) {
                a.mo61071a(this.f85773a, this.f85777e, z, z2);
            }
            ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).afterTabChangedInMainPageFragment(str);
        }
    }
}
