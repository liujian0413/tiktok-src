package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.shortvideo.C38527bf;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemViewHolder.C39425a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemViewHolder.C39426b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c.C39441a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39440c.C39444d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.vesdk.runtime.C45345b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import dmt.p1861av.video.C47462j;
import dmt.p1861av.video.C47466l.C47467a;
import dmt.p1861av.video.VEVideoPublishEditViewModel;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter */
public final class AudioItemAdapter extends C1262a<C1293v> implements C39426b {

    /* renamed from: a */
    public boolean f102351a;

    /* renamed from: b */
    public CategoryPageModel f102352b;

    /* renamed from: c */
    public C39465j f102353c;

    /* renamed from: d */
    public final AppCompatActivity f102354d;

    /* renamed from: e */
    private int f102355e;

    /* renamed from: f */
    private List<? extends Effect> f102356f;

    /* renamed from: g */
    private RecyclerView f102357g;

    /* renamed from: h */
    private C39426b f102358h = new C39426b(this) {

        /* renamed from: a */
        final /* synthetic */ AudioItemAdapter f102363a;

        {
            this.f102363a = r1;
        }

        /* renamed from: a */
        public final void mo98248a(View view, int i) {
            C7573i.m23587b(view, "view");
            this.f102363a.f102351a = true;
            if (i == 0) {
                this.f102363a.mo98251b(i);
            } else {
                this.f102363a.mo98246a(i);
            }
        }
    };

    /* renamed from: i */
    private final VEVideoPublishEditViewModel f102359i;

    /* renamed from: j */
    private final C15389d f102360j;

    /* renamed from: k */
    private final VideoPublishEditModel f102361k;

    /* renamed from: l */
    private final AudioEffectParam f102362l;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter$a */
    public static final class C39421a implements C39444d {

        /* renamed from: a */
        final /* synthetic */ AudioItemAdapter f102364a;

        /* renamed from: b */
        final /* synthetic */ Effect f102365b;

        /* renamed from: c */
        final /* synthetic */ int f102366c;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter$a$a */
        static final class C39422a<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C39421a f102367a;

            C39422a(C39421a aVar) {
                this.f102367a = aVar;
            }

            public final /* synthetic */ Object call() {
                m125931a();
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private void m125931a() {
                C10761a.m31399c((Context) this.f102367a.f102364a.f102354d, (int) R.string.p2).mo25750a();
                this.f102367a.f102364a.mo98247a(this.f102367a.f102366c, 3);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter$a$b */
        static final class C39423b<V> implements Callable<Object> {

            /* renamed from: a */
            final /* synthetic */ C39421a f102368a;

            /* renamed from: b */
            final /* synthetic */ Effect f102369b;

            C39423b(C39421a aVar, Effect effect) {
                this.f102368a = aVar;
                this.f102369b = effect;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7581n call() {
                CategoryPageModel categoryPageModel = this.f102368a.f102364a.f102352b;
                if (categoryPageModel != null) {
                    CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
                    if (categoryEffectModel != null) {
                        List<Effect> list = categoryEffectModel.effects;
                        if (list != null) {
                            list.set(this.f102368a.f102366c - 1, this.f102369b);
                        }
                    }
                }
                this.f102368a.f102364a.mo98247a(this.f102368a.f102366c, 1);
                this.f102368a.f102364a.mo98252c(this.f102368a.f102366c);
                C39465j jVar = this.f102368a.f102364a.f102353c;
                if (jVar == null) {
                    return null;
                }
                jVar.mo98281a(this.f102368a.f102365b);
                return C7581n.f20898a;
            }
        }

        /* renamed from: a */
        public final void mo98253a(Effect effect) {
            CharSequence charSequence;
            String str;
            String str2 = null;
            if (effect != null) {
                charSequence = effect.getEffectId();
            } else {
                charSequence = null;
            }
            if (TextUtils.equals(charSequence, this.f102365b.getEffectId())) {
                C1592h.m7855a((Callable<TResult>) new C39423b<TResult>(this, effect), C1592h.f5958b);
                AudioItemAdapter audioItemAdapter = this.f102364a;
                String a = AudioItemAdapter.m125913a(effect);
                if (effect != null) {
                    str = C39428a.m125950b(effect);
                } else {
                    str = null;
                }
                if (effect != null) {
                    str2 = effect.getUnzipPath();
                }
                audioItemAdapter.mo98250a(a, str, str2);
            }
        }

        /* renamed from: a */
        public final void mo98254a(Effect effect, C43726c cVar) {
            String str;
            C7573i.m23587b(cVar, "e");
            if (effect != null) {
                str = effect.getEffectId();
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.f102365b.getEffectId())) {
                C1592h.m7855a((Callable<TResult>) new C39422a<TResult>(this), C1592h.f5958b);
            }
        }

        C39421a(AudioItemAdapter audioItemAdapter, Effect effect, int i) {
            this.f102364a = audioItemAdapter;
            this.f102365b = effect;
            this.f102366c = i;
        }
    }

    /* renamed from: a */
    public final void mo98245a() {
        mo98252c(0);
    }

    public final int getItemCount() {
        int i;
        CategoryPageModel categoryPageModel = this.f102352b;
        if (categoryPageModel != null) {
            CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
            if (categoryEffectModel != null) {
                List<Effect> list = categoryEffectModel.effects;
                if (list != null) {
                    i = list.size();
                    return i + 1;
                }
            }
        }
        i = 0;
        return i + 1;
    }

    /* renamed from: b */
    private final boolean m125917b() {
        Integer num;
        if (this.f102360j != null) {
            AudioEffectParam audioEffectParam = this.f102362l;
            if (audioEffectParam != null) {
                num = Integer.valueOf(audioEffectParam.getTrackType());
            } else {
                num = null;
            }
            if (num != null && !TextUtils.isEmpty(this.f102362l.getEffectPath())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m125913a(Effect effect) {
        if (effect == null) {
            return "";
        }
        String effectId = effect.getEffectId();
        if (effectId == null) {
            effectId = "";
        }
        return effectId;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f102357g = recyclerView;
    }

    /* renamed from: a */
    private final void m125914a(boolean z) {
        String str;
        if (!this.f102351a) {
            AudioEffectParam audioEffectParam = this.f102362l;
            if (audioEffectParam != null) {
                str = audioEffectParam.getEffectPath();
            } else {
                str = null;
            }
            if (str != null && m125917b()) {
                m125916b(z);
            }
        }
    }

    /* renamed from: c */
    private final boolean m125918c(Effect effect) {
        String str;
        AudioEffectParam audioEffectParam = this.f102362l;
        String str2 = null;
        if (audioEffectParam != null) {
            str = audioEffectParam.getEffectTag();
        } else {
            str = null;
        }
        if (C39428a.m125949a(effect, str)) {
            CharSequence unzipPath = effect.getUnzipPath();
            AudioEffectParam audioEffectParam2 = this.f102362l;
            if (audioEffectParam2 != null) {
                str2 = audioEffectParam2.getEffectPath();
            }
            if (TextUtils.equals(unzipPath, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private final boolean m125919d(Effect effect) {
        String str;
        AudioEffectParam audioEffectParam = this.f102362l;
        String str2 = null;
        if (audioEffectParam != null) {
            str = audioEffectParam.getEffectTag();
        } else {
            str = null;
        }
        if (!C39428a.m125949a(effect, str)) {
            CharSequence unzipPath = effect.getUnzipPath();
            AudioEffectParam audioEffectParam2 = this.f102362l;
            if (audioEffectParam2 != null) {
                str2 = audioEffectParam2.getEffectPath();
            }
            if (TextUtils.equals(unzipPath, str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final void m125916b(boolean z) {
        int i = 0;
        if (this.f102362l == null) {
            mo98252c(0);
            return;
        }
        int i2 = -1;
        List<? extends Effect> list = this.f102356f;
        if (list != null) {
            for (Object next : list) {
                int i3 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                Effect effect = (Effect) next;
                if (effect.getUnzipPath() != null && C38527bf.m123172a(effect.getUnzipPath()) && (m125918c(effect) || m125919d(effect))) {
                    i2 = i;
                }
                i = i3;
            }
        }
        this.f102355e = i2 + 1;
        if (this.f102355e > 0) {
            mo98252c(this.f102355e);
            return;
        }
        if (z) {
            mo98251b(this.f102355e);
        }
    }

    /* renamed from: a */
    public final void mo98246a(int i) {
        CategoryPageModel categoryPageModel = this.f102352b;
        if (categoryPageModel != null) {
            CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
            if (categoryEffectModel != null) {
                List<Effect> list = categoryEffectModel.effects;
                if (list != null) {
                    Effect effect = (Effect) list.get(i - 1);
                    if (effect != null) {
                        m125915b(effect);
                        String unzipPath = effect.getUnzipPath();
                        if (unzipPath == null) {
                            unzipPath = "";
                        }
                        C39441a.m125976a();
                        if (C39440c.m125971a(effect)) {
                            mo98250a(m125913a(effect), C39428a.m125950b(effect), unzipPath);
                            mo98252c(i);
                            C39465j jVar = this.f102353c;
                            if (jVar != null) {
                                jVar.mo98281a(effect);
                            }
                        } else {
                            mo98247a(i, 2);
                            C39441a.m125976a();
                            C39440c.m125969a(effect, (C39444d) new C39421a(this, effect, i));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo98252c(int i) {
        C1293v vVar;
        int itemCount = getItemCount();
        int i2 = this.f102355e;
        C1293v vVar2 = null;
        if (i2 >= 0 && itemCount > i2) {
            RecyclerView recyclerView = this.f102357g;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(this.f102355e);
            } else {
                vVar = null;
            }
            if (vVar instanceof AudioItemViewHolder) {
                ((AudioItemViewHolder) vVar).mo98260a(false);
            } else {
                notifyItemChanged(this.f102355e);
            }
        }
        this.f102355e = i;
        if (this.f102355e < getItemCount()) {
            RecyclerView recyclerView2 = this.f102357g;
            if (recyclerView2 != null) {
                vVar2 = recyclerView2.mo5575f(this.f102355e);
            }
            if (vVar2 instanceof AudioItemViewHolder) {
                ((AudioItemViewHolder) vVar2).mo98260a(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        if (r2 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r2 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0072, code lost:
        if (r2 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        if (r2 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r2 == null) goto L_0x0034;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m125915b(com.p280ss.android.ugc.effectmanager.effect.model.Effect r5) {
        /*
            r4 = this;
            java.lang.String r0 = "select_voice_effect"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "video_edit_page"
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "effect_name"
            java.lang.String r3 = r5.getName()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "effect_id"
            java.lang.String r5 = r5.getEffectId()
            com.ss.android.ugc.aweme.app.g.d r5 = r1.mo59973a(r2, r5)
            java.lang.String r1 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r4.f102361k
            if (r2 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r2 = r2.getAvetParameter()
            if (r2 == 0) goto L_0x0034
            java.lang.String r2 = r2.getShootWay()
            if (r2 != 0) goto L_0x0036
        L_0x0034:
            java.lang.String r2 = ""
        L_0x0036:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r2)
            java.lang.String r1 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r4.f102361k
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = r2.creationId
            if (r2 != 0) goto L_0x0046
        L_0x0044:
            java.lang.String r2 = ""
        L_0x0046:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r2)
            java.lang.String r1 = "content_source"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r4.f102361k
            if (r2 == 0) goto L_0x005c
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r2 = r2.getAvetParameter()
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = r2.getContentSource()
            if (r2 != 0) goto L_0x005e
        L_0x005c:
            java.lang.String r2 = ""
        L_0x005e:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r2)
            java.lang.String r1 = "shoot_entrance"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r4.f102361k
            if (r2 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r2 = r2.getAvetParameter()
            if (r2 == 0) goto L_0x0074
            java.lang.String r2 = r2.getStoryShootEntrance()
            if (r2 != 0) goto L_0x0076
        L_0x0074:
            java.lang.String r2 = ""
        L_0x0076:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r2)
            java.lang.String r1 = "content_type"
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r4.f102361k
            if (r2 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.shortvideo.model.AVETParameter r2 = r2.getAvetParameter()
            if (r2 == 0) goto L_0x008c
            java.lang.String r2 = r2.getContentType()
            if (r2 != 0) goto L_0x008e
        L_0x008c:
            java.lang.String r2 = ""
        L_0x008e:
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59973a(r1, r2)
            java.lang.String r1 = "local_time_ms"
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.app.g.d r5 = r5.mo59971a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioItemAdapter.m125915b(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    /* renamed from: b */
    public final void mo98251b(int i) {
        boolean z;
        mo98252c(i);
        C47462j c = this.f102359i.mo119511c();
        C7573i.m23582a((Object) c, "viewModel.audioEffectOpLiveData");
        VideoPublishEditModel videoPublishEditModel = this.f102361k;
        if (videoPublishEditModel != null) {
            z = videoPublishEditModel.isReviewVideo();
        } else {
            z = false;
        }
        c.setValue(C47467a.m148182a(true, z));
    }

    /* renamed from: a */
    public final void mo98247a(int i, int i2) {
        C1293v vVar;
        int itemCount = getItemCount();
        if (i >= 0 && itemCount > i) {
            RecyclerView recyclerView = this.f102357g;
            if (recyclerView != null) {
                vVar = recyclerView.mo5575f(i);
            } else {
                vVar = null;
            }
            if (vVar instanceof AudioItemViewHolder) {
                ((AudioItemViewHolder) vVar).mo98258a(i2);
                return;
            }
            notifyItemChanged(i);
        }
    }

    public final void onBindViewHolder(C1293v vVar, int i) {
        Effect effect;
        boolean z;
        C7573i.m23587b(vVar, "viewHolder");
        if (vVar instanceof AudioItemViewHolder) {
            if (i > 0) {
                List<? extends Effect> list = this.f102356f;
                if (list == null) {
                    C7573i.m23580a();
                }
                effect = (Effect) list.get(i - 1);
            } else {
                effect = null;
            }
            AudioItemViewHolder audioItemViewHolder = (AudioItemViewHolder) vVar;
            audioItemViewHolder.mo98259a(effect);
            if (i == this.f102355e) {
                z = true;
            } else {
                z = false;
            }
            audioItemViewHolder.mo98260a(z);
        }
    }

    public final C1293v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C7573i.m23587b(viewGroup, "viewGroup");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C7573i.m23582a((Object) from, "LayoutInflater.from(viewGroup.context)");
        return new AudioItemViewHolder(C39425a.m125943a(from, viewGroup), this);
    }

    /* renamed from: a */
    public final void mo98248a(View view, int i) {
        C7573i.m23587b(view, "view");
        C39426b bVar = this.f102358h;
        if (bVar != null) {
            bVar.mo98248a(view, i);
        }
    }

    /* renamed from: a */
    public final void mo98249a(CategoryPageModel categoryPageModel, boolean z) {
        C7573i.m23587b(categoryPageModel, "model");
        if (!C7573i.m23585a((Object) categoryPageModel, (Object) this.f102352b)) {
            CategoryEffectModel categoryEffectModel = categoryPageModel.category_effects;
            if (categoryEffectModel != null) {
                List<Effect> list = categoryEffectModel.effects;
                if (list != null) {
                    this.f102356f = list;
                    this.f102352b = categoryPageModel;
                    notifyDataSetChanged();
                    m125914a(z);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo98250a(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        String str4;
        Integer num;
        if (this.f102360j != null && str3 != null) {
            boolean z3 = false;
            if (str3.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0052o o = this.f102359i.mo119523o();
                C7573i.m23582a((Object) o, "viewModel.reverseLiveData");
                Boolean bool = (Boolean) o.getValue();
                if (bool == null) {
                    bool = Boolean.valueOf(false);
                }
                C7573i.m23582a((Object) bool, "viewModel.reverseLiveData.value ?: false");
                boolean booleanValue = bool.booleanValue();
                VideoPublishEditModel videoPublishEditModel = this.f102361k;
                if (videoPublishEditModel != null) {
                    z2 = videoPublishEditModel.isFastImport;
                } else {
                    z2 = false;
                }
                Integer num2 = null;
                if (!booleanValue || !z2) {
                    i = C39428a.m125947a(this.f102361k);
                } else {
                    C45345b a = this.f102360j.mo38796a();
                    if (a != null) {
                        num = Integer.valueOf(a.f116804i);
                    } else {
                        num = null;
                    }
                    i = num.intValue();
                }
                if (!booleanValue || !z2) {
                    i2 = 0;
                } else {
                    i2 = this.f102360j.mo38796a().f116803h;
                }
                if (str2 == null) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                C15389d dVar = this.f102360j;
                if (dVar != null) {
                    num2 = Integer.valueOf(dVar.mo38860l());
                }
                int intValue = num2.intValue();
                C39441a.m125976a();
                AudioEffectParam audioEffectParam = new AudioEffectParam(str, i, i2, str3, str4, 0, intValue, C39440c.m125972a(str3));
                audioEffectParam.setShowErrorToast(true);
                C47462j c = this.f102359i.mo119511c();
                C7573i.m23582a((Object) c, "viewModel.audioEffectOpLiveData");
                VideoPublishEditModel videoPublishEditModel2 = this.f102361k;
                if (videoPublishEditModel2 != null) {
                    z3 = videoPublishEditModel2.isReviewVideo();
                }
                c.setValue(C47467a.m148183a(true, z3, audioEffectParam));
            }
        }
    }

    public AudioItemAdapter(AppCompatActivity appCompatActivity, C15389d dVar, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam) {
        C7573i.m23587b(appCompatActivity, "context");
        this.f102354d = appCompatActivity;
        this.f102360j = dVar;
        this.f102361k = videoPublishEditModel;
        this.f102362l = audioEffectParam;
        C0063u a = C0069x.m159a((FragmentActivity) this.f102354d).mo147a(VEVideoPublishEditViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(co…ditViewModel::class.java)");
        this.f102359i = (VEVideoPublishEditViewModel) a;
    }
}
