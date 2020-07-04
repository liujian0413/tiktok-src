package com.p280ss.android.ugc.aweme.effect;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.view.View;
import com.C1642a;
import com.p280ss.android.ugc.aweme.effect.VEStickerEffectAdapter.C27353a;
import com.p280ss.android.ugc.aweme.effect.p1194a.C27359a;
import com.p280ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.p280ss.android.ugc.aweme.shortvideo.model.VEEffectSelectOp;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtHorizontalImageTextLayout;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtTextView;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47477r.C47478a;
import dmt.p1861av.video.C47479s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.StickerEffectTabFragment */
public final class StickerEffectTabFragment extends EditEffectTabFragment {

    /* renamed from: j */
    public static final C27343a f72151j = new C27343a(null);

    /* renamed from: h */
    public EditEffectVideoModel f72152h;

    /* renamed from: i */
    public VEStickerEffectAdapter f72153i;

    /* renamed from: k */
    private HashMap f72154k;

    /* renamed from: com.ss.android.ugc.aweme.effect.StickerEffectTabFragment$a */
    public static final class C27343a {
        private C27343a() {
        }

        public /* synthetic */ C27343a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static StickerEffectTabFragment m89660a(List<? extends Effect> list, String str) {
            C7573i.m23587b(list, "effects");
            C7573i.m23587b(str, "category");
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("effect_list", (ArrayList) C7525m.m23509d((Collection<? extends T>) list));
            bundle.putString("effect_category", str);
            StickerEffectTabFragment stickerEffectTabFragment = new StickerEffectTabFragment();
            stickerEffectTabFragment.setArguments(bundle);
            return stickerEffectTabFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.StickerEffectTabFragment$b */
    static final class C27344b<T> implements C0053p<C47479s> {

        /* renamed from: a */
        final /* synthetic */ StickerEffectTabFragment f72155a;

        C27344b(StickerEffectTabFragment stickerEffectTabFragment) {
            this.f72155a = stickerEffectTabFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C47479s sVar) {
            if (sVar == null || sVar.f121912d != 3) {
                if (sVar != null && sVar.f121912d == 4) {
                    for (int length = sVar.f121909a.length - 1; length >= 0 && !this.f72155a.f72096f.isEmpty(); length--) {
                        Object obj = this.f72155a.f72096f.get(0);
                        C7573i.m23582a(obj, "mEffectPointModelStack[0]");
                        if (((EffectPointModel) obj).getIndex() == sVar.f121909a[length]) {
                            StickerEffectTabFragment.m89652a(this.f72155a).mo70444a(null);
                            Object remove = this.f72155a.f72096f.remove(0);
                            C7573i.m23582a(remove, "mEffectPointModelStack.removeAt(0)");
                            StickerEffectTabFragment.m89653b(this.f72155a).mo70334a().mo70542i().setValue(C47479s.m148202a(((EffectPointModel) remove).getIndex()));
                            return;
                        }
                    }
                } else if (sVar != null && sVar.f121912d == 9) {
                    StickerEffectTabFragment.m89652a(this.f72155a).mo70444a(null);
                }
                return;
            }
            this.f72155a.f72096f.clear();
            AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) this.f72155a.mo70328b((int) R.id.dpv);
            C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
            aVDmtHorizontalImageTextLayout.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.StickerEffectTabFragment$c */
    static final class C27345c<T> implements C0053p<Float> {

        /* renamed from: a */
        final /* synthetic */ StickerEffectTabFragment f72156a;

        C27345c(StickerEffectTabFragment stickerEffectTabFragment) {
            this.f72156a = stickerEffectTabFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Float f) {
            if (f == null || Float.compare(f.floatValue(), 0.0f) <= 0) {
                AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f72156a.mo70328b((int) R.id.dpz);
                C7573i.m23582a((Object) aVDmtTextView, "tvHint");
                aVDmtTextView.setText(this.f72156a.getString(R.string.o2));
                return;
            }
            Locale locale = Locale.getDefault();
            C7573i.m23582a((Object) locale, "Locale.getDefault()");
            String a = C1642a.m8035a(locale, "%.1f", Arrays.copyOf(new Object[]{f}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
            AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f72156a.mo70328b((int) R.id.dpz);
            C7573i.m23582a((Object) aVDmtTextView2, "tvHint");
            aVDmtTextView2.setText(this.f72156a.getString(R.string.ayw, a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.StickerEffectTabFragment$d */
    static final class C27346d implements C27353a {

        /* renamed from: a */
        final /* synthetic */ StickerEffectTabFragment f72157a;

        C27346d(StickerEffectTabFragment stickerEffectTabFragment) {
            this.f72157a = stickerEffectTabFragment;
        }

        /* renamed from: a */
        public final void mo70405a(EffectModel effectModel, int i, int i2) {
            EffectPointModel effectPointModel;
            EditEffectVideoModel b = StickerEffectTabFragment.m89653b(this.f72157a);
            Effect effect = (Effect) this.f72157a.mo70329b().get(i2);
            if (i == 2) {
                if (this.f72157a.f72095e != null) {
                    EffectPlatform a = C27359a.m89722a();
                    if (a != null && a.mo70640a(effect)) {
                        if (!this.f72157a.f72096f.isEmpty()) {
                            Object remove = this.f72157a.f72096f.remove(0);
                            C7573i.m23582a(remove, "mEffectPointModelStack.removeAt(0)");
                            b.mo70334a().mo70542i().setValue(C47479s.m148202a(((EffectPointModel) remove).getIndex()));
                        }
                        AVDmtTextView aVDmtTextView = (AVDmtTextView) this.f72157a.mo70328b((int) R.id.dpz);
                        C7573i.m23582a((Object) aVDmtTextView, "tvHint");
                        aVDmtTextView.setText(this.f72157a.getString(R.string.o2));
                        return;
                    }
                    return;
                }
                return;
            }
            this.f72157a.mo70325a(i2);
            if (this.f72157a.f72095e != null) {
                EffectPlatform a2 = C27359a.m89722a();
                if (a2 != null && a2.mo70640a(effect)) {
                    C0052o f = b.mo70340f();
                    if (this.f72157a.f72096f.isEmpty()) {
                        effectPointModel = null;
                    } else {
                        effectPointModel = (EffectPointModel) this.f72157a.f72096f.remove(0);
                    }
                    f.setValue(VEEffectSelectOp.selectSticker(effectModel, effectPointModel));
                    b.mo70341g().setValue(C47478a.m148201a(effectModel.hint, 2000));
                    AVDmtTextView aVDmtTextView2 = (AVDmtTextView) this.f72157a.mo70328b((int) R.id.dpz);
                    C7573i.m23582a((Object) aVDmtTextView2, "tvHint");
                    aVDmtTextView2.setText(this.f72157a.getString(R.string.o2));
                    ArrayList h = b.mo70334a().mo70541h();
                    if (!h.isEmpty()) {
                        this.f72157a.f72096f.add(h.get(h.size() - 1));
                        return;
                    } else {
                        C42880h.m136156a("add effect fail");
                        return;
                    }
                }
            }
            C27359a aVar = this.f72157a.f72095e;
            if (aVar != null) {
                aVar.mo70459a(effect);
            }
        }
    }

    /* renamed from: a */
    public static final StickerEffectTabFragment m89651a(List<? extends Effect> list, String str) {
        return C27343a.m89660a(list, str);
    }

    /* renamed from: b */
    public final View mo70328b(int i) {
        if (this.f72154k == null) {
            this.f72154k = new HashMap();
        }
        View view = (View) this.f72154k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f72154k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public final void mo70333f() {
        if (this.f72154k != null) {
            this.f72154k.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo70333f();
    }

    /* renamed from: a */
    public static final /* synthetic */ VEStickerEffectAdapter m89652a(StickerEffectTabFragment stickerEffectTabFragment) {
        VEStickerEffectAdapter vEStickerEffectAdapter = stickerEffectTabFragment.f72153i;
        if (vEStickerEffectAdapter == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        return vEStickerEffectAdapter;
    }

    /* renamed from: b */
    public static final /* synthetic */ EditEffectVideoModel m89653b(StickerEffectTabFragment stickerEffectTabFragment) {
        EditEffectVideoModel editEffectVideoModel = stickerEffectTabFragment.f72152h;
        if (editEffectVideoModel == null) {
            C7573i.m23583a("mViewModel");
        }
        return editEffectVideoModel;
    }

    /* renamed from: a */
    public final void mo70396a(Effect effect) {
        C7573i.m23587b(effect, "rawEffect");
        int indexOf = mo70329b().indexOf(effect);
        if (indexOf >= 0) {
            VEStickerEffectAdapter vEStickerEffectAdapter = this.f72153i;
            if (vEStickerEffectAdapter == null) {
                C7573i.m23583a("mEffectAdapter");
            }
            vEStickerEffectAdapter.mo70493a(indexOf, 2);
        }
    }

    /* renamed from: a */
    public final void mo70326a(C1146b bVar, List<? extends EffectModel> list) {
        C7573i.m23587b(bVar, "result");
        C7573i.m23587b(list, "newEffectSource");
        VEStickerEffectAdapter vEStickerEffectAdapter = this.f72153i;
        if (vEStickerEffectAdapter == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        bVar.mo4548a((C1262a) vEStickerEffectAdapter);
        mo70327a(list);
        VEStickerEffectAdapter vEStickerEffectAdapter2 = this.f72153i;
        if (vEStickerEffectAdapter2 == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        vEStickerEffectAdapter2.mo70494a((List) this.f72094d);
    }

    /* renamed from: a */
    public final void mo70397a(Effect effect, C43726c cVar) {
        if (effect != null) {
            int indexOf = mo70329b().indexOf(effect);
            if (indexOf >= 0) {
                VEStickerEffectAdapter vEStickerEffectAdapter = this.f72153i;
                if (vEStickerEffectAdapter == null) {
                    C7573i.m23583a("mEffectAdapter");
                }
                vEStickerEffectAdapter.mo70493a(indexOf, 4);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        AVDmtTextView aVDmtTextView = (AVDmtTextView) mo70328b((int) R.id.dpz);
        C7573i.m23582a((Object) aVDmtTextView, "tvHint");
        aVDmtTextView.setText(getString(R.string.o2));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C0063u a = C0069x.m159a(activity).mo147a(EditEffectVideoModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(fr…ctVideoModel::class.java)");
            this.f72152h = (EditEffectVideoModel) a;
            EditEffectVideoModel editEffectVideoModel = this.f72152h;
            if (editEffectVideoModel == null) {
                C7573i.m23583a("mViewModel");
            }
            C0043i iVar = this;
            editEffectVideoModel.mo70334a().mo70542i().observe(iVar, new C27344b(this));
            this.f72153i = new VEStickerEffectAdapter((AVDmtPanelRecyleView) mo70328b((int) R.id.cqw), this.f72095e);
            EditEffectVideoModel editEffectVideoModel2 = this.f72152h;
            if (editEffectVideoModel2 == null) {
                C7573i.m23583a("mViewModel");
            }
            editEffectVideoModel2.mo70339e().observe(iVar, new C27345c(this));
        }
        VEStickerEffectAdapter vEStickerEffectAdapter = this.f72153i;
        if (vEStickerEffectAdapter == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        vEStickerEffectAdapter.mo70494a((List) this.f72094d);
        if (!this.f72096f.isEmpty()) {
            VEStickerEffectAdapter vEStickerEffectAdapter2 = this.f72153i;
            if (vEStickerEffectAdapter2 == null) {
                C7573i.m23583a("mEffectAdapter");
            }
            vEStickerEffectAdapter2.mo70444a((EffectPointModel) this.f72096f.get(0));
        }
        VEStickerEffectAdapter vEStickerEffectAdapter3 = this.f72153i;
        if (vEStickerEffectAdapter3 == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        vEStickerEffectAdapter3.f72205a = new C27346d(this);
        AVDmtPanelRecyleView aVDmtPanelRecyleView = (AVDmtPanelRecyleView) mo70328b((int) R.id.cqw);
        C7573i.m23582a((Object) aVDmtPanelRecyleView, "recyerview");
        VEStickerEffectAdapter vEStickerEffectAdapter4 = this.f72153i;
        if (vEStickerEffectAdapter4 == null) {
            C7573i.m23583a("mEffectAdapter");
        }
        aVDmtPanelRecyleView.setAdapter(vEStickerEffectAdapter4);
        AVDmtHorizontalImageTextLayout aVDmtHorizontalImageTextLayout = (AVDmtHorizontalImageTextLayout) mo70328b((int) R.id.dpv);
        C7573i.m23582a((Object) aVDmtHorizontalImageTextLayout, "tvDelete");
        aVDmtHorizontalImageTextLayout.setVisibility(8);
        mo70332e();
    }

    /* renamed from: a */
    public final void mo70398a(Effect effect, Effect effect2, boolean z) {
        C7573i.m23587b(effect, "rawEffect");
        int indexOf = mo70329b().indexOf(effect);
        if (indexOf >= 0) {
            VEStickerEffectAdapter vEStickerEffectAdapter = this.f72153i;
            if (vEStickerEffectAdapter == null) {
                C7573i.m23583a("mEffectAdapter");
            }
            vEStickerEffectAdapter.mo70493a(indexOf, 3);
        }
    }
}
