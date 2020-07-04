package com.p280ss.android.ugc.aweme.forward.adapter;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.comment.list.C24183i;
import com.p280ss.android.ugc.aweme.comment.list.C24186l;
import com.p280ss.android.ugc.aweme.comment.list.C24188n;
import com.p280ss.android.ugc.aweme.comment.list.C24189o;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.services.CommentService.C24217a;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.C28297e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.BaseFollowViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowImageViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.FollowVideoViewHolder;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21745c;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21747e;
import com.p280ss.android.ugc.aweme.forward.model.DetailAdapterBean;
import com.p280ss.android.ugc.aweme.forward.p1272vh.BaseForwardViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardImageViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardTextViewHolder;
import com.p280ss.android.ugc.aweme.forward.p1272vh.ForwardVideoViewHolder;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.story.api.C41974f;
import com.p280ss.android.ugc.aweme.story.api.userstory.C41982b;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.forward.adapter.FeedDetailAdapter */
public class FeedDetailAdapter extends BaseAdapter<DetailAdapterBean> implements C0053p<C41982b>, C21745c {

    /* renamed from: A */
    private BaseForwardViewHolder f78452A;

    /* renamed from: B */
    private RecyclerView f78453B;

    /* renamed from: C */
    private HashMap<Long, Long> f78454C = new HashMap<>();

    /* renamed from: D */
    private C41974f f78455D;

    /* renamed from: a */
    public C21747e f78456a;

    /* renamed from: b */
    public C24090a f78457b;

    /* renamed from: c */
    public C21743a f78458c;

    /* renamed from: d */
    protected C28297e f78459d;

    /* renamed from: e */
    public C21744b f78460e;

    /* renamed from: f */
    public String f78461f;

    /* renamed from: g */
    public String f78462g;

    /* renamed from: h */
    public String f78463h;

    /* renamed from: i */
    public int f78464i;

    /* renamed from: j */
    public Aweme f78465j;

    /* renamed from: k */
    public Aweme f78466k;

    /* renamed from: w */
    public String f78467w;

    /* renamed from: x */
    public C24190p f78468x;

    /* renamed from: y */
    private C29376j f78469y;

    /* renamed from: z */
    private BaseFollowViewHolder f78470z;

    /* renamed from: l */
    public final C21745c mo75915l() {
        return this;
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int a = mo58029a(i);
        if (a != 2) {
            if (a != 11) {
                switch (a) {
                    case 16:
                    case 17:
                        BaseFollowViewHolder baseFollowViewHolder = (BaseFollowViewHolder) vVar;
                        baseFollowViewHolder.f77512aa = this.f78464i;
                        baseFollowViewHolder.f77513ab = C22704b.f60415d;
                        baseFollowViewHolder.f77510Z = this.f78461f;
                        baseFollowViewHolder.f77524am = this.f78467w;
                        baseFollowViewHolder.mo68518a(((DetailAdapterBean) this.f67539l.get(i)).getAweme(), new ArrayList(), null, this.f78456a);
                        baseFollowViewHolder.f77525an = this.f78462g;
                        baseFollowViewHolder.f77527ap = this.f78463h;
                        baseFollowViewHolder.mo75257a(this.f78466k);
                        return;
                    case 18:
                    case 19:
                    case 20:
                        if (((DetailAdapterBean) this.f67539l.get(i)).getAweme() != null) {
                            BaseForwardViewHolder baseForwardViewHolder = (BaseForwardViewHolder) vVar;
                            baseForwardViewHolder.f78557K = this.f78461f;
                            baseForwardViewHolder.mo76022a(((DetailAdapterBean) this.f67539l.get(i)).getAweme(), (List<Comment>) new ArrayList<Comment>(), null, this.f78461f, this.f78462g);
                            return;
                        }
                        break;
                    default:
                        C24189o oVar = (C24189o) vVar;
                        if (mo58029a(i) != 1 || i >= mo60557c() - 1 || mo58029a(i + 1) == 1) {
                            oVar.mo62373g().setPadding(0, 0, 0, 0);
                        } else {
                            oVar.mo62373g().setPadding(0, 0, 0, C23486n.m77122a(10.0d));
                        }
                        oVar.mo62362a(((DetailAdapterBean) mo62312a().get(i)).getComment());
                        break;
                }
            } else {
                ((C24183i) vVar).mo62334a((CommentReplyButtonStruct) ((DetailAdapterBean) this.f67539l.get(i)).getComment());
            }
        } else if (this.f67539l.get(i) != null) {
            C24186l lVar = (C24186l) vVar;
            lVar.mo62339a(((DetailAdapterBean) this.f67539l.get(i)).getComment());
            lVar.mo62340a(this.f78461f);
        }
    }

    /* renamed from: a */
    public final void mo75911a(String str, boolean z) {
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (awemeById != null && this.f78465j != null) {
            this.f78465j.setUserDigg(awemeById.getUserDigg());
            this.f78465j.setStatistics(awemeById.getStatistics());
            if (!z) {
                if (this.f78470z != null) {
                    this.f78470z.mo75231G();
                }
                if (this.f78452A != null) {
                    this.f78452A.mo75231G();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo75910a(String str) {
        if (mo60557c() != 0) {
            for (int i = 0; i < mo62312a().size(); i++) {
                if (m97722b(i)) {
                    Comment comment = ((DetailAdapterBean) mo62312a().get(i)).getComment();
                    if (comment != null && C6319n.m19594a(comment.getCid(), str)) {
                        C24217a.m79549a().updateDigg(comment, this.f78465j.getAuthorUid());
                        notifyItemChanged(i, Integer.valueOf(0));
                        C42961az.m136380a(new C24029a(2, new Object[]{this.f78465j.getAid(), comment}));
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo75908a(Aweme aweme) {
        if (this.f78470z != null) {
            this.f78470z.mo75268c(aweme);
        }
    }

    /* renamed from: a */
    public final void mo75909a(Exception exc, Aweme aweme, int i) {
        if (aweme != null && this.f78470z != null) {
            this.f78470z.mo75265b(aweme);
            C22814a.m75245a(this.f78460e.mo58074c(), exc, i == 1 ? R.string.apd : R.string.fjf);
        }
    }

    /* renamed from: a */
    public final void mo75912a(boolean z) {
        if (this.f78454C != null) {
            for (Entry entry : this.f78454C.entrySet()) {
                Long l = (Long) entry.getKey();
                if (z) {
                    m97718a(l.longValue(), System.currentTimeMillis());
                } else {
                    Comment comment = new Comment();
                    comment.setCid(String.valueOf(l));
                    int indexOf = this.f67539l.indexOf(new DetailAdapterBean(comment));
                    if (indexOf >= 0 && indexOf < this.f67539l.size()) {
                        m97721b(((DetailAdapterBean) this.f67539l.get(indexOf)).getComment());
                    }
                    entry.setValue(Long.valueOf(0));
                }
            }
        }
    }

    public final void aW_() {
        if (this.f78470z != null) {
            this.f78470z.mo75248X();
        }
        if (this.f78452A != null) {
            this.f78452A.aW_();
        }
        mo75912a(false);
    }

    /* renamed from: j */
    public final void mo58064j() {
        if (this.f78470z != null) {
            this.f78470z.mo75250Z();
        }
        if (this.f78452A != null) {
            this.f78452A.mo58064j();
        }
        if (this.f78469y != null) {
            this.f78469y.mo75122g();
        }
        mo75912a(true);
    }

    /* renamed from: k */
    public final void mo58065k() {
        if (this.f78469y != null) {
            this.f78469y.mo75121f();
        }
        if (this.f78455D != null) {
            this.f78455D.mo102994a().removeObserver(this);
        }
    }

    /* renamed from: n */
    private void m97724n() {
        this.f78455D = (C41974f) ServiceManager.get().getService(C41974f.class);
        if (this.f78455D != null) {
            this.f78455D.mo102994a().observe((C0043i) C23487o.m77130a(this.f78453B.getContext()), this);
        }
    }

    /* renamed from: m */
    public final void mo75916m() {
        if (this.f78465j != null) {
            AwemeStatistics statistics = this.f78465j.getStatistics();
            if (statistics != null) {
                statistics.setForwardCount(statistics.getForwardCount() + 1);
            } else {
                statistics = new AwemeStatistics();
                statistics.setForwardCount(1);
            }
            this.f78465j.setStatistics(statistics);
        }
        if (this.f78470z != null) {
            this.f78470z.mo68532m();
        }
        if (this.f78452A != null) {
            this.f78452A.mo76008E();
        }
    }

    /* renamed from: b */
    private boolean m97722b(int i) {
        int a = mo58029a(i);
        if (a == 0 || a == 1 || a == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo58030a(View view) {
        if (view == null) {
            return 0;
        }
        return (int) C9738o.m28708b(view.getContext(), 75.0f);
    }

    /* renamed from: e */
    public static List<DetailAdapterBean> m97723e(List<Comment> list) {
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (Comment detailAdapterBean : list) {
                arrayList.add(new DetailAdapterBean(detailAdapterBean));
            }
        }
        return arrayList;
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        Comment comment;
        long j;
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof C24188n) {
            comment = ((C24188n) vVar).mo62372f();
        } else if (vVar instanceof C24186l) {
            comment = ((C24186l) vVar).mo62347d();
        } else {
            comment = null;
        }
        if (comment != null && comment.getUser() != null) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            if (j != 0) {
                m97718a(j, System.currentTimeMillis());
            }
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        Comment comment;
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof C24189o) {
            comment = ((C24189o) vVar).mo62372f();
        } else if (vVar instanceof C24186l) {
            comment = ((C24186l) vVar).mo62347d();
        } else {
            comment = null;
        }
        if (comment != null) {
            m97719a(comment);
        }
    }

    /* renamed from: a */
    private void m97719a(Comment comment) {
        long j;
        if (comment != null && comment.getUser() != null) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            m97721b(comment);
            this.f78454C.remove(Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo75914b(String str) {
        if (mo60557c() != 0 && !TextUtils.isEmpty(str)) {
            Iterator it = this.f67539l.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Comment comment = ((DetailAdapterBean) it.next()).getComment();
                if (comment != null && !C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
                    Comment comment2 = (Comment) comment.getReplyComments().get(0);
                    if (comment2 != null && TextUtils.equals(comment2.getCid(), str)) {
                        it.remove();
                        z = true;
                    }
                }
            }
            if (z) {
                notifyDataSetChanged();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C41982b bVar) {
        if (!C6307b.m19566a((Collection<T>) this.f67539l)) {
            for (DetailAdapterBean aweme : this.f67539l) {
                Aweme aweme2 = aweme.getAweme();
                if (!(aweme2 == null || aweme2.getAuthor() == null || !TextUtils.equals(bVar.f109061a, aweme2.getAuthor().getUid()))) {
                    aweme2.getAuthor().setHasUnreadStory(!bVar.f109062b);
                }
            }
        }
    }

    /* renamed from: b */
    private void m97721b(Comment comment) {
        long j;
        String str;
        String str2;
        int i;
        String valueOf;
        String valueOf2;
        String str3;
        String cid;
        Comment comment2 = comment;
        if (comment2 != null && !TextUtils.isEmpty(this.f78461f)) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            if (this.f78454C != null && this.f78454C.get(Long.valueOf(j)) != null && ((Long) this.f78454C.get(Long.valueOf(j))).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f78454C.get(Long.valueOf(j))).longValue();
                if (currentTimeMillis > 30) {
                    String str4 = "";
                    int i2 = -1;
                    if (comment.getCommentType() == 2) {
                        String replyId = comment.getReplyId();
                        int e = this.f78468x.mo62608e(replyId);
                        String cid2 = comment.getCid();
                        List b = this.f78468x.mo62601b(String.valueOf(e));
                        if (b != null) {
                            i2 = b.indexOf(comment2);
                        }
                        str2 = replyId;
                        str = cid2;
                        i = e;
                    } else {
                        if (comment.getCommentType() == 1) {
                            cid = comment.getCid();
                            i = this.f78468x.mo62608e(cid);
                        } else {
                            cid = comment.getCid();
                            i = this.f67539l.indexOf(new DetailAdapterBean(comment2)) - 1;
                        }
                        str = str4;
                        str2 = cid;
                    }
                    if (TextUtils.isEmpty(comment.getLabelText())) {
                        valueOf = "";
                    } else {
                        valueOf = String.valueOf(comment.getLabelType());
                    }
                    String str5 = valueOf;
                    if (comment.getRelationLabel() == null) {
                        valueOf2 = "";
                    } else {
                        valueOf2 = String.valueOf(comment.getRelationLabel().getType());
                    }
                    String str6 = valueOf2;
                    if (comment.getUser() == null || comment.getUser().getUid() == null) {
                        str3 = "";
                    } else {
                        str3 = comment.getUser().getUid();
                    }
                    String str7 = str3;
                    C24217a.m79549a().sendCommentDurationEvent(this.f78461f, this.f78465j.getAid(), str2, i + 1, str, i2 + 1, currentTimeMillis, "", str5, str6, str7);
                }
            }
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        DetailAdapterBean detailAdapterBean = (DetailAdapterBean) this.f67539l.get(i);
        if (detailAdapterBean == null) {
            return -1;
        }
        if (detailAdapterBean.getType() == 1) {
            if (detailAdapterBean.getComment() != null) {
                int commentType = detailAdapterBean.getComment().getCommentType();
                if (commentType == 11) {
                    return 11;
                }
                switch (commentType) {
                    case 0:
                        return 0;
                    case 1:
                        return 1;
                    case 2:
                        return 2;
                }
            }
            return 0;
        }
        if (detailAdapterBean.getType() == 0) {
            Aweme aweme = detailAdapterBean.getAweme();
            if (aweme.getAwemeType() == 0 || aweme.getAwemeType() == 51 || aweme.getAwemeType() == 52 || aweme.getAwemeType() == 54 || aweme.getAwemeType() == 53 || aweme.getAwemeType() == 55 || aweme.getAwemeType() == 56) {
                return 16;
            }
            if (aweme.getAwemeType() == 2) {
                return 17;
            }
            if (aweme.getAwemeType() == 13) {
                if (aweme.getForwardItem() == null) {
                    return 20;
                }
                if (aweme.getForwardItem().getAwemeType() == 0 || aweme.getForwardItem().getAwemeType() == 51 || aweme.getForwardItem().getAwemeType() == 52 || aweme.getForwardItem().getAwemeType() == 54 || aweme.getForwardItem().getAwemeType() == 53 || aweme.getForwardItem().getAwemeType() == 55 || aweme.getAwemeType() == 56) {
                    return 18;
                }
                if (aweme.getForwardItem().getAwemeType() == 2) {
                    return 19;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m97718a(long j, long j2) {
        this.f78454C.put(Long.valueOf(j), Long.valueOf(j2));
    }

    public FeedDetailAdapter(RecyclerView recyclerView, C28297e eVar) {
        this.f78453B = recyclerView;
        this.f78469y = new C29376j(recyclerView);
        this.f78459d = eVar;
        m97724n();
    }

    /* renamed from: a */
    public static List<DetailAdapterBean> m97717a(Aweme aweme, List<Comment> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DetailAdapterBean(aweme));
        if (!C6307b.m19566a((Collection<T>) list)) {
            for (Comment detailAdapterBean : list) {
                arrayList.add(new DetailAdapterBean(detailAdapterBean));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int mo75913b(String str, int i) {
        if (mo60557c() == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < mo62312a().size(); i2++) {
            Comment comment = ((DetailAdapterBean) mo62312a().get(i2)).getComment();
            if (mo58029a(i2) == i && comment != null && TextUtils.equals(comment.getCid(), str)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final int mo75907a(String str, int i) {
        if (mo60557c() == 0 || TextUtils.isEmpty(str)) {
            return -1;
        }
        for (int i2 = 0; i2 < mo62312a().size(); i2++) {
            if (m97722b(i2)) {
                Comment comment = ((DetailAdapterBean) mo62312a().get(i2)).getComment();
                if (comment != null && C6319n.m19594a(comment.getCid(), str)) {
                    if (i > 1) {
                        List list = this.f67539l;
                        list.subList(i2, Math.min(list.size(), i + i2)).clear();
                        notifyItemRangeRemoved(i2, i);
                    } else {
                        if (i2 > 0) {
                            notifyItemChanged(i2 - 1);
                        }
                        this.f67539l.remove(i2);
                        notifyItemRemoved(i2);
                    }
                    notifyItemRangeChanged(i2, mo62312a().size() - i2);
                    return i2;
                }
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 11) {
            return (C1293v) C24217a.m79549a().providerCommentReplyButtonViewHolder(viewGroup, this.f78457b);
        }
        boolean z = true;
        switch (i) {
            case 1:
                z = false;
                break;
            case 2:
                C24186l providerCommentReplyViewHolder = C24217a.m79549a().providerCommentReplyViewHolder(viewGroup, this.f78457b);
                providerCommentReplyViewHolder.mo62346c(this.f78465j.getAuthorUid());
                providerCommentReplyViewHolder.mo62342b(this.f78465j.getAid());
                providerCommentReplyViewHolder.mo62340a(this.f78461f);
                return (C1293v) providerCommentReplyViewHolder;
            default:
                switch (i) {
                    case 16:
                        FollowVideoViewHolder followVideoViewHolder = new FollowVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f78460e, this.f78469y, this.f78458c);
                        followVideoViewHolder.f77522ak = false;
                        this.f78470z = followVideoViewHolder;
                        return followVideoViewHolder;
                    case 17:
                        FollowImageViewHolder followImageViewHolder = new FollowImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f78460e, this.f78469y, this.f78458c);
                        followImageViewHolder.f77522ak = false;
                        this.f78470z = followImageViewHolder;
                        return followImageViewHolder;
                    case 18:
                        ForwardVideoViewHolder forwardVideoViewHolder = new ForwardVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f78460e, this.f78469y, this.f78456a, this.f78458c);
                        forwardVideoViewHolder.mo76035f(1);
                        this.f78452A = forwardVideoViewHolder;
                        return forwardVideoViewHolder;
                    case 19:
                        ForwardImageViewHolder forwardImageViewHolder = new ForwardImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f78460e, this.f78469y, this.f78456a, this.f78458c);
                        forwardImageViewHolder.mo76035f(1);
                        this.f78452A = forwardImageViewHolder;
                        return forwardImageViewHolder;
                    case 20:
                        ForwardTextViewHolder forwardTextViewHolder = new ForwardTextViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f78460e, this.f78469y, this.f78456a, this.f78458c);
                        forwardTextViewHolder.mo76035f(1);
                        this.f78452A = forwardTextViewHolder;
                        return forwardTextViewHolder;
                }
        }
        C24189o providerCommentViewHolderFollowFeed = C24217a.m79549a().providerCommentViewHolderFollowFeed(viewGroup, this.f78457b, C21115b.m71197a().getCurUserId());
        providerCommentViewHolderFollowFeed.mo62365a(z);
        providerCommentViewHolderFollowFeed.mo62364a(this.f78461f);
        providerCommentViewHolderFollowFeed.mo62360a(this.f78464i);
        providerCommentViewHolderFollowFeed.mo62368c(this.f78465j.getAuthorUid());
        providerCommentViewHolderFollowFeed.mo62367b(this.f78465j.getAid());
        return (C1293v) providerCommentViewHolderFollowFeed;
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        super.onBindViewHolder(vVar, i, list);
        if (!list.isEmpty() && (list.get(0) instanceof Integer) && ((Integer) list.get(0)).intValue() == 0) {
            if (vVar instanceof C24189o) {
                ((C24189o) vVar).mo62646m();
            } else if (vVar instanceof C24186l) {
                ((C24186l) vVar).mo62341b();
            }
        }
    }
}
