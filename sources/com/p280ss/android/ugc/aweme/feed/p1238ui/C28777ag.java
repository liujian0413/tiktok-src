package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.os.Build.VERSION;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.C32982di;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainFragment;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ag */
public final class C28777ag implements C29028z {

    /* renamed from: a */
    public final Activity f75893a;

    /* renamed from: b */
    public final C32982di f75894b = new C32982di();

    /* renamed from: c */
    public C28774af f75895c;

    /* renamed from: d */
    public final int f75896d = 6;

    /* renamed from: e */
    public final int f75897e = 3;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ag$a */
    static final class C28778a<V> implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ C28777ag f75898a;

        /* renamed from: b */
        final /* synthetic */ int f75899b;

        C28778a(C28777ag agVar, int i) {
            this.f75898a = agVar;
            this.f75899b = i;
        }

        public final /* synthetic */ Object call() {
            m94761a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m94761a() {
            int i;
            if (this.f75899b == 2) {
                i = this.f75898a.f75896d;
            } else {
                i = this.f75898a.f75897e;
            }
            if (C7634n.m23768b(this.f75898a.f75894b.mo84691e(), new String[]{","}, false, 0).size() >= i) {
                if (this.f75898a.f75895c == null) {
                    this.f75898a.f75895c = new C28774af(this.f75898a.f75893a);
                    C28774af afVar = this.f75898a.f75895c;
                    if (afVar != null) {
                        afVar.setOnShowListener(new OnShowListener(this) {

                            /* renamed from: a */
                            final /* synthetic */ C28778a f75900a;

                            {
                                this.f75900a = r1;
                            }

                            public final void onShow(DialogInterface dialogInterface) {
                                this.f75900a.f75898a.f75894b.mo84688c(true);
                                C6907h.m21524a("location_permission_show", (Map) new HashMap());
                            }
                        });
                    }
                }
                C28774af afVar2 = this.f75898a.f75895c;
                if (afVar2 == null) {
                    C7573i.m23580a();
                }
                if (!afVar2.isShowing() && this.f75898a.mo74001c()) {
                    C28774af afVar3 = this.f75898a.f75895c;
                    if (afVar3 != null) {
                        afVar3.show();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo74000b() {
        C28774af afVar = this.f75895c;
        if (afVar != null) {
            afVar.dismiss();
        }
        this.f75895c = null;
    }

    /* renamed from: a */
    public final void mo73998a() {
        if (!this.f75894b.mo84690d()) {
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            int aR = a.mo18755aR();
            if (aR > 0 && C6399b.m19944t() && VERSION.SDK_INT >= 23 && !C43122ff.m136767b()) {
                C1592h.m7855a((Callable<TResult>) new C28778a<TResult>(this, aR), C1592h.f5958b);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo74001c() {
        if (this.f75893a instanceof MainActivity) {
            Fragment curFragment = ((MainActivity) this.f75893a).getCurFragment();
            if (curFragment instanceof MainFragment) {
                FeedFragment g = ((MainFragment) curFragment).mo84447b();
                if (g instanceof FeedRecommendFragment) {
                    FeedRecommendFragment feedRecommendFragment = (FeedRecommendFragment) g;
                    if (feedRecommendFragment.isResumed() && feedRecommendFragment.mUserVisibleHint) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public C28777ag(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f75893a = activity;
    }

    /* renamed from: a */
    public final void mo73999a(String str) {
        C7573i.m23587b(str, "aid");
        if (!this.f75894b.mo84690d()) {
            C7213d a = C7213d.m22500a();
            C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
            if (a.mo18755aR() > 0 && C6399b.m19944t() && VERSION.SDK_INT >= 23 && !C43122ff.m136767b()) {
                String e = this.f75894b.mo84691e();
                CharSequence charSequence = e;
                if (!C7634n.m23768b(charSequence, new String[]{","}, false, 0).contains(str)) {
                    C32982di diVar = this.f75894b;
                    if (!TextUtils.isEmpty(charSequence)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(e);
                        sb.append(',');
                        sb.append(str);
                        str = sb.toString();
                    }
                    diVar.mo84686b(str);
                }
            }
        }
    }
}
