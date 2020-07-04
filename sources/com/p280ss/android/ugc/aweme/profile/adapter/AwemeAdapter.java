package com.p280ss.android.ugc.aweme.profile.adapter;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextLoadingLayout;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.LoadMoreViewHolder;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p280ss.android.ugc.aweme.profile.service.C36067c;
import com.p280ss.android.ugc.aweme.profile.service.C36074j;
import com.p280ss.android.ugc.aweme.profile.util.C36743n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.AwemeAdapter */
public class AwemeAdapter extends AnimatedAdapter {

    /* renamed from: A */
    private C25663d f93507A;

    /* renamed from: B */
    private C27311c f93508B;

    /* renamed from: C */
    private RoomStruct f93509C;

    /* renamed from: D */
    private C35717j f93510D;

    /* renamed from: E */
    private MediaMixList f93511E;

    /* renamed from: F */
    private FragmentActivity f93512F;

    /* renamed from: G */
    private boolean f93513G;

    /* renamed from: H */
    private String f93514H;

    /* renamed from: I */
    private String f93515I;

    /* renamed from: J */
    private C1293v f93516J;

    /* renamed from: K */
    private Boolean f93517K = Boolean.valueOf(false);

    /* renamed from: L */
    private String f93518L;

    /* renamed from: e */
    public boolean f93519e;

    /* renamed from: f */
    public boolean f93520f = true;

    /* renamed from: g */
    public boolean f93521g;

    /* renamed from: h */
    C23685d f93522h;

    /* renamed from: i */
    boolean f93523i;

    /* renamed from: j */
    protected int f93524j;

    /* renamed from: k */
    public boolean f93525k = true;

    /* renamed from: w */
    public boolean f93526w = true;

    /* renamed from: x */
    public String f93527x;

    /* renamed from: y */
    public boolean f93528y;

    /* renamed from: z */
    protected String f93529z;

    /* renamed from: a */
    public final List<Aweme> mo62312a() {
        return this.f67539l;
    }

    /* renamed from: m */
    private static boolean m115285m() {
        return C36074j.f94315a.isEnableSettingDiskManager();
    }

    /* renamed from: j */
    public final int mo90520j() {
        return super.mo60557c();
    }

    /* renamed from: k */
    public final boolean mo90521k() {
        if (this.f93509C != null) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    private int m115284l() {
        if (m115285m()) {
            return R.layout.b34;
        }
        return R.layout.b33;
    }

    /* renamed from: n */
    private int m115286n() {
        boolean z;
        boolean z2 = this.f93519e;
        if (this.f93509C != null) {
            z = true;
        } else {
            z = false;
        }
        return (z2 ? 1 : 0) + (z ? 1 : 0) + (this.f93513G ? 1 : 0);
    }

    /* renamed from: c */
    public final int mo60557c() {
        return super.mo60557c() + m115286n();
    }

    /* renamed from: f */
    public final void mo90519f() {
        this.f93519e = false;
        this.f93508B = null;
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public final void mo66502g() {
        this.f93513G = false;
        this.f93511E = null;
        this.f93509C = null;
        super.mo66502g();
    }

    /* renamed from: o */
    private void m115287o() {
        if (this.f93516J != null) {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f93516J.itemView;
            LayoutParams layoutParams = (LayoutParams) dmtStatusView.getLayoutParams();
            layoutParams.height = mo58030a(this.f93516J.itemView);
            dmtStatusView.setLayoutParams(layoutParams);
        }
    }

    public String toString() {
        String str;
        switch (this.f93524j) {
            case 0:
                str = "TYPE_PUBLISH_AWEME";
                break;
            case 1:
                str = "TYPE_FAVORITE_AWEME";
                break;
            case 2:
                str = "TYPE_STORY_AWEME";
                break;
            case 3:
                str = "TYPE_ORIGIN_MUSIC";
                break;
            case 4:
                str = "TYPE_COLLECT_AWEME";
                break;
            case 5:
                str = "TYPE_DYNAMIC_STATE";
                break;
            default:
                str = "TYPE_TOOL_MASTER";
                break;
        }
        StringBuilder sb = new StringBuilder("profileListType: ");
        sb.append(str);
        sb.append(", itemCount: ");
        sb.append(getItemCount());
        sb.append(", baseCount: ");
        sb.append(mo60557c());
        sb.append(", mShowDraftBox: ");
        sb.append(this.f93519e);
        sb.append(", mShowFooter: ");
        sb.append(this.f67566v);
        sb.append(", isMyProfile: ");
        sb.append(this.f93523i);
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo58045a(List<Aweme> list) {
        super.mo58045a(list);
        m115283e(list);
    }

    /* renamed from: b */
    public final void mo61577b(List<Aweme> list) {
        super.mo61577b(list);
        m115283e(list);
    }

    /* renamed from: b */
    private Aweme m115281b(int i) {
        int n = i - m115286n();
        if (this.f67539l != null && n >= 0 && n < this.f67539l.size()) {
            return (Aweme) this.f67539l.get(n);
        }
        return null;
    }

    /* renamed from: a_ */
    public final C1293v mo61886a_(ViewGroup viewGroup) {
        this.f93516J = super.mo61886a_(viewGroup);
        if (this.f93517K.booleanValue()) {
            m115282e(this.f93518L);
            this.f93517K = Boolean.valueOf(false);
        }
        return this.f93516J;
    }

    /* renamed from: d */
    public final void mo90518d(String str) {
        if (!TextUtils.isEmpty(str)) {
            int a = mo66489a(str);
            if (a >= 0 && a < mo60557c()) {
                mo62312a().remove(a);
                notifyItemRemoved(a);
            }
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (this.f93521g && vVar.mItemViewType == 0 && this.f93507A != null) {
            this.f93507A.mo61737a(vVar);
        }
        if (vVar instanceof LiveViewHolder) {
            ((LiveViewHolder) vVar).mo90539a();
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        int i2;
        if (!this.f93513G) {
            i2 = 0;
        } else if (i == 0) {
            return 4;
        } else {
            i2 = 1;
        }
        if (this.f93519e) {
            if (i2 == i) {
                return 1;
            }
            i2++;
        }
        if (this.f93509C != null && i2 == i) {
            return 3;
        }
        Aweme b = m115281b(i);
        if (b == null || b.getAwemeType() != 2) {
            return super.mo58029a(i);
        }
        return 2;
    }

    /* renamed from: b */
    public final void mo90517b(String str) {
        this.f93518L = str;
        if (this.f93516J != null) {
            m115282e(this.f93518L);
            this.f93517K = Boolean.valueOf(false);
        } else {
            this.f93517K = Boolean.valueOf(true);
        }
        ag_();
    }

    public void onViewDetachedFromWindow(C1293v vVar) {
        super.onViewDetachedFromWindow(vVar);
        if (vVar instanceof LiveViewHolder) {
            ((LiveViewHolder) vVar).mo90542b();
            return;
        }
        if ((vVar instanceof LoadMoreViewHolder) && C36743n.m118430a(this.f93524j, this.f93523i) && this.f93516J != null) {
            m115287o();
        }
    }

    /* renamed from: e */
    private void m115282e(String str) {
        if (this.f93516J != null && !TextUtils.isEmpty(str)) {
            DmtStatusView dmtStatusView = (DmtStatusView) this.f93516J.itemView;
            DmtTextLoadingLayout dmtTextLoadingLayout = new DmtTextLoadingLayout(this.f93512F);
            dmtTextLoadingLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            dmtTextLoadingLayout.setBottomText(str);
            dmtTextLoadingLayout.setBoxViewBackground(null);
            dmtStatusView.setBuilder(dmtStatusView.mo25937c().mo25960a((View) dmtTextLoadingLayout));
            LayoutParams layoutParams = (LayoutParams) dmtStatusView.getLayoutParams();
            layoutParams.height = (int) C9738o.m28708b((Context) this.f93512F, 85.0f);
            dmtStatusView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo90514a(C27311c cVar) {
        if (!this.f93528y) {
            this.f93508B = cVar;
            this.f93519e = true;
            notifyDataSetChanged();
        }
    }

    /* renamed from: e */
    private void m115283e(List<Aweme> list) {
        if (this.f93523i && this.f93524j == 0 && list != null) {
            int size = list.size();
            int awemeCount = C6861a.m21337f().getCurUser().getAwemeCount();
            if (size > awemeCount) {
                StringBuilder sb = new StringBuilder();
                sb.append(size);
                sb.append("-");
                sb.append(awemeCount);
                C6907h.m21524a("publish_num_check", (Map) C22984d.m75611a().mo59970a("error_type", 1).mo59973a("num_des", sb.toString()).f60753a);
            }
            if (size == 0 && awemeCount == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(size);
                sb2.append("-");
                sb2.append(awemeCount);
                C6907h.m21524a("publish_num_check", (Map) C22984d.m75611a().mo59970a("error_type", 2).mo59973a("num_des", sb2.toString()).f60753a);
            }
            if (!this.f93526w && size != awemeCount) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(size);
                sb3.append("-");
                sb3.append(awemeCount);
                C6907h.m21524a("publish_num_check", (Map) C22984d.m75611a().mo59970a("error_type", 3).mo59973a("num_des", sb3.toString()).f60753a);
            }
        }
    }

    /* renamed from: a */
    public final void mo90515a(RoomStruct roomStruct) {
        if (roomStruct != this.f93509C) {
            this.f93509C = roomStruct;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    private static boolean m115280a(int i, boolean z) {
        if (i != 4 || !z || C36067c.f94307a.mo91799a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new DraftBoxViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(m115284l(), viewGroup, false));
            case 2:
                return new ImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.wq, viewGroup, false), this.f93529z, this.f93522h);
            case 3:
                return new LiveViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a11, viewGroup, false), this.f93512F);
            case 4:
                if (this.f93510D == null) {
                    this.f93510D = new C35717j(this.f93512F);
                }
                return this.f93510D.mo90562a(viewGroup, this.f93511E);
            default:
                return new AwemeViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tg, viewGroup, false), this.f93529z, this.f93522h);
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        switch (getItemViewType(i)) {
            case 1:
                ((DraftBoxViewHolder) vVar).mo66491a(this.f93508B, i);
                return;
            case 2:
                Aweme b = m115281b(i);
                ImageViewHolder imageViewHolder = (ImageViewHolder) vVar;
                imageViewHolder.mo90536a(b, i, this.f93521g, this.f93529z, this.f93523i, this.f93524j);
                imageViewHolder.mo90537a(this.f93527x);
                m115279a(this.f93524j, this.f93525k, b);
                return;
            case 3:
                ((LiveViewHolder) vVar).mo90540a(this.f93509C);
                return;
            case 4:
                if (this.f93510D != null) {
                    this.f93510D.mo90563a((MediaMixListViewHolder) vVar, i, this.f93511E, this.f93529z, this.f93514H, this.f93515I);
                    return;
                }
                break;
            default:
                if (vVar instanceof AwemeViewHolder) {
                    Aweme b2 = m115281b(i);
                    AwemeViewHolder awemeViewHolder = (AwemeViewHolder) vVar;
                    awemeViewHolder.mo90523a(b2, i, this.f93521g, this.f93529z, this.f93523i, this.f93524j);
                    awemeViewHolder.mo66497c(this.f93520f);
                    awemeViewHolder.mo90524a(this.f93527x);
                    m115279a(this.f93524j, this.f93525k, b2);
                    break;
                } else {
                    return;
                }
        }
    }

    /* renamed from: a */
    public final void mo90516a(boolean z, MediaMixList mediaMixList) {
        if (this.f93513G != z) {
            this.f93513G = z;
            this.f93511E = mediaMixList;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public static void m115279a(int i, boolean z, Aweme aweme) {
        if (m115280a(i, z) && aweme != null) {
            C36067c.f94307a.mo91797a(aweme);
        }
    }

    public AwemeAdapter(FragmentActivity fragmentActivity, String str, boolean z, int i, C23685d dVar, C25663d dVar2, String str2, String str3) {
        this.f93512F = fragmentActivity;
        this.f93529z = str;
        this.f93522h = dVar;
        this.f93523i = z;
        this.f93524j = i;
        this.f93507A = dVar2;
        this.f93514H = str2;
        this.f93515I = str3;
    }
}
