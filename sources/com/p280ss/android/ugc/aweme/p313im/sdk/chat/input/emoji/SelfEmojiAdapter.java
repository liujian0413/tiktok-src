package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.app.Activity;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.SelfEmojiAdapter */
public class SelfEmojiAdapter extends C1262a<C1293v> {

    /* renamed from: a */
    public C30833a f80741a;

    /* renamed from: b */
    public boolean f80742b;

    /* renamed from: c */
    public LinkedHashSet<Emoji> f80743c = new LinkedHashSet<>();

    /* renamed from: d */
    public List<Emoji> f80744d;

    /* renamed from: e */
    private OnClickListener f80745e;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.SelfEmojiAdapter$a */
    public interface C30833a {
        /* renamed from: a */
        void mo80695a();
    }

    /* renamed from: d */
    private void m100472d() {
        this.f80745e = new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!SelfEmojiAdapter.this.f80742b) {
                    return;
                }
                if (R.id.b_c == view.getId() || R.id.vi == view.getId()) {
                    int intValue = ((Integer) view.getTag()).intValue();
                    Emoji a = SelfEmojiAdapter.this.mo80704a(intValue);
                    if (SelfEmojiAdapter.this.f80743c.contains(a)) {
                        SelfEmojiAdapter.this.f80743c.remove(a);
                    } else {
                        SelfEmojiAdapter.this.f80743c.add(a);
                    }
                    SelfEmojiAdapter.this.notifyItemChanged(intValue);
                    if (SelfEmojiAdapter.this.f80741a != null) {
                        SelfEmojiAdapter.this.f80741a.mo80695a();
                    }
                }
            }
        };
    }

    /* renamed from: b */
    public final int mo80706b() {
        return this.f80743c.size();
    }

    /* renamed from: c */
    public final void mo80707c() {
        this.f80743c.clear();
    }

    public SelfEmojiAdapter() {
        m100472d();
    }

    /* renamed from: a */
    public final List<Emoji> mo80705a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f80743c.iterator();
        while (it.hasNext()) {
            arrayList.add((Emoji) it.next());
        }
        return arrayList;
    }

    public int getItemCount() {
        if (this.f80742b) {
            if (this.f80744d == null) {
                return 0;
            }
            return this.f80744d.size();
        } else if (this.f80744d == null) {
            return 1;
        } else {
            return this.f80744d.size() + 1;
        }
    }

    /* renamed from: a */
    public final Emoji mo80704a(int i) {
        return (Emoji) this.f80744d.get(i);
    }

    public int getItemViewType(int i) {
        int i2;
        if (this.f80744d == null) {
            i2 = 0;
        } else {
            i2 = this.f80744d.size();
        }
        if (i == i2) {
            return 1;
        }
        return 0;
    }

    public C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new SelfEmojiViewHolder(viewGroup);
        }
        SelfAddEmojiViewHolder selfAddEmojiViewHolder = new SelfAddEmojiViewHolder(viewGroup);
        selfAddEmojiViewHolder.itemView.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (SelfEmojiAdapter.this.f80744d == null || SelfEmojiAdapter.this.f80744d.size() < 79) {
                    C30842d.m100513a((Activity) view.getContext());
                    return;
                }
                C10761a.m31392b(view.getContext(), (int) R.string.bmb, 1).mo25750a();
                C31858ad.m103406a();
                C31858ad.m103452b(false);
            }
        });
        return selfAddEmojiViewHolder;
    }

    public void onBindViewHolder(C1293v vVar, int i) {
        if (vVar instanceof SelfEmojiViewHolder) {
            SelfEmojiViewHolder selfEmojiViewHolder = (SelfEmojiViewHolder) vVar;
            int i2 = 0;
            if (this.f80742b) {
                if (this.f80743c.contains(mo80704a(i))) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
            }
            selfEmojiViewHolder.f80748a = this.f80745e;
            selfEmojiViewHolder.mo80710a(mo80704a(i), i, i2);
        }
    }
}
