package com.p280ss.android.ugc.aweme.account.login;

import android.animation.ObjectAnimator;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.LoginChannleAdapter */
public final class LoginChannleAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public boolean f57114a = (!this.f57117d);

    /* renamed from: b */
    public boolean f57115b;

    /* renamed from: c */
    public List<? extends C22162a> f57116c;

    /* renamed from: d */
    public final boolean f57117d;

    /* renamed from: e */
    public final int f57118e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.LoginChannleAdapter$LoginChannleView */
    public final class LoginChannleView extends C1293v {

        /* renamed from: a */
        public final ImageView f57119a = ((ImageView) this.f57121c.findViewById(R.id.ax9));

        /* renamed from: b */
        public final TextView f57120b = ((TextView) this.f57121c.findViewById(R.id.v3));

        /* renamed from: c */
        public final View f57121c;

        /* renamed from: d */
        final /* synthetic */ LoginChannleAdapter f57122d;

        /* renamed from: a */
        public final void mo57187a(C22162a aVar) {
            C7573i.m23587b(aVar, "loginItemViewModel");
            this.f57119a.setImageResource(aVar.f59214a);
            this.f57121c.setOnClickListener(aVar.f59215b);
            TextView textView = this.f57120b;
            C7573i.m23582a((Object) textView, "channelName");
            textView.setText(this.f57121c.getContext().getText(aVar.f59216c));
            if (!this.f57122d.f57114a || !this.f57122d.f57115b || getAdapterPosition() - 1 < this.f57122d.f57118e) {
                this.f57121c.setAlpha(1.0f);
            } else {
                this.f57121c.setAlpha(0.0f);
            }
        }

        /* renamed from: a */
        public final void mo57188a(boolean z) {
            if (this.f57121c.getAlpha() != 1.0f) {
                if (z) {
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f57121c, "alpha", new float[]{0.0f, 1.0f});
                    C7573i.m23582a((Object) ofFloat, "objectAnimator");
                    ofFloat.setDuration(300);
                    ofFloat.setStartDelay((long) (((getAdapterPosition() - this.f57122d.f57118e) - 1) * 50));
                    ofFloat.start();
                    return;
                }
                this.f57121c.setAlpha(1.0f);
            }
        }

        public LoginChannleView(LoginChannleAdapter loginChannleAdapter, View view) {
            C7573i.m23587b(view, "item");
            this.f57122d = loginChannleAdapter;
            super(view);
            this.f57121c = view;
            this.f57121c.setOnTouchListener(new C34032a(0.5f, 150, null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.LoginChannleAdapter$LoginDialogHeader */
    public final class LoginDialogHeader extends C1293v {

        /* renamed from: a */
        public final TextView f57123a = ((TextView) this.f57125c.findViewById(R.id.title));

        /* renamed from: b */
        public final TextView f57124b = ((TextView) this.f57125c.findViewById(R.id.d1p));

        /* renamed from: c */
        public final View f57125c;

        /* renamed from: d */
        final /* synthetic */ LoginChannleAdapter f57126d;

        public LoginDialogHeader(LoginChannleAdapter loginChannleAdapter, View view) {
            C7573i.m23587b(view, "item");
            this.f57126d = loginChannleAdapter;
            super(view);
            this.f57125c = view;
            if (!loginChannleAdapter.f57117d) {
                TextView textView = this.f57123a;
                C7573i.m23582a((Object) textView, "title");
                textView.setText(this.f57125c.getContext().getText(R.string.abk));
                TextView textView2 = this.f57124b;
                C7573i.m23582a((Object) textView2, "secondTitle");
                textView2.setText(this.f57125c.getContext().getText(R.string.abh));
            }
        }
    }

    public final int getItemViewType(int i) {
        return i == 0 ? 0 : 1;
    }

    public final int getItemCount() {
        int i;
        if (this.f57114a) {
            i = this.f57116c.size();
        } else {
            i = this.f57118e;
        }
        return i + 1;
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        C7573i.m23587b(vVar, "p0");
        if (vVar instanceof LoginChannleView) {
            ((LoginChannleView) vVar).mo57187a((C22162a) this.f57116c.get(i - 1));
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "p0");
        if (i == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a7a, viewGroup, false);
            C7573i.m23582a((Object) inflate, "LayoutInflater.from(p0.c…dialog_header, p0, false)");
            return new LoginDialogHeader(this, inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zt, viewGroup, false);
        C7573i.m23582a((Object) inflate2, "LayoutInflater.from(p0.c…login_channle, p0, false)");
        return new LoginChannleView(this, inflate2);
    }

    public LoginChannleAdapter(List<? extends C22162a> list, boolean z, int i) {
        C7573i.m23587b(list, "channelList");
        this.f57116c = list;
        this.f57117d = z;
        this.f57118e = i;
    }
}
