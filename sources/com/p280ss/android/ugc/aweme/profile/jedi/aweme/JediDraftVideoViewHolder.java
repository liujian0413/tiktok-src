package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.internal.C11640h;
import com.bytedance.jedi.ext.adapter.C11679b;
import com.bytedance.jedi.ext.adapter.C11714g;
import com.bytedance.jedi.ext.adapter.C11714g.C11715a;
import com.bytedance.lighten.loader.SmartImageView;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseViewHolder;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediDraftVideoViewHolder */
public final class JediDraftVideoViewHolder extends JediBaseViewHolder<JediDraftVideoViewHolder, Object> {

    /* renamed from: g */
    static final /* synthetic */ C7595j[] f94090g = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediDraftVideoViewHolder.class), "mCover", "getMCover()Lcom/bytedance/lighten/loader/SmartImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(JediDraftVideoViewHolder.class), "awemeListViewModel", "getAwemeListViewModel()Lcom/ss/android/ugc/aweme/profile/jedi/aweme/JediAwemeListViewModel;"))};

    /* renamed from: j */
    public final Context f94091j;

    /* renamed from: k */
    private final C7541d f94092k;

    /* renamed from: l */
    private final C7541d f94093l;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediDraftVideoViewHolder$a */
    public static final class C35935a implements OnVideoCoverCallback {

        /* renamed from: a */
        final /* synthetic */ JediDraftVideoViewHolder f94094a;

        public final void onGetVideoCoverFailed(int i) {
        }

        C35935a(JediDraftVideoViewHolder jediDraftVideoViewHolder) {
            this.f94094a = jediDraftVideoViewHolder;
        }

        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
            C7573i.m23587b(bitmap, "bitmap");
            if (this.f94094a.mo62390p() != null) {
                this.f94094a.mo62390p().setImageBitmap(bitmap);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediDraftVideoViewHolder$b */
    static final class C35936b extends Lambda implements C7562b<AwemeDraftState, AwemeDraftState> {

        /* renamed from: a */
        final /* synthetic */ JediDraftVideoViewHolder f94095a;

        C35936b(JediDraftVideoViewHolder jediDraftVideoViewHolder) {
            this.f94095a = jediDraftVideoViewHolder;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AwemeDraftState invoke(AwemeDraftState awemeDraftState) {
            C7573i.m23587b(awemeDraftState, "$receiver");
            Object o = this.f94095a.mo29309o();
            if (o != null) {
                return awemeDraftState.copy((C27311c) o);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.AwemeDraft");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediDraftVideoViewHolder$c */
    static final class C35937c extends Lambda implements C7561a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ JediDraftVideoViewHolder f94096a;

        C35937c(JediDraftVideoViewHolder jediDraftVideoViewHolder) {
            this.f94096a = jediDraftVideoViewHolder;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public SmartImageView invoke() {
            return (SmartImageView) this.f94096a.itemView.findViewById(R.id.a4g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediDraftVideoViewHolder$d */
    static final class C35938d extends Lambda implements C7563m<JediDraftVideoViewHolder, C27311c, C7581n> {

        /* renamed from: a */
        public static final C35938d f94097a = new C35938d();

        C35938d() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m115870a((JediDraftVideoViewHolder) obj, (C27311c) obj2);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private static void m115870a(JediDraftVideoViewHolder jediDraftVideoViewHolder, C27311c cVar) {
            C7573i.m23587b(jediDraftVideoViewHolder, "$receiver");
            C7573i.m23587b(cVar, "it");
            jediDraftVideoViewHolder.mo90886a(cVar, jediDraftVideoViewHolder.getPosition());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediDraftVideoViewHolder$e */
    static final class C35939e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JediDraftVideoViewHolder f94098a;

        C35939e(JediDraftVideoViewHolder jediDraftVideoViewHolder) {
            this.f94098a = jediDraftVideoViewHolder;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94098a.mo69905q();
        }
    }

    /* renamed from: p */
    public final SmartImageView mo62390p() {
        return (SmartImageView) this.f94092k.getValue();
    }

    public final void bA_() {
        super.bA_();
        mo29062a(m115864r(), C35990r.f94171a, C11640h.m34110a(), C35938d.f94097a);
        mo62390p().setOnClickListener(new C35939e(this));
    }

    /* renamed from: r */
    private final JediAwemeDraftModel m115864r() {
        C7562b bVar = new C35936b(this);
        Class<JediAwemeDraftModel> cls = JediAwemeDraftModel.class;
        C11679b d = mo29218d();
        if (d != null) {
            C11714g a = C11715a.m34329a(mo29056f(), d.mo29232b());
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append('_');
            sb.append(cls.getName());
            JediViewModel jediViewModel = (JediViewModel) a.mo29268a(sb.toString(), cls);
            C11664n a2 = jediViewModel.f31065b.mo29189a(JediAwemeDraftModel.class);
            if (a2 != null) {
                a2.binding(jediViewModel);
            }
            jediViewModel.mo29034a(bVar);
            return (JediAwemeDraftModel) jediViewModel;
        }
        throw new IllegalStateException("proxy not bound to viewHolder yet");
    }

    /* renamed from: q */
    public final void mo69905q() {
        IAccountUserService f = C6861a.m21337f();
        C7573i.m23582a((Object) f, "AccountProxyService.userService()");
        if (!f.isLogin()) {
            Context context = this.f94091j;
            if (context != null) {
                C32656f.m105742a((Activity) context, "", "click_draft");
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
        IDraftService draftService = ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService();
        Context context2 = this.f94091j;
        if (context2 != null) {
            draftService.enterDraftBox((Activity) context2);
            C6907h.onEvent(MobClick.obtain().setEventName("click_draft").setLabelName("personal_homepage"));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* renamed from: a */
    public final void mo90886a(C27311c cVar, int i) {
        if (cVar != null) {
            C27312d.m89561a(cVar, new C35935a(this));
        }
        mo62390p().setContentDescription(this.f94091j.getString(R.string.d6j, new Object[]{Integer.valueOf(i + 1)}));
    }

    private JediDraftVideoViewHolder(ViewGroup viewGroup, Context context) {
        C7573i.m23587b(viewGroup, "parent");
        C7573i.m23587b(context, "mContext");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b33, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…draft_box, parent, false)");
        super(inflate);
        this.f94091j = context;
        this.f94092k = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C35937c(this));
        C7584c a = C7575l.m23595a(JediAwemeListViewModel.class);
        this.f94093l = C7546e.m23569a(new JediDraftVideoViewHolder$$special$$inlined$hostViewModel$1(this, a, a));
    }

    public /* synthetic */ JediDraftVideoViewHolder(ViewGroup viewGroup, Context context, int i, C7571f fVar) {
        Context context2 = viewGroup.getContext();
        C7573i.m23582a((Object) context2, "parent.context");
        this(viewGroup, context2);
    }
}
