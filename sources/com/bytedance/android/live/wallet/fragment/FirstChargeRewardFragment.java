package com.bytedance.android.live.wallet.fragment;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.p457i.C9471a;
import com.bytedance.android.livesdkapi.p457i.C9471a.C9472a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class FirstChargeRewardFragment extends Fragment {

    /* renamed from: c */
    public static final C3785a f11248c = new C3785a(null);

    /* renamed from: a */
    public int f11249a = R.layout.aq1;

    /* renamed from: b */
    public int f11250b = R.layout.arw;

    /* renamed from: d */
    private ImageView f11251d;

    /* renamed from: e */
    private TextView f11252e;

    /* renamed from: f */
    private LinearLayout f11253f;

    /* renamed from: g */
    private HashMap f11254g;

    /* renamed from: com.bytedance.android.live.wallet.fragment.FirstChargeRewardFragment$a */
    public static final class C3785a {
        private C3785a() {
        }

        public /* synthetic */ C3785a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static FirstChargeRewardFragment m13529a(int i, int i2) {
            FirstChargeRewardFragment firstChargeRewardFragment = new FirstChargeRewardFragment();
            firstChargeRewardFragment.f11249a = i;
            firstChargeRewardFragment.f11250b = i2;
            return firstChargeRewardFragment;
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.fragment.FirstChargeRewardFragment$b */
    static final class C3786b {

        /* renamed from: a */
        private final ImageView f11255a;

        /* renamed from: b */
        private final TextView f11256b;

        /* renamed from: c */
        private final View f11257c;

        /* renamed from: d */
        private final View f11258d;

        public C3786b(View view) {
            C7573i.m23587b(view, "view");
            this.f11258d = view;
            View findViewById = this.f11258d.findViewById(R.id.bbk);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.iv_reward_item_icon)");
            this.f11255a = (ImageView) findViewById;
            View findViewById2 = this.f11258d.findViewById(R.id.e0r);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.tv_reward_item_text)");
            this.f11256b = (TextView) findViewById2;
            View findViewById3 = this.f11258d.findViewById(R.id.csn);
            C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.reward_item_placeholder)");
            this.f11257c = findViewById3;
        }

        /* renamed from: a */
        public final void mo11276a(C9472a aVar, boolean z) {
            int i;
            C7573i.m23587b(aVar, "reward");
            View view = this.f11257c;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            ImageModel imageModel = aVar.f25928b;
            if (imageModel != null) {
                C5343e.m17030a(this.f11255a, imageModel);
            }
            C9505f fVar = aVar.f25927a;
            if (fVar != null) {
                this.f11256b.setText(((C3495l) C3596c.m13172a(C3495l.class)).parsePatternAndGetSpannable(fVar, ""));
            }
        }
    }

    /* renamed from: a */
    public static final FirstChargeRewardFragment m13526a(int i, int i2) {
        return C3785a.m13529a(i, i2);
    }

    /* renamed from: a */
    private void m13527a() {
        if (this.f11254g != null) {
            this.f11254g.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m13527a();
    }

    /* renamed from: a */
    private final void m13528a(View view) {
        this.f11251d = (ImageView) view.findViewById(R.id.bbj);
        this.f11252e = (TextView) view.findViewById(R.id.e0s);
        this.f11253f = (LinearLayout) view.findViewById(R.id.bs9);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        m13528a(view);
        C3338l<C9471a> lVar = LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE;
        C7573i.m23582a((Object) lVar, "LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE");
        C9471a aVar = (C9471a) lVar.mo10240a();
        if (aVar != null) {
            ImageModel imageModel = aVar.f25925b;
            if (imageModel != null) {
                C5343e.m17030a(this.f11251d, imageModel);
            }
            C9505f fVar = aVar.f25924a;
            if (fVar != null) {
                ((C3495l) C3596c.m13172a(C3495l.class)).parsePatternAndGetSpannable(fVar, "");
                TextView textView = this.f11252e;
                if (textView != null) {
                    textView.setText(((C3495l) C3596c.m13172a(C3495l.class)).parsePatternAndGetSpannable(fVar, ""));
                }
            }
            List<C9472a> list = aVar.f25926c;
            C7573i.m23582a((Object) list, "rewardList.firstChargeRewards");
            if (!list.isEmpty()) {
                List<C9472a> list2 = aVar.f25926c;
                C7573i.m23582a((Object) list2, "rewardList.firstChargeRewards");
                int i = 0;
                for (Object next : list2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        C7525m.m23465b();
                    }
                    C9472a aVar2 = (C9472a) next;
                    View inflate = getLayoutInflater().inflate(this.f11250b, this.f11253f, false);
                    C7573i.m23582a((Object) inflate, "itemReward");
                    C3786b bVar = new C3786b(inflate);
                    C7573i.m23582a((Object) aVar2, "reward");
                    if (i == aVar.f25926c.size() - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.mo11276a(aVar2, z);
                    LinearLayout linearLayout = this.f11253f;
                    if (linearLayout != null) {
                        linearLayout.addView(inflate);
                    }
                    i = i2;
                }
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(this.f11249a, viewGroup, false);
    }
}
