package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.widget.Widget;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.api.NewUserApiManager;
import com.p280ss.android.ugc.aweme.profile.model.NewUserCount;
import com.p280ss.android.ugc.aweme.profile.p1487ui.RecommendPointView;
import com.p280ss.android.ugc.aweme.viewmodel.Resource;
import com.p280ss.android.ugc.aweme.viewmodel.Resource.Status;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AddFriendWidget */
public final class AddFriendWidget extends Widget implements C0053p<Resource<NewUserCount>> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f96005g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(AddFriendWidget.class), "mRecommendDot", "getMRecommendDot()Lcom/ss/android/ugc/aweme/profile/ui/RecommendPointView;"))};

    /* renamed from: h */
    public int f96006h;

    /* renamed from: i */
    private final C0052o<Resource<NewUserCount>> f96007i = new C0052o<>();

    /* renamed from: j */
    private final C7541d f96008j = C7546e.m23569a(new C36593b(this));

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AddFriendWidget$a */
    static final class C36592a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AddFriendWidget f96009a;

        C36592a(AddFriendWidget addFriendWidget) {
            this.f96009a = addFriendWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                this.f96009a.mo92815a().startActivity(((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getAddFriendsActivityIntent(this.f96009a.mo92815a(), this.f96009a.f96006h, 21, "", "homepage_familiar"));
                this.f96009a.mo92816a(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.AddFriendWidget$b */
    static final class C36593b extends Lambda implements C7561a<RecommendPointView> {

        /* renamed from: a */
        final /* synthetic */ AddFriendWidget f96010a;

        C36593b(AddFriendWidget addFriendWidget) {
            this.f96010a = addFriendWidget;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecommendPointView invoke() {
            return (RecommendPointView) this.f96010a.mo31582g().findViewById(R.id.cp3);
        }
    }

    /* renamed from: b */
    private final RecommendPointView m118075b() {
        return (RecommendPointView) this.f96008j.getValue();
    }

    /* renamed from: h */
    public final int mo31583h() {
        return R.layout.b2j;
    }

    /* renamed from: c */
    private void m118076c() {
        mo31582g().setOnClickListener(new C36592a(this));
    }

    /* renamed from: a */
    public final Context mo92815a() {
        Context context = mo31582g().getContext();
        C7573i.m23582a((Object) context, "container.context");
        return context;
    }

    /* renamed from: j */
    public final void mo31585j() {
        super.mo31585j();
        NewUserApiManager.m115438a(this.f96007i);
    }

    /* renamed from: m */
    public final void mo31588m() {
        super.mo31588m();
        this.f96007i.removeObserver(this);
    }

    /* renamed from: i */
    public final void mo31584i() {
        super.mo31584i();
        m118076c();
        this.f96007i.observe(this, this);
    }

    /* renamed from: a */
    public final void mo92816a(int i) {
        if (i <= 0 || TimeLockRuler.isTeenModeON()) {
            m118075b().setVisibility(8);
        } else {
            m118075b().setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(Resource<NewUserCount> resource) {
        Status status;
        int i;
        if (resource != null) {
            status = resource.f112149a;
        } else {
            status = null;
        }
        if (status == Status.SUCCESS) {
            NewUserCount newUserCount = (NewUserCount) resource.f112150b;
            if (newUserCount != null) {
                i = newUserCount.count;
            } else {
                i = 0;
            }
            this.f96006h = i;
            if (this.f96006h <= 0) {
                mo92816a(0);
                return;
            }
            mo92816a(this.f96006h);
        }
    }
}
