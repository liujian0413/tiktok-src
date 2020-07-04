package com.bytedance.android.live.broadcast.game;

import android.app.Dialog;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p022v4.app.DialogFragment;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.Game;
import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3233a;
import com.bytedance.android.live.core.rxutils.autodispose.C3245ad;
import com.bytedance.android.live.core.rxutils.autodispose.C3246ae;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.utils.C9076n;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class SelectGameDialogFragment extends DialogFragment {

    /* renamed from: a */
    public OnDismissListener f8672a;

    /* renamed from: b */
    private CircularProgressView f8673b;

    /* renamed from: c */
    private RecyclerView f8674c;

    /* renamed from: d */
    private C2734b f8675d;

    /* renamed from: e */
    private Game f8676e;

    /* renamed from: f */
    private C2735c f8677f;

    /* renamed from: com.bytedance.android.live.broadcast.game.SelectGameDialogFragment$a */
    static class C2733a extends C1293v {

        /* renamed from: a */
        public final View f8680a;

        /* renamed from: b */
        public ImageView f8681b;

        /* renamed from: c */
        public TextView f8682c;

        private C2733a(View view) {
            super(view);
            this.f8681b = (ImageView) view.findViewById(R.id.axy);
            this.f8682c = (TextView) view.findViewById(R.id.c38);
            this.f8680a = view.findViewById(R.id.nh);
        }

        /* renamed from: a */
        public final void mo9432a(Game game) {
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                C5343e.m17034a(this.f8681b, game.icon, this.f8681b.getWidth(), this.f8681b.getHeight(), 0);
            } else {
                C5343e.m17045b(this.f8681b, game.icon, this.f8681b.getWidth(), this.f8681b.getHeight(), 0);
            }
            this.f8682c.setText(game.name);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.game.SelectGameDialogFragment$b */
    static class C2734b extends C1262a<C2733a> {

        /* renamed from: a */
        public C2735c f8683a;

        /* renamed from: b */
        private final List<Game> f8684b;

        /* renamed from: c */
        private Game f8685c;

        private C2734b() {
            this.f8684b = new ArrayList();
        }

        public final int getItemCount() {
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                return this.f8684b.size() + 1;
            }
            return this.f8684b.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo9433a(View view) {
            this.f8683a.mo9437a(null);
        }

        /* renamed from: a */
        public final void mo9434a(Game game) {
            this.f8685c = game;
            notifyDataSetChanged();
        }

        public final long getItemId(int i) {
            return ((Game) this.f8684b.get(i)).gameId;
        }

        /* renamed from: a */
        public final void mo9436a(List<Game> list) {
            this.f8684b.clear();
            if (list != null) {
                this.f8684b.addAll(list);
            }
            notifyDataSetChanged();
        }

        public final /* synthetic */ C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m11017a(viewGroup, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo9435a(Game game, View view) {
            this.f8683a.mo9437a(game);
        }

        /* renamed from: a */
        private static C2733a m11017a(ViewGroup viewGroup, int i) {
            int i2;
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                i2 = R.layout.as1;
            } else {
                i2 = R.layout.as0;
            }
            return new C2733a(from.inflate(i2, viewGroup, false));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onBindViewHolder(C2733a aVar, int i) {
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1 && i == 0) {
                aVar.f8681b.setImageResource(R.drawable.can);
                aVar.f8682c.setText(R.string.fd9);
                if (this.f8685c == null) {
                    aVar.f8680a.setVisibility(0);
                    aVar.f8682c.setTextColor(C3358ac.m12521b((int) R.color.ar7));
                } else {
                    aVar.f8680a.setVisibility(4);
                    aVar.f8682c.setTextColor(C3358ac.m12521b((int) R.color.as5));
                }
                aVar.itemView.setOnClickListener(new C2741d(this));
                return;
            }
            Game game = (Game) this.f8684b.get(i - ((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue());
            aVar.mo9432a(game);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                if (this.f8685c == null || game.gameId != this.f8685c.gameId) {
                    aVar.f8680a.setVisibility(4);
                    aVar.f8682c.setTextColor(C3358ac.m12521b((int) R.color.as5));
                } else {
                    aVar.f8680a.setVisibility(0);
                    aVar.f8682c.setTextColor(C3358ac.m12521b((int) R.color.ar7));
                }
            }
            aVar.itemView.setOnClickListener(new C2742e(this, game));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.game.SelectGameDialogFragment$c */
    public interface C2735c {
        /* renamed from: a */
        void mo9437a(Game game);
    }

    public void onDestroyView() {
        m11011b();
        super.onDestroyView();
    }

    /* renamed from: a */
    private void m11010a() {
        if (this.f8673b.getVisibility() != 0) {
            this.f8673b.setVisibility(0);
        }
        this.f8673b.mo37275a();
    }

    /* renamed from: b */
    private void m11011b() {
        if (this.f8673b.getVisibility() == 0) {
            this.f8673b.mo37277c();
            this.f8673b.setVisibility(8);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9430a(C7321c cVar) throws Exception {
        m11011b();
    }

    /* renamed from: a */
    public static SelectGameDialogFragment m11009a(Game game) {
        SelectGameDialogFragment selectGameDialogFragment = new SelectGameDialogFragment();
        selectGameDialogFragment.f8676e = game;
        return selectGameDialogFragment;
    }

    /* renamed from: a */
    public final void mo9428a(C2735c cVar) {
        this.f8677f = cVar;
        if (this.f8675d != null) {
            this.f8675d.f8683a = cVar;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f8672a != null) {
            this.f8672a.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
            i = R.style.yh;
        } else {
            i = R.style.zh;
        }
        setStyle(1, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9429a(C3478c cVar) throws Exception {
        this.f8675d.mo9436a(cVar.f10296b);
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, -2);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9431a(Throwable th) throws Exception {
        C9076n.m27095a(getContext(), th);
        C3517a.m12960a(getContext(), (int) R.string.egm);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f8673b = (CircularProgressView) view.findViewById(R.id.clb);
        this.f8674c = (RecyclerView) view.findViewById(R.id.cqp);
        this.f8674c.setLayoutManager(new GridLayoutManager(getContext(), 4, 1, false));
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 0) {
            this.f8674c.mo5525a((C1272h) new C1272h() {

                /* renamed from: a */
                final int f8678a = SelectGameDialogFragment.this.getResources().getDimensionPixelSize(R.dimen.su);

                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                    if (RecyclerView.m5892f(view) < 4) {
                        rect.set(0, this.f8678a, 0, this.f8678a);
                    } else {
                        rect.set(0, 0, 0, this.f8678a);
                    }
                }
            });
        }
        this.f8675d = new C2734b();
        this.f8675d.f8683a = this.f8677f;
        this.f8675d.mo9434a(this.f8676e);
        this.f8674c.setAdapter(this.f8675d);
        m11010a();
        ((C3245ad) C2515f.m10417f().mo9076c().mo9169d().getLiveGameList(((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19321e((C7326g<? super C7321c>) new C2738a<Object>(this)).mo19297a((C7494t<T, ? extends R>) C3255e.m12297a((C3246ae) C3233a.m12259a((C0043i) this, Event.ON_DESTROY)))).mo10183a(new C2739b(this), new C2740c(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        LayoutInflater from = LayoutInflater.from(getContext());
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.mo10240a()).intValue() == 1) {
            i = R.layout.ap2;
        } else {
            i = R.layout.ap1;
        }
        return (ViewGroup) from.inflate(i, null);
    }
}
