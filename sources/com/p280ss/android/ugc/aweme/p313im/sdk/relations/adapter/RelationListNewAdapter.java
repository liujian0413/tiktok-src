package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationListNewAdapter */
public class RelationListNewAdapter extends AbsRelationListAdapter {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationListNewAdapter$ViewHolderWithTag */
    public class ViewHolderWithTag extends ViewHolder {

        /* renamed from: f */
        public AvatarImageView f83015f;

        /* renamed from: h */
        private TextView f83017h;

        /* renamed from: i */
        private TextView f83018i;

        /* renamed from: j */
        private TextView f83019j;

        /* renamed from: k */
        private ImageView f83020k;

        /* renamed from: l */
        private ImageView f83021l;

        /* renamed from: m */
        private View f83022m;

        /* renamed from: a */
        public final void mo80307a() {
            super.mo80307a();
        }

        /* renamed from: g */
        private void m103024g() {
            if (RelationListNewAdapter.this.f82956k != null) {
                this.itemView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        RelationListNewAdapter.this.f82956k.mo82497a(ViewHolderWithTag.this.itemView, ViewHolderWithTag.this.getAdapterPosition());
                    }
                });
                this.f83015f.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        RelationListNewAdapter.this.f82956k.mo82497a(ViewHolderWithTag.this.f83015f, ViewHolderWithTag.this.getAdapterPosition());
                    }
                });
            }
        }

        /* renamed from: b */
        public final void mo80310b() {
            super.mo80310b();
            this.f83022m = this.itemView.findViewById(R.id.bm2);
            this.f83015f = (AvatarImageView) this.itemView.findViewById(R.id.j2);
            this.f83017h = (TextView) this.itemView.findViewById(R.id.c37);
            this.f83018i = (TextView) this.itemView.findViewById(R.id.dga);
            this.f83020k = (ImageView) this.itemView.findViewById(R.id.anq);
            this.f83019j = (TextView) this.itemView.findViewById(R.id.dkn);
            this.f83021l = (ImageView) this.itemView.findViewById(R.id.e_q);
        }

        /* renamed from: a */
        private void m103022a(IMContact iMContact) {
            if (iMContact.getType() == 2) {
                this.f83019j.setText(R.string.boi);
                this.f83019j.setVisibility(0);
                this.f83022m.setVisibility(8);
            } else if (iMContact.getType() == 3) {
                this.f83019j.setText(R.string.bn_);
                this.f83019j.setVisibility(0);
                this.f83022m.setVisibility(0);
            } else {
                this.f83019j.setVisibility(8);
                this.f83022m.setVisibility(8);
            }
            UrlModel displayAvatar = iMContact.getDisplayAvatar();
            if (displayAvatar == null || displayAvatar.getUrlList() == null || displayAvatar.getUrlList().size() == 0) {
                C23323e.m76503a((RemoteImageView) this.f83015f, (int) R.drawable.a_j);
            } else {
                C23323e.m76524b(this.f83015f, displayAvatar);
            }
            m103023b(iMContact);
        }

        /* renamed from: b */
        private void m103023b(IMContact iMContact) {
            IMUser a = C6961d.m21661a(iMContact);
            if (!C6399b.m19944t()) {
                C31889bb.m103601a(this.f83021l, a);
            } else if (a != null) {
                C43126fg.m136801a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f83017h);
            } else {
                C43126fg.m136801a(this.itemView.getContext(), "", "", this.f83017h);
            }
            if (a != null) {
                RelationListNewAdapter.this.mo82475a(this.f83017h, a, RelationListNewAdapter.this.f82950e);
                if (a.getFollowStatus() == 2) {
                    int a2 = C6990a.m21758a().mo18069a(a.getUid());
                    if (a2 > 1) {
                        this.f83018i.setText(C6399b.m19921a().getString(R.string.brb, new Object[]{C6990a.m21759a(a2)}));
                        this.f83018i.setVisibility(0);
                    } else if (a2 == 1) {
                        this.f83018i.setText(C6399b.m19921a().getString(R.string.brc));
                        this.f83018i.setVisibility(0);
                    } else {
                        this.f83018i.setVisibility(8);
                    }
                } else {
                    this.f83018i.setVisibility(8);
                }
                if (C7074e.m22067a(a) || a.getFollowStatus() != 2) {
                    this.f83020k.setVisibility(8);
                } else {
                    this.f83020k.setVisibility(0);
                }
                C31858ad.m103406a();
                C31858ad.m103494k(a.getUid(), "contact");
                return;
            }
            this.f83018i.setVisibility(8);
            this.f83020k.setVisibility(8);
            if (TextUtils.isEmpty(RelationListNewAdapter.this.f82950e)) {
                this.f83017h.setText(iMContact.getDisplayName());
            } else {
                RelationListNewAdapter.m102957a(this.f83017h, iMContact.getDisplayName(), RelationListNewAdapter.this.f82950e, 0);
            }
        }

        public ViewHolderWithTag(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo80309a(IMContact iMContact, int i) {
            if (iMContact.getType() != -1) {
                m103022a(iMContact);
                m103024g();
                this.itemView.setTag(83886080, iMContact);
                this.f83015f.setTag(83886080, iMContact);
                this.itemView.setTag(50331648, Integer.valueOf(50331648));
                this.f83015f.setTag(50331648, Integer.valueOf(50331649));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo82380a(IMContact iMContact) {
        return null;
    }

    /* renamed from: a */
    public final void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.mo80309a((IMContact) this.f82948c.get(i), i);
    }

    /* renamed from: a */
    public final ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.a24;
        } else {
            i2 = R.layout.a00;
        }
        return new ViewHolderWithTag(from.inflate(i2, viewGroup, false));
    }
}
