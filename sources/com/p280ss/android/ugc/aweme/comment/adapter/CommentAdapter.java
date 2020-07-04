package com.p280ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.comment.abtest.C24034b;
import com.p280ss.android.ugc.aweme.comment.api.ICommentLikeUsersHolder;
import com.p280ss.android.ugc.aweme.comment.api.ICommentVideoDescHolder;
import com.p280ss.android.ugc.aweme.comment.list.C24186l;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.model.CommentLikeUsersStruct;
import com.p280ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p280ss.android.ugc.aweme.comment.p1094a.C24029a;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24130a;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24131b;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24163l;
import com.p280ss.android.ugc.aweme.comment.p1103ui.C24340v;
import com.p280ss.android.ugc.aweme.comment.param.VideoCommentPageParam;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.commercialize.model.CommentStruct;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22385a;
import com.p280ss.android.ugc.aweme.p984ad.p986b.C22386b;
import com.p280ss.android.ugc.aweme.p984ad.services.IAdService;
import com.p280ss.android.ugc.aweme.p984ad.services.p992a.C22468d;
import com.p280ss.android.ugc.aweme.p984ad.view.IAdViewHolder;
import com.p280ss.android.ugc.aweme.utils.C42953aw;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.CommentAdapter */
public class CommentAdapter extends BaseAdapter<Comment> {

    /* renamed from: A */
    private final int f63549A;

    /* renamed from: B */
    private final int f63550B;

    /* renamed from: C */
    private C22385a f63551C;

    /* renamed from: a */
    public C24090a f63552a;

    /* renamed from: b */
    public String f63553b;

    /* renamed from: c */
    public C24340v f63554c;

    /* renamed from: d */
    public String f63555d;

    /* renamed from: e */
    public C24163l f63556e;

    /* renamed from: f */
    public boolean f63557f;

    /* renamed from: g */
    public C22386b f63558g;

    /* renamed from: h */
    public DataCenter f63559h;

    /* renamed from: i */
    private String f63560i;

    /* renamed from: j */
    private HashMap<Long, Long> f63561j = new HashMap<>();

    /* renamed from: k */
    private Aweme f63562k;

    /* renamed from: w */
    private boolean f63563w = false;

    /* renamed from: x */
    private int f63564x = 0;

    /* renamed from: y */
    private VideoCommentPageParam f63565y;

    /* renamed from: z */
    private final int f63566z;

    /* renamed from: e */
    private static boolean m78876e(int i) {
        return i == 1 || i == 0 || i == 10 || i == 12;
    }

    /* renamed from: a */
    public final List<Comment> mo62312a() {
        return this.f67539l;
    }

    /* renamed from: a */
    public final void mo62317a(String str) {
        if (mo60557c() != 0) {
            int i = 0;
            while (i < this.f67539l.size()) {
                Comment comment = (Comment) this.f67539l.get(i);
                if (comment == null || !C6319n.m19594a(comment.getCid(), str)) {
                    i++;
                } else {
                    C24034b.m78869a(comment, this.f63565y.getAuthorUid());
                    notifyItemChanged(i, Integer.valueOf(0));
                    C42961az.m136380a(new C24029a(2, new Object[]{this.f63565y.getAid(), comment}));
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62318a(String str, int i) {
        int c = mo60557c();
        if (c != 0 && !TextUtils.isEmpty(str)) {
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= c) {
                    break;
                }
                Comment comment = (Comment) this.f67539l.get(i3);
                if (comment != null && C6319n.m19594a(comment.getCid(), str)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            m78870a(i2, i);
        }
    }

    /* renamed from: a */
    public final void mo62319a(boolean z) {
        if (this.f63561j != null) {
            for (Entry entry : this.f63561j.entrySet()) {
                Long l = (Long) entry.getKey();
                Comment comment = null;
                Comment comment2 = new Comment();
                comment2.setCid(String.valueOf(l));
                int indexOf = this.f67539l.indexOf(comment2);
                if (indexOf >= 0) {
                    comment = (Comment) this.f67539l.get(indexOf);
                }
                if (comment != null) {
                    if (z) {
                        m78871a(l.longValue(), System.currentTimeMillis());
                        if (comment.isAuthorDigged()) {
                            C24130a.m79275b(this.f63553b, this.f63565y.getAid(), this.f63565y.getAuthorUid(), comment.getCid());
                        }
                    } else {
                        m78874b((Comment) this.f67539l.get(indexOf));
                        entry.setValue(Long.valueOf(0));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62316a(Comment comment, int i) {
        if (comment != null) {
            List j = m78879j();
            this.f67539l.add(i, comment);
            C42953aw.m136346a(this, j, this.f67539l);
        }
    }

    /* renamed from: j */
    private List<Comment> m78879j() {
        if (this.f67539l == null) {
            this.f67539l = new ArrayList();
        }
        return new ArrayList(this.f67539l);
    }

    /* renamed from: f */
    private void m78877f() {
        if (this.f63562k != null && this.f63562k.isAd()) {
            AwemeRawAd awemeRawAd = this.f63562k.getAwemeRawAd();
            CommentStruct commentArea = awemeRawAd.getCommentArea();
            this.f63563w = awemeRawAd.isCommentAreaSwitch();
            if (commentArea != null) {
                this.f63564x = commentArea.getShowButtonNumber();
            }
        }
    }

    /* renamed from: a */
    public final void mo62315a(Aweme aweme) {
        this.f63562k = aweme;
        m78877f();
    }

    /* renamed from: b */
    private int m78873b(int i) {
        if (i >= mo60557c() - 1) {
            return -1;
        }
        return mo58029a(i + 1);
    }

    /* renamed from: f */
    private void m78878f(int i) {
        if (this.f63563w && this.f63554c != null && this.f63564x > 0 && i == this.f63564x) {
            this.f63554c.mo63094q();
        }
    }

    /* renamed from: a */
    public final int mo58030a(View view) {
        return (int) C9738o.m28708b(view.getContext(), 45.0f);
    }

    /* renamed from: c */
    public final void mo62323c(List<Comment> list) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            List j = m78879j();
            this.f67539l.addAll(list);
            C42953aw.m136346a(this, j, this.f67539l);
        }
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        Comment comment;
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof CommentViewHolder) {
            comment = ((CommentViewHolder) vVar).f63627a;
        } else if (vVar instanceof CommentReplyViewHolder) {
            comment = ((CommentReplyViewHolder) vVar).f63590b;
        } else {
            comment = null;
        }
        if (comment != null) {
            m78872a(comment);
        }
    }

    /* renamed from: c */
    private Rect m78875c(int i) {
        if (!C24148e.m79342a()) {
            return new Rect(-1, -1, -1, -1);
        }
        int i2 = this.f63549A;
        int a = mo58029a(i);
        int b = m78873b(i);
        if (m78876e(a) && !m78876e(b)) {
            i2 = this.f63566z;
        }
        return new Rect(-1, this.f63549A, -1, i2);
    }

    /* renamed from: a */
    private void m78872a(Comment comment) {
        long j;
        if (comment != null && comment.getUser() != null) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            m78874b(comment);
            this.f63561j.remove(Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final void mo62320b(String str) {
        if (mo60557c() != 0 && !TextUtils.isEmpty(str)) {
            Iterator it = this.f67539l.iterator();
            boolean z = false;
            while (it.hasNext()) {
                Comment comment = (Comment) it.next();
                if (!C6307b.m19566a((Collection<T>) comment.getReplyComments())) {
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

    public void onViewAttachedToWindow(C1293v vVar) {
        Comment comment;
        long j;
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof CommentViewHolder) {
            CommentViewHolder commentViewHolder = (CommentViewHolder) vVar;
            commentViewHolder.mo62374h();
            comment = commentViewHolder.f63627a;
        } else if (vVar instanceof CommentReplyViewHolder) {
            CommentReplyViewHolder commentReplyViewHolder = (CommentReplyViewHolder) vVar;
            commentReplyViewHolder.mo62344c();
            comment = commentReplyViewHolder.f63590b;
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
                m78871a(j, System.currentTimeMillis());
            }
            if (comment.isAuthorDigged()) {
                C24130a.m79275b(this.f63553b, this.f63565y.getAid(), this.f63565y.getAuthorUid(), comment.getCid());
            }
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (mo62312a() != null) {
            switch (((Comment) mo62312a().get(i)).getCommentType()) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 10:
                    return 10;
                case 11:
                    return 11;
                case 12:
                    return 12;
                case 220:
                    return 220;
                case 221:
                    return 221;
            }
        }
        return super.mo58029a(i);
    }

    /* renamed from: b */
    private void m78874b(Comment comment) {
        long j;
        String str;
        String str2;
        int i;
        String valueOf;
        String valueOf2;
        String str3;
        String cid;
        Comment comment2 = comment;
        if (comment2 != null && !TextUtils.isEmpty(this.f63553b)) {
            try {
                j = Long.parseLong(comment.getCid());
            } catch (Exception unused) {
                j = 0;
            }
            if (this.f63561j != null && this.f63561j.get(Long.valueOf(j)) != null && ((Long) this.f63561j.get(Long.valueOf(j))).longValue() > 10) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) this.f63561j.get(Long.valueOf(j))).longValue();
                if (currentTimeMillis > 30) {
                    String str4 = "";
                    int i2 = -1;
                    if (comment.getCommentType() == 2) {
                        String replyId = comment.getReplyId();
                        int e = this.f63556e.mo62608e(replyId);
                        String cid2 = comment.getCid();
                        List b = this.f63556e.mo62601b(String.valueOf(e));
                        if (b != null) {
                            i2 = b.indexOf(comment2);
                        }
                        str2 = replyId;
                        str = cid2;
                        i = e;
                    } else {
                        if (comment.getCommentType() == 1) {
                            cid = comment.getCid();
                            i = this.f63556e.mo62608e(cid);
                        } else {
                            cid = comment.getCid();
                            i = this.f67539l.indexOf(comment2);
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
                    C24131b.m79282a(this.f63553b, this.f63565y.getAid(), str2, i + 1, str, i2 + 1, currentTimeMillis, this.f63555d, this.f63565y.getIsLongItem(), str5, str6, str7);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62313a(C1293v vVar) {
        super.mo62313a(vVar);
        vVar.itemView.setPadding(this.f63550B, vVar.itemView.getPaddingTop(), this.f63550B, vVar.itemView.getPaddingBottom());
    }

    /* renamed from: a */
    private void m78871a(long j, long j2) {
        this.f63561j.put(Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: a */
    private void m78870a(int i, int i2) {
        if (i >= 0 && i < this.f67539l.size()) {
            List j = m78879j();
            if (i2 > 1) {
                List list = this.f67539l;
                list.subList(i, Math.min(list.size(), i2 + i)).clear();
            } else {
                this.f67539l.remove(i);
            }
            C42953aw.m136346a(this, j, this.f67539l);
        }
    }

    /* renamed from: b */
    public final void mo62321b(String str, int i) {
        int c = mo60557c();
        if (c != 0 && !TextUtils.isEmpty(str)) {
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= c) {
                    break;
                }
                Comment comment = (Comment) this.f67539l.get(i3);
                if (comment != null && C6319n.m19594a(comment.getFakeId(), str)) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            m78870a(i2, i);
        }
    }

    public CommentAdapter(C24090a aVar, VideoCommentPageParam videoCommentPageParam) {
        float f;
        Context a = C6399b.m19921a();
        if (C6399b.m19944t()) {
            f = 6.0f;
        } else {
            f = 5.5f;
        }
        this.f63566z = (int) C9738o.m28708b(a, f);
        this.f63549A = (int) C9738o.m28708b(C6399b.m19921a(), 10.0f);
        this.f63550B = (int) C9738o.m28708b(C6399b.m19921a(), 16.0f);
        this.f63557f = false;
        this.f63551C = new C22385a() {
            /* renamed from: a */
            public final void mo58876a() {
                CommentAdapter.this.f63552a.mo62451f();
            }

            /* renamed from: a */
            public final void mo58877a(View view, boolean z, String str) {
                CommentAdapter.this.f63552a.mo62442a(view, false, str);
            }
        };
        this.f63552a = aVar;
        this.f63565y = videoCommentPageParam;
        this.f63560i = videoCommentPageParam.getAuthorUid();
        mo66506d(R.string.am0);
    }

    /* renamed from: c */
    public final int mo62322c(String str, int i) {
        if (mo60557c() == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < mo62312a().size(); i2++) {
            Comment comment = (Comment) mo62312a().get(i2);
            if (comment != null && comment.getCommentType() == i && C6319n.m19594a(comment.getCid(), str)) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        boolean z;
        View view;
        switch (i) {
            case 1:
                z = false;
                break;
            case 2:
                CommentReplyViewHolder commentReplyViewHolder = new CommentReplyViewHolder(viewGroup, this.f63552a);
                commentReplyViewHolder.mo62346c(this.f63565y.getAuthorUid());
                commentReplyViewHolder.mo62342b(this.f63565y.getAid());
                commentReplyViewHolder.mo62340a(this.f63553b);
                return commentReplyViewHolder;
            case 10:
                C22468d dVar = new C22468d();
                dVar.f59916h = 256;
                dVar.f59915g = this.f63553b;
                dVar.f59917i = this.f63551C;
                return ((IAdService) ServiceManager.get().getService(IAdService.class)).getViewHolderForType(viewGroup.getContext(), dVar);
            case 11:
                return new CommentReplyButtonViewHolder(viewGroup, this.f63552a);
            case 12:
                C22468d dVar2 = new C22468d();
                dVar2.f59909a = C25268bg.m83039a(this.f63562k);
                dVar2.f59916h = 258;
                dVar2.f59915g = this.f63553b;
                dVar2.f59917i = this.f63551C;
                return ((IAdService) ServiceManager.get().getService(IAdService.class)).getViewHolderForType(viewGroup.getContext(), dVar2);
            case 220:
                return C24220a.m79551a().getICommentLikeUsersHolder(viewGroup);
            case 221:
                CommentVideoDescViewHolder commentVideoDescViewHolder = new CommentVideoDescViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a53, viewGroup, false), this.f63552a);
                commentVideoDescViewHolder.f63615a = this.f63565y.getEventType();
                commentVideoDescViewHolder.f63616b = this.f63565y.getAuthorUid();
                return commentVideoDescViewHolder;
            default:
                z = true;
                break;
        }
        if (C24148e.m79342a()) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u0, viewGroup, false);
        } else {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tz, viewGroup, false);
        }
        CommentViewHolderNewStyle commentViewHolderNewStyle = new CommentViewHolderNewStyle(view, this.f63552a, this.f63560i);
        commentViewHolderNewStyle.mo62365a(z);
        commentViewHolderNewStyle.mo62368c(this.f63565y.getAuthorUid());
        commentViewHolderNewStyle.mo62367b(this.f63565y.getAid());
        commentViewHolderNewStyle.mo62360a(this.f63565y.getPageType());
        commentViewHolderNewStyle.mo62364a(this.f63553b);
        return commentViewHolderNewStyle;
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int itemViewType = getItemViewType(i);
        m78878f(i);
        if (itemViewType != 2) {
            switch (itemViewType) {
                case 10:
                    C22468d dVar = new C22468d();
                    dVar.f59913e = (CommentStruct) mo62312a().get(i);
                    dVar.f59914f = m78875c(i);
                    dVar.f59915g = this.f63553b;
                    ((IAdViewHolder) vVar).mo58902a(C6399b.m19921a(), dVar);
                    return;
                case 11:
                    ((CommentReplyButtonViewHolder) vVar).mo62334a((CommentReplyButtonStruct) this.f67539l.get(i));
                    return;
                case 12:
                    C22468d dVar2 = new C22468d();
                    dVar2.f59909a = C25268bg.m83039a(this.f63562k);
                    dVar2.f59910b = this.f63562k;
                    dVar2.f59912d = this.f63559h;
                    dVar2.f59911c = this.f63558g;
                    ((IAdViewHolder) vVar).mo58902a(C6399b.m19921a(), dVar2);
                    return;
                default:
                    switch (itemViewType) {
                        case 220:
                            ((ICommentLikeUsersHolder) vVar).mo62331a((CommentLikeUsersStruct) this.f67539l.get(i));
                            return;
                        case 221:
                            ((ICommentVideoDescHolder) vVar).mo62355a((Comment) this.f67539l.get(i));
                            return;
                        default:
                            ((CommentViewHolder) vVar).mo62363a((Comment) this.f67539l.get(i), m78875c(i));
                            if (vVar instanceof CommentViewHolderNewStyle) {
                                ((CommentViewHolderNewStyle) vVar).mo62364a(this.f63553b);
                            }
                            return;
                    }
            }
        } else {
            C24186l lVar = (C24186l) vVar;
            lVar.mo62339a((Comment) this.f67539l.get(i));
            lVar.mo62340a(this.f63553b);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            mo62313a(vVar);
        } else if (list.isEmpty()) {
            mo58033a(vVar, i);
        } else {
            int intValue = ((Integer) list.get(0)).intValue();
            if (intValue == 0) {
                if (vVar instanceof CommentViewHolderNewStyle) {
                    CommentViewHolderNewStyle commentViewHolderNewStyle = (CommentViewHolderNewStyle) vVar;
                    commentViewHolderNewStyle.mo62384m();
                    commentViewHolderNewStyle.mo62364a(this.f63553b);
                }
                if (vVar instanceof CommentReplyViewHolder) {
                    C24186l lVar = (C24186l) vVar;
                    lVar.mo62341b();
                    lVar.mo62340a(this.f63553b);
                }
            } else if (intValue == 1) {
                if (vVar instanceof CommentViewHolderNewStyle) {
                    ((CommentViewHolderNewStyle) vVar).mo62370d();
                }
                if (vVar instanceof C24186l) {
                    ((C24186l) vVar).mo62336a();
                }
            }
        }
    }
}
