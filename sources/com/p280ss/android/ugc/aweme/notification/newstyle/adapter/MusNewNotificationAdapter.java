package com.p280ss.android.ugc.aweme.notification.newstyle.adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.message.p1392a.C33213d;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.TutorialVideoResp;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34360i;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34362j;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.RoomInfo;
import com.p280ss.android.ugc.aweme.notification.adapter.C34396d;
import com.p280ss.android.ugc.aweme.notification.adapter.MTBaseNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.adapter.MusAdHelperNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.adapter.MusFriendNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.adapter.MusLiveRecommendAvatarNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.C34558c;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MTTitleHeadHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusMixedFollowRequestHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewApproveFollowNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewAssistantNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCheckProfileNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCreateAwemeNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewLiveNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTcmNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTextNotificationHolder;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewholder.MusTutorialVideoHolder;
import com.p280ss.android.ugc.aweme.notification.util.C34614c;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32269d;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.collections.C7506ac;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.MusNewNotificationAdapter */
public final class MusNewNotificationAdapter extends BaseAdapter<MusNotice> implements C34396d {

    /* renamed from: d */
    public static final C34507a f90010d = new C34507a(null);

    /* renamed from: a */
    public List<MusNotice> f90011a;

    /* renamed from: b */
    public int f90012b;

    /* renamed from: c */
    public final C7561a<C7581n> f90013c;

    /* renamed from: e */
    private Dialog f90014e;

    /* renamed from: f */
    private MusNotice f90015f;

    /* renamed from: g */
    private MusNotice f90016g;

    /* renamed from: h */
    private C34558c f90017h;

    /* renamed from: i */
    private int f90018i = 36;

    /* renamed from: j */
    private boolean f90019j = true;

    /* renamed from: k */
    private int f90020k;

    /* renamed from: w */
    private LinearLayoutManager f90021w;

    /* renamed from: x */
    private final Fragment f90022x;

    /* renamed from: y */
    private final String f90023y;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.MusNewNotificationAdapter$a */
    public static final class C34507a {
        private C34507a() {
        }

        public /* synthetic */ C34507a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.adapter.MusNewNotificationAdapter$b */
    static final class C34508b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNewNotificationAdapter f90024a;

        /* renamed from: b */
        final /* synthetic */ int f90025b;

        C34508b(MusNewNotificationAdapter musNewNotificationAdapter, int i) {
            this.f90024a = musNewNotificationAdapter;
            this.f90025b = i;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            int size = this.f90024a.f67539l.size();
            if (size > 0 && this.f90025b >= 0 && this.f90025b < size) {
                MusNotice musNotice = (MusNotice) this.f90024a.f67539l.get(this.f90025b);
                if (musNotice != null) {
                    MusNotificationApiManager.m111255a(musNotice.getNid());
                }
                List<MusNotice> list = this.f90024a.f90011a;
                if (list != null) {
                    list.remove(this.f90024a.f67539l.get(this.f90025b));
                }
                this.f90024a.f67539l.remove(this.f90025b);
                if (this.f90024a.mo87822f()) {
                    this.f90024a.notifyDataSetChanged();
                } else {
                    this.f90024a.notifyItemRemoved(this.f90025b);
                }
            }
            dialogInterface.dismiss();
            Collection a = this.f90024a.mo62312a();
            if (a == null || a.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f90024a.f90013c.invoke();
            }
        }
    }

    /* renamed from: a */
    public final void mo58045a(List<MusNotice> list) {
        this.f90011a = list;
        if (list == null || list.size() <= 0) {
            super.mo58045a(m111582e(list));
        } else {
            super.mo58045a(m111582e(m111583f(list)));
        }
        m111588k();
    }

    /* renamed from: a */
    public final void mo87819a(List<User> list, int i, int i2) {
        C7573i.m23587b(list, "list");
        this.f90020k = i2;
        if (i == 0) {
            this.f90017h = null;
        } else {
            C34558c cVar = new C34558c();
            cVar.setType(13);
            cVar.f90153b = list;
            cVar.f90152a = i;
            this.f90017h = cVar;
        }
        super.mo58045a(m111582e(mo62312a()));
    }

    /* renamed from: j */
    private final void m111587j() {
        Dialog dialog = this.f90014e;
        if (dialog != null && dialog.isShowing()) {
            C34511a.m111619a(dialog);
        }
    }

    /* renamed from: k */
    private final void m111588k() {
        Integer num;
        LinearLayoutManager linearLayoutManager = this.f90021w;
        if (linearLayoutManager != null) {
            num = Integer.valueOf(linearLayoutManager.mo5447l());
        } else {
            num = null;
        }
        if (num != null && num.intValue() >= 0) {
            int i = 0;
            int intValue = num.intValue();
            if (intValue >= 0) {
                while (true) {
                    mo87821e(i);
                    if (i == intValue) {
                        break;
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: f */
    public final boolean mo87822f() {
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
                        if (i == 0 && ((MusNotice) this.f67539l.get(i)).timeLineType == 5) {
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

    /* renamed from: b */
    public final void mo87671b(int i) {
        m111584f(i);
    }

    /* renamed from: c */
    public final void mo87820c(int i) {
        boolean z;
        this.f90018i = i;
        if (this.f90018i == 36) {
            z = true;
        } else {
            z = false;
        }
        this.f90019j = z;
    }

    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f90021w = null;
    }

    /* renamed from: b */
    public final void mo61577b(List<? extends MusNotice> list) {
        if (list != null) {
            super.mo61577b(m111582e(m111583f(list)));
        } else {
            super.mo61577b(m111582e(list));
        }
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                this.f90021w = (LinearLayoutManager) layoutManager;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* renamed from: e */
    private final List<MusNotice> m111582e(List<? extends MusNotice> list) {
        C34558c cVar = this.f90017h;
        MusNotice musNotice = this.f90015f;
        MusNotice musNotice2 = this.f90016g;
        List<MusNotice> arrayList = new ArrayList<>();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (arrayList.size() > 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((MusNotice) arrayList.get(size)).getType() == 50 || ((MusNotice) arrayList.get(size)).getType() == 13 || ((MusNotice) arrayList.get(size)).getType() == 1000) {
                    arrayList.remove(size);
                }
            }
        }
        if (musNotice2 != null && this.f90019j) {
            arrayList.add(0, musNotice2);
        }
        if (musNotice != null && this.f90019j) {
            arrayList.add(0, musNotice);
        }
        if (cVar != null && this.f90019j) {
            arrayList.add(0, cVar);
        }
        return arrayList;
    }

    /* renamed from: f */
    private final void m111584f(int i) {
        Dialog dialog = this.f90014e;
        if (dialog == null || !dialog.isShowing()) {
            C25712a aVar = new C25712a(this.f90022x.getContext());
            String[] strArr = new String[1];
            Context context = this.f90022x.getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) context, "mFragment.context!!");
            strArr[0] = context.getResources().getString(R.string.anl);
            aVar.mo66614a((CharSequence[]) strArr, (OnClickListener) new C34508b(this, i));
            this.f90014e = aVar.mo66610a();
            Dialog dialog2 = this.f90014e;
            if (dialog2 != null) {
                dialog2.show();
            }
        }
    }

    /* renamed from: g */
    private final boolean m111586g(int i) {
        if (i > 0) {
            Iterable a = C7551d.m23563a(i - 1, 0);
            Collection arrayList = new ArrayList(C7525m.m23469a(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                arrayList.add((MusNotice) this.f67539l.get(((C7506ac) it).mo19392a()));
            }
            for (MusNotice musNotice : (List) arrayList) {
                if (musNotice instanceof C34360i) {
                    if (musNotice.timeLineType == 0) {
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        int i2;
        MusNotice musNotice = (MusNotice) mo62312a().get(i);
        if (musNotice == null) {
            i2 = 0;
        } else if (musNotice instanceof C34360i) {
            return 999;
        } else {
            if ((musNotice.getType() == 1 || musNotice.getType() == 11) && musNotice.getAnnouncement() != null) {
                AnnouncementNotice announcement = musNotice.getAnnouncement();
                C7573i.m23582a((Object) announcement, "notice.announcement");
                if (announcement.getChallenge() != null) {
                    i2 = BaseNotice.HASHTAG;
                }
            }
            return musNotice.getType();
        }
        return i2;
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        int c = C0683b.m2912c(viewGroup.getContext(), R.color.a53);
        this.f67550q = c;
        C1293v a_ = super.mo61886a_(viewGroup);
        DmtTextView dmtTextView = new DmtTextView(viewGroup.getContext());
        dmtTextView.setGravity(17);
        dmtTextView.setTextColor(c);
        dmtTextView.setTextSize(13.0f);
        dmtTextView.setText(R.string.bnk);
        View view = a_.itemView;
        if (view != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25963b((View) dmtTextView));
            C7573i.m23582a((Object) a_, "superFooterHolder");
            return a_;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
    }

    /* renamed from: g */
    private final void m111585g(List<MusNotice> list) {
        int i = this.f90012b;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        for (MusNotice musNotice : list) {
            int type = musNotice.getType();
            if (type == 13) {
                i4++;
                musNotice.timeLineType = 0;
            } else if (type != 50) {
                switch (type) {
                    case 1000:
                        i4++;
                        musNotice.timeLineType = 0;
                        break;
                    case 1001:
                        i3++;
                        musNotice.timeLineType = 0;
                        break;
                    default:
                        if (i2 <= 0) {
                            musNotice.timeLineType = C32269d.m104787a(musNotice.getCreateTime() * 1000);
                            break;
                        } else {
                            musNotice.timeLineType = 0;
                            i2--;
                            break;
                        }
                }
            } else {
                i4++;
                musNotice.timeLineType = 0;
            }
        }
        if (i3 > 0 || this.f90012b > 0) {
            list.add(i4, new C34360i(0));
        }
        int size = list.size() - 1;
        while (size >= 0 && ((MusNotice) list.get(size)).timeLineType != 0) {
            int i5 = ((MusNotice) list.get(size)).timeLineType;
            if (size == 0) {
                list.add(i2, new C34360i(i5));
            } else if (i5 != ((MusNotice) list.get(size - 1)).timeLineType) {
                list.add(size, new C34360i(i5));
            }
            size--;
        }
    }

    /* renamed from: a */
    public final void mo87817a(TutorialVideoResp tutorialVideoResp) {
        MusNotice musNotice = new MusNotice(null, null, null, null, null, null, null, 127, null);
        musNotice.setTutorialVideo(tutorialVideoResp);
        musNotice.setType(1000);
        this.f90016g = musNotice;
        super.mo58045a(m111582e(mo62312a()));
    }

    /* renamed from: e */
    public final void mo87821e(int i) {
        if (i >= 0 && i < mo62312a().size() && mo58029a(i) == 1001) {
            try {
                LiveNotice liveNotice = ((MusNotice) mo62312a().get(i)).getLiveNotice();
                if (liveNotice != null) {
                    User user = liveNotice.getUser();
                    if (user != null) {
                        RoomInfo roomInfo = liveNotice.getRoomInfo();
                        if (roomInfo != null) {
                            long roomId = roomInfo.getRoomId();
                            LogHelper logHelper = (LogHelper) ServiceManager.get().getService(LogHelper.class);
                            String uid = user.getUid();
                            C7573i.m23582a((Object) uid, "user.uid");
                            logHelper.logLiveShow(uid, roomId, "message", "live_cell", user.getRequestId(), i - 1, true, "");
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r3 == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r3.getLiveNotice() != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r3.getTutorialVideo() != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (r3.getTcmNotice() != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r3 == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ae, code lost:
        if (r3 == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r3.getFollowNotice() != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c4, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d2, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00df, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00ec, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f3, code lost:
        if (r3.getFollowRequestNotice() != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010c, code lost:
        if (r3 == false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0117, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x011e, code lost:
        if (r3.getTextNotice() != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0125, code lost:
        if (r3.getAnnouncement() != null) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0127, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0129, code lost:
        if (r5 != null) goto L_0x0127;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> m111583f(java.util.List<? extends com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> r9) {
        /*
            r8 = this;
            r8.m111587j()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r9 = r9.iterator()
        L_0x0017:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0133
            java.lang.Object r2 = r9.next()
            r3 = r2
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r3
            int r4 = r3.getType()
            r5 = 0
            r6 = 0
            r7 = 1
            switch(r4) {
                case 1: goto L_0x0121;
                case 2: goto L_0x011a;
                case 6: goto L_0x010f;
                case 9: goto L_0x00f6;
                case 11: goto L_0x0121;
                case 12: goto L_0x011a;
                case 13: goto L_0x00ef;
                case 21: goto L_0x00e2;
                case 22: goto L_0x00d5;
                case 23: goto L_0x00c8;
                case 24: goto L_0x00ba;
                case 33: goto L_0x00b2;
                case 41: goto L_0x0096;
                case 45: goto L_0x0088;
                case 50: goto L_0x006e;
                case 61: goto L_0x0066;
                case 1000: goto L_0x005e;
                case 1001: goto L_0x0056;
                case 1002: goto L_0x003a;
                default: goto L_0x002e;
            }
        L_0x002e:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice r3 = r3.getCommentNotice()
            if (r3 == 0) goto L_0x0129
            com.ss.android.ugc.aweme.comment.model.Comment r5 = r3.getComment()
            goto L_0x0129
        L_0x003a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice r3 = r3.getCheckProfileNotice()
            if (r3 == 0) goto L_0x0044
            java.util.List r5 = r3.getUsers()
        L_0x0044:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0051
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            goto L_0x0052
        L_0x0051:
            r3 = 1
        L_0x0052:
            if (r3 != 0) goto L_0x012c
            goto L_0x0127
        L_0x0056:
            com.ss.android.ugc.aweme.notice.repo.list.bean.LiveNotice r3 = r3.getLiveNotice()
            if (r3 == 0) goto L_0x012c
            goto L_0x0127
        L_0x005e:
            com.ss.android.ugc.aweme.notice.repo.TutorialVideoResp r3 = r3.getTutorialVideo()
            if (r3 == 0) goto L_0x012c
            goto L_0x0127
        L_0x0066:
            com.ss.android.ugc.aweme.notice.repo.list.bean.n r3 = r3.getTcmNotice()
            if (r3 == 0) goto L_0x012c
            goto L_0x0127
        L_0x006e:
            com.ss.android.ugc.aweme.notice.repo.list.bean.j r3 = r3.getRecommendAvatars()
            if (r3 == 0) goto L_0x0076
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r5 = r3.f89551a
        L_0x0076:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x0083
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r3 = 0
            goto L_0x0084
        L_0x0083:
            r3 = 1
        L_0x0084:
            if (r3 != 0) goto L_0x012c
            goto L_0x0127
        L_0x0088:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe r3 = r3.getAtMe()
            if (r3 == 0) goto L_0x0092
            com.ss.android.ugc.aweme.profile.model.User r5 = r3.getUser()
        L_0x0092:
            if (r5 == 0) goto L_0x012c
            goto L_0x0127
        L_0x0096:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice r3 = r3.getDiggNotice()
            if (r3 == 0) goto L_0x00a0
            java.util.List r5 = r3.getUsers()
        L_0x00a0:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x00ad
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r3 = 0
            goto L_0x00ae
        L_0x00ad:
            r3 = 1
        L_0x00ae:
            if (r3 != 0) goto L_0x012c
            goto L_0x0127
        L_0x00b2:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice r3 = r3.getFollowNotice()
            if (r3 == 0) goto L_0x012c
            goto L_0x0127
        L_0x00ba:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice r3 = r3.getFriendNotice()
            if (r3 == 0) goto L_0x00c4
            com.ss.android.ugc.aweme.profile.model.User r5 = r3.getUser()
        L_0x00c4:
            if (r5 == 0) goto L_0x012c
            goto L_0x0127
        L_0x00c8:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice r3 = r3.getFollowApproveNotice()
            if (r3 == 0) goto L_0x00d2
            com.ss.android.ugc.aweme.profile.model.User r5 = r3.getUser()
        L_0x00d2:
            if (r5 == 0) goto L_0x012c
            goto L_0x0127
        L_0x00d5:
            com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice r3 = r3.getPostNotice()
            if (r3 == 0) goto L_0x00df
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.getAweme()
        L_0x00df:
            if (r5 == 0) goto L_0x012c
            goto L_0x0127
        L_0x00e2:
            com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice r3 = r3.getDuetNotice()
            if (r3 == 0) goto L_0x00ec
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.getAweme()
        L_0x00ec:
            if (r5 == 0) goto L_0x012c
            goto L_0x0127
        L_0x00ef:
            com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestNotice r3 = r3.getFollowRequestNotice()
            if (r3 == 0) goto L_0x012c
            goto L_0x0127
        L_0x00f6:
            com.ss.android.ugc.aweme.notice.repo.list.bean.o r3 = r3.getVoteNotice()
            if (r3 == 0) goto L_0x00fe
            java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r5 = r3.f89568a
        L_0x00fe:
            java.util.Collection r5 = (java.util.Collection) r5
            if (r5 == 0) goto L_0x010b
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto L_0x0109
            goto L_0x010b
        L_0x0109:
            r3 = 0
            goto L_0x010c
        L_0x010b:
            r3 = 1
        L_0x010c:
            if (r3 != 0) goto L_0x012c
            goto L_0x0127
        L_0x010f:
            com.ss.android.ugc.aweme.notice.repo.list.bean.a r3 = r3.getAdHelperNotice()
            if (r3 == 0) goto L_0x0117
            java.lang.String r5 = r3.f89517a
        L_0x0117:
            if (r5 == 0) goto L_0x012c
            goto L_0x0127
        L_0x011a:
            com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice r3 = r3.getTextNotice()
            if (r3 == 0) goto L_0x012c
            goto L_0x0127
        L_0x0121:
            com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice r3 = r3.getAnnouncement()
            if (r3 == 0) goto L_0x012c
        L_0x0127:
            r6 = 1
            goto L_0x012c
        L_0x0129:
            if (r5 == 0) goto L_0x012c
            goto L_0x0127
        L_0x012c:
            if (r6 == 0) goto L_0x0017
            r1.add(r2)
            goto L_0x0017
        L_0x0133:
            java.util.List r1 = (java.util.List) r1
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r9 = r1.iterator()
        L_0x013b:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x014e
            java.lang.Object r1 = r9.next()
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r1 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) r1
            r2.add(r1)
            goto L_0x013b
        L_0x014e:
            r8.m111585g(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.adapter.MusNewNotificationAdapter.m111583f(java.util.List):java.util.List");
    }

    /* renamed from: a */
    public final void mo87818a(C34362j jVar) {
        boolean z;
        if (jVar != null) {
            Collection collection = jVar.f89551a;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                MusNotice musNotice = new MusNotice(null, null, null, null, null, null, null, 127, null);
                musNotice.setRecommendAvatars(jVar);
                musNotice.setType(50);
                musNotice.setCreateTime(9223372036854775806L);
                this.f90015f = musNotice;
                ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logLiveMergeShow("message", false);
                super.mo58045a(m111582e(mo62312a()));
            }
        }
        this.f90015f = null;
        super.mo58045a(m111582e(mo62312a()));
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        MTBaseNotificationHolder mTBaseNotificationHolder;
        C7573i.m23587b(viewGroup, "parent");
        switch (i) {
            case 1:
            case 12:
                mTBaseNotificationHolder = new MusNewAssistantNotificationHolder(m111580a((int) R.layout.af5, viewGroup, false), false);
                break;
            case 2:
            case 11:
                mTBaseNotificationHolder = new MusNewTextNotificationHolder(m111580a((int) R.layout.af5, viewGroup, false));
                break;
            case 6:
                mTBaseNotificationHolder = new MusAdHelperNotificationHolder(m111580a((int) R.layout.aeo, viewGroup, false));
                break;
            case 9:
                mTBaseNotificationHolder = new MTVoteNotificationHolder(m111580a((int) R.layout.af7, viewGroup, false));
                break;
            case 13:
                mTBaseNotificationHolder = new MusMixedFollowRequestHolder(m111580a((int) R.layout.af0, viewGroup, false), this.f90022x);
                break;
            case 21:
                mTBaseNotificationHolder = new MTNewDuetNotificationHolder(m111580a((int) R.layout.aex, viewGroup, false));
                break;
            case 22:
                mTBaseNotificationHolder = new MusNewCreateAwemeNotificationHolder(m111580a((int) R.layout.aet, viewGroup, false));
                break;
            case 23:
                mTBaseNotificationHolder = new MusNewApproveFollowNotificationHolder(m111580a((int) R.layout.aep, viewGroup, false));
                break;
            case 24:
                mTBaseNotificationHolder = new MusFriendNotificationHolder(m111580a((int) R.layout.aey, viewGroup, false));
                break;
            case 31:
                mTBaseNotificationHolder = new MTNewCommentsNotificationHolder(m111580a((int) R.layout.aes, viewGroup, false));
                break;
            case 33:
                mTBaseNotificationHolder = new MTNewFansNotificationHolder(m111580a((int) R.layout.aez, viewGroup, false));
                break;
            case BaseNotice.LIKE /*41*/:
                mTBaseNotificationHolder = new MTNewLikesNotificationHolder(m111580a((int) R.layout.af2, viewGroup, false));
                break;
            case BaseNotice.f89516AT /*45*/:
                mTBaseNotificationHolder = new MTNewMentionNotificationHolder(m111580a((int) R.layout.aeq, viewGroup, false));
                break;
            case 50:
                mTBaseNotificationHolder = new MusLiveRecommendAvatarNotificationHolder(m111580a((int) R.layout.af4, viewGroup, false));
                break;
            case BaseNotice.TCM /*61*/:
                mTBaseNotificationHolder = new MusNewTcmNotificationHolder(m111580a((int) R.layout.af5, viewGroup, false), this.f90022x);
                break;
            case BaseNotice.HASHTAG /*101*/:
                mTBaseNotificationHolder = new MusNewAssistantNotificationHolder(m111580a((int) R.layout.af5, viewGroup, false), true);
                break;
            case 999:
                mTBaseNotificationHolder = new MTTitleHeadHolder(m111580a((int) R.layout.af6, viewGroup, false));
                break;
            case 1000:
                mTBaseNotificationHolder = new MusTutorialVideoHolder(m111580a((int) R.layout.a08, viewGroup, false));
                break;
            case 1001:
                mTBaseNotificationHolder = new MusNewLiveNotificationHolder(m111580a((int) R.layout.af3, viewGroup, false));
                break;
            case 1002:
                mTBaseNotificationHolder = new MusNewCheckProfileNotificationHolder(m111580a((int) R.layout.aer, viewGroup, false));
                break;
            default:
                mTBaseNotificationHolder = null;
                break;
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
        if (vVar instanceof MTTitleHeadHolder) {
            MTTitleHeadHolder mTTitleHeadHolder = (MTTitleHeadHolder) vVar;
            Object obj = mo62312a().get(i);
            if (obj != null) {
                mTTitleHeadHolder.mo87878a((C34360i) obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeTitle");
        }
        String b = C34614c.m111859b(((MusNotice) mo62312a().get(i)).timeLineType);
        boolean z = false;
        switch (mo58029a(i)) {
            case 1:
            case 12:
                if (vVar != null) {
                    MusNewAssistantNotificationHolder musNewAssistantNotificationHolder = (MusNewAssistantNotificationHolder) vVar;
                    Object obj2 = mo62312a().get(i);
                    C7573i.m23582a(obj2, "data[position]");
                    musNewAssistantNotificationHolder.mo87881a((BaseNotice) obj2, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewAssistantNotificationHolder");
            case 2:
            case 11:
                if (vVar != null) {
                    MusNewTextNotificationHolder musNewTextNotificationHolder = (MusNewTextNotificationHolder) vVar;
                    Object obj3 = mo62312a().get(i);
                    C7573i.m23582a(obj3, "data[position]");
                    musNewTextNotificationHolder.mo87886a((BaseNotice) obj3, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTextNotificationHolder");
            case 6:
                if (vVar != null) {
                    ((MusAdHelperNotificationHolder) vVar).mo87673a((MusNotice) mo62312a().get(i), true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MusAdHelperNotificationHolder");
            case 9:
                m111581a("pollsticker", i, b);
                if (vVar != null) {
                    MTVoteNotificationHolder mTVoteNotificationHolder = (MTVoteNotificationHolder) vVar;
                    Object obj4 = mo62312a().get(i);
                    C7573i.m23582a(obj4, "data[position]");
                    mTVoteNotificationHolder.mo87670a((BaseNotice) obj4, true, m111586g(i), C34614c.m111858a(this.f90018i), this.f90023y);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MTVoteNotificationHolder");
            case 13:
                if (vVar != null) {
                    MusMixedFollowRequestHolder musMixedFollowRequestHolder = (MusMixedFollowRequestHolder) vVar;
                    Object obj5 = mo62312a().get(i);
                    if (obj5 != null) {
                        musMixedFollowRequestHolder.mo87879a((C34558c) obj5, this.f90020k);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.model.MusMixedFollowRequestNotice");
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusMixedFollowRequestHolder");
            case 21:
                m111581a("duet", i, b);
                if (vVar != null) {
                    MTNewDuetNotificationHolder mTNewDuetNotificationHolder = (MTNewDuetNotificationHolder) vVar;
                    Object obj6 = mo62312a().get(i);
                    C7573i.m23582a(obj6, "data[position]");
                    mTNewDuetNotificationHolder.mo87873a((BaseNotice) obj6, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewDuetNotificationHolder");
            case 22:
                m111581a("create_aweme", i, b);
                if (vVar != null) {
                    MusNewCreateAwemeNotificationHolder musNewCreateAwemeNotificationHolder = (MusNewCreateAwemeNotificationHolder) vVar;
                    Object obj7 = mo62312a().get(i);
                    C7573i.m23582a(obj7, "data[position]");
                    musNewCreateAwemeNotificationHolder.mo87883a((MusNotice) obj7, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCreateAwemeNotificationHolder");
            case 23:
                if (vVar != null) {
                    MusNewApproveFollowNotificationHolder musNewApproveFollowNotificationHolder = (MusNewApproveFollowNotificationHolder) vVar;
                    Object obj8 = mo62312a().get(i);
                    C7573i.m23582a(obj8, "data[position]");
                    musNewApproveFollowNotificationHolder.mo87880a((MusNotice) obj8, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewApproveFollowNotificationHolder");
            case 24:
                m111581a("friend", i, b);
                if (vVar != null) {
                    ((MusFriendNotificationHolder) vVar).mo87674a((MusNotice) mo62312a().get(i), true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MusFriendNotificationHolder");
            case 31:
                if (vVar != null) {
                    MTNewCommentsNotificationHolder mTNewCommentsNotificationHolder = (MTNewCommentsNotificationHolder) vVar;
                    Object obj9 = mo62312a().get(i);
                    C7573i.m23582a(obj9, "data[position]");
                    mTNewCommentsNotificationHolder.mo87872a((BaseNotice) obj9, true, C34614c.m111858a(this.f90018i), this.f90023y);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewCommentsNotificationHolder");
            case 33:
                if (vVar != null) {
                    MTNewFansNotificationHolder mTNewFansNotificationHolder = (MTNewFansNotificationHolder) vVar;
                    Object obj10 = mo62312a().get(i);
                    C7573i.m23582a(obj10, "data[position]");
                    mTNewFansNotificationHolder.mo87874a((BaseNotice) obj10, true, C34614c.m111858a(this.f90018i), this.f90023y);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewFansNotificationHolder");
            case BaseNotice.LIKE /*41*/:
                if (vVar != null) {
                    MTNewLikesNotificationHolder mTNewLikesNotificationHolder = (MTNewLikesNotificationHolder) vVar;
                    Object obj11 = mo62312a().get(i);
                    C7573i.m23582a(obj11, "data[position]");
                    mTNewLikesNotificationHolder.mo87875a((BaseNotice) obj11, true, m111586g(i), C34614c.m111858a(this.f90018i), this.f90023y);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewLikesNotificationHolder");
            case BaseNotice.f89516AT /*45*/:
                if (vVar != null) {
                    MTNewMentionNotificationHolder mTNewMentionNotificationHolder = (MTNewMentionNotificationHolder) vVar;
                    Object obj12 = mo62312a().get(i);
                    C7573i.m23582a(obj12, "data[position]");
                    mTNewMentionNotificationHolder.mo87876a((BaseNotice) obj12, true, C34614c.m111858a(this.f90018i), this.f90023y);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MTNewMentionNotificationHolder");
            case 50:
                m111581a("live", i, b);
                if (vVar != null) {
                    ((MusLiveRecommendAvatarNotificationHolder) vVar).mo87675a((MusNotice) mo62312a().get(i), true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.adapter.MusLiveRecommendAvatarNotificationHolder");
            case BaseNotice.TCM /*61*/:
                if (vVar != null) {
                    MusNewTcmNotificationHolder musNewTcmNotificationHolder = (MusNewTcmNotificationHolder) vVar;
                    Object obj13 = mo62312a().get(i);
                    C7573i.m23582a(obj13, "data[position]");
                    BaseNotice baseNotice = (BaseNotice) obj13;
                    if (C33213d.m107132a().mo85008c(61) <= 0) {
                        z = true;
                    }
                    musNewTcmNotificationHolder.mo87885a(baseNotice, z);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewTcmNotificationHolder");
            case BaseNotice.HASHTAG /*101*/:
                m111581a("tag", i, b);
                if (vVar != null) {
                    MusNewAssistantNotificationHolder musNewAssistantNotificationHolder2 = (MusNewAssistantNotificationHolder) vVar;
                    Object obj14 = mo62312a().get(i);
                    C7573i.m23582a(obj14, "data[position]");
                    musNewAssistantNotificationHolder2.mo87881a((BaseNotice) obj14, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewAssistantNotificationHolder");
            case 1000:
                if (vVar != null) {
                    MusTutorialVideoHolder musTutorialVideoHolder = (MusTutorialVideoHolder) vVar;
                    Object obj15 = mo62312a().get(i);
                    C7573i.m23582a(obj15, "data[position]");
                    musTutorialVideoHolder.mo87887a((MusNotice) obj15, false);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusTutorialVideoHolder");
                }
            case 1001:
                m111581a("live", i, b);
                if (vVar != null) {
                    MusNewLiveNotificationHolder musNewLiveNotificationHolder = (MusNewLiveNotificationHolder) vVar;
                    Object obj16 = mo62312a().get(i);
                    C7573i.m23582a(obj16, "data[position]");
                    musNewLiveNotificationHolder.mo87884a((MusNotice) obj16, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewLiveNotificationHolder");
            case 1002:
                m111581a("check_profile", i, b);
                if (vVar != null) {
                    MusNewCheckProfileNotificationHolder musNewCheckProfileNotificationHolder = (MusNewCheckProfileNotificationHolder) vVar;
                    Object obj17 = mo62312a().get(i);
                    C7573i.m23582a(obj17, "data[position]");
                    musNewCheckProfileNotificationHolder.mo87882a((MusNotice) obj17, true);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.newstyle.viewholder.MusNewCheckProfileNotificationHolder");
        }
    }

    public MusNewNotificationAdapter(Fragment fragment, String str, C7561a<C7581n> aVar) {
        C7573i.m23587b(fragment, "mFragment");
        C7573i.m23587b(str, "enterFrom");
        C7573i.m23587b(aVar, "onEmptyListener");
        this.f90022x = fragment;
        this.f90023y = str;
        this.f90013c = aVar;
    }

    /* renamed from: a */
    private static View m111580a(int i, ViewGroup viewGroup, boolean z) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare… parent, attatchToParent)");
        return inflate;
    }

    /* renamed from: a */
    private final void m111581a(String str, int i, String str2) {
        C6907h.m21524a("notification_message_inner_message", (Map) C22984d.m75611a().mo59973a("action_type", "show").mo59973a("account_type", str).mo59973a("client_order", String.valueOf(i)).mo59973a("tab_name", C34614c.m111858a(this.f90018i)).mo59973a("timeline", str2).mo59973a("scene_id", "1002").f60753a);
    }
}
