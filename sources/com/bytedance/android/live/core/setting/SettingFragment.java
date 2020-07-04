package com.bytedance.android.live.core.setting;

import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3408u;
import com.bytedance.android.live.core.widget.simple.SimpleViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import p346io.reactivex.p348d.C7326g;

public class SettingFragment extends BaseFragment {

    /* renamed from: a */
    private RecyclerView f10067a;

    /* renamed from: b */
    private String[] f10068b;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public static SettingFragment m12413a(String[] strArr) {
        SettingFragment settingFragment = new SettingFragment();
        settingFragment.f10068b = strArr;
        return settingFragment;
    }

    /* renamed from: b */
    public static String[] m12415b(C3338l lVar) {
        String[] f = C3339m.m12457f(lVar);
        if (f == null || f.length == 0) {
            return null;
        }
        String[] strArr = new String[(f.length + 1)];
        for (int i = 0; i < f.length; i++) {
            strArr[i] = f[i];
        }
        strArr[f.length] = C3358ac.m12515a((int) R.string.fci);
        return strArr;
    }

    /* renamed from: a */
    public static CharSequence m12414a(C3338l lVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append("[ ");
        int length = spannableStringBuilder.length();
        String a = C3339m.m12447a(lVar);
        String b = C3339m.m12451b(lVar);
        if (C3339m.m12452b()) {
            spannableStringBuilder.append(" debug:").append(C3408u.m12669a(C3339m.m12459h(lVar)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), length, spannableStringBuilder.length(), 33);
        } else if (TextUtils.isEmpty(b) && TextUtils.isEmpty(a)) {
            spannableStringBuilder.append(" default:").append(String.valueOf(C3339m.m12458g(lVar)));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-7829368), length, spannableStringBuilder.length(), 33);
        } else if (TextUtils.equals(b, a) || TextUtils.isEmpty(b)) {
            spannableStringBuilder.append(" server:").append(String.valueOf(a));
        } else if (!TextUtils.isEmpty(b)) {
            spannableStringBuilder.append(" local:").append(String.valueOf(b)).append(" server:").append(String.valueOf(a));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), length, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.append(" ]\n").append(C3339m.m12455d(lVar)).append("\n");
        String[] f = C3339m.m12457f(lVar);
        if (f != null) {
            for (String append : f) {
                spannableStringBuilder.append(append).append("\n");
            }
        }
        return spannableStringBuilder;
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f10067a.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f10067a.setAdapter(new SimpleRecycleAdapter<C3338l>(getContext(), C3330d.m12426a(this.f10068b)) {
            /* renamed from: b */
            public final /* synthetic */ void mo10229b(SimpleViewHolder simpleViewHolder, Object obj, int i) {
                m12416a(simpleViewHolder, (C3338l) obj, i);
            }

            /* renamed from: a */
            private static void m12416a(SimpleViewHolder simpleViewHolder, C3338l lVar, int i) {
                simpleViewHolder.mo10341a((int) R.id.title, C3339m.m12454c(lVar));
                simpleViewHolder.mo10340a((int) R.id.a7m, SettingFragment.m12414a(lVar));
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public void mo10227a(SimpleViewHolder simpleViewHolder, C3338l lVar, int i) {
                String[] f = C3339m.m12457f(lVar);
                if (f == null || f.length <= 0) {
                    ABTestDialog.m12401a().mo10221a(lVar).mo10220a(i).mo10222a((C7326g<Integer>) new C3337k<Integer>(this)).mo10223a((C0608j) SettingFragment.this.mFragmentManager);
                } else {
                    new Builder(SettingFragment.this.getContext()).setTitle(C3339m.m12455d(lVar)).setSingleChoiceItems(SettingFragment.m12415b(lVar), -1, new C3336j(this, f, lVar, i)).create().show();
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo10228a(String[] strArr, C3338l lVar, int i, DialogInterface dialogInterface, int i2) {
                if (i2 >= 0) {
                    if (i2 == strArr.length) {
                        C3339m.m12450a(lVar, null);
                    } else {
                        C3339m.m12450a(lVar, strArr[i2].split(":")[0]);
                    }
                    notifyItemChanged(i);
                }
                dialogInterface.dismiss();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f10067a = new RecyclerView(getContext());
        this.f10067a.setLayoutParams(new LayoutParams(-1, -1));
        return this.f10067a;
    }
}
