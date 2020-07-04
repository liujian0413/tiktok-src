package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1282n;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.jedi.arch.C11491a;
import com.bytedance.jedi.arch.C11493ab;
import com.bytedance.jedi.arch.C11497af;
import com.bytedance.jedi.arch.C11502e;
import com.bytedance.jedi.arch.C11585f;
import com.bytedance.jedi.arch.C11592h;
import com.bytedance.jedi.arch.C11592h.C11593a;
import com.bytedance.jedi.arch.C11648k;
import com.bytedance.jedi.arch.C11669s;
import com.bytedance.jedi.arch.C11670t;
import com.bytedance.jedi.arch.C11672v;
import com.bytedance.jedi.arch.C11675y;
import com.bytedance.jedi.arch.C11676z;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ext.list.C11557c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.router.SmartRouter;
import com.facebook.ads.AdError;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.arch.C23274b;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23660c;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.OnAnimatedScrollListenerForJedi;
import com.p280ss.android.ugc.aweme.commercialize.log.C24945an;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25657a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33246ar;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.adapter.AmeDecoration;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment.C36120b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragmentImpl;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36341a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36340al.C36343c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.C36435dv;
import com.p280ss.android.ugc.aweme.profile.service.C36073i;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.service.C36075k;
import com.p280ss.android.ugc.aweme.profile.util.C36729b;
import com.p280ss.android.ugc.aweme.setting.C37656k;
import com.p280ss.android.ugc.aweme.setting.p337ui.C37897ax;
import com.p280ss.android.ugc.aweme.store.C41959a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42980bm.C42981a;
import com.p280ss.android.ugc.aweme.utils.C43105eq;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.C43371g;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref.BooleanRef;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.reflect.C7599l;
import kotlin.text.C7634n;
import org.greenrobot.eventbus.C7709l;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment */
public class JediAwemeListFragment extends AwemeListFragment implements C11497af<C23274b>, C11592h, C6905a, C28532n {

    /* renamed from: K */
    public static final C35851a f93922K = new C35851a(null);

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f93923e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediAwemeListFragment.class), "mAwemeListViewModel", "getMAwemeListViewModel()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListViewModel;"))};

    /* renamed from: A */
    public String f93924A;

    /* renamed from: B */
    public String f93925B;

    /* renamed from: C */
    public String f93926C;

    /* renamed from: D */
    public boolean f93927D = true;

    /* renamed from: E */
    public String f93928E;

    /* renamed from: F */
    public boolean f93929F = true;

    /* renamed from: G */
    public C36341a f93930G;

    /* renamed from: H */
    public C36343c f93931H;

    /* renamed from: J */
    public JediAwemeAdapter f93932J;

    /* renamed from: L */
    private ViewStub f93933L;

    /* renamed from: Q */
    private DmtTextView f93934Q;

    /* renamed from: R */
    private boolean f93935R;

    /* renamed from: S */
    private View f93936S;

    /* renamed from: T */
    private boolean f93937T;

    /* renamed from: U */
    private int f93938U;

    /* renamed from: V */
    private C25657a f93939V;

    /* renamed from: W */
    private final lifecycleAwareLazy f93940W;

    /* renamed from: X */
    private HashMap f93941X;

    /* renamed from: f */
    public final C23274b f93942f = new C23274b();

    /* renamed from: g */
    public RecyclerView f93943g;

    /* renamed from: h */
    public DmtStatusView f93944h;

    /* renamed from: i */
    public C10803a f93945i;

    /* renamed from: j */
    public View f93946j;

    /* renamed from: k */
    public User f93947k;

    /* renamed from: l */
    public boolean f93948l;

    /* renamed from: m */
    public boolean f93949m;

    /* renamed from: n */
    public int f93950n = 1;

    /* renamed from: o */
    public int f93951o;

    /* renamed from: p */
    public String f93952p;

    /* renamed from: q */
    public String f93953q;

    /* renamed from: r */
    public boolean f93954r;

    /* renamed from: s */
    public boolean f93955s;

    /* renamed from: t */
    public boolean f93956t;

    /* renamed from: u */
    public boolean f93957u = true;

    /* renamed from: v */
    public String f93958v;

    /* renamed from: w */
    public String f93959w;

    /* renamed from: x */
    public String f93960x;

    /* renamed from: y */
    public String f93961y;

    /* renamed from: z */
    public String f93962z;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$a */
    public static final class C35851a {
        private C35851a() {
        }

        public /* synthetic */ C35851a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static JediAwemeListFragment m115766a(int i, int i2, String str, String str2, boolean z, boolean z2) {
            C7573i.m23587b(str, "userID");
            JediAwemeListFragment jediAwemeListFragment = new JediAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", i2);
            bundle.putString("uid", str);
            bundle.putString("sec_user_id", str2);
            bundle.putBoolean("is_my_profile", z);
            bundle.putInt("bottom_bar_height", i);
            bundle.putBoolean("should_refresh_on_init_data", z2);
            jediAwemeListFragment.setArguments(bundle);
            return jediAwemeListFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$aa */
    static final class C35852aa extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f93963a;

        C35852aa(String str) {
            this.f93963a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115767a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115767a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setFeedsAwemeId(this.f93963a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$ab */
    static final class C35853ab extends Lambda implements C7562b<AwemeListState, AwemeListState> {

        /* renamed from: a */
        final /* synthetic */ int f93964a;

        C35853ab(int i) {
            this.f93964a = i;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeListState invoke(AwemeListState awemeListState) {
            AwemeListState awemeListState2 = awemeListState;
            C7573i.m23587b(awemeListState, "$receiver");
            return AwemeListState.copy$default(awemeListState2, null, null, false, false, this.f93964a, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, 2097135, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$ac */
    static final class C35854ac extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f93965a;

        C35854ac(String str) {
            this.f93965a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115769a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115769a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setMethodFrom(this.f93965a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$ad */
    static final class C35855ad extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f93966a;

        C35855ad(String str) {
            this.f93966a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115770a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115770a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setMethodFromLike(this.f93966a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$ae */
    static final class C35856ae extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f93967a;

        C35856ae(String str) {
            this.f93967a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115771a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115771a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setPreviousPage(this.f93967a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$af */
    static final class C35857af extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f93968a;

        C35857af(String str) {
            this.f93968a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115772a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115772a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setPreviousPagePosition(this.f93968a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$ag */
    static final class C35858ag extends Lambda implements C7562b<AwemeListState, AwemeListState> {

        /* renamed from: a */
        final /* synthetic */ boolean f93969a;

        C35858ag(boolean z) {
            this.f93969a = z;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeListState invoke(AwemeListState awemeListState) {
            AwemeListState awemeListState2 = awemeListState;
            C7573i.m23587b(awemeListState, "$receiver");
            return AwemeListState.copy$default(awemeListState2, null, null, false, this.f93969a, 0, false, 0, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, 2097143, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$ah */
    static final class C35859ah implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93970a;

        C35859ah(JediAwemeListFragment jediAwemeListFragment) {
            this.f93970a = jediAwemeListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f93970a.mo90811A();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$ai */
    static final class C35860ai extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93971a;

        C35860ai(JediAwemeListFragment jediAwemeListFragment) {
            this.f93971a = jediAwemeListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115774a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115774a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setUserId(this.f93971a.f93952p);
            awemeListState.setSecUserId(this.f93971a.f93953q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$aj */
    static final class C35861aj extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ boolean f93972a;

        C35861aj(boolean z) {
            this.f93972a = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115775a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115775a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setVisibleForFavoritesMob(this.f93972a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$b */
    public static final class C35862b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ Context f93973a;

        C35862b(Context context) {
            this.f93973a = context;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C7573i.m23587b(textPaint, "ds");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C7573i.m23587b(view, "widget");
            Context context = this.f93973a;
            if (context != null) {
                SmartRouter.buildRoute(context, "aweme://privacy/setting").open();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$c */
    static final class C35863c extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ IntRef f93974a;

        C35863c(IntRef intRef) {
            this.f93974a = intRef;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115776a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115776a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            this.f93974a.element = awemeListState.getListState().getList().size();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$d */
    static final class C35864d extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ IntRef f93975a;

        /* renamed from: b */
        final /* synthetic */ String f93976b;

        C35864d(IntRef intRef, String str) {
            this.f93975a = intRef;
            this.f93976b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115777a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115777a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "state");
            IntRef intRef = this.f93975a;
            Iterator it = awemeListState.getListState().getList().iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                String str = null;
                if (!(next instanceof Aweme)) {
                    next = null;
                }
                Aweme aweme = (Aweme) next;
                if (aweme != null) {
                    str = aweme.getAid();
                }
                if (C7573i.m23585a((Object) str, (Object) this.f93976b)) {
                    break;
                }
                i++;
            }
            intRef.element = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$e */
    static final class C35865e extends Lambda implements C7562b<AwemeListState, ArrayList<Aweme>> {

        /* renamed from: a */
        public static final C35865e f93977a = new C35865e();

        C35865e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m115778a((AwemeListState) obj);
        }

        /* renamed from: a */
        private static ArrayList<Aweme> m115778a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            Iterable list = awemeListState.getListState().getList();
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof Aweme) {
                    arrayList.add(next);
                }
            }
            List list2 = (List) arrayList;
            if (list2.size() < 3) {
                return new ArrayList<>(C7525m.m23505c((Iterable<? extends T>) list2, 3));
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$f */
    static final class C35866f extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93978a;

        C35866f(JediAwemeListFragment jediAwemeListFragment) {
            this.f93978a = jediAwemeListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115779a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115779a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            AwemeListFragmentImpl.m116358a(this.f93978a.f93943g, awemeListState.getListState().getList());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$g */
    static final class C35867g extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ BooleanRef f93979a;

        C35867g(BooleanRef booleanRef) {
            this.f93979a = booleanRef;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115780a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115780a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            this.f93979a.element = ((C35968f) awemeListState.getListState().getPayload()).f31254a.f31214a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$h */
    static final class C35868h extends Lambda implements C7563m<AwemeListState, Bundle, AwemeListState> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93980a;

        C35868h(JediAwemeListFragment jediAwemeListFragment) {
            this.f93980a = jediAwemeListFragment;
            super(2);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeListState invoke(AwemeListState awemeListState, Bundle bundle) {
            AwemeListState awemeListState2 = awemeListState;
            C7573i.m23587b(awemeListState, "$receiver");
            boolean z = this.f93980a.f93955s;
            boolean z2 = this.f93980a.f93956t;
            int i = this.f93980a.f93950n;
            String str = this.f93980a.f95164O;
            return AwemeListState.copy$default(awemeListState2, this.f93980a.f93952p, this.f93980a.f93953q, z, false, 0, z2, i, this.f93980a.f93951o, str, this.f93980a.f93958v, this.f93980a.f93959w, this.f93980a.f93960x, this.f93980a.f93961y, this.f93980a.f93962z, this.f93980a.f93924A, this.f93980a.f93925B, this.f93980a.f93926C, false, this.f93980a.f93927D, this.f93980a.f93928E, null, 1179672, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$i */
    static final class C35869i extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93981a;

        /* renamed from: b */
        final /* synthetic */ C28318an f93982b;

        C35869i(JediAwemeListFragment jediAwemeListFragment, C28318an anVar) {
            this.f93981a = jediAwemeListFragment;
            this.f93982b = anVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115782a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115782a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            if (this.f93981a.isViewValid() && this.f93981a.f93955s && this.f93981a.f93950n == 0) {
                IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
                Object obj = this.f93982b.f74632b;
                if (!(obj instanceof Aweme)) {
                    obj = null;
                }
                Aweme updateAweme = iAwemeService.updateAweme((Aweme) obj);
                if (updateAweme != null) {
                    this.f93981a.mo90838l().mo90875a(updateAweme);
                    C35975l.m115924a(updateAweme, this.f93981a.f93952p);
                    this.f93981a.mo90821a(false, true);
                    DmtStatusView dmtStatusView = this.f93981a.f93944h;
                    if (dmtStatusView != null) {
                        dmtStatusView.setVisibility(4);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$j */
    static final class C35870j extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93983a;

        /* renamed from: b */
        final /* synthetic */ C28318an f93984b;

        C35870j(JediAwemeListFragment jediAwemeListFragment, C28318an anVar) {
            this.f93983a = jediAwemeListFragment;
            this.f93984b = anVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115783a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115783a(AwemeListState awemeListState) {
            boolean z;
            C7573i.m23587b(awemeListState, "it");
            if (this.f93983a.isViewValid() && this.f93983a.f93955s && this.f93983a.f93950n == 0) {
                Object obj = this.f93984b.f74632b;
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.f93983a.mo90838l().mo90878a(str);
                    C35975l.m115927a(str, this.f93983a.f93952p);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$k */
    static final class C35871k extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93985a;

        /* renamed from: b */
        final /* synthetic */ C28318an f93986b;

        C35871k(JediAwemeListFragment jediAwemeListFragment, C28318an anVar) {
            this.f93985a = jediAwemeListFragment;
            this.f93986b = anVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115784a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115784a(AwemeListState awemeListState) {
            boolean z;
            C7573i.m23587b(awemeListState, "it");
            if (this.f93985a.isViewValid() && this.f93985a.f93955s && this.f93985a.f93950n != 0) {
                Object obj = this.f93986b.f74632b;
                if (!(obj instanceof String)) {
                    obj = null;
                }
                String str = (String) obj;
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
                    if (awemeById == null) {
                        awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getProfileSelfSeeAweme(str, this.f93985a.f93950n);
                    }
                    if (!(awemeById == null || awemeById.getAwemeType() == 13 || this.f93985a.f93950n != 1)) {
                        if (awemeById.getUserDigg() != 0) {
                            this.f93985a.mo90838l().mo90875a(awemeById);
                        } else {
                            JediAwemeListViewModel l = this.f93985a.mo90838l();
                            String aid = awemeById.getAid();
                            C7573i.m23582a((Object) aid, "aweme.aid");
                            l.mo90878a(aid);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$l */
    static final class C35872l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f93987a;

        /* renamed from: b */
        final /* synthetic */ JediAwemeVideoViewHolder f93988b;

        C35872l(JediAwemeListFragment jediAwemeListFragment, JediAwemeVideoViewHolder jediAwemeVideoViewHolder) {
            this.f93987a = jediAwemeListFragment;
            this.f93988b = jediAwemeVideoViewHolder;
        }

        public final void run() {
            String str;
            int i;
            if (this.f93987a.f93955s) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            if (this.f93987a.f93955s) {
                i = 1000;
            } else {
                i = AdError.SERVER_ERROR_CODE;
            }
            int i2 = i + this.f93987a.f93950n;
            if (this.f93988b.getAdapterPosition() != -1) {
                try {
                    if (AwemeListFragmentImpl.m116364a(this.f93988b.itemView)) {
                        new C33246ar().mo85126a(str).mo85128c(this.f93988b.mo69909u(), i2).mo85252e();
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$m */
    public static final class C35873m implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f93989a;

        /* renamed from: b */
        final /* synthetic */ C7563m f93990b;

        /* renamed from: c */
        final /* synthetic */ C7563m f93991c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f93992d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f93993e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f93994f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f93992d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f93993e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f93994f;
        }

        public C35873m(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f93989a = bVar;
            this.f93990b = mVar;
            this.f93991c = mVar2;
            this.f93992d = bVar;
            this.f93993e = mVar;
            this.f93994f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$n */
    public static final class C35874n implements C11557c<Object, C11585f> {

        /* renamed from: a */
        final /* synthetic */ C7562b f93995a;

        /* renamed from: b */
        final /* synthetic */ C7563m f93996b;

        /* renamed from: c */
        final /* synthetic */ C7563m f93997c;

        /* renamed from: d */
        private final C7562b<C11585f, C7581n> f93998d;

        /* renamed from: e */
        private final C7563m<C11585f, Throwable, C7581n> f93999e;

        /* renamed from: f */
        private final C7563m<C11585f, List<? extends Object>, C7581n> f94000f;

        /* renamed from: a */
        public final C7562b<C11585f, C7581n> mo29138a() {
            return this.f93998d;
        }

        /* renamed from: b */
        public final C7563m<C11585f, Throwable, C7581n> mo29139b() {
            return this.f93999e;
        }

        /* renamed from: c */
        public final C7563m<C11585f, List<? extends Object>, C7581n> mo29140c() {
            return this.f94000f;
        }

        public C35874n(C7562b bVar, C7563m mVar, C7563m mVar2) {
            this.f93995a = bVar;
            this.f93996b = mVar;
            this.f93997c = mVar2;
            this.f93998d = bVar;
            this.f93999e = mVar;
            this.f94000f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$o */
    static final class C35875o implements C6905a {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94001a;

        C35875o(JediAwemeListFragment jediAwemeListFragment) {
            this.f94001a = jediAwemeListFragment;
        }

        public final void bd_() {
            this.f94001a.mo90838l().f94022f.mo29085c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$p */
    static final class C35876p extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94002a;

        C35876p(JediAwemeListFragment jediAwemeListFragment) {
            this.f94002a = jediAwemeListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115791a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115791a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                if (this.f94002a.f93955s || 1 != this.f94002a.f93950n || !C6399b.m19944t()) {
                    this.f94002a.ae_();
                } else {
                    C10803a aVar = null;
                    if (this.f94002a.mo90838l().f94021e == 7) {
                        DmtStatusView dmtStatusView = this.f94002a.f93944h;
                        if (dmtStatusView != null) {
                            C10803a aVar2 = this.f94002a.f93945i;
                            if (aVar2 != null) {
                                aVar = aVar2.mo25963b((View) this.f94002a.mo90823b(this.f94002a.getContext(), true));
                            }
                            dmtStatusView.setBuilder(aVar);
                        }
                        DmtStatusView dmtStatusView2 = this.f94002a.f93944h;
                        if (dmtStatusView2 != null) {
                            dmtStatusView2.mo25939d();
                        }
                        this.f94002a.ae_();
                        if (this.f94002a.f93931H != null) {
                            C36343c cVar = this.f94002a.f93931H;
                            if (cVar != null) {
                                cVar.mo92455a(true);
                            }
                        }
                    } else {
                        DmtStatusView dmtStatusView3 = this.f94002a.f93944h;
                        if (dmtStatusView3 != null) {
                            C10803a aVar3 = this.f94002a.f93945i;
                            if (aVar3 != null) {
                                aVar = aVar3.mo25963b((View) this.f94002a.mo90823b(this.f94002a.getContext(), false));
                            }
                            dmtStatusView3.setBuilder(aVar);
                        }
                        DmtStatusView dmtStatusView4 = this.f94002a.f93944h;
                        if (dmtStatusView4 != null) {
                            dmtStatusView4.mo25939d();
                        }
                        this.f94002a.ae_();
                        if (this.f94002a.f93931H != null) {
                            C36343c cVar2 = this.f94002a.f93931H;
                            if (cVar2 != null) {
                                cVar2.mo92455a(false);
                            }
                        }
                    }
                }
                C36341a aVar4 = this.f94002a.f93930G;
                if (aVar4 != null) {
                    aVar4.mo91881a(this.f94002a.f93955s, this.f94002a.f93950n);
                }
            } else {
                DmtStatusView dmtStatusView5 = this.f94002a.f93944h;
                if (dmtStatusView5 != null) {
                    dmtStatusView5.mo25939d();
                }
                C36341a aVar5 = this.f94002a.f93930G;
                if (aVar5 != null) {
                    aVar5.mo91882b(this.f94002a.f93955s, this.f94002a.f93950n);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$q */
    static final class C35877q extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94003a;

        C35877q(JediAwemeListFragment jediAwemeListFragment) {
            this.f94003a = jediAwemeListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115792a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115792a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            this.f94003a.mo90841o();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$r */
    static final class C35878r extends Lambda implements C7563m<C11585f, List<? extends Object>, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94004a;

        C35878r(JediAwemeListFragment jediAwemeListFragment) {
            this.f94004a = jediAwemeListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115793a((C11585f) obj, (List) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115793a(C11585f fVar, List<? extends Object> list) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(list, "data");
            Collection collection = list;
            if (!collection.isEmpty()) {
                DmtStatusView dmtStatusView = this.f94004a.f93944h;
                if (dmtStatusView != null) {
                    dmtStatusView.mo25939d();
                }
            } else {
                this.f94004a.ae_();
            }
            if (C6399b.m19944t() && this.f94004a.f93955s && TextUtils.equals(this.f94004a.f95164O, C43105eq.m136725a(1))) {
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                C22903bl f = a.mo60076f();
                C7573i.m23582a((Object) f, "CommonSharePrefCache.ins…redLikeSelfVisibleSetting");
                if (!((Boolean) f.mo59877d()).booleanValue()) {
                    C23060u a2 = C23060u.m75742a();
                    C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
                    C22903bl b = a2.mo60072b();
                    C7573i.m23582a((Object) b, "CommonSharePrefCache.ins…ClickLikeSelfVisibleGuide");
                    if (!((Boolean) b.mo59877d()).booleanValue() && (!collection.isEmpty())) {
                        View view = this.f94004a.f93946j;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                    }
                }
            }
            if (!(this.f94004a.mTag == null || this.f94004a.f93952p == null || !C7573i.m23585a((Object) this.f94004a.f93952p, (Object) C36120b.m116333b()))) {
                String str = this.f94004a.mTag;
                if (str == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) str, "this@JediAwemeListFragment.tag!!");
                String num = Integer.toString(0);
                C7573i.m23582a((Object) num, "Integer.toString(Constan…tType.TYPE_PUBLISH_AWEME)");
                if (C7634n.m23723c(str, num, false) && C36120b.m116329a() > 0) {
                    final long a3 = C36120b.m116329a();
                    final String c = C36120b.m116335c();
                    C1592h.m7853a((Callable<TResult>) new Callable<TResult>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Void call() {
                            String str;
                            JSONObject jSONObject = new JSONObject();
                            String str2 = "group_id";
                            try {
                                if (c == null) {
                                    str = "";
                                } else {
                                    str = c;
                                }
                                jSONObject.put(str2, str);
                                C41959a.f109023a = SystemClock.uptimeMillis() - a3;
                                jSONObject.put("duration", String.valueOf(C41959a.f109023a));
                            } catch (JSONException unused) {
                            }
                            C6759a.m20910a("post_list", jSONObject);
                            return null;
                        }
                    });
                    C36120b.m116330a(0);
                    C36120b.m116331a((String) null);
                    C36120b.m116334b("");
                }
            }
            this.f94004a.f93957u = false;
            this.f94004a.f93929F = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$s */
    static final class C35880s extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94007a;

        C35880s(JediAwemeListFragment jediAwemeListFragment) {
            this.f94007a = jediAwemeListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115795a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115795a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            this.f94007a.mo90820a(th.getCause());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$t */
    static final class C35881t extends Lambda implements C7562b<C11585f, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94008a;

        C35881t(JediAwemeListFragment jediAwemeListFragment) {
            this.f94008a = jediAwemeListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115796a((C11585f) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115796a(C11585f fVar) {
            C7573i.m23587b(fVar, "$receiver");
            JediAwemeListFragment.m115700a(this.f94008a).ag_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$u */
    static final class C35882u extends Lambda implements C7563m<C11585f, Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94009a;

        C35882u(JediAwemeListFragment jediAwemeListFragment) {
            this.f94009a = jediAwemeListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115797a((C11585f) obj, (Throwable) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115797a(C11585f fVar, Throwable th) {
            C7573i.m23587b(fVar, "$receiver");
            C7573i.m23587b(th, "it");
            Throwable cause = th.getCause();
            if (!(cause instanceof Exception)) {
                cause = null;
            }
            Exception exc = (Exception) cause;
            if (exc != null) {
                C36729b.m118410a(this.f94009a.f93950n, true, exc);
            }
            JediAwemeListFragment.m115700a(this.f94009a).mo66508i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$v */
    static final class C35883v extends Lambda implements C7563m<C11585f, Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94010a;

        C35883v(JediAwemeListFragment jediAwemeListFragment) {
            this.f94010a = jediAwemeListFragment;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115798a((C11585f) obj, ((Boolean) obj2).booleanValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115798a(C11585f fVar, boolean z) {
            C7573i.m23587b(fVar, "$receiver");
            if (z) {
                JediAwemeListFragment.m115700a(this.f94010a).ai_();
            } else {
                JediAwemeListFragment.m115700a(this.f94010a).ah_();
            }
            this.f94010a.mo59100a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$w */
    static final class C35884w extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f94011a;

        C35884w(String str) {
            this.f94011a = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115799a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115799a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setContentSource(this.f94011a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$x */
    static final class C35885x extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94012a;

        C35885x(JediAwemeListFragment jediAwemeListFragment) {
            this.f94012a = jediAwemeListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115800a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115800a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setCurVisible(this.f94012a.f93927D);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$y */
    static final class C35886y extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ JediAwemeListFragment f94013a;

        C35886y(JediAwemeListFragment jediAwemeListFragment) {
            this.f94013a = jediAwemeListFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115801a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115801a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setEnterAwemeId(this.f94013a.f93928E);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment$z */
    static final class C35887z extends Lambda implements C7562b<AwemeListState, C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f94014a;

        /* renamed from: b */
        final /* synthetic */ String f94015b;

        C35887z(String str, String str2) {
            this.f94014a = str;
            this.f94015b = str2;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m115802a((AwemeListState) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m115802a(AwemeListState awemeListState) {
            C7573i.m23587b(awemeListState, "it");
            awemeListState.setEnterFromRequestId(this.f94014a);
            awemeListState.setPreviousPage(this.f94015b);
        }
    }

    /* renamed from: a */
    public static final JediAwemeListFragment m115701a(int i, int i2, String str, String str2, boolean z, boolean z2) {
        return C35851a.m115766a(i, i2, str, str2, true, false);
    }

    /* renamed from: B */
    public void mo90812B() {
        if (this.f93941X != null) {
            this.f93941X.clear();
        }
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public final void aP_() {
        bd_();
    }

    /* renamed from: l */
    public final JediAwemeListViewModel mo90838l() {
        return (JediAwemeListViewModel) this.f93940W.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo90839m() {
        return R.layout.fragment_aweme_list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo90846q() {
        mo90811A();
    }

    /* renamed from: t */
    public final void mo71270t() {
    }

    /* renamed from: w */
    public final int mo90851w() {
        return this.f93950n;
    }

    /* renamed from: y */
    public final void mo90853y() {
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B, C, D> C7321c mo29065a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C7599l<S, ? extends C> lVar3, C7599l<S, ? extends D> lVar4, C11672v<C11493ab<A, B, C, D>> vVar, C48008s<? super C11585f, ? super A, ? super B, ? super C, ? super D, C7581n> sVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(lVar3, "prop3");
        C7573i.m23587b(lVar4, "prop4");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(sVar, "subscriber");
        return C11593a.m34073a(this, jediViewModel, lVar, lVar2, lVar3, lVar4, vVar, sVar);
    }

    /* renamed from: a */
    public final <VM1 extends JediViewModel<S1>, S1 extends C11670t, R> R mo29066a(VM1 vm1, C7562b<? super S1, ? extends R> bVar) {
        C7573i.m23587b(vm1, "viewModel1");
        C7573i.m23587b(bVar, "block");
        return C11593a.m34074a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo90819a(String str) {
        this.f93928E = str;
        if (isViewValid()) {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35886y<Object,Object>(this));
        }
    }

    /* renamed from: a */
    public final void mo65501a(String str, String str2) {
        super.mo65501a(str, str2);
        this.f93952p = str;
        this.f93953q = str2;
        this.f93957u = true;
        if (isViewValid()) {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35860ai<Object,Object>(this));
        }
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        if (!z) {
            JediAwemeAdapter jediAwemeAdapter = this.f93932J;
            if (jediAwemeAdapter == null) {
                C7573i.m23583a("mJediAwemeAdapter");
            }
            jediAwemeAdapter.mo66504a((C6905a) null);
            if (C6399b.m19944t()) {
                JediAwemeAdapter jediAwemeAdapter2 = this.f93932J;
                if (jediAwemeAdapter2 == null) {
                    C7573i.m23583a("mJediAwemeAdapter");
                }
                jediAwemeAdapter2.mo66516d(false);
                return;
            }
            JediAwemeAdapter jediAwemeAdapter3 = this.f93932J;
            if (jediAwemeAdapter3 == null) {
                C7573i.m23583a("mJediAwemeAdapter");
            }
            jediAwemeAdapter3.ah_();
            JediAwemeAdapter jediAwemeAdapter4 = this.f93932J;
            if (jediAwemeAdapter4 == null) {
                C7573i.m23583a("mJediAwemeAdapter");
            }
            jediAwemeAdapter4.mo66516d(true);
        }
    }

    /* renamed from: a */
    public final void mo90820a(Throwable th) {
        if (isViewValid()) {
            if (m115696E()) {
                DmtStatusView dmtStatusView = this.f93944h;
                if (dmtStatusView != null) {
                    dmtStatusView.mo25944h();
                }
            } else {
                DmtStatusView dmtStatusView2 = this.f93944h;
                if (dmtStatusView2 != null) {
                    dmtStatusView2.mo25939d();
                }
            }
            this.f93957u = true;
            if (!(th instanceof Exception)) {
                th = null;
            }
            Exception exc = (Exception) th;
            if (exc != null) {
                C36729b.m118410a(this.f93950n, false, exc);
            }
        }
    }

    /* renamed from: a */
    public final void mo90815a(RoomStruct roomStruct) {
        if (isViewValid()) {
            mo90838l().mo90877a(roomStruct);
        }
    }

    /* renamed from: a */
    public final void mo90821a(boolean z, boolean z2) {
        C25657a aVar = this.f93939V;
        if (aVar != null) {
            aVar.mo66545a(z, z2);
        }
    }

    /* renamed from: a */
    public final void mo90818a(C36343c cVar) {
        this.f93931H = cVar;
    }

    /* renamed from: a */
    public final void mo90816a(User user) {
        this.f93947k = user;
        if (C6399b.m19944t() && !this.f93955s && !C43122ff.m136767b() && this.f93950n == 1) {
            m115703c(getContext(), this.f93935R);
        }
    }

    /* renamed from: a */
    public final void mo90814a(int i, int i2) {
        mo90821a(false, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public C11585f mo29191e() {
        return C11593a.m34077d(this);
    }

    /* renamed from: a */
    public final C11648k mo29060a() {
        return C11593a.m34068a(this);
    }

    /* renamed from: b */
    public final C11669s<C11585f> mo29067b() {
        return C11593a.m34075b(this);
    }

    /* renamed from: c */
    public final boolean mo29068c() {
        return C11593a.m34078e(this);
    }

    /* renamed from: d */
    public final C0043i mo29173d() {
        return C11593a.m34076c(this);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C0067b mo29056f() {
        return this.f93942f;
    }

    /* renamed from: g */
    public final int mo90835g() {
        return m115697F();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ View mo61750j() {
        return this.f93943g;
    }

    public final boolean aO_() {
        if (!this.f93957u || this.f93949m || this.f93948l) {
            return false;
        }
        return true;
    }

    public void onPause() {
        super.onPause();
        if (this.mUserVisibleHint) {
            mo90850v();
        }
    }

    /* renamed from: r */
    public final boolean mo90847r() {
        if (!isViewValid() || m115697F() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public final void mo90850v() {
        C25657a aVar = this.f93939V;
        if (aVar != null) {
            aVar.mo66544a();
        }
    }

    /* renamed from: E */
    private final boolean m115696E() {
        if (!this.f93955s || this.f93950n != 0 || m115697F() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: F */
    private final int m115697F() {
        IntRef intRef = new IntRef();
        intRef.element = 0;
        mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35863c<Object,Object>(intRef));
        return intRef.element;
    }

    public final boolean aR_() {
        BooleanRef booleanRef = new BooleanRef();
        booleanRef.element = false;
        mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35867g<Object,Object>(booleanRef));
        return booleanRef.element;
    }

    public final void aS_() {
        int i;
        if (isViewValid()) {
            RecyclerView recyclerView = this.f93943g;
            if (recyclerView != null) {
                i = recyclerView.getChildCount();
            } else {
                i = 0;
            }
            if (i > 0) {
                RecyclerView recyclerView2 = this.f93943g;
                if (recyclerView2 != null) {
                    recyclerView2.mo5561d(0);
                }
            }
        }
    }

    public final void bd_() {
        if (this.f93955s) {
            C36729b.m118408a(this.f93950n, true, m115697F());
        }
        mo90838l().f94022f.mo29085c();
    }

    /* renamed from: o */
    public final void mo90841o() {
        if (isViewValid()) {
            View view = this.f93936S;
            if (view != null) {
                view.setVisibility(4);
            }
            DmtStatusView dmtStatusView = this.f93944h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25942f();
            }
        }
    }

    public void onDestroyView() {
        C24945an.m81853a().mo65223b();
        C24945an a = C24945an.m81853a();
        C7573i.m23582a((Object) a, "StarLogHelper.getInstance()");
        a.f65782a = false;
        super.onDestroyView();
        mo90812B();
    }

    public void onStart() {
        super.onStart();
        try {
            if (AwemeListFragmentImpl.m116370c(this.f93950n)) {
                AwemeListFragmentImpl.m116369c(this.f93943g);
            }
        } catch (Exception unused) {
        }
    }

    public void onStop() {
        if (this.mUserVisibleHint) {
            mo90850v();
        }
        try {
            if (isViewValid()) {
                AwemeListFragmentImpl.m116366b(this.f93943g);
            }
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
        super.onStop();
    }

    /* renamed from: s */
    public final void mo90848s() {
        DmtStatusView dmtStatusView = this.f93944h;
        if (dmtStatusView != null && !dmtStatusView.mo25945i()) {
            DmtStatusView dmtStatusView2 = this.f93944h;
            if (dmtStatusView2 == null) {
                C7573i.m23580a();
            }
            dmtStatusView2.setVisibility(0);
        }
    }

    /* renamed from: u */
    public final void mo90849u() {
        DmtStatusView dmtStatusView = this.f93944h;
        if (dmtStatusView != null && dmtStatusView.mo25945i()) {
            DmtStatusView dmtStatusView2 = this.f93944h;
            if (dmtStatusView2 == null) {
                C7573i.m23580a();
            }
            dmtStatusView2.setVisibility(4);
        }
    }

    /* renamed from: x */
    public final ArrayList<Aweme> mo90852x() {
        return (ArrayList) mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) C35865e.f93977a);
    }

    public JediAwemeListFragment() {
        C7563m hVar = new C35868h(this);
        C7584c a = C7575l.m23595a(JediAwemeListViewModel.class);
        C7561a jediAwemeListFragment$$special$$inlined$viewModel$1 = new JediAwemeListFragment$$special$$inlined$viewModel$1(a);
        this.f93940W = new lifecycleAwareLazy(this, jediAwemeListFragment$$special$$inlined$viewModel$1, new JediAwemeListFragment$$special$$inlined$viewModel$2(this, jediAwemeListFragment$$special$$inlined$viewModel$1, a, hVar));
    }

    public final void aQ_() {
        if (isViewValid()) {
            if (this.f93949m || this.f93948l) {
                ae_();
            } else if (this.f93944h == null || (!this.f93937T && !C36075k.f94317a.mo59240a())) {
                mo90846q();
            } else {
                DmtStatusView dmtStatusView = this.f93944h;
                if (dmtStatusView == null) {
                    C7573i.m23580a();
                }
                dmtStatusView.setVisibility(4);
                View view = this.f93936S;
                if (view == null) {
                    C7573i.m23580a();
                }
                view.setVisibility(0);
            }
        }
    }

    public final void ae_() {
        if (!this.f93955s || this.f93950n != 0) {
            DmtStatusView dmtStatusView = this.f93944h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25943g();
            }
            View view = this.f93946j;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        DmtStatusView dmtStatusView2 = this.f93944h;
        if (dmtStatusView2 != null) {
            dmtStatusView2.mo25950n();
        }
        DmtStatusView dmtStatusView3 = this.f93944h;
        if (dmtStatusView3 != null) {
            dmtStatusView3.setVisibility(4);
        }
    }

    /* renamed from: k */
    public final void mo90837k() {
        if (!this.f93949m && !this.f93948l && isViewValid()) {
            DmtStatusView dmtStatusView = this.f93944h;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(4);
            }
            View view = this.f93936S;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo90840n() {
        String str;
        if (this.f93955s) {
            str = "my_profile";
        } else {
            str = "user_profile";
        }
        C42981a.m136451a(str).mo104686a(this.f93943g);
        if (((this.f93955s && this.f93950n == 0) || this.f93954r || this.f95163N) && !C36075k.f94317a.mo59240a()) {
            mo90846q();
        }
    }

    /* renamed from: z */
    public final void mo90854z() {
        int i;
        C1293v vVar;
        if (isViewValid() && this.f93943g != null && !this.f93956t) {
            mo90832e(true);
            RecyclerView recyclerView = this.f93943g;
            if (recyclerView != null) {
                i = recyclerView.getChildCount();
            } else {
                i = 0;
            }
            for (int i2 = 0; i2 < i; i2++) {
                RecyclerView recyclerView2 = this.f93943g;
                if (recyclerView2 != null) {
                    vVar = recyclerView2.mo5575f(i2);
                } else {
                    vVar = null;
                }
                if (vVar instanceof JediAwemeVideoViewHolder) {
                    JediAwemeVideoViewHolder jediAwemeVideoViewHolder = (JediAwemeVideoViewHolder) vVar;
                    jediAwemeVideoViewHolder.bB_();
                    m115702a(jediAwemeVideoViewHolder);
                }
            }
        }
    }

    /* renamed from: D */
    private final void m115695D() {
        String str;
        Bundle arguments = getArguments();
        if (arguments != null) {
            C7573i.m23582a((Object) arguments, "arguments ?: return");
            this.f93950n = arguments.getInt("type");
            String string = arguments.getString("uid");
            if (!TextUtils.isEmpty(string)) {
                this.f93952p = string;
            }
            String string2 = arguments.getString("sec_user_id");
            if (!TextUtils.isEmpty(string2)) {
                this.f93953q = string2;
            }
            this.f93955s = arguments.getBoolean("is_my_profile");
            this.f93938U = arguments.getInt("bottom_bar_height");
            this.f93954r = arguments.getBoolean("should_refresh_on_init_data", false);
            if (this.f93950n == 0) {
                this.f93951o = 1;
            }
            if (this.f93955s || this.f93950n == 4) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            this.f93961y = str;
        }
    }

    public final void aT_() {
        if (isViewValid()) {
            if (!this.mUserVisibleHint || !C37656k.m120485a(getContext()) || !C35974k.m115923a(getActivity())) {
                mo90850v();
            } else {
                mo90821a(false, false);
            }
            if (this.mUserVisibleHint) {
                AwemeListFragmentImpl.m116357a(this.f93943g);
                if (AwemeListFragmentImpl.m116370c(this.f93950n)) {
                    mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35866f<Object,Object>(this));
                }
            }
        }
    }

    /* renamed from: G */
    private final void m115698G() {
        int a = AwemeListFragmentImpl.m116350a(this.f93948l, this.f93948l, this.f93955s, this.f93950n);
        if (!(a == 0 || this.f93945i == null || this.f93944h == null)) {
            DmtStatusView dmtStatusView = this.f93944h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25939d();
            }
            if (!C6399b.m19944t() || !this.f93955s || this.f93950n != 1) {
                if (!C6399b.m19944t() || this.f93955s || this.f93950n != 1) {
                    C10803a aVar = this.f93945i;
                    if (aVar != null) {
                        aVar.mo25963b((View) AwemeListFragmentImpl.m116352a(getContext(), a));
                    }
                } else if (C43122ff.m136767b()) {
                    C10803a aVar2 = this.f93945i;
                    if (aVar2 != null) {
                        aVar2.mo25963b((View) AwemeListFragmentImpl.m116352a(getContext(), a));
                    }
                } else {
                    C10803a aVar3 = this.f93945i;
                    if (aVar3 != null) {
                        aVar3.mo25963b((View) mo90823b(getContext(), false));
                    }
                }
            } else if (C43122ff.m136767b()) {
                C10803a aVar4 = this.f93945i;
                if (aVar4 != null) {
                    aVar4.mo25963b((View) AwemeListFragmentImpl.m116352a(getContext(), a));
                }
            } else {
                C23060u a2 = C23060u.m75742a();
                C7573i.m23582a((Object) a2, "CommonSharePrefCache.inst()");
                C22903bl e = a2.mo60075e();
                C7573i.m23582a((Object) e, "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue");
                Integer num = (Integer) e.mo59877d();
                if (num != null && num.intValue() == 0) {
                    C10803a aVar5 = this.f93945i;
                    if (aVar5 != null) {
                        aVar5.mo25963b((View) mo90813a(getContext(), false));
                    }
                } else {
                    C10803a aVar6 = this.f93945i;
                    if (aVar6 != null) {
                        aVar6.mo25963b((View) mo90813a(getContext(), true));
                    }
                }
            }
            DmtStatusView dmtStatusView2 = this.f93944h;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setBuilder(this.f93945i);
            }
        }
    }

    /* renamed from: A */
    public final boolean mo90811A() {
        if (!isViewValid() || C36075k.f94317a.mo59240a()) {
            return false;
        }
        if (!C35974k.m115923a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            this.f93957u = true;
            mo90838l().f94022f.mo29082b();
            return false;
        }
        if (this.f93955s) {
            if (TextUtils.isEmpty(this.f93952p)) {
                IAccountUserService f = C6861a.m21337f();
                C7573i.m23582a((Object) f, "AccountProxyService.userService()");
                this.f93952p = f.getCurUserId();
            }
            if (TextUtils.isEmpty(this.f93953q)) {
                IAccountUserService f2 = C6861a.m21337f();
                C7573i.m23582a((Object) f2, "AccountProxyService.userService()");
                User curUser = f2.getCurUser();
                C7573i.m23582a((Object) curUser, "AccountProxyService.userService().curUser");
                this.f93953q = curUser.getSecUid();
            }
        }
        if (!TextUtils.isEmpty(this.f93952p)) {
            if (this.f93955s) {
                C36729b.m118408a(this.f93950n, false, 0);
            }
            C36729b.m118406a(this.f93950n, this.f93952p);
        }
        mo90838l().f94022f.mo29082b();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r8 = this;
            super.onResume()
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            r1 = 1
            if (r0 == 0) goto L_0x0086
            boolean r0 = r8.f93955s
            if (r0 == 0) goto L_0x0086
            java.lang.String r0 = r8.f95164O
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r2 = com.p280ss.android.ugc.aweme.utils.C43105eq.m136725a(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60076f()
            java.lang.String r2 = "CommonSharePrefCache.ins…redLikeSelfVisibleSetting"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.String r2 = "CommonSharePrefCache.ins…eSelfVisibleSetting.cache"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0073
            com.ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeAdapter r0 = r8.f93932J
            if (r0 != 0) goto L_0x004a
            java.lang.String r2 = "mJediAwemeAdapter"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x004a:
            int r0 = r0.mo60557c()
            if (r0 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r2 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60072b()
            java.lang.String r2 = "CommonSharePrefCache.ins…ClickLikeSelfVisibleGuide"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.String r2 = "CommonSharePrefCache.ins…ikeSelfVisibleGuide.cache"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0086
        L_0x0073:
            android.view.View r0 = r8.f93946j
            if (r0 == 0) goto L_0x0086
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0086
            android.view.View r0 = r8.f93946j
            if (r0 == 0) goto L_0x0086
            r2 = 8
            r0.setVisibility(r2)
        L_0x0086:
            boolean r0 = r8.mUserVisibleHint
            if (r0 == 0) goto L_0x00a8
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment> r3 = com.p280ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment.class
            r4 = 1
            java.lang.String r5 = "stop_main_anim_when_invisible"
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r0 = r0.mo15295d()
            boolean r6 = r0.stop_main_anim_when_invisible
            r7 = 0
            boolean r0 = r2.mo15292a(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x00a8
            r0 = 0
            r8.mo90821a(r0, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediAwemeListFragment.onResume():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo90845p() {
        int a = AwemeListFragmentImpl.m116350a(this.f93948l, this.f93948l, this.f93955s, this.f93950n);
        this.f93945i = C10803a.m31631a(getContext());
        DmtTextView a2 = AwemeListFragmentImpl.m116352a(getContext(), (int) R.string.c48);
        a2.setOnClickListener(new C35859ah(this));
        C10803a aVar = this.f93945i;
        if (aVar == null) {
            C7573i.m23580a();
        }
        aVar.mo25966c((View) a2);
        if (this.f93950n == 4) {
            AwemeListFragmentImpl.m116356a(getContext(), this.f93944h, this.f93945i, a);
        } else {
            try {
                if (!C6399b.m19944t() || !this.f93955s || this.f93950n != 1) {
                    if (!C6399b.m19944t() || this.f93955s || this.f93950n != 1) {
                        C10803a aVar2 = this.f93945i;
                        if (aVar2 == null) {
                            C7573i.m23580a();
                        }
                        aVar2.mo25963b((View) AwemeListFragmentImpl.m116352a(getContext(), a));
                    } else if (C43122ff.m136767b()) {
                        C10803a aVar3 = this.f93945i;
                        if (aVar3 == null) {
                            C7573i.m23580a();
                        }
                        aVar3.mo25963b((View) AwemeListFragmentImpl.m116352a(getContext(), a));
                    } else {
                        C10803a aVar4 = this.f93945i;
                        if (aVar4 == null) {
                            C7573i.m23580a();
                        }
                        aVar4.mo25963b((View) mo90823b(getContext(), false));
                    }
                } else if (C43122ff.m136767b()) {
                    C10803a aVar5 = this.f93945i;
                    if (aVar5 == null) {
                        C7573i.m23580a();
                    }
                    aVar5.mo25963b((View) AwemeListFragmentImpl.m116352a(getContext(), a));
                } else {
                    C23060u a3 = C23060u.m75742a();
                    C7573i.m23582a((Object) a3, "CommonSharePrefCache.inst()");
                    C22903bl e = a3.mo60075e();
                    C7573i.m23582a((Object) e, "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue");
                    Integer num = (Integer) e.mo59877d();
                    if (num != null) {
                        if (num.intValue() == 0) {
                            C10803a aVar6 = this.f93945i;
                            if (aVar6 == null) {
                                C7573i.m23580a();
                            }
                            aVar6.mo25963b((View) mo90813a(getContext(), false));
                        }
                    }
                    C10803a aVar7 = this.f93945i;
                    if (aVar7 == null) {
                        C7573i.m23580a();
                    }
                    aVar7.mo25963b((View) mo90813a(getContext(), true));
                }
            } catch (Exception unused) {
            }
        }
        DmtStatusView dmtStatusView = this.f93944h;
        if (dmtStatusView == null) {
            C7573i.m23580a();
        }
        dmtStatusView.setBuilder(this.f93945i);
    }

    /* renamed from: a */
    public final void mo90817a(C36341a aVar) {
        this.f93930G = aVar;
    }

    /* renamed from: f */
    public final void mo90834f(boolean z) {
        this.f93954r = z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m115695D();
    }

    /* renamed from: a */
    public static final /* synthetic */ JediAwemeAdapter m115700a(JediAwemeListFragment jediAwemeListFragment) {
        JediAwemeAdapter jediAwemeAdapter = jediAwemeListFragment.f93932J;
        if (jediAwemeAdapter == null) {
            C7573i.m23583a("mJediAwemeAdapter");
        }
        return jediAwemeAdapter;
    }

    /* renamed from: d_ */
    public final void mo90830d_(int i) {
        mo90838l().mo90881f(new C35853ab(i));
    }

    /* renamed from: i */
    private final int m115705i(String str) {
        IntRef intRef = new IntRef();
        intRef.element = -1;
        mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35864d<Object,Object>(intRef, str));
        return intRef.element;
    }

    /* renamed from: b */
    public final void mo90824b(int i) {
        RecyclerView recyclerView = this.f93943g;
        if (recyclerView != null) {
            C1282n recycledViewPool = recyclerView.getRecycledViewPool();
            if (recycledViewPool != null) {
                recycledViewPool.mo5821a(0, 12);
            }
        }
    }

    /* renamed from: c */
    public final void mo90827c(String str) {
        if (!isViewValid()) {
            this.f93959w = str;
        } else {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35855ad<Object,Object>(str));
        }
    }

    /* renamed from: c_ */
    public final void mo86064c_(boolean z) {
        this.f93937T = z;
        mo90838l().mo90881f(new C35858ag(z));
    }

    /* renamed from: d */
    public final void mo90828d(String str) {
        if (!isViewValid()) {
            this.f93960x = str;
        } else {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35884w<Object,Object>(str));
        }
    }

    /* renamed from: e */
    public final void mo90831e(String str) {
        if (!isViewValid()) {
            this.f93962z = str;
        } else {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35856ae<Object,Object>(str));
        }
    }

    /* renamed from: f */
    public final void mo90833f(String str) {
        if (!isViewValid()) {
            this.f93924A = str;
        } else {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35857af<Object,Object>(str));
        }
    }

    /* renamed from: g */
    public final void mo90836g(String str) {
        if (!isViewValid()) {
            this.f93926C = str;
        } else {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35852aa<Object,Object>(str));
        }
    }

    @C7709l
    public final void onDynamicEvent(C23660c cVar) {
        C7573i.m23587b(cVar, "event");
        if (cVar.f62378a == 0) {
            mo90821a(true, false);
        } else {
            mo90850v();
        }
    }

    /* renamed from: a */
    private void m115702a(JediAwemeVideoViewHolder jediAwemeVideoViewHolder) {
        C7573i.m23587b(jediAwemeVideoViewHolder, "holder");
        if (jediAwemeVideoViewHolder.mo69909u() != null) {
            if (this.f93929F && this.f93939V != null) {
                this.f93929F = false;
                mo90821a(false, false);
            }
            C6726a.m20843a(new C35872l(this, jediAwemeVideoViewHolder), C34943c.f91128x);
        }
    }

    /* renamed from: c */
    public final void mo86904c(boolean z) {
        if (this.f93949m != z) {
            this.f93949m = z;
            m115698G();
            DmtStatusView dmtStatusView = this.f93944h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25943g();
            }
        }
    }

    /* renamed from: d */
    public final void mo90829d(boolean z) {
        this.f93927D = z;
        if (isViewValid()) {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35885x<Object,Object>(this));
        }
    }

    /* renamed from: e */
    public final void mo90832e(boolean z) {
        this.f93956t = z;
        if (isAdded()) {
            mo90838l().mo90879a(z);
        }
    }

    @C7709l(mo20400a = ThreadMode.MAIN)
    public final void onUpdateWhoCanSeeMyLikeListModeEvent(C37897ax axVar) {
        C7573i.m23587b(axVar, "event");
        if (this.f93955s && TextUtils.equals(this.f95164O, C43105eq.m136725a(1))) {
            m115698G();
        }
        JediAwemeAdapter jediAwemeAdapter = this.f93932J;
        if (jediAwemeAdapter == null) {
            C7573i.m23583a("mJediAwemeAdapter");
        }
        if (jediAwemeAdapter.getItemCount() == 0) {
            DmtStatusView dmtStatusView = this.f93944h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25943g();
            }
        } else {
            DmtStatusView dmtStatusView2 = this.f93944h;
            if (dmtStatusView2 != null) {
                dmtStatusView2.setVisibility(4);
            }
        }
    }

    /* renamed from: b */
    public final void mo90825b(String str) {
        if (!isViewValid()) {
            this.f93958v = str;
        } else {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35854ac<Object,Object>(str));
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        boolean z2 = false;
        if (z) {
            if (C6399b.m19944t() && this.f93955s && TextUtils.equals(this.f95164O, C43105eq.m136725a(1))) {
                C23060u a = C23060u.m75742a();
                C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
                a.mo60074d().mo59871a(Boolean.valueOf(false));
            }
            mo90854z();
        }
        C24945an a2 = C24945an.m81853a();
        C7573i.m23582a((Object) a2, "StarLogHelper.getInstance()");
        if (mo90851w() == 0) {
            z2 = true;
        }
        a2.f65782a = z2;
        if (AwemeListFragmentImpl.m116370c(this.f93950n)) {
            mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35861aj<Object,Object>(z));
        }
    }

    /* renamed from: h */
    private final SpannableStringBuilder m115704h(boolean z) {
        int i;
        int i2;
        String str;
        if (z) {
            i = R.string.d79;
        } else {
            i = R.string.d7a;
        }
        String string = getString(i);
        C7573i.m23582a((Object) string, "if (isPrivate) getString…ile_public_nolikes_title)");
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("\n");
        String sb2 = sb.toString();
        if (z) {
            i2 = R.string.d78;
        } else {
            i2 = R.string.d7_;
        }
        String string2 = getString(i2);
        C7573i.m23582a((Object) string2, "if (isPrivate) getString…le_others_public_nolikes)");
        if (!C6399b.m19947w()) {
            StringBuilder sb3 = new StringBuilder("@");
            sb3.append(C43122ff.m136777h(this.f93947k));
            string2 = C1642a.m8034a(string2, Arrays.copyOf(new Object[]{sb3.toString()}, 1));
            C7573i.m23582a((Object) string2, "java.lang.String.format(format, *args)");
        } else if (this.f93947k != null) {
            User user = this.f93947k;
            String str2 = null;
            if (user != null) {
                str = user.getNickname();
            } else {
                str = null;
            }
            if (str != null) {
                Object[] objArr = new Object[1];
                StringBuilder sb4 = new StringBuilder("@");
                User user2 = this.f93947k;
                if (user2 != null) {
                    str2 = user2.getNickname();
                }
                sb4.append(str2);
                objArr[0] = sb4.toString();
                string2 = C1642a.m8034a(string2, Arrays.copyOf(objArr, 1));
                C7573i.m23582a((Object) string2, "java.lang.String.format(format, *args)");
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append(string2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb5.toString());
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, sb2.length() - 1, 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, sb2.length() - 1, 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a4z)), 0, sb2.length(), 18);
        return spannableStringBuilder;
    }

    @C7709l
    public final void onVideoEvent(C28318an anVar) {
        C1273i iVar;
        C1273i iVar2;
        C7573i.m23587b(anVar, "event");
        if (isViewValid() && !C36075k.f94317a.mo59240a()) {
            int i = anVar.f74631a;
            if (i == 2) {
                mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35870j<Object,Object>(this, anVar));
            } else if (i == 13) {
                mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35871k<Object,Object>(this, anVar));
            } else if (i != 15) {
                if (i == 21 && this.f93950n == anVar.f74637g) {
                    Object obj = anVar.f74632b;
                    if (!(obj instanceof Aweme)) {
                        obj = null;
                    }
                    Aweme aweme = (Aweme) obj;
                    if (aweme != null) {
                        int i2 = m115705i(aweme.getAid());
                        if (i2 != -1) {
                            RecyclerView recyclerView = this.f93943g;
                            if (recyclerView != null) {
                                iVar = recyclerView.getLayoutManager();
                            } else {
                                iVar = null;
                            }
                            if ((iVar instanceof C43371g) && AwemeListFragmentImpl.m116363a(this.f93943g, i2)) {
                                C42961az.m136380a(new C36435dv(this.f93955s));
                                RecyclerView recyclerView2 = this.f93943g;
                                if (recyclerView2 != null) {
                                    iVar2 = recyclerView2.getLayoutManager();
                                } else {
                                    iVar2 = null;
                                }
                                if (!(iVar2 instanceof C43371g)) {
                                    iVar2 = null;
                                }
                                C43371g gVar = (C43371g) iVar2;
                                if (gVar != null) {
                                    gVar.mo105243a(i2, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35869i<Object,Object>(this, anVar));
            }
        }
    }

    /* renamed from: b */
    public final void mo86903b(boolean z) {
        if (this.f93948l != z) {
            this.f93948l = z;
            m115698G();
            DmtStatusView dmtStatusView = this.f93944h;
            if (dmtStatusView != null) {
                dmtStatusView.mo25943g();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final DmtTextView mo90823b(Context context, boolean z) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context, R.style.ss));
        this.f93935R = z;
        dmtTextView.setGravity(17);
        dmtTextView.setText(m115704h(z));
        dmtTextView.setLineSpacing(C9738o.m28708b(context, 12.0f), 1.0f);
        if (context == null) {
            C7573i.m23580a();
        }
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a51));
        this.f93934Q = dmtTextView;
        return dmtTextView;
    }

    /* renamed from: c */
    private final void m115703c(Context context, boolean z) {
        if (this.f93934Q != null) {
            DmtTextView dmtTextView = this.f93934Q;
            if (dmtTextView == null) {
                C7573i.m23580a();
            }
            dmtTextView.setGravity(17);
            DmtTextView dmtTextView2 = this.f93934Q;
            if (dmtTextView2 == null) {
                C7573i.m23580a();
            }
            dmtTextView2.setText(m115704h(z));
            DmtTextView dmtTextView3 = this.f93934Q;
            if (dmtTextView3 == null) {
                C7573i.m23580a();
            }
            dmtTextView3.setLineSpacing(C9738o.m28708b(context, 12.0f), 1.0f);
            DmtTextView dmtTextView4 = this.f93934Q;
            if (dmtTextView4 == null) {
                C7573i.m23580a();
            }
            if (context == null) {
                C7573i.m23580a();
            }
            dmtTextView4.setTextColor(context.getResources().getColor(R.color.a51));
        }
    }

    /* renamed from: b */
    public final void mo90826b(String str, String str2) {
        if (!isViewValid()) {
            this.f93925B = str;
            this.f93962z = str2;
            return;
        }
        mo29066a((VM1) mo90838l(), (C7562b<? super S1, ? extends R>) new C35887z<Object,Object>(str, str2));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DmtTextView mo90813a(Context context, boolean z) {
        int i;
        int i2;
        int i3;
        Context context2 = context;
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(context2, R.style.ss));
        if (z) {
            i = R.string.d7h;
        } else {
            i = R.string.d7a;
        }
        String string = getString(i);
        C7573i.m23582a((Object) string, "if (isPrivate) getString…ile_public_nolikes_title)");
        if (z) {
            i2 = R.string.d7g;
        } else {
            i2 = R.string.d7j;
        }
        String string2 = getString(i2);
        C7573i.m23582a((Object) string2, "if (isPrivate) getString…file_self_public_nolikes)");
        if (z) {
            string2 = C1642a.m8034a(string2, Arrays.copyOf(new Object[]{getString(R.string.d7f)}, 1));
            C7573i.m23582a((Object) string2, "java.lang.String.format(format, *args)");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append("\n");
        sb.append(string2);
        CharSequence sb2 = sb.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(17, true), 0, string.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a4z)), 0, string.length(), 18);
        String string3 = getString(R.string.d7f);
        C7573i.m23582a((Object) string3, "getString(R.string.profi…lf_likes_settings_portal)");
        if (z) {
            i3 = 17;
            int a = C7634n.m23730a(sb2, string3, 0, false, 6, (Object) null);
            int length = string3.length() + a;
            if (a >= 0 && length >= 0) {
                spannableStringBuilder.setSpan(new C35862b(context2), a, length, 18);
                if (context2 == null) {
                    C7573i.m23580a();
                }
                spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.a4q)), a, length, 18);
            }
            dmtTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            i3 = 17;
        }
        dmtTextView.setGravity(i3);
        dmtTextView.setText(spannableStringBuilder);
        dmtTextView.setLineSpacing(C9738o.m28708b(context2, 12.0f), 1.0f);
        if (context2 == null) {
            C7573i.m23580a();
        }
        dmtTextView.setTextColor(context.getResources().getColor(R.color.a51));
        return dmtTextView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        TextView textView2;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        OnAnimatedScrollListenerForJedi onAnimatedScrollListenerForJedi = null;
        JediAwemeAdapter jediAwemeAdapter = new JediAwemeAdapter(this, null, 2, null);
        jediAwemeAdapter.mo66504a((C6905a) new C35875o(this));
        jediAwemeAdapter.registerAdapterDataObserver(new JediAwemeListFragment$onViewCreated$$inlined$apply$lambda$2(this));
        jediAwemeAdapter.mo66506d(R.string.am0);
        if (this.f93950n == 0 && C36073i.f94313a.mo85873b()) {
            jediAwemeAdapter.f67554u = new JediAwemeListFragment$onViewCreated$$inlined$apply$lambda$3(jediAwemeAdapter, this);
        }
        this.f93932J = jediAwemeAdapter;
        if (C6399b.m19946v()) {
            View view2 = getView();
            if (view2 == null) {
                C7573i.m23580a();
            }
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "context!!");
            view2.setBackgroundColor(context.getResources().getColor(R.color.aye));
        }
        RecyclerView recyclerView = this.f93943g;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
            recyclerView.setLayoutManager(new WrapGridLayoutManager((Context) getActivity(), 3, 1, false));
            JediAwemeAdapter jediAwemeAdapter2 = this.f93932J;
            if (jediAwemeAdapter2 == null) {
                C7573i.m23583a("mJediAwemeAdapter");
            }
            recyclerView.setAdapter(jediAwemeAdapter2);
            Context context2 = recyclerView.getContext();
            if (context2 == null) {
                C7573i.m23580a();
            }
            recyclerView.mo5525a((C1272h) new AmeDecoration((int) C9738o.m28708b(context2, 1.0f)));
        }
        if (C36075k.f94317a.mo59240a()) {
            View view3 = this.f93936S;
            if (view3 != null) {
                textView = (TextView) view3.findViewById(R.id.title);
            } else {
                textView = null;
            }
            if (!(textView instanceof TextView)) {
                textView = null;
            }
            if (textView != null) {
                textView.setText(R.string.e6j);
            }
            View view4 = this.f93936S;
            if (view4 != null) {
                textView2 = (TextView) view4.findViewById(R.id.a1q);
            } else {
                textView2 = null;
            }
            if (!(textView2 instanceof TextView)) {
                textView2 = null;
            }
            if (textView2 != null) {
                textView2.setText(R.string.e69);
            }
        }
        if (!C7188c.m22428a()) {
            onAnimatedScrollListenerForJedi = new OnAnimatedScrollListenerForJedi();
            RecyclerView recyclerView2 = this.f93943g;
            if (recyclerView2 != null) {
                recyclerView2.mo5528a((C1281m) onAnimatedScrollListenerForJedi);
            }
        }
        this.f93939V = new C25657a(this.f93943g, onAnimatedScrollListenerForJedi);
        RecyclerView recyclerView3 = this.f93943g;
        if (recyclerView3 != null) {
            C36074j.f94315a.buildBaseRecyclerView(recyclerView3, this);
        }
        ListMiddleware<AwemeListState, Object, C35968f> listMiddleware = mo90838l().f94022f;
        C11502e eVar = this;
        JediAwemeAdapter jediAwemeAdapter3 = this.f93932J;
        if (jediAwemeAdapter3 == null) {
            C7573i.m23583a("mJediAwemeAdapter");
        }
        ListMiddleware.m33938a(listMiddleware, eVar, jediAwemeAdapter3, false, false, new C35873m(new C35877q(this), new C35880s(this), new C35878r(this)), new C35874n(new C35881t(this), new C35882u(this), JediAwemeListFragment$onViewCreated$$inlined$ListListener$2.INSTANCE), new C35883v(this), new C35876p(this), null, null, 780, null);
        mo90840n();
    }

    /* renamed from: a */
    public final <S extends C11670t> C7321c mo29061a(JediViewModel<S> jediViewModel, C11672v<S> vVar, C7563m<? super C11585f, ? super S, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$subscribe");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34069a(this, jediViewModel, vVar, mVar);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(mo90839m(), viewGroup, false);
        this.f93943g = (RecyclerView) inflate.findViewById(R.id.ajd);
        this.f93944h = (DmtStatusView) inflate.findViewById(R.id.dav);
        this.f93933L = (ViewStub) inflate.findViewById(R.id.dcm);
        ViewStub viewStub = this.f93933L;
        if (viewStub == null) {
            C7573i.m23580a();
        }
        this.f93936S = viewStub.inflate();
        View view = this.f93936S;
        if (view == null) {
            C7573i.m23580a();
        }
        view.setVisibility(4);
        if (C6399b.m19944t()) {
            C23060u a = C23060u.m75742a();
            C7573i.m23582a((Object) a, "CommonSharePrefCache.inst()");
            C22903bl e = a.mo60075e();
            C7573i.m23582a((Object) e, "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue");
            Integer num = (Integer) e.mo59877d();
            if (num != null && num.intValue() == 0) {
                this.f93946j = AwemeListFragmentImpl.m116351a(inflate, this.f93955s, this.f95164O, false);
            } else {
                this.f93946j = AwemeListFragmentImpl.m116351a(inflate, this.f93955s, this.f95164O, true);
            }
        }
        mo90845p();
        RecyclerView recyclerView = this.f93943g;
        if (!(recyclerView instanceof FpsRecyclerView)) {
            recyclerView = null;
        }
        FpsRecyclerView fpsRecyclerView = (FpsRecyclerView) recyclerView;
        if (fpsRecyclerView != null) {
            fpsRecyclerView.setLabel("profile_list");
        }
        if (C36074j.f94315a.shouldUseRecyclerPartialUpdate()) {
            RecyclerView recyclerView2 = this.f93943g;
            if (recyclerView2 != null) {
                C1267f itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator != null) {
                    itemAnimator.f4940i = 0;
                }
            }
        }
        if (this.f93938U > 0) {
            RecyclerView recyclerView3 = this.f93943g;
            if (recyclerView3 != null) {
                recyclerView3.setPadding(0, 0, 0, this.f93938U);
            }
        }
        return inflate;
    }

    /* renamed from: a */
    public final <S extends C11670t, A> C7321c mo29062a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C11672v<C11675y<A>> vVar, C7563m<? super C11585f, ? super A, C7581n> mVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(mVar, "subscriber");
        return C11593a.m34070a(this, jediViewModel, lVar, vVar, mVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, A, B> C7321c mo29064a(JediViewModel<S> jediViewModel, C7599l<S, ? extends A> lVar, C7599l<S, ? extends B> lVar2, C11672v<C11676z<A, B>> vVar, C48006q<? super C11585f, ? super A, ? super B, C7581n> qVar) {
        C7573i.m23587b(jediViewModel, "$this$selectSubscribe");
        C7573i.m23587b(lVar, "prop1");
        C7573i.m23587b(lVar2, "prop2");
        C7573i.m23587b(vVar, "config");
        C7573i.m23587b(qVar, "subscriber");
        return C11593a.m34072a(this, jediViewModel, lVar, lVar2, vVar, qVar);
    }

    /* renamed from: a */
    public final <S extends C11670t, T> C7321c mo29063a(JediViewModel<S> jediViewModel, C7599l<S, ? extends C11491a<? extends T>> lVar, C11672v<C11675y<C11491a<T>>> vVar, C7563m<? super C11585f, ? super Throwable, C7581n> mVar, C7562b<? super C11585f, C7581n> bVar, C7563m<? super C11585f, ? super T, C7581n> mVar2) {
        C7573i.m23587b(jediViewModel, "$this$asyncSubscribe");
        C7573i.m23587b(lVar, "prop");
        C7573i.m23587b(vVar, "config");
        return C11593a.m34071a(this, jediViewModel, lVar, vVar, mVar, bVar, mVar2);
    }
}
