package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.arch.lifecycle.C0043i;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationMemberListViewModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.BaseSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.viewholder.RelationMemberSelectViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C48006q;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter */
public final class RelationMemberSelectListAdapter extends BaseSelectListAdapter<IMContact> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f83031a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(RelationMemberSelectListAdapter.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/model/RelationMemberListViewModel;"))};

    /* renamed from: b */
    private final C7541d f83032b;

    /* renamed from: e */
    private C48006q<? super Integer, ? super Integer, ? super View, C7581n> f83033e = new C31726a(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter$a */
    static final class C31726a extends Lambda implements C48006q<Integer, Integer, View, C7581n> {

        /* renamed from: a */
        final /* synthetic */ RelationMemberSelectListAdapter f83034a;

        C31726a(RelationMemberSelectListAdapter relationMemberSelectListAdapter) {
            this.f83034a = relationMemberSelectListAdapter;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m103040a(((Number) obj).intValue(), ((Number) obj2).intValue(), (View) obj3);
            return C7581n.f20898a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
            if (r6 == null) goto L_0x003b;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m103040a(int r4, int r5, android.view.View r6) {
            /*
                r3 = this;
                java.lang.String r0 = "view"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                switch(r4) {
                    case 0: goto L_0x000a;
                    case 1: goto L_0x000a;
                    case 2: goto L_0x000a;
                    default: goto L_0x0008;
                }
            L_0x0008:
                goto L_0x0095
            L_0x000a:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r4 = r3.f83034a
                java.lang.Object r4 = r4.mo80344b(r5)
                com.ss.android.ugc.aweme.im.service.model.IMContact r4 = (com.p280ss.android.ugc.aweme.p313im.service.model.IMContact) r4
                if (r4 == 0) goto L_0x0095
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r6 = r3.f83034a
                boolean r6 = r6.mo82515a(r4)
                if (r6 == 0) goto L_0x0094
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r6 = r3.f83034a
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r6 = r6.mo82516k()
                r0 = 0
                if (r6 == 0) goto L_0x002a
                boolean r6 = r6.mo82588m()
                goto L_0x002b
            L_0x002a:
                r6 = 0
            L_0x002b:
                if (r6 == 0) goto L_0x0088
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r6 = r3.f83034a
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r6 = r6.mo82516k()
                if (r6 == 0) goto L_0x003b
                java.util.List r6 = r6.mo82590o()
                if (r6 != 0) goto L_0x003f
            L_0x003b:
                java.util.List r6 = kotlin.collections.C7525m.m23461a()
            L_0x003f:
                boolean r1 = r6.contains(r4)
                if (r1 != 0) goto L_0x0077
                int r6 = r6.size()
                r1 = 10
                if (r6 < r1) goto L_0x0077
                boolean r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19945u()
                if (r4 == 0) goto L_0x0057
                r4 = 2131823944(0x7f110d48, float:1.9280702E38)
                goto L_0x005a
            L_0x0057:
                r4 = 2131823945(0x7f110d49, float:1.9280704E38)
            L_0x005a:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r5 = r3.f83034a
                android.content.Context r5 = r5.f82978c
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r6 = r3.f83034a
                android.content.Context r6 = r6.f82978c
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2[r0] = r1
                java.lang.String r4 = r6.getString(r4, r2)
                com.bytedance.ies.dmt.ui.c.a r4 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31410e(r5, r4)
                r4.mo25750a()
                goto L_0x0095
            L_0x0077:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r6 = r3.f83034a
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r6 = r6.mo82516k()
                if (r6 == 0) goto L_0x0082
                r6.mo82586a(r4)
            L_0x0082:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r4 = r3.f83034a
                r4.notifyItemChanged(r5)
                goto L_0x0095
            L_0x0088:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationMemberSelectListAdapter r5 = r3.f83034a
                com.ss.android.ugc.aweme.im.sdk.relations.model.RelationMemberListViewModel r5 = r5.mo82516k()
                if (r5 == 0) goto L_0x0094
                r5.mo82586a(r4)
                goto L_0x0095
            L_0x0094:
                return
            L_0x0095:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationMemberSelectListAdapter.C31726a.m103040a(int, int, android.view.View):void");
        }
    }

    /* renamed from: k */
    public final RelationMemberListViewModel mo82516k() {
        return (RelationMemberListViewModel) this.f83032b.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C48006q<Integer, Integer, View, C7581n> mo81805l() {
        return this.f83033e;
    }

    public RelationMemberSelectListAdapter(C0043i iVar) {
        C7573i.m23587b(iVar, "owner");
        super(iVar);
        C7584c a = C7575l.m23595a(RelationMemberListViewModel.class);
        this.f83032b = C7546e.m23569a(new C31727x36d4eaef(a, iVar, a));
    }

    /* renamed from: a */
    public final boolean mo82515a(IMContact iMContact) {
        IMUser a = C6961d.m21661a(iMContact);
        boolean z = false;
        if (a != null) {
            if (C7573i.m23585a((Object) a.getUid(), (Object) C7074e.m22069b().toString()) || a.getFollowStatus() == 2) {
                return true;
            }
            RelationMemberListViewModel k = mo82516k();
            if (k != null) {
                SharePackage sharePackage = k.f83131d;
                if (sharePackage != null) {
                    String str = sharePackage.f20181g;
                    int hashCode = str.hashCode();
                    if (hashCode != -913038159) {
                        if (hashCode != 102340) {
                            if (hashCode == 110986 && str.equals("pic")) {
                                C9738o.m28693a(C6399b.m19921a(), (int) R.string.bnq);
                                return z;
                            }
                        } else if (str.equals("gif")) {
                            C9738o.m28693a(C6399b.m19921a(), (int) R.string.bj6);
                            return z;
                        }
                    } else if (str.equals("story_video")) {
                        C9738o.m28693a(C6399b.m19921a(), (int) R.string.bnr);
                        return z;
                    }
                }
            }
            return false;
        }
        z = true;
        return z;
    }

    /* renamed from: b */
    public final BaseSelectViewHolder<IMContact> mo81803b(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "parent");
        return new RelationMemberSelectViewHolder<>(viewGroup);
    }
}
