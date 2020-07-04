package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.feedupdate.C6990a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter.ViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.IndexerListAdapter.C31715a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31852a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7063bg;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexerListAdapter */
public class RelationIndexerListAdapter extends IndexerListAdapter {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexerListAdapter$NewRelationViewHolder */
    public class NewRelationViewHolder extends ViewHolder {

        /* renamed from: f */
        public AvatarImageView f83000f;

        /* renamed from: g */
        public RemoteImageView f83001g;

        /* renamed from: i */
        private TextView f83003i;

        /* renamed from: j */
        private TextView f83004j;

        /* renamed from: k */
        private TextView f83005k;

        /* renamed from: l */
        private TextView f83006l;

        /* renamed from: m */
        private TextView f83007m;

        /* renamed from: n */
        private ImageView f83008n;

        /* renamed from: o */
        private ImageView f83009o;

        /* renamed from: p */
        private View f83010p;

        /* renamed from: q */
        private LinearLayout f83011q;

        /* renamed from: g */
        private void m103015g() {
            if (RelationIndexerListAdapter.this.f82956k != null) {
                this.itemView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        RelationIndexerListAdapter.this.f82956k.mo82497a(NewRelationViewHolder.this.itemView, NewRelationViewHolder.this.getAdapterPosition());
                    }
                });
                this.f83000f.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        RelationIndexerListAdapter.this.f82956k.mo82497a(NewRelationViewHolder.this.f83000f, NewRelationViewHolder.this.getAdapterPosition());
                    }
                });
                this.f83001g.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        RelationIndexerListAdapter.this.f82956k.mo82497a(NewRelationViewHolder.this.f83001g, NewRelationViewHolder.this.getAdapterPosition());
                    }
                });
            }
        }

        /* renamed from: b */
        public final void mo80310b() {
            this.f83010p = this.itemView.findViewById(R.id.bm2);
            this.f83011q = (LinearLayout) this.itemView.findViewById(R.id.dke);
            this.f83005k = (TextView) this.itemView.findViewById(R.id.dkn);
            this.f83009o = (ImageView) this.itemView.findViewById(R.id.b0l);
            this.f83007m = (TextView) this.itemView.findViewById(R.id.b0n);
            this.f83000f = (AvatarImageView) this.itemView.findViewById(R.id.j2);
            this.f83008n = (ImageView) this.itemView.findViewById(R.id.e_q);
            this.f83003i = (TextView) this.itemView.findViewById(R.id.c37);
            this.f83004j = (TextView) this.itemView.findViewById(R.id.dga);
            this.f83006l = (TextView) this.itemView.findViewById(R.id.a83);
            this.f83001g = (RemoteImageView) this.itemView.findViewById(R.id.v8);
        }

        /* renamed from: a */
        private void m103013a(IMContact iMContact) {
            IMUser a = C6961d.m21661a(iMContact);
            if (!C6399b.m19944t()) {
                C31889bb.m103601a(this.f83008n, a);
            } else if (a != null) {
                C43126fg.m136801a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f83003i);
            } else {
                C43126fg.m136801a(this.itemView.getContext(), "", "", this.f83003i);
            }
            if (a != null) {
                RelationIndexerListAdapter.this.mo82475a(this.f83003i, a, RelationIndexerListAdapter.this.f82950e);
                RelationIndexerListAdapter.this.mo82482b(this.f83006l, a, RelationIndexerListAdapter.this.f82950e);
                int a2 = C6990a.m21758a().mo18069a(a.getUid());
                if (a2 > 1) {
                    this.f83004j.setText(C6399b.m19921a().getString(R.string.brb, new Object[]{C6990a.m21759a(a2)}));
                    this.f83004j.setVisibility(0);
                } else if (a2 == 1) {
                    this.f83004j.setText(C6399b.m19921a().getString(R.string.brc));
                    this.f83004j.setVisibility(0);
                } else {
                    this.f83004j.setVisibility(8);
                }
                C31852a.m103395a((ImageView) this.f83000f, a);
                C31858ad.m103406a();
                C31858ad.m103494k(a.getUid(), "contact");
            } else {
                this.f83004j.setVisibility(8);
                this.f83006l.setVisibility(8);
                if (TextUtils.isEmpty(RelationIndexerListAdapter.this.f82950e)) {
                    this.f83003i.setText(iMContact.getDisplayName());
                } else {
                    RelationIndexerListAdapter.m102957a(this.f83003i, iMContact.getDisplayName(), RelationIndexerListAdapter.this.f82950e, 0);
                }
            }
            C43126fg.m136801a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f83003i);
        }

        public NewRelationViewHolder(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo80309a(IMContact iMContact, int i) {
            if (iMContact.getType() != -1) {
                m103015g();
                m103014b(iMContact, i);
                this.f83001g.setTag(83886080, iMContact);
                this.itemView.setTag(83886080, iMContact);
                this.f83000f.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, Integer.valueOf(50331648));
                this.f83001g.setTag(50331648, Integer.valueOf(100663296));
                this.f83000f.setTag(50331648, Integer.valueOf(50331649));
            }
        }

        /* renamed from: b */
        private void m103014b(IMContact iMContact, int i) {
            this.f83009o.setVisibility(8);
            if (iMContact.getType() == 6 || iMContact.getType() == 5) {
                if (iMContact.getType() != 5 || !TextUtils.isEmpty(RelationIndexerListAdapter.this.f82950e)) {
                    this.f83011q.setVisibility(8);
                    this.f83010p.setVisibility(8);
                } else {
                    this.f83011q.setVisibility(0);
                    this.f83005k.setText(R.string.bnf);
                    this.f83009o.setVisibility(0);
                    this.f83010p.setVisibility(8);
                }
                this.f83007m.setVisibility(8);
            } else if (iMContact.getType() == 0 || iMContact.getType() == 3) {
                if (iMContact.getType() != 3 || !TextUtils.isEmpty(RelationIndexerListAdapter.this.f82950e)) {
                    this.f83011q.setVisibility(8);
                    this.f83010p.setVisibility(8);
                } else {
                    this.f83011q.setVisibility(0);
                    this.f83005k.setText(R.string.bne);
                    this.f83009o.setVisibility(8);
                    this.f83010p.setVisibility(0);
                }
                if (RelationIndexerListAdapter.this.f82946a != 1) {
                    C31715a c = RelationIndexerListAdapter.this.mo82502c(i);
                    if (c != null) {
                        if (!TextUtils.isEmpty(c.f82986d)) {
                            this.f83007m.setText(c.f82986d);
                            this.f83007m.setVisibility(0);
                        } else {
                            this.f83007m.setVisibility(8);
                        }
                    }
                } else {
                    this.f83007m.setVisibility(8);
                }
            }
            if (i == 0) {
                this.f83005k.setText("");
                this.f83009o.setVisibility(8);
            }
            UrlModel displayAvatar = iMContact.getDisplayAvatar();
            if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                C23323e.m76503a((RemoteImageView) this.f83000f, (int) R.drawable.a_j);
            } else {
                C23323e.m76524b(this.f83000f, displayAvatar);
            }
            C7063bg.m22047a(this.f83001g, 4);
            m103013a(iMContact);
        }
    }

    /* renamed from: a */
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 1 && this.f82952g != null) {
            return super.onCreateViewHolder(viewGroup, i);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.zw;
        } else {
            i2 = R.layout.a00;
        }
        return new NewRelationViewHolder(from.inflate(i2, viewGroup, false));
    }
}
