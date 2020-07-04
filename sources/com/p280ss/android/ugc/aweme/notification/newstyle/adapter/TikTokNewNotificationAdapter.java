package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34360i;
import com.p280ss.android.ugc.aweme.notification.C34380a;
import com.p280ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder;
import com.p280ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.adapter.NotificationAdapter;
import com.p280ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTTitleHeadHolder;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.collections.C7506ac;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.TikTokNewNotificationAdapter */
public final class TikTokNewNotificationAdapter extends NotificationAdapter {

    /* renamed from: d */
    public int f90031d;

    /* renamed from: e */
    private final int f90032e = ((int) C9738o.m28708b((Context) this.f90033f, 8.0f));

    /* renamed from: f */
    private final Activity f90033f;

    /* renamed from: g */
    private final String f90034g;

    /* renamed from: h */
    private final int f90035h;

    /* renamed from: i */
    private final int f90036i;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.TikTokNewNotificationAdapter$a */
    static final class C34510a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TikTokNewNotificationAdapter f90037a;

        /* renamed from: b */
        final /* synthetic */ int f90038b;

        C34510a(TikTokNewNotificationAdapter tikTokNewNotificationAdapter, int i) {
            this.f90037a = tikTokNewNotificationAdapter;
            this.f90038b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            int size = this.f90037a.f67539l.size();
            if (size > 0 && this.f90038b >= 0 && this.f90038b < size) {
                BaseNotice baseNotice = (BaseNotice) this.f90037a.f67539l.get(this.f90038b);
                if (baseNotice != null) {
                    NoticeApiManager.m111260a(baseNotice.getNid());
                }
                BaseNotice baseNotice2 = (BaseNotice) this.f90037a.f67539l.get(this.f90038b);
                if (baseNotice2.timeLineType == 0) {
                    this.f90037a.f90031d--;
                }
                List list = this.f90037a.f89801c;
                if (list != null) {
                    list.remove(baseNotice2);
                }
                this.f90037a.f67539l.remove(this.f90038b);
                if (this.f90037a.mo87825j()) {
                    this.f90037a.notifyDataSetChanged();
                } else {
                    this.f90037a.notifyItemRemoved(this.f90038b);
                }
                this.f90037a.f89800b.mo87683a(this.f90037a.f89801c.size());
            }
            dialogInterface.dismiss();
        }
    }

    /* renamed from: j */
    public final boolean mo87825j() {
        if (C6307b.m19566a((Collection<T>) this.f67539l)) {
            return false;
        }
        if (this.f67539l.size() != 1) {
            int size = this.f67539l.size() - 2;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    if (!(this.f67539l.get(i) instanceof C34360i) || !(this.f67539l.get(i + 1) instanceof C34360i)) {
                        if (i == size) {
                            break;
                        }
                        i++;
                    } else {
                        this.f67539l.remove(i);
                        if (i == 0 && ((BaseNotice) this.f67539l.get(i)).timeLineType == 5) {
                            this.f67539l.remove(i);
                        }
                        return true;
                    }
                }
            }
            return false;
        } else if (!(this.f67539l.get(0) instanceof C34360i)) {
            return false;
        } else {
            this.f67539l.remove(0);
            return true;
        }
    }

    /* renamed from: f */
    public final void mo87682f() {
        this.f90031d = C34315c.m110974a(this.f90035h);
        if (this.f90031d > 0) {
            int i = this.f90036i;
            if (!(i == 7 || i == 10 || i == 62)) {
                switch (i) {
                    case 4:
                    case 5:
                        break;
                    default:
                        C42961az.m136380a(new C34314g(this.f90035h, 0));
                        C42961az.m136380a(new C34380a(this.f90035h, 0));
                        break;
                }
            }
        }
    }

    /* renamed from: e */
    public final List<BaseNotice> mo87681e(List<? extends BaseNotice> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        List<BaseNotice> e = super.mo87681e(list);
        C7573i.m23582a((Object) e, "data");
        m111611f(e);
        return e;
    }

    /* renamed from: e */
    private final boolean m111610e(int i) {
        if (i > 0) {
            Iterable a = C7551d.m23563a(i - 1, 0);
            Collection arrayList = new ArrayList(C7525m.m23469a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add((BaseNotice) this.f67539l.get(((C7506ac) it).mo19392a()));
            }
            for (BaseNotice baseNotice : (List) arrayList) {
                if (baseNotice instanceof C34360i) {
                    if (baseNotice.timeLineType == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    private final void m111611f(List<BaseNotice> list) {
        int i = this.f90031d;
        int i2 = 0;
        for (BaseNotice baseNotice : list) {
            if (i > 0) {
                baseNotice.timeLineType = 0;
                i--;
            } else {
                baseNotice.timeLineType = 5;
            }
            baseNotice.clientOrder = i2;
            i2++;
        }
        if (this.f90031d > 0) {
            list.add(0, new C34360i(0));
            int size = list.size() - 1;
            while (size >= 0 && ((BaseNotice) list.get(size)).timeLineType != 0) {
                int i3 = ((BaseNotice) list.get(size)).timeLineType;
                if (size == 0) {
                    list.add(i, new C34360i(i3));
                } else if (i3 != ((BaseNotice) list.get(size - 1)).timeLineType) {
                    list.add(size, new C34360i(i3));
                }
                size--;
            }
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        BaseNotice baseNotice = (BaseNotice) mo62312a().get(i);
        if (baseNotice == null) {
            return 0;
        }
        if (baseNotice instanceof C34360i) {
            return 999;
        }
        if (baseNotice.getVoteNotice() != null) {
            return 20;
        }
        if (this.f90036i != 2 || baseNotice.getDuetNotice() == null) {
            return this.f90036i;
        }
        return 21;
    }

    /* renamed from: c */
    public final void mo87680c(int i) {
        Dialog dialog = this.f89799a;
        if (dialog == null || !dialog.isShowing()) {
            C25712a aVar = new C25712a(this.f90033f);
            aVar.mo66614a((CharSequence[]) new String[]{this.f90033f.getResources().getString(R.string.anl)}, (OnClickListener) new C34510a(this, i));
            this.f89799a = aVar.mo66610a();
            Dialog dialog2 = this.f89799a;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p029v7.widget.RecyclerView.C1293v mo58032a(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C7573i.m23587b(r6, r0)
            r0 = 7
            r1 = 0
            if (r7 == r0) goto L_0x008f
            r0 = 10
            if (r7 == r0) goto L_0x008f
            r0 = 62
            if (r7 == r0) goto L_0x008f
            r0 = 999(0x3e7, float:1.4E-42)
            if (r7 == r0) goto L_0x007f
            switch(r7) {
                case 0: goto L_0x006f;
                case 1: goto L_0x005f;
                case 2: goto L_0x004f;
                case 3: goto L_0x003f;
                case 4: goto L_0x008f;
                case 5: goto L_0x008f;
                default: goto L_0x0018;
            }
        L_0x0018:
            switch(r7) {
                case 20: goto L_0x002f;
                case 21: goto L_0x001e;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = 0
            goto L_0x00b0
        L_0x001e:
            r0 = 2131494468(0x7f0c0644, float:1.8612445E38)
            android.view.View r0 = m111608a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder r1 = new com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
            goto L_0x00b0
        L_0x002f:
            r0 = 2131494478(0x7f0c064e, float:1.8612466E38)
            android.view.View r0 = m111608a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder r1 = new com.ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
            goto L_0x00b0
        L_0x003f:
            r0 = 2131494463(0x7f0c063f, float:1.8612435E38)
            android.view.View r0 = m111608a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder r1 = new com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
            goto L_0x00b0
        L_0x004f:
            r0 = 2131494461(0x7f0c063d, float:1.8612431E38)
            android.view.View r0 = m111608a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder r1 = new com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
            goto L_0x00b0
        L_0x005f:
            r0 = 2131494473(0x7f0c0649, float:1.8612455E38)
            android.view.View r0 = m111608a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder r1 = new com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
            goto L_0x00b0
        L_0x006f:
            r0 = 2131494470(0x7f0c0646, float:1.861245E38)
            android.view.View r0 = m111608a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder r1 = new com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
            goto L_0x00b0
        L_0x007f:
            r0 = 2131494477(0x7f0c064d, float:1.8612463E38)
            android.view.View r0 = m111608a(r0, r6, r1)
            com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTTitleHeadHolder r1 = new com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTTitleHeadHolder
            r1.<init>(r0)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
            goto L_0x00b0
        L_0x008f:
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r2 = 2131493867(0x7f0c03eb, float:1.8611226E38)
            android.view.View r0 = r0.inflate(r2, r6, r1)
            java.lang.String r1 = "LayoutInflater.from(pare…elper_new, parent, false)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder r1 = new com.ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder
            android.app.Activity r2 = r5.f90033f
            int r3 = r5.f90036i
            r4 = 1
            r1.<init>(r0, r2, r3, r4)
            r0 = r1
            android.support.v7.widget.RecyclerView$v r0 = (android.support.p029v7.widget.RecyclerView.C1293v) r0
        L_0x00b0:
            if (r0 == 0) goto L_0x00be
            boolean r1 = r0 instanceof com.p280ss.android.ugc.aweme.notification.adapter.BaseNotificationHolder
            if (r1 == 0) goto L_0x00be
            r1 = r0
            com.ss.android.ugc.aweme.notification.adapter.BaseNotificationHolder r1 = (com.p280ss.android.ugc.aweme.notification.adapter.BaseNotificationHolder) r1
            r2 = r5
            com.ss.android.ugc.aweme.notification.adapter.d r2 = (com.p280ss.android.ugc.aweme.notification.adapter.C34396d) r2
            r1.f89661a = r2
        L_0x00be:
            if (r0 != 0) goto L_0x00c9
            android.support.v7.widget.RecyclerView$v r0 = super.mo58032a(r6, r7)
            java.lang.String r6 = "super.onCreateBasicViewHolder(parent, viewType)"
            kotlin.jvm.internal.C7573i.m23582a(r0, r6)
        L_0x00c9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.adapter.TikTokNewNotificationAdapter.mo58032a(android.view.ViewGroup, int):android.support.v7.widget.RecyclerView$v");
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int i2;
        if (vVar instanceof MTTitleHeadHolder) {
            MTTitleHeadHolder mTTitleHeadHolder = (MTTitleHeadHolder) vVar;
            Object obj = mo62312a().get(i);
            if (obj != null) {
                mTTitleHeadHolder.mo87878a((C34360i) obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTitle");
        }
        if (vVar != null) {
            View view = vVar.itemView;
            C7573i.m23582a((Object) view, "holder.itemView");
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                int i3 = marginLayoutParams.leftMargin;
                if (i == 0) {
                    i2 = this.f90032e;
                } else {
                    i2 = 0;
                }
                marginLayoutParams.setMargins(i3, i2, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        int a = mo58029a(i);
        if (!(a == 7 || a == 10 || a == 62)) {
            switch (a) {
                case 0:
                    if (vVar != null) {
                        MTNewFansNotificationHolder mTNewFansNotificationHolder = (MTNewFansNotificationHolder) vVar;
                        Object obj2 = mo62312a().get(i);
                        C7573i.m23582a(obj2, "data[position]");
                        mTNewFansNotificationHolder.mo87874a((BaseNotice) obj2, true, null, this.f90034g);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder");
                case 1:
                    if (vVar != null) {
                        MTNewLikesNotificationHolder mTNewLikesNotificationHolder = (MTNewLikesNotificationHolder) vVar;
                        Object obj3 = mo62312a().get(i);
                        C7573i.m23582a(obj3, "data[position]");
                        mTNewLikesNotificationHolder.mo87875a((BaseNotice) obj3, true, m111610e(i), (String) null, this.f90034g);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder");
                case 2:
                    if (vVar != null) {
                        MTNewMentionNotificationHolder mTNewMentionNotificationHolder = (MTNewMentionNotificationHolder) vVar;
                        Object obj4 = mo62312a().get(i);
                        C7573i.m23582a(obj4, "data[position]");
                        mTNewMentionNotificationHolder.mo87876a((BaseNotice) obj4, true, null, this.f90034g);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder");
                case 3:
                    if (vVar != null) {
                        MTNewCommentsNotificationHolder mTNewCommentsNotificationHolder = (MTNewCommentsNotificationHolder) vVar;
                        Object obj5 = mo62312a().get(i);
                        C7573i.m23582a(obj5, "data[position]");
                        mTNewCommentsNotificationHolder.mo87872a((BaseNotice) obj5, true, null, this.f90034g);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder");
                case 4:
                case 5:
                    break;
                default:
                    switch (a) {
                        case 20:
                            m111609a("pollsticker", i, String.valueOf(((BaseNotice) mo62312a().get(i)).timeLineType));
                            if (vVar != null) {
                                MTVoteNotificationHolder mTVoteNotificationHolder = (MTVoteNotificationHolder) vVar;
                                Object obj6 = mo62312a().get(i);
                                C7573i.m23582a(obj6, "data[position]");
                                mTVoteNotificationHolder.mo87670a((BaseNotice) obj6, true, m111610e(i), null, this.f90034g);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder");
                        case 21:
                            if (vVar != null) {
                                MTNewDuetNotificationHolder mTNewDuetNotificationHolder = (MTNewDuetNotificationHolder) vVar;
                                Object obj7 = mo62312a().get(i);
                                C7573i.m23582a(obj7, "data[position]");
                                mTNewDuetNotificationHolder.mo87873a((BaseNotice) obj7, true);
                                return;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder");
                        default:
                            super.mo58033a(vVar, i);
                            return;
                    }
            }
        }
        if (vVar != null) {
            ((DouYinHelperHolder) vVar).mo87641a((BaseNotice) mo62312a().get(i), true, this.f90034g);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.DouYinHelperHolder");
    }

    /* renamed from: a */
    private static View m111608a(int i, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare… parent, attatchToParent)");
        return inflate;
    }

    /* renamed from: a */
    private static void m111609a(String str, int i, String str2) {
        C6907h.m21524a("notification_message_inner_message", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("account_type", str).mo59973a("client_order", String.valueOf(i)).mo59973a("timeline", str2).mo59973a("scene_id", "1002").f60753a);
    }

    public TikTokNewNotificationAdapter(Activity activity, String str, int i, int i2, int i3) {
        C7573i.m23587b(activity, "mFragment");
        C7573i.m23587b(str, "enterFrom");
        super(i2, activity, i3, str);
        this.f90033f = activity;
        this.f90034g = str;
        this.f90035h = i;
        this.f90036i = i2;
        this.f90031d = i3;
    }
}
