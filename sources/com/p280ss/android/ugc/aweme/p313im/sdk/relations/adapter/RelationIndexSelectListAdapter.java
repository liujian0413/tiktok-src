package com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter;

import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.AbsRelationListAdapter.ViewHolder;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31852a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter */
public class RelationIndexSelectListAdapter extends IndexerListAdapter {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter$RelationSelectViewHolder */
    public class RelationSelectViewHolder extends ViewHolder {

        /* renamed from: f */
        public AvatarImageView f82987f;

        /* renamed from: h */
        private TextView f82989h;

        /* renamed from: i */
        private TextView f82990i;

        /* renamed from: j */
        private TextView f82991j;

        /* renamed from: k */
        private TextView f82992k;

        /* renamed from: l */
        private ImageView f82993l;

        /* renamed from: m */
        private ImageView f82994m;

        /* renamed from: n */
        private ImageView f82995n;

        /* renamed from: o */
        private View f82996o;

        /* renamed from: p */
        private LinearLayout f82997p;

        /* renamed from: g */
        private void m103008g() {
            if (RelationIndexSelectListAdapter.this.f82956k != null) {
                this.itemView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        RelationIndexSelectListAdapter.this.f82956k.mo82497a(RelationSelectViewHolder.this.itemView, RelationSelectViewHolder.this.getAdapterPosition() + RelationIndexSelectListAdapter.this.mo82485c());
                    }
                });
                this.f82987f.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        RelationIndexSelectListAdapter.this.f82956k.mo82497a(RelationSelectViewHolder.this.f82987f, RelationSelectViewHolder.this.getAdapterPosition() + RelationIndexSelectListAdapter.this.mo82485c());
                    }
                });
            }
        }

        /* renamed from: b */
        public final void mo80310b() {
            super.mo80310b();
            this.f82996o = this.itemView.findViewById(R.id.bm2);
            this.f82997p = (LinearLayout) this.itemView.findViewById(R.id.dke);
            this.f82990i = (TextView) this.itemView.findViewById(R.id.dkn);
            this.f82995n = (ImageView) this.itemView.findViewById(R.id.b0l);
            this.f82992k = (TextView) this.itemView.findViewById(R.id.b0n);
            this.f82961b = (ImageView) this.itemView.findViewById(R.id.vi);
            this.f82987f = (AvatarImageView) this.itemView.findViewById(R.id.j2);
            this.f82994m = (ImageView) this.itemView.findViewById(R.id.e_q);
            this.f82989h = (TextView) this.itemView.findViewById(R.id.c37);
            this.f82991j = (TextView) this.itemView.findViewById(R.id.a83);
            this.f82993l = (ImageView) this.itemView.findViewById(R.id.anq);
        }

        /* renamed from: a */
        private void m103005a(IMContact iMContact) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f82961b.getLayoutParams();
            if (RelationIndexSelectListAdapter.this.f82949d) {
                if (RelationIndexSelectListAdapter.this.f82951f.contains(iMContact)) {
                    this.f82961b.setSelected(true);
                } else {
                    this.f82961b.setSelected(false);
                }
                if (VERSION.SDK_INT > 16) {
                    if (marginLayoutParams.getMarginStart() != this.f82962c) {
                        marginLayoutParams.setMarginStart(this.f82962c);
                        marginLayoutParams.setMargins(this.f82962c, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
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
                        marginLayoutParams.setMarginStart(this.f82963d);
                        marginLayoutParams.setMargins(this.f82963d, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        this.f82961b.setLayoutParams(marginLayoutParams);
                    }
                } else if (marginLayoutParams.leftMargin != this.f82963d) {
                    marginLayoutParams.setMargins(this.f82963d, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                    this.f82961b.setLayoutParams(marginLayoutParams);
                }
            }
        }

        /* renamed from: b */
        private void m103006b(IMContact iMContact) {
            IMUser a = C6961d.m21661a(iMContact);
            if (!C6399b.m19944t()) {
                C31889bb.m103601a(this.f82994m, a);
            } else if (a != null) {
                C43126fg.m136801a(this.itemView.getContext(), a.getCustomVerify(), a.getEnterpriseVerifyReason(), this.f82989h);
            } else {
                C43126fg.m136801a(this.itemView.getContext(), "", "", this.f82989h);
            }
            if (a != null) {
                C31852a.m103395a((ImageView) this.f82987f, a);
                RelationIndexSelectListAdapter.this.mo82475a(this.f82989h, a, RelationIndexSelectListAdapter.this.f82950e);
                RelationIndexSelectListAdapter.this.mo82482b(this.f82991j, a, RelationIndexSelectListAdapter.this.f82950e);
                if (a.getFollowStatus() == 2) {
                    this.f82993l.setVisibility(0);
                } else {
                    this.f82993l.setVisibility(8);
                }
                C31858ad.m103406a();
                C31858ad.m103494k(a.getUid(), "contact");
                return;
            }
            this.f82991j.setVisibility(8);
            this.f82993l.setVisibility(8);
            if (TextUtils.isEmpty(RelationIndexSelectListAdapter.this.f82950e)) {
                this.f82989h.setText(iMContact.getDisplayName());
            } else {
                RelationIndexSelectListAdapter.m102957a(this.f82989h, iMContact.getDisplayName(), RelationIndexSelectListAdapter.this.f82950e, 0);
            }
        }

        public RelationSelectViewHolder(View view) {
            super(view);
        }

        /* renamed from: a */
        public final void mo80309a(IMContact iMContact, int i) {
            if (iMContact.getType() != -1) {
                m103005a(iMContact);
                m103007b(iMContact, i);
                m103008g();
                this.itemView.setTag(50331648, Integer.valueOf(50331648));
                this.itemView.setTag(83886080, iMContact);
                this.f82987f.setTag(50331648, Integer.valueOf(50331649));
                this.f82987f.setTag(83886080, iMContact);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m103007b(com.p280ss.android.ugc.aweme.p313im.service.model.IMContact r7, int r8) {
            /*
                r6 = this;
                com.ss.android.ugc.aweme.base.model.UrlModel r0 = r7.getDisplayAvatar()
                if (r0 == 0) goto L_0x001d
                java.util.List r1 = r0.getUrlList()
                if (r1 == 0) goto L_0x001d
                java.util.List r1 = r0.getUrlList()
                int r1 = r1.size()
                if (r1 != 0) goto L_0x0017
                goto L_0x001d
            L_0x0017:
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r1 = r6.f82987f
                com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r1, r0)
                goto L_0x0025
            L_0x001d:
                com.ss.android.ugc.aweme.base.ui.AvatarImageView r0 = r6.f82987f
                r1 = 2131232103(0x7f080567, float:1.8080306E38)
                com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r0, r1)
            L_0x0025:
                android.widget.ImageView r0 = r6.f82995n
                r1 = 8
                r0.setVisibility(r1)
                int r0 = r7.getType()
                r2 = 2
                r3 = 1
                r4 = 0
                if (r0 == r3) goto L_0x0116
                int r0 = r7.getType()
                if (r0 != r2) goto L_0x003d
                goto L_0x0116
            L_0x003d:
                int r0 = r7.getType()
                r2 = 6
                r5 = 5
                if (r0 == r2) goto L_0x00b7
                int r0 = r7.getType()
                if (r0 != r5) goto L_0x004c
                goto L_0x00b7
            L_0x004c:
                int r0 = r7.getType()
                r2 = 3
                if (r0 == 0) goto L_0x0059
                int r0 = r7.getType()
                if (r0 != r2) goto L_0x0143
            L_0x0059:
                int r0 = r7.getType()
                if (r0 != r2) goto L_0x0084
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r0 = r0.f82950e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0084
                android.widget.LinearLayout r0 = r6.f82997p
                r0.setVisibility(r4)
                android.widget.TextView r0 = r6.f82990i
                r2 = 2131823808(0x7f110cc0, float:1.9280426E38)
                r0.setText(r2)
                if (r8 != 0) goto L_0x007e
                android.view.View r0 = r6.f82996o
                r0.setVisibility(r1)
                goto L_0x008e
            L_0x007e:
                android.view.View r0 = r6.f82996o
                r0.setVisibility(r4)
                goto L_0x008e
            L_0x0084:
                android.widget.LinearLayout r0 = r6.f82997p
                r0.setVisibility(r1)
                android.view.View r0 = r6.f82996o
                r0.setVisibility(r1)
            L_0x008e:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                int r0 = r0.f82946a
                if (r0 == r3) goto L_0x013e
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter$a r0 = r0.mo82502c(r8)
                java.lang.String r2 = r0.f82986d
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x00b0
                android.widget.TextView r2 = r6.f82992k
                r2.setVisibility(r4)
                android.widget.TextView r2 = r6.f82992k
                java.lang.String r0 = r0.f82986d
                r2.setText(r0)
                goto L_0x0143
            L_0x00b0:
                android.widget.TextView r0 = r6.f82992k
                r0.setVisibility(r1)
                goto L_0x0143
            L_0x00b7:
                int r0 = r7.getType()
                if (r0 != r5) goto L_0x00e7
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r0 = r0.f82950e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x00e7
                android.widget.LinearLayout r0 = r6.f82997p
                r0.setVisibility(r4)
                android.widget.TextView r0 = r6.f82990i
                r2 = 2131823809(0x7f110cc1, float:1.9280428E38)
                r0.setText(r2)
                android.widget.ImageView r0 = r6.f82995n
                r0.setVisibility(r4)
                if (r8 != 0) goto L_0x00e1
                android.view.View r0 = r6.f82996o
                r0.setVisibility(r1)
                goto L_0x00f1
            L_0x00e1:
                android.view.View r0 = r6.f82996o
                r0.setVisibility(r4)
                goto L_0x00f1
            L_0x00e7:
                android.widget.LinearLayout r0 = r6.f82997p
                r0.setVisibility(r1)
                android.view.View r0 = r6.f82996o
                r0.setVisibility(r1)
            L_0x00f1:
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                boolean r0 = r0.f82947b
                if (r0 == 0) goto L_0x0110
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.IndexerListAdapter$a r0 = r0.mo82502c(r8)
                java.lang.String r0 = r0.f82986d
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L_0x0110
                android.widget.TextView r2 = r6.f82992k
                r2.setVisibility(r4)
                android.widget.TextView r2 = r6.f82992k
                r2.setText(r0)
                goto L_0x0143
            L_0x0110:
                android.widget.TextView r0 = r6.f82992k
                r0.setVisibility(r1)
                goto L_0x0143
            L_0x0116:
                int r0 = r7.getType()
                if (r0 != r2) goto L_0x0134
                com.ss.android.ugc.aweme.im.sdk.relations.adapter.RelationIndexSelectListAdapter r0 = com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.this
                java.lang.String r0 = r0.f82950e
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0134
                android.widget.TextView r0 = r6.f82990i
                r2 = 2131823849(0x7f110ce9, float:1.928051E38)
                r0.setText(r2)
                android.widget.LinearLayout r0 = r6.f82997p
                r0.setVisibility(r4)
                goto L_0x0139
            L_0x0134:
                android.widget.LinearLayout r0 = r6.f82997p
                r0.setVisibility(r1)
            L_0x0139:
                android.view.View r0 = r6.f82996o
                r0.setVisibility(r1)
            L_0x013e:
                android.widget.TextView r0 = r6.f82992k
                r0.setVisibility(r1)
            L_0x0143:
                if (r8 != 0) goto L_0x0151
                android.widget.TextView r8 = r6.f82990i
                java.lang.String r0 = ""
                r8.setText(r0)
                android.widget.ImageView r8 = r6.f82995n
                r8.setVisibility(r1)
            L_0x0151:
                r6.m103006b(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.relations.adapter.RelationIndexSelectListAdapter.RelationSelectViewHolder.m103007b(com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
        }
    }

    /* renamed from: a */
    public final void mo82474a(int i) {
        int c = i - mo82485c();
        if (c >= 0 && c < this.f82948c.size()) {
            IMContact iMContact = (IMContact) this.f82948c.get(c);
            for (int i2 = 0; i2 < this.f82948c.size(); i2++) {
                if (iMContact.equals(this.f82948c.get(i2))) {
                    notifyItemChanged(mo82485c() + i2);
                }
            }
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
            i2 = R.layout.zy;
        } else {
            i2 = R.layout.a00;
        }
        return new RelationSelectViewHolder(from.inflate(i2, viewGroup, false));
    }
}
