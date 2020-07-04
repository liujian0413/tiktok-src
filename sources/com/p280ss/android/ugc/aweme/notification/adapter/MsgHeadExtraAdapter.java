package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewLiveNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.util.C34614c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.MsgHeadExtraAdapter */
public final class MsgHeadExtraAdapter extends BaseAdapter<BaseNotice> implements C34396d {

    /* renamed from: a */
    public List<BaseNotice> f89773a;

    /* renamed from: b */
    public final C7561a<C7581n> f89774b;

    /* renamed from: c */
    private Dialog f89775c;

    /* renamed from: d */
    private final Fragment f89776d;

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.MsgHeadExtraAdapter$a */
    static final class C34389a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MsgHeadExtraAdapter f89777a;

        /* renamed from: b */
        final /* synthetic */ int f89778b;

        C34389a(MsgHeadExtraAdapter msgHeadExtraAdapter, int i) {
            this.f89777a = msgHeadExtraAdapter;
            this.f89778b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            try {
                int size = this.f89777a.f67539l.size();
                if (size > 0 && this.f89778b >= 0 && this.f89778b < size) {
                    BaseNotice baseNotice = (BaseNotice) this.f89777a.f67539l.get(this.f89778b);
                    if (baseNotice != null) {
                        MusNotificationApiManager.m111255a(baseNotice.getNid());
                    }
                    List<BaseNotice> list = this.f89777a.f89773a;
                    if (list != null) {
                        list.remove(this.f89777a.f67539l.get(this.f89778b));
                    }
                    this.f89777a.f67539l.remove(this.f89778b);
                    this.f89777a.notifyItemRemoved(this.f89778b);
                }
            } catch (Exception unused) {
            }
            dialogInterface.dismiss();
            Collection a = this.f89777a.mo62312a();
            if (a == null || a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f89777a.f89774b.invoke();
            }
        }
    }

    /* renamed from: b */
    public final void mo87671b(int i) {
        m111216c(i);
    }

    /* renamed from: a */
    public final void mo58045a(List<BaseNotice> list) {
        this.f89773a = list;
        super.mo58045a(list);
    }

    /* renamed from: c */
    private final void m111216c(int i) {
        Dialog dialog = this.f89775c;
        if (dialog == null || !dialog.isShowing()) {
            C25712a aVar = new C25712a(this.f89776d.getContext());
            String[] strArr = new String[1];
            Context context = this.f89776d.getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "mFragment.context!!");
            strArr[0] = context.getResources().getString(R.string.anl);
            aVar.mo66614a((CharSequence[]) strArr, (OnClickListener) new C34389a(this, i));
            this.f89775c = aVar.mo66610a();
            Dialog dialog2 = this.f89775c;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        BaseNotice baseNotice = (BaseNotice) mo62312a().get(i);
        if (baseNotice != null) {
            return baseNotice.getType();
        }
        return 0;
    }

    public MsgHeadExtraAdapter(Fragment fragment, C7561a<C7581n> aVar) {
        C7573i.m23587b(fragment, "mFragment");
        C7573i.m23587b(aVar, "onEmptyListener");
        this.f89776d = fragment;
        this.f89774b = aVar;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        MTBaseNotificationHolder mTBaseNotificationHolder;
        C7573i.m23587b(viewGroup, "parent");
        if (i == 50) {
            mTBaseNotificationHolder = new MusLiveRecommendAvatarNotificationHolder(m111214a((int) R.layout.af4, viewGroup, false));
        } else if (i != 1001) {
            mTBaseNotificationHolder = null;
        } else {
            mTBaseNotificationHolder = new MusNewLiveNotificationHolder(m111214a((int) R.layout.af3, viewGroup, false));
        }
        if (mTBaseNotificationHolder != null) {
            mTBaseNotificationHolder.f89661a = this;
        }
        if (mTBaseNotificationHolder != null) {
            return mTBaseNotificationHolder;
        }
        C1293v onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        C7573i.m23582a((Object) onCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        String b = C34614c.m111859b(((BaseNotice) mo62312a().get(i)).timeLineType);
        int a = mo58029a(i);
        if (a == 50) {
            m111215a("live", i, b);
            if (mo62312a().get(i) instanceof MusNotice) {
                if (vVar != null) {
                    MusLiveRecommendAvatarNotificationHolder musLiveRecommendAvatarNotificationHolder = (MusLiveRecommendAvatarNotificationHolder) vVar;
                    Object obj = mo62312a().get(i);
                    if (obj != null) {
                        musLiveRecommendAvatarNotificationHolder.mo87675a((MusNotice) obj, true);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice");
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MusLiveRecommendAvatarNotificationHolder");
                }
            }
        } else if (a == 1001) {
            m111215a("live", i, b);
            if (mo62312a().get(i) instanceof MusNotice) {
                if (vVar != null) {
                    MusNewLiveNotificationHolder musNewLiveNotificationHolder = (MusNewLiveNotificationHolder) vVar;
                    Object obj2 = mo62312a().get(i);
                    if (obj2 != null) {
                        musNewLiveNotificationHolder.mo87884a((MusNotice) obj2, true);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewLiveNotificationHolder");
            }
        }
    }

    /* renamed from: a */
    private static View m111214a(int i, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare… parent, attatchToParent)");
        return inflate;
    }

    /* renamed from: a */
    private static void m111215a(String str, int i, String str2) {
        C6907h.m21524a("notification_message_inner_message", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("account_type", str).mo59973a("client_order", String.valueOf(i)).mo59973a("timeline", str2).mo59973a("scene_id", "1002").f60753a);
    }
}
