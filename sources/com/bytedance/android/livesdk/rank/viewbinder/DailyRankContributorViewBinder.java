package com.bytedance.android.livesdk.rank.viewbinder;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3404s.C3405a;
import com.bytedance.android.livesdk.chatroom.event.C4443m;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;
import p1886me.drakeet.multitype.C48226c;

public final class DailyRankContributorViewBinder extends C48226c<C8857f, DailyRankContributorViewHolder> {

    public static final class DailyRankContributorViewHolder extends C1293v {

        /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$a */
        public static final class C8878a implements C3405a {

            /* renamed from: a */
            final /* synthetic */ DailyRankContributorViewHolder f24193a;

            /* renamed from: a */
            public final void mo10308a(ImageModel imageModel) {
                C7573i.m23587b(imageModel, "imageModel");
            }

            /* renamed from: a */
            public final void mo10310a(ImageModel imageModel, Exception exc) {
                C7573i.m23587b(imageModel, "imageModel");
                C7573i.m23587b(exc, "e");
            }

            C8878a(DailyRankContributorViewHolder dailyRankContributorViewHolder) {
                this.f24193a = dailyRankContributorViewHolder;
            }

            /* renamed from: a */
            public final void mo10309a(ImageModel imageModel, int i, int i2, boolean z) {
                C7573i.m23587b(imageModel, "imageModel");
                View view = this.f24193a.itemView;
                C7573i.m23582a((Object) view, "itemView");
                ImageView imageView = (ImageView) view.findViewById(R.id.avv);
                C7573i.m23582a((Object) imageView, "itemView.honor");
                LayoutParams layoutParams = imageView.getLayoutParams();
                int a = C3358ac.m12510a(30.0f);
                layoutParams.width = a;
                layoutParams.height = (i2 * a) / i;
                View view2 = this.f24193a.itemView;
                C7573i.m23582a((Object) view2, "itemView");
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.avv);
                C7573i.m23582a((Object) imageView2, "itemView.honor");
                imageView2.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$b */
        static final class C8879b implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C8857f f24194a;

            C8879b(C8857f fVar) {
                this.f24194a = fVar;
            }

            public final void onClick(View view) {
                if (this.f24194a.f24097a != null) {
                    C9097a.m27146a().mo22267a((Object) new UserProfileEvent(this.f24194a.f24097a));
                    Map hashMap = new HashMap();
                    hashMap.put("event_belong", "live");
                    hashMap.put("room_id", String.valueOf(this.f24194a.mo21920a()));
                    User user = this.f24194a.f24097a;
                    C7573i.m23582a((Object) user, "item.user");
                    hashMap.put("user_id", String.valueOf(user.getId()));
                    hashMap.put("event_type", "click");
                    hashMap.put("event_module", "popup");
                    hashMap.put("event_page", "live_detail");
                    C8443c.m25663a().mo21606a("hourly_richest_click", hashMap, new Object[0]);
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$c */
        static final class C8880c implements OnClickListener {

            /* renamed from: a */
            public static final C8880c f24195a = new C8880c();

            C8880c() {
            }

            public final void onClick(View view) {
                C9097a.m27146a().mo22267a((Object) new C4443m(true));
            }
        }

        public DailyRankContributorViewHolder(View view) {
            C7573i.m23587b(view, "itemView");
            super(view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0171  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0082  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo21967a(com.bytedance.android.livesdk.rank.model.C8857f r15) {
            /*
                r14 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C7573i.m23587b(r15, r0)
                android.view.View r0 = r14.itemView
                java.lang.String r1 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r1)
                r1 = 2131297346(0x7f090442, float:1.8212634E38)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                com.bytedance.android.live.base.model.user.User r2 = r15.f24097a
                java.lang.String r3 = "item.user"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.bytedance.android.live.base.model.ImageModel r2 = r2.getAvatarThumb()
                android.view.View r3 = r14.itemView
                java.lang.String r4 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                android.view.View r3 = r3.findViewById(r1)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                java.lang.String r4 = "itemView.contributor_avatar"
                kotlin.jvm.internal.C7573i.m23582a(r3, r4)
                int r3 = r3.getWidth()
                android.view.View r4 = r14.itemView
                java.lang.String r5 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                android.view.View r4 = r4.findViewById(r1)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                java.lang.String r5 = "itemView.contributor_avatar"
                kotlin.jvm.internal.C7573i.m23582a(r4, r5)
                int r4 = r4.getHeight()
                r5 = 2131234614(0x7f080f36, float:1.8085399E38)
                com.bytedance.android.livesdk.chatroom.utils.C5343e.m17045b(r0, r2, r3, r4, r5)
                com.bytedance.android.live.base.model.user.User r0 = r15.f24097a
                r2 = 0
                if (r0 == 0) goto L_0x0062
                com.bytedance.android.live.base.model.user.l r0 = r0.getUserHonor()
                if (r0 == 0) goto L_0x0062
                com.bytedance.android.live.base.model.ImageModel r0 = r0.mo8707k()
                goto L_0x0063
            L_0x0062:
                r0 = r2
            L_0x0063:
                r3 = 8
                r4 = 2131298459(0x7f09089b, float:1.8214892E38)
                if (r0 == 0) goto L_0x0082
                android.view.View r5 = r14.itemView
                java.lang.String r6 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r5, r6)
                android.view.View r4 = r5.findViewById(r4)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$a r5 = new com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$a
                r5.<init>(r14)
                com.bytedance.android.live.core.utils.s$a r5 = (com.bytedance.android.live.core.utils.C3404s.C3405a) r5
                com.bytedance.android.livesdk.chatroom.utils.C5343e.m17035a(r4, r0, r5)
                goto L_0x0097
            L_0x0082:
                android.view.View r0 = r14.itemView
                java.lang.String r5 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r5)
                android.view.View r0 = r0.findViewById(r4)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.String r4 = "itemView.honor"
                kotlin.jvm.internal.C7573i.m23582a(r0, r4)
                r0.setVisibility(r3)
            L_0x0097:
                android.view.View r0 = r14.itemView
                java.lang.String r4 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r4)
                r4 = 2131297347(0x7f090443, float:1.8212636E38)
                android.view.View r0 = r0.findViewById(r4)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r4 = "itemView.contributor_name"
                kotlin.jvm.internal.C7573i.m23582a(r0, r4)
                com.bytedance.android.live.base.model.user.User r4 = r15.f24097a
                if (r4 == 0) goto L_0x00b4
                java.lang.String r2 = r4.getNickName()
            L_0x00b4:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r0.setText(r2)
                com.bytedance.android.live.base.model.user.User r0 = r15.f24097a
                r2 = 2131301687(0x7f091537, float:1.8221439E38)
                if (r0 == 0) goto L_0x0105
                com.bytedance.android.live.base.model.user.User r0 = r15.f24097a
                java.lang.String r4 = "item.user"
                kotlin.jvm.internal.C7573i.m23582a(r0, r4)
                com.bytedance.android.live.base.model.ImageModel r0 = r0.getMedal()
                if (r0 == 0) goto L_0x0105
                com.bytedance.android.live.base.model.user.User r0 = r15.f24097a
                java.lang.String r4 = "item.user"
                kotlin.jvm.internal.C7573i.m23582a(r0, r4)
                com.bytedance.android.live.base.model.ImageModel r0 = r0.getMedal()
                java.lang.String r4 = "item.user.medal"
                kotlin.jvm.internal.C7573i.m23582a(r0, r4)
                java.util.List r0 = r0.getUrls()
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
                if (r0 != 0) goto L_0x0105
                android.view.View r0 = r14.itemView
                java.lang.String r3 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r3)
                android.view.View r0 = r0.findViewById(r2)
                com.bytedance.android.live.core.widget.HSImageView r0 = (com.bytedance.android.live.core.widget.HSImageView) r0
                com.bytedance.android.live.base.model.user.User r2 = r15.f24097a
                java.lang.String r3 = "item.user"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.bytedance.android.live.base.model.ImageModel r2 = r2.getMedal()
                com.bytedance.android.livesdk.chatroom.utils.C5343e.m17030a(r0, r2)
                goto L_0x011a
            L_0x0105:
                android.view.View r0 = r14.itemView
                java.lang.String r4 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r4)
                android.view.View r0 = r0.findViewById(r2)
                com.bytedance.android.live.core.widget.HSImageView r0 = (com.bytedance.android.live.core.widget.HSImageView) r0
                java.lang.String r2 = "itemView.special_medal"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                r0.setVisibility(r3)
            L_0x011a:
                boolean r0 = com.bytedance.android.livesdkapi.p435b.C9290a.f25466a
                r2 = 17
                r3 = 2131101495(0x7f060737, float:1.7815401E38)
                if (r0 != 0) goto L_0x0171
                r0 = 2131828979(0x7f1120f3, float:1.9290914E38)
                java.lang.String r0 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r0)
                long r4 = r15.f24098b
                java.lang.String r4 = com.bytedance.android.live.core.utils.C3385e.m12593c(r4)
                r5 = 2131828976(0x7f1120f0, float:1.9290908E38)
                java.lang.String r5 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r5)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r4)
                r6.append(r5)
                java.lang.String r4 = r6.toString()
                android.text.SpannableString r6 = new android.text.SpannableString
                r7 = r4
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r6.<init>(r7)
                android.text.style.ForegroundColorSpan r7 = new android.text.style.ForegroundColorSpan
                int r3 = com.bytedance.android.live.core.utils.C3358ac.m12521b(r3)
                r7.<init>(r3)
                int r0 = r0.length()
                int r3 = r4.length()
                if (r5 != 0) goto L_0x0167
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0167:
                int r4 = r5.length()
                int r3 = r3 - r4
                r6.setSpan(r7, r0, r3, r2)
                r5 = r6
                goto L_0x01ba
            L_0x0171:
                r0 = 2131828975(0x7f1120ef, float:1.9290906E38)
                java.lang.String r0 = com.bytedance.android.live.core.utils.C3358ac.m12515a(r0)
                r4 = 1
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r5 = 0
                long r6 = r15.f24098b
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                r4[r5] = r6
                java.lang.String r0 = com.bytedance.android.livesdk.utils.C9078p.m27100a(r0, r4)
                long r4 = r15.f24098b
                java.lang.String r4 = java.lang.String.valueOf(r4)
                android.text.SpannableString r5 = new android.text.SpannableString
                r12 = r0
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                r5.<init>(r12)
                android.text.style.ForegroundColorSpan r13 = new android.text.style.ForegroundColorSpan
                int r3 = com.bytedance.android.live.core.utils.C3358ac.m12521b(r3)
                r13.<init>(r3)
                java.lang.String r3 = "origin"
                kotlin.jvm.internal.C7573i.m23582a(r0, r3)
                r8 = 0
                r9 = 0
                r10 = 6
                r11 = 0
                r6 = r12
                r7 = r4
                int r0 = kotlin.text.C7634n.m23730a(r6, r7, r8, r9, r10, r11)
                int r3 = kotlin.text.C7634n.m23730a(r6, r7, r8, r9, r10, r11)
                int r4 = r4.length()
                int r3 = r3 + r4
                r5.setSpan(r13, r0, r3, r2)
            L_0x01ba:
                android.view.View r0 = r14.itemView
                java.lang.String r2 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                r2 = 2131298065(0x7f090711, float:1.8214093E38)
                android.view.View r0 = r0.findViewById(r2)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.String r2 = "itemView.fire_number"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r0.setText(r5)
                android.view.View r0 = r14.itemView
                java.lang.String r2 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                android.view.View r0 = r0.findViewById(r1)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$b r1 = new com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$b
                r1.<init>(r15)
                android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
                r0.setOnClickListener(r1)
                android.view.View r15 = r14.itemView
                java.lang.String r0 = "itemView"
                kotlin.jvm.internal.C7573i.m23582a(r15, r0)
                r0 = 2131298439(0x7f090887, float:1.8214851E38)
                android.view.View r15 = r15.findViewById(r0)
                com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder$DailyRankContributorViewHolder$c r0 = com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder.C8880c.f24195a
                android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
                r15.setOnClickListener(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.rank.viewbinder.DailyRankContributorViewBinder.DailyRankContributorViewHolder.mo21967a(com.bytedance.android.livesdk.rank.model.f):void");
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1293v mo21965a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m26562b(layoutInflater, viewGroup);
    }

    /* renamed from: a */
    private static void m26561a(DailyRankContributorViewHolder dailyRankContributorViewHolder, C8857f fVar) {
        C7573i.m23587b(dailyRankContributorViewHolder, "holder");
        C7573i.m23587b(fVar, "item");
        dailyRankContributorViewHolder.mo21967a(fVar);
    }

    /* renamed from: b */
    private static DailyRankContributorViewHolder m26562b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C7573i.m23587b(layoutInflater, "inflater");
        C7573i.m23587b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.awn, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        return new DailyRankContributorViewHolder(inflate);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo21966a(C1293v vVar, Object obj) {
        m26561a((DailyRankContributorViewHolder) vVar, (C8857f) obj);
    }
}
