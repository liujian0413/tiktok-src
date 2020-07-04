package com.p280ss.android.ugc.aweme.tools.draft;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27312d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.p280ss.android.ugc.aweme.shortvideo.p1571f.C39850i;
import com.p280ss.android.ugc.aweme.shortvideo.p1587q.C40244a;
import com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40256i;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41653c;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41656f;
import com.p280ss.android.ugc.aweme.tools.draft.DraftItemView.C42273a;
import com.p280ss.android.ugc.aweme.tools.draft.p1666a.C42276b;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.p280ss.android.ugc.aweme.views.MentionTextView.C43346d;
import com.p280ss.android.ugc.p1716b.C43656b;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder */
public class AwemeDraftViewHolder extends AnimatedViewHolder<C27311c> implements C0042h, C6310a {

    /* renamed from: a */
    public RemoteImageView f109973a;

    /* renamed from: b */
    public boolean f109974b;

    /* renamed from: c */
    public boolean f109975c;

    /* renamed from: d */
    private ExpandableMentionTextView f109976d;

    /* renamed from: e */
    private LinearLayout f109977e;

    /* renamed from: f */
    private TextView f109978f;

    /* renamed from: g */
    private TextView f109979g;

    /* renamed from: l */
    private ImageView f109980l;

    /* renamed from: m */
    private View f109981m;

    /* renamed from: n */
    private ImageView f109982n;

    /* renamed from: o */
    private AppCompatCheckBox f109983o;

    /* renamed from: p */
    private DraftItemView f109984p;

    /* renamed from: q */
    private Space f109985q;

    /* renamed from: r */
    private Space f109986r;

    /* renamed from: s */
    private RelativeLayout f109987s;

    /* renamed from: t */
    private C42268a f109988t;

    /* renamed from: u */
    private Context f109989u;

    /* renamed from: v */
    private C41653c f109990v;

    /* renamed from: w */
    private long f109991w;

    /* renamed from: x */
    private C43656b f109992x = new C43656b();

    /* renamed from: y */
    private Map<ImageView, C13326a<C13645c>> f109993y;

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.AwemeDraftViewHolder$a */
    public interface C42268a {
        /* renamed from: a */
        void mo103711a(View view, C27311c cVar);
    }

    public final void bB_() {
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f109992x.mo105599a((C43651a) null);
    }

    private void dismiss(C41654d dVar) {
        if (dVar != null) {
            dVar.dismiss();
        }
    }

    /* renamed from: d */
    private void m134436d(View view) {
        if (C39360dw.m125725a().mo97930a(view.getContext())) {
            this.f109988t.mo103711a(view, (C27311c) this.f67534h);
        }
    }

    public void handleMsg(Message message) {
        this.f109989u.startActivity((Intent) message.obj);
        if (this.f109990v != null && this.f109990v.isShowing()) {
            this.f109990v.dismiss();
            this.f109990v = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void mo103733b(View view) {
        if (this.f109974b) {
            this.f109983o.setChecked(!((C27311c) this.f67534h).f72054w);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f109991w >= 500) {
            this.f109991w = currentTimeMillis;
            C42299p.m134549a(view.getContext(), (C27311c) this.f67534h, 0);
        }
    }

    /* renamed from: c */
    private void m134435c(View view) {
        this.f109976d = (ExpandableMentionTextView) C0991u.m4211e(view, (int) R.id.ji);
        this.f109977e = (LinearLayout) C0991u.m4211e(view, (int) R.id.bsr);
        this.f109978f = (TextView) C0991u.m4211e(view, (int) R.id.dtn);
        this.f109979g = (TextView) C0991u.m4211e(view, (int) R.id.je);
        this.f109980l = (ImageView) C0991u.m4211e(view, (int) R.id.uf);
        this.f109973a = (RemoteImageView) C0991u.m4211e(view, (int) R.id.a4g);
        this.f109981m = C0991u.m4211e(view, (int) R.id.dsh);
        this.f109982n = (ImageView) C0991u.m4211e(view, (int) R.id.aba);
        this.f109983o = (AppCompatCheckBox) C0991u.m4211e(view, (int) R.id.vh);
        this.f109984p = (DraftItemView) C0991u.m4211e(view, (int) R.id.bqv);
        this.f109984p.setOnScrollListener(new C42273a() {
            /* renamed from: a */
            public final void mo103735a(int i, boolean z) {
                AwemeDraftViewHolder.this.mo103728a(i, z);
            }
        });
        this.f109985q = (Space) C0991u.m4211e(view, (int) R.id.ab_);
        this.f109986r = (Space) C0991u.m4211e(view, (int) R.id.ab9);
        this.f109987s = (RelativeLayout) C0991u.m4211e(view, (int) R.id.ab7);
        this.f109987s.setOnClickListener(new C42285d(this));
        this.f109987s.setOnLongClickListener(new C42288e(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo103732a(View view) {
        m134436d(view);
        return true;
    }

    /* renamed from: a */
    public static boolean m134434a(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return false;
        }
        imageView.setImageBitmap(bitmap);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103729a(CompoundButton compoundButton, boolean z) {
        ((C27311c) this.f67534h).f72054w = z;
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().notifyDraftCheckedChanged((C27311c) this.f67534h, z);
    }

    /* renamed from: a */
    public final void mo103728a(int i, boolean z) {
        int i2;
        int i3;
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f109977e.getLayoutParams();
        int i4 = 1;
        if (C43127fh.m136806a(this.f109976d.getContext())) {
            int i5 = marginLayoutParams.leftMargin;
            if (z) {
                i4 = -1;
            }
            i3 = i5 + (i * i4);
            i2 = marginLayoutParams.rightMargin;
        } else {
            i3 = marginLayoutParams.leftMargin;
            int i6 = marginLayoutParams.rightMargin;
            if (!z) {
                i4 = -1;
            }
            i2 = (i * i4) + i6;
        }
        marginLayoutParams.leftMargin = i3;
        marginLayoutParams.rightMargin = i2;
        this.f109977e.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public final void mo103730a(ImageView imageView, C13326a<C13645c> aVar) {
        C13326a aVar2 = (C13326a) this.f109993y.put(imageView, aVar);
        if (aVar2 != null) {
            C13326a.m39001c(aVar2);
        }
    }

    /* renamed from: a */
    public final void mo66491a(final C27311c cVar, int i) {
        if (cVar != null && cVar.f72033b != null) {
            this.f67534h = cVar;
            if (this.f109974b) {
                this.f109984p.mo103752a();
                this.f109982n.animate().alpha(0.0f).setDuration(200).start();
            } else {
                this.f109984p.mo103753b();
                this.f109982n.animate().alpha(1.0f).setDuration(200).start();
                ((C27311c) this.f67534h).f72054w = false;
            }
            if (this.f109975c) {
                this.f109978f.setText(C42276b.m134494e(cVar));
            }
            this.f109983o.setOnCheckedChangeListener(null);
            this.f109983o.setChecked(((C27311c) this.f67534h).f72054w);
            this.f109983o.setOnCheckedChangeListener(new C42289f(this));
            this.f109973a.setTag(cVar.mo70221aj());
            this.f109973a.setImageResource(R.drawable.ahw);
            C27312d.m89561a((C27311c) this.f67534h, new OnVideoCoverCallback() {
                public final void onGetVideoCoverFailed(int i) {
                }

                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (!bitmap.isRecycled() && AwemeDraftViewHolder.this.f109973a != null && AwemeDraftViewHolder.this.f109973a.getTag().equals(cVar.mo70221aj())) {
                        AwemeDraftViewHolder.m134434a((ImageView) AwemeDraftViewHolder.this.f109973a, bitmap);
                        C13326a a = C39850i.m127559a(bitmap);
                        C39850i.m127560a(a, ((C27311c) AwemeDraftViewHolder.this.f67534h).mo70221aj());
                        AwemeDraftViewHolder.this.mo103730a((ImageView) AwemeDraftViewHolder.this.f109973a, a.clone());
                    }
                }
            });
            if (!C35563c.f93260w.mo57088a()) {
                this.f109976d.setSpanColor(this.f109989u.getResources().getColor(R.color.a4p));
            } else {
                this.f109976d.setSpanColor(this.f109989u.getResources().getColor(R.color.a4z));
            }
            String str = cVar.f72033b.f71933a;
            if (C6319n.m19593a(str)) {
                this.f109976d.setText(this.f109989u.getText(R.string.aw8));
                this.f109976d.setTextColor(this.f109989u.getResources().getColor(R.color.a53));
            } else {
                this.f109976d.setText(str);
                if (cVar.f72033b.f71934b != null) {
                    this.f109976d.mo105184a((List<TextExtraStruct>) C40256i.m128616a(cVar.f72033b.f71934b), (C43346d) new C41656f(true));
                    for (AVTextExtraStruct aVTextExtraStruct : cVar.f72033b.f71934b) {
                        if (C6399b.m19944t() && aVTextExtraStruct.getType() == 0 && !TextUtils.isEmpty(aVTextExtraStruct.getAwemeId())) {
                            this.f109976d.mo105183a(aVTextExtraStruct.getStart(), aVTextExtraStruct.getEnd(), new C40244a(this.f109976d.getContext(), this.f109976d));
                        }
                    }
                }
                this.f109976d.setTextColor(this.f109989u.getResources().getColor(R.color.a4z));
            }
            List<AVChallenge> list = cVar.f72033b.f71935c;
            StringBuilder sb = new StringBuilder();
            if (list != null && list.size() > 0) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AVChallenge aVChallenge = (AVChallenge) it.next();
                    if (aVChallenge.getChallengeName() == null) {
                        sb = new StringBuilder();
                        break;
                    } else {
                        sb.append(aVChallenge.getChallengeName());
                        sb.append(" ");
                    }
                }
            }
            String sb2 = sb.toString();
            if (C6319n.m19593a(sb2)) {
                this.f109979g.setText(R.string.aw5);
                this.f109980l.setImageResource(R.drawable.a6m);
                this.f109979g.setTextColor(this.f109989u.getResources().getColor(R.color.a5m));
            } else {
                this.f109979g.setText(sb2);
                this.f109979g.setTextColor(this.f109989u.getResources().getColor(R.color.a5h));
                this.f109980l.setImageResource(R.drawable.a6l);
            }
            this.f109979g.setVisibility(8);
            this.f109980l.setVisibility(8);
            LayoutParams layoutParams = this.f109986r.getLayoutParams();
            LayoutParams layoutParams2 = this.f109987s.getLayoutParams();
            int b = (int) C9738o.m28708b(this.f109989u, 16.0f);
            int b2 = (int) C9738o.m28708b(this.f109989u, 96.0f);
            if (!cVar.f72055x) {
                this.f109981m.setVisibility(4);
                layoutParams.height = 0;
                layoutParams2.height = b2 - b;
            } else {
                this.f109981m.setVisibility(0);
                layoutParams.height = b;
                layoutParams2.height = b2;
            }
            this.f109986r.setLayoutParams(layoutParams);
            this.f109987s.setLayoutParams(layoutParams2);
        }
    }

    AwemeDraftViewHolder(View view, Map<ImageView, C13326a<C13645c>> map, C42268a aVar) {
        super(view);
        m134435c(view);
        this.f109988t = aVar;
        this.f109989u = view.getContext();
        ((FragmentActivity) this.f109989u).getLifecycle().mo55a(this);
        this.f109993y = map;
    }
}
