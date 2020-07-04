package com.p280ss.android.ugc.aweme.notification.adapter;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p280ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter */
public class NotificationAdapter extends BaseAdapter<BaseNotice> implements C34396d {

    /* renamed from: a */
    protected Dialog f89799a;

    /* renamed from: b */
    public C34390a f89800b;

    /* renamed from: c */
    public List<BaseNotice> f89801c;

    /* renamed from: d */
    private int f89802d;

    /* renamed from: e */
    private Activity f89803e;

    /* renamed from: f */
    private int f89804f;

    /* renamed from: g */
    private String f89805g;

    /* renamed from: h */
    private Map<String, BaseNotice> f89806h = new HashMap(this.f89804f);

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.NotificationAdapter$a */
    public interface C34390a {
        /* renamed from: a */
        void mo87683a(int i);
    }

    /* renamed from: f */
    public void mo87682f() {
        this.f89804f = 0;
    }

    /* renamed from: j */
    private void mo87825j() {
        if (this.f89799a != null && this.f89799a.isShowing()) {
            C34402j.m111252a(this.f89799a);
        }
    }

    /* renamed from: b */
    public final void mo87671b(int i) {
        mo87680c(i);
    }

    /* renamed from: b */
    public final void mo61577b(List<BaseNotice> list) {
        super.mo61577b(mo87681e(list));
    }

    /* renamed from: a */
    public final void mo58045a(List<BaseNotice> list) {
        this.f89801c = list;
        super.mo58045a(mo87681e(list));
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        this.f67550q = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        C1293v a_ = super.mo61886a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        if (C6399b.m19944t()) {
            dmtTextView.setText(R.string.dvr);
        } else {
            dmtTextView.setText(R.string.bnk);
        }
        DmtStatusView dmtStatusView = (DmtStatusView) a_.itemView;
        dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) dmtTextView));
        return a_;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo87680c(int i) {
        if (this.f89799a == null || !this.f89799a.isShowing()) {
            C25712a aVar = new C25712a(this.f89803e);
            aVar.mo66614a((CharSequence[]) new String[]{this.f89803e.getResources().getString(R.string.anl)}, (OnClickListener) new C34401i(this, i));
            this.f89799a = aVar.mo66610a();
            this.f89799a.show();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public List<BaseNotice> mo87681e(List<BaseNotice> list) {
        mo87825j();
        ArrayList arrayList = new ArrayList();
        for (BaseNotice baseNotice : list) {
            if (this.f89802d == 0) {
                if (baseNotice.getFollowNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 1) {
                if (baseNotice.getDiggNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 2) {
                if (baseNotice.getAtMe() != null || baseNotice.getDuetNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 4) {
                if (baseNotice.getAnnouncement() != null || baseNotice.getChallengeNotice() != null || baseNotice.getTextNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 62) {
                if (baseNotice.getTcmNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 5) {
                if (baseNotice.getTextNotice() != null || baseNotice.getAnnouncement() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 10) {
                if (baseNotice.getAnnouncement() != null || baseNotice.getChallengeNotice() != null || baseNotice.getTextNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 7) {
                if (baseNotice.getAdHelperNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (this.f89802d == 11) {
                if (baseNotice.getFriendNotice() != null) {
                    arrayList.add(baseNotice);
                }
            } else if (baseNotice.getCommentNotice() != null || baseNotice.getVoteNotice() != null) {
                arrayList.add(baseNotice);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C1293v mo58032a(ViewGroup viewGroup, int i) {
        BaseNotificationHolder baseNotificationHolder;
        if (this.f89802d == 0) {
            baseNotificationHolder = new FansNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a04, viewGroup, false), this.f89803e);
        } else if (this.f89802d == 1) {
            baseNotificationHolder = new LikeNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a06, viewGroup, false), this.f89803e);
        } else if (this.f89802d == 2) {
            baseNotificationHolder = new AtMeNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a07, viewGroup, false), this.f89803e);
        } else if (this.f89802d == 11) {
            baseNotificationHolder = new FriendRecommendNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a05, viewGroup, false), this.f89803e);
        } else if (this.f89802d == 4 || this.f89802d == 5 || this.f89802d == 7 || this.f89802d == 62 || this.f89802d == 10) {
            baseNotificationHolder = new DouYinHelperHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a02, viewGroup, false), this.f89803e, this.f89802d, false);
        } else {
            baseNotificationHolder = new CommentNotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a01, viewGroup, false), this.f89803e);
        }
        if (baseNotificationHolder.mo87643a()) {
            baseNotificationHolder.f89661a = this;
        }
        return baseNotificationHolder;
    }

    /* renamed from: a */
    public void mo58033a(C1293v vVar, int i) {
        boolean z;
        if (i > this.f89804f - 1) {
            z = true;
        } else {
            z = false;
        }
        BaseNotice baseNotice = (BaseNotice) this.f67539l.get(i);
        if (!z && this.f89806h.get(baseNotice.getNid()) != null) {
            z = true;
        }
        if (this.f89802d == 0) {
            ((FansNotificationHolder) vVar).mo87651a(this.f89806h, baseNotice, z, this.f89805g);
        } else if (this.f89802d == 1) {
            ((LikeNotificationHolder) vVar).mo87651a(this.f89806h, baseNotice, z, this.f89805g);
        } else if (this.f89802d == 2) {
            ((AtMeNotificationHolder) vVar).mo87651a(this.f89806h, baseNotice, z, this.f89805g);
        } else if (this.f89802d == 11) {
            ((FriendRecommendNotificationHolder) vVar).mo87651a(this.f89806h, baseNotice, z, this.f89805g);
        } else if (this.f89802d == 4 || this.f89802d == 5 || this.f89802d == 7 || this.f89802d == 62 || this.f89802d == 10) {
            ((DouYinHelperHolder) vVar).mo87651a(this.f89806h, baseNotice, z, this.f89805g);
        } else {
            if (this.f89802d == 3) {
                ((CommentNotificationHolder) vVar).mo87651a(this.f89806h, baseNotice, z, this.f89805g);
            }
        }
    }

    /* renamed from: a */
    public final void mo87679a(User user, int i) {
        if (this.f89802d == 0 || this.f89802d == 11) {
            int i2 = 0;
            if (this.f89802d == 0) {
                while (i2 < this.f67539l.size()) {
                    FollowNotice followNotice = ((BaseNotice) this.f67539l.get(i2)).getFollowNotice();
                    if (!(followNotice == null || followNotice.getUser() == null || !TextUtils.equals(followNotice.getUser().getUid(), user.getUid()))) {
                        followNotice.getUser().setFollowStatus(i);
                        notifyItemChanged(i2);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < this.f67539l.size()) {
                FriendNotice friendNotice = ((BaseNotice) this.f67539l.get(i2)).getFriendNotice();
                if (friendNotice == null || friendNotice.getUser() == null || !TextUtils.equals(friendNotice.getUser().getUid(), user.getUid())) {
                    i2++;
                } else {
                    friendNotice.getUser().setFollowStatus(i);
                    notifyItemChanged(i2);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo87678a(int i, DialogInterface dialogInterface, int i2) {
        int size = this.f67539l.size();
        if (size > 0 && i >= 0 && i < size) {
            BaseNotice baseNotice = (BaseNotice) this.f67539l.get(i);
            if (baseNotice != null) {
                NoticeApiManager.m111260a(baseNotice.getNid());
            }
            if (!C6307b.m19566a((Collection<T>) this.f89801c)) {
                this.f89801c.remove(baseNotice);
            }
            this.f67539l.remove(i);
            notifyItemRemoved(i);
            this.f89800b.mo87683a(this.f89801c.size());
        }
        dialogInterface.dismiss();
    }

    public NotificationAdapter(int i, Activity activity, int i2, String str) {
        this.f89802d = i;
        this.f89803e = activity;
        this.f89804f = Math.max(0, i2);
        this.f89805g = str;
    }
}
