package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.sdk.BaseViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C31740d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p320b.C7048a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter */
public abstract class AbsRelationListAdapter extends C1262a<ViewHolder> {

    /* renamed from: a */
    protected int f82946a;

    /* renamed from: b */
    public boolean f82947b = false;

    /* renamed from: c */
    protected List<IMContact> f82948c = new ArrayList();

    /* renamed from: d */
    public boolean f82949d;

    /* renamed from: e */
    protected String f82950e;

    /* renamed from: f */
    public LinkedHashSet<IMContact> f82951f = new LinkedHashSet<>();

    /* renamed from: g */
    protected View f82952g;

    /* renamed from: h */
    protected RecyclerView f82953h;

    /* renamed from: i */
    public LinearLayoutManager f82954i;

    /* renamed from: j */
    public Runnable f82955j;

    /* renamed from: k */
    public C31713a f82956k;

    /* renamed from: l */
    protected C1281m f82957l;

    /* renamed from: m */
    private AnimatorListener f82958m = new AnimatorListener() {
        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            AbsRelationListAdapter.this.notifyDataSetChanged();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter$ViewHolder */
    public class ViewHolder extends BaseViewHolder<IMContact> {

        /* renamed from: b */
        protected ImageView f82961b;

        /* renamed from: c */
        protected int f82962c = Math.round(C9738o.m28708b(C6399b.m19921a(), 16.0f));

        /* renamed from: d */
        protected int f82963d;

        /* renamed from: f */
        private AvatarImageView f82965f;

        /* renamed from: g */
        private TextView f82966g;

        /* renamed from: h */
        private TextView f82967h;

        /* renamed from: i */
        private TextView f82968i;

        /* renamed from: j */
        private ImageView f82969j;

        /* renamed from: k */
        private ImageView f82970k;

        /* renamed from: l */
        private View f82971l;

        /* renamed from: c */
        public final void mo80311c() {
        }

        /* renamed from: g */
        private void m102979g() {
            if (AbsRelationListAdapter.this.f82956k != null) {
                this.itemView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        AbsRelationListAdapter.this.f82956k.mo82497a(ViewHolder.this.itemView, ViewHolder.this.getAdapterPosition());
                    }
                });
            }
        }

        /* renamed from: a */
        public void mo80307a() {
            super.mo80307a();
            this.itemView.setBackground(C10774c.m31449e(this.itemView.getContext()));
        }

        /* renamed from: e */
        public final Animator mo82492e() {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f82963d, this.f82962c});
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (ViewHolder.this.f82961b != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) ViewHolder.this.f82961b.getLayoutParams();
                        marginLayoutParams.setMargins(((Integer) valueAnimator.getAnimatedValue()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewHolder.this.f82961b.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        /* renamed from: f */
        public final Animator mo82493f() {
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f82962c, this.f82963d});
            ofInt.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (ViewHolder.this.f82961b != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) ViewHolder.this.f82961b.getLayoutParams();
                        marginLayoutParams.setMargins(((Integer) valueAnimator.getAnimatedValue()).intValue(), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        ViewHolder.this.f82961b.setLayoutParams(marginLayoutParams);
                    }
                }
            });
            return ofInt;
        }

        /* renamed from: b */
        public void mo80310b() {
            super.mo80310b();
            this.f82971l = this.itemView.findViewById(R.id.bm2);
            this.f82965f = (AvatarImageView) this.itemView.findViewById(R.id.j2);
            this.f82961b = (ImageView) this.itemView.findViewById(R.id.vi);
            this.f82966g = (TextView) this.itemView.findViewById(R.id.c37);
            this.f82967h = (TextView) this.itemView.findViewById(R.id.a83);
            this.f82969j = (ImageView) this.itemView.findViewById(R.id.anq);
            this.f82968i = (TextView) this.itemView.findViewById(R.id.dkn);
            this.f82970k = (ImageView) this.itemView.findViewById(R.id.e_q);
        }

        /* renamed from: a */
        private void m102976a(IMContact iMContact) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f82961b.getLayoutParams();
            if (AbsRelationListAdapter.this.f82949d) {
                if (AbsRelationListAdapter.this.f82951f.contains(iMContact)) {
                    this.f82961b.setSelected(true);
                } else {
                    this.f82961b.setSelected(false);
                }
                if (VERSION.SDK_INT > 16) {
                    if (marginLayoutParams.getMarginStart() != this.f82962c) {
                        marginLayoutParams.setMargins(this.f82962c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        marginLayoutParams.setMarginStart(this.f82962c);
                        this.f82961b.setLayoutParams(marginLayoutParams);
                    }
                } else if (marginLayoutParams.leftMargin != this.f82962c) {
                    marginLayoutParams.setMargins(this.f82962c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    this.f82961b.setLayoutParams(marginLayoutParams);
                }
            } else {
                this.f82961b.setSelected(false);
                if (VERSION.SDK_INT > 16) {
                    if (marginLayoutParams.getMarginStart() != this.f82963d) {
                        marginLayoutParams.setMargins(this.f82963d, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        marginLayoutParams.setMarginStart(this.f82963d);
                        this.f82961b.setLayoutParams(marginLayoutParams);
                    }
                } else if (marginLayoutParams.leftMargin != this.f82963d) {
                    marginLayoutParams.setMargins(this.f82963d, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    this.f82961b.setLayoutParams(marginLayoutParams);
                }
            }
        }

        /* renamed from: b */
        private void m102977b(IMContact iMContact) {
            IMUser a = C6961d.m21661a(iMContact);
            if (!C6399b.m19944t()) {
                C31889bb.m103601a(this.f82970k, a);
            } else if (a != null) {
                C43126fg.m136801a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f82966g);
            } else {
                C43126fg.m136801a(this.itemView.getContext(), "", "", this.f82966g);
            }
            if (a != null) {
                AbsRelationListAdapter.this.mo82475a(this.f82966g, a, AbsRelationListAdapter.this.f82950e);
                if (!TextUtils.isEmpty(AbsRelationListAdapter.this.mo82380a(iMContact)) && !TextUtils.isEmpty(AbsRelationListAdapter.this.f82950e)) {
                    AbsRelationListAdapter.this.mo82482b(this.f82967h, a, AbsRelationListAdapter.this.f82950e);
                } else if (TextUtils.isEmpty(AbsRelationListAdapter.this.mo82380a(iMContact))) {
                    this.f82967h.setVisibility(8);
                } else {
                    this.f82967h.setVisibility(0);
                    this.f82967h.setText(AbsRelationListAdapter.this.mo82380a(iMContact));
                }
                if (C7074e.m22067a(a) || a.getFollowStatus() != 2) {
                    this.f82969j.setVisibility(8);
                } else {
                    this.f82969j.setVisibility(0);
                }
                C31858ad.m103406a();
                C31858ad.m103494k(a.getUid(), "contact");
                return;
            }
            this.f82967h.setVisibility(8);
            this.f82969j.setVisibility(8);
            if (TextUtils.isEmpty(AbsRelationListAdapter.this.f82950e)) {
                this.f82966g.setText(iMContact.getDisplayName());
            } else {
                AbsRelationListAdapter.m102957a(this.f82966g, iMContact.getDisplayName(), AbsRelationListAdapter.this.f82950e, 0);
            }
        }

        /* renamed from: a */
        public void mo80309a(IMContact iMContact, int i) {
            super.mo80308a(iMContact);
            if (iMContact.getType() != -1) {
                m102976a(iMContact);
                m102978b(iMContact, i);
                m102979g();
                this.f82965f.setTag(50331648, Integer.valueOf(50331649));
                this.f82965f.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, Integer.valueOf(50331648));
                this.itemView.setTag(83886080, iMContact);
            }
        }

        public ViewHolder(View view) {
            int i;
            super(view);
            view.setTag(this);
            if (C31915n.m103672b() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
                i = -32;
            } else {
                i = -18;
            }
            this.f82963d = ((int) C9738o.m28708b(C6399b.m19921a(), (float) i)) - 1;
        }

        /* renamed from: b */
        private void m102978b(IMContact iMContact, int i) {
            int i2 = 8;
            if (iMContact.getType() == 2) {
                this.f82968i.setText(R.string.boi);
                this.f82968i.setVisibility(0);
                this.f82971l.setVisibility(8);
            } else if (iMContact.getType() == 3) {
                View view = this.f82971l;
                if (i != 0) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                this.f82968i.setText(R.string.bn_);
                this.f82968i.setVisibility(0);
            } else {
                this.f82968i.setVisibility(8);
                this.f82971l.setVisibility(8);
            }
            UrlModel displayAvatar = iMContact.getDisplayAvatar();
            if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                C23323e.m76503a((RemoteImageView) this.f82965f, (int) R.drawable.a_j);
            } else {
                C23323e.m76524b(this.f82965f, displayAvatar);
            }
            m102977b(iMContact);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.AbsRelationListAdapter$a */
    public interface C31713a {
        /* renamed from: a */
        void mo82497a(View view, int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo82380a(IMContact iMContact);

    /* renamed from: b */
    public final int mo82481b() {
        return this.f82951f.size();
    }

    /* renamed from: c */
    public final int mo82485c() {
        if (this.f82952g != null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    private void m102958d() {
        if (this.f82957l == null) {
            this.f82957l = new C1281m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    int m = AbsRelationListAdapter.this.f82954i.mo5448m();
                    if (AbsRelationListAdapter.this.f82946a == 0 && m == AbsRelationListAdapter.this.getItemCount() - 1 && AbsRelationListAdapter.this.f82955j != null) {
                        C6726a.m20844b(AbsRelationListAdapter.this.f82955j);
                    }
                }
            };
        }
    }

    public int getItemCount() {
        if (this.f82948c == null || this.f82948c.isEmpty()) {
            return 0;
        }
        return this.f82948c.size();
    }

    /* renamed from: e */
    private void m102959e() {
        AnimatorSet animatorSet = new AnimatorSet();
        Builder builder = null;
        for (int i = 0; i < this.f82954i.mo5800s(); i++) {
            View g = this.f82954i.mo5788g(i);
            if (g != null) {
                ViewHolder viewHolder = (ViewHolder) g.getTag();
                if (builder == null) {
                    builder = animatorSet.play(viewHolder.mo82492e());
                } else {
                    builder.with(viewHolder.mo82492e());
                }
            }
        }
        animatorSet.setDuration(300);
        animatorSet.addListener(this.f82958m);
        animatorSet.start();
    }

    /* renamed from: f */
    private void m102960f() {
        AnimatorSet animatorSet = new AnimatorSet();
        Builder builder = null;
        for (int i = 0; i < this.f82954i.mo5800s(); i++) {
            View g = this.f82954i.mo5788g(i);
            if (g != null) {
                ViewHolder viewHolder = (ViewHolder) g.getTag();
                if (builder == null) {
                    builder = animatorSet.play(viewHolder.mo82493f());
                } else {
                    builder.with(viewHolder.mo82493f());
                }
            }
        }
        animatorSet.setDuration(300);
        animatorSet.addListener(this.f82958m);
        animatorSet.start();
    }

    /* renamed from: a */
    public final IMContact[] mo82480a() {
        return (IMContact[]) this.f82951f.toArray(new IMContact[0]);
    }

    /* renamed from: a */
    public void mo82474a(int i) {
        notifyItemChanged(i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f82953h = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo82483b(int i) {
        if (i < mo82485c()) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo82486c(IMContact iMContact) {
        return this.f82951f.contains(iMContact);
    }

    /* renamed from: b */
    public final boolean mo82484b(IMContact iMContact) {
        if (this.f82951f.contains(iMContact)) {
            this.f82951f.remove(iMContact);
            return false;
        }
        this.f82951f.add(iMContact);
        return true;
    }

    public int getItemViewType(int i) {
        if (((IMContact) this.f82948c.get(i)).getType() == -1) {
            return -1;
        }
        return 0;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f82953h = recyclerView;
        this.f82954i = (LinearLayoutManager) this.f82953h.getLayoutManager();
        m102958d();
        this.f82953h.mo5528a(this.f82957l);
    }

    /* renamed from: a */
    public final void mo82477a(List<IMContact> list) {
        this.f82950e = null;
        this.f82948c.clear();
        this.f82946a = 0;
        this.f82948c.addAll(list);
        if (this.f82948c.isEmpty()) {
            IMUser iMUser = new IMUser();
            iMUser.setType(-1);
            this.f82948c.add(iMUser);
        } else if (this.f82948c.size() != 1 || ((IMContact) this.f82948c.get(0)).getType() != -1) {
            if (((IMContact) this.f82948c.get(0)).getType() == -1) {
                this.f82948c.remove(0);
            }
        } else {
            return;
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo82479a(boolean z) {
        if (this.f82949d != z) {
            this.f82949d = z;
            if (!this.f82949d) {
                this.f82951f.clear();
            }
            if (this.f82949d) {
                m102959e();
                return;
            }
            m102960f();
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mo80309a((IMContact) this.f82948c.get(i), i);
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.a20;
        } else {
            i2 = R.layout.a00;
        }
        return new ViewHolder(from.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public final void mo82478a(List<IMContact> list, CharSequence charSequence) {
        this.f82946a = 1;
        this.f82950e = charSequence.toString();
        this.f82948c.clear();
        this.f82948c.addAll(list);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82475a(TextView textView, IMUser iMUser, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText(iMUser.getDisplayName());
            return;
        }
        if (C31915n.m103671a()) {
            String nickName = iMUser.getNickName();
            if (!TextUtils.isEmpty(nickName) && !nickName.contains(str)) {
                str = str.toLowerCase();
                int indexOf = nickName.toLowerCase().indexOf(str);
                if (indexOf != -1) {
                    str = nickName.substring(indexOf, Math.min(str.length() + indexOf, nickName.length()));
                }
            }
        } else if (iMUser.getSearchType() == 5) {
            str = C7048a.m21924a(iMUser.getRemarkName(), iMUser.getRemarkPinyin(), iMUser.getRemarkInitial(), str);
        } else if (iMUser.getSearchType() == 3) {
            str = C7048a.m21924a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
        }
        m102957a(textView, iMUser.getDisplayName(), str, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo82482b(TextView textView, IMUser iMUser, String str) {
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 5) {
            if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 3) {
            if (!TextUtils.isEmpty(iMUser.getRemarkName())) {
                m102957a(textView, C6399b.m19921a().getResources().getString(R.string.bnj, new Object[]{iMUser.getNickName()}), C7048a.m21924a(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str), 3);
                textView.setVisibility(0);
                return;
            } else if (!TextUtils.isEmpty(iMUser.getSignature())) {
                textView.setText(iMUser.getSignature());
                textView.setVisibility(0);
                return;
            }
        } else if (iMUser.getSearchType() == 1) {
            String displayId = iMUser.getDisplayId();
            String a = C7048a.m21924a(displayId, C7048a.m21930c(displayId).toLowerCase(), C7048a.m21928b(displayId), str);
            StringBuilder sb = new StringBuilder();
            sb.append(C6399b.m19921a().getResources().getString(R.string.bfu));
            sb.append(displayId);
            m102957a(textView, sb.toString(), a, 4);
            textView.setVisibility(0);
            return;
        } else if (iMUser.getSearchType() == 2) {
            m102957a(textView, C6399b.m19921a().getResources().getString(R.string.bia, new Object[]{iMUser.getContactName()}), C7048a.m21924a(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str), 6);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    /* renamed from: a */
    protected static void m102957a(TextView textView, String str, String str2, int i) {
        textView.setText(C31740d.m103076a(C0683b.m2912c(textView.getContext(), R.color.uk), str, str2, i));
    }
}
