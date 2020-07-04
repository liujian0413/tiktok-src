package com.bytedance.android.live.core.setting;

import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.utils.C3408u;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.HashSet;
import p346io.reactivex.p348d.C7326g;

public class ABTestDialog extends BaseDialogFragmentV2 {

    /* renamed from: e */
    private static HashSet<Class> f10055e;

    /* renamed from: a */
    private LinearLayout f10056a;

    /* renamed from: b */
    private C3338l f10057b;

    /* renamed from: c */
    private int f10058c;

    /* renamed from: d */
    private C7326g<Integer> f10059d;

    /* renamed from: a */
    public static ABTestDialog m12401a() {
        return new ABTestDialog();
    }

    static {
        HashSet<Class> hashSet = new HashSet<>();
        f10055e = hashSet;
        hashSet.add(Boolean.class);
        f10055e.add(Boolean.TYPE);
        f10055e.add(Integer.class);
        f10055e.add(Integer.TYPE);
        f10055e.add(Float.class);
        f10055e.add(Float.TYPE);
        f10055e.add(Long.class);
        f10055e.add(Long.TYPE);
        f10055e.add(Double.class);
        f10055e.add(Double.TYPE);
        f10055e.add(String.class);
    }

    /* renamed from: a */
    public final ABTestDialog mo10220a(int i) {
        this.f10058c = i;
        return this;
    }

    /* renamed from: a */
    public final ABTestDialog mo10221a(C3338l lVar) {
        this.f10057b = lVar;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo10225b(View view) {
        C3339m.m12450a(this.f10057b, "");
        C3303k.m12376a(this.f10059d, Integer.valueOf(this.f10058c));
        dismiss();
    }

    /* renamed from: a */
    public final ABTestDialog mo10222a(C7326g<Integer> gVar) {
        this.f10059d = gVar;
        return this;
    }

    /* renamed from: a */
    public final void mo10223a(C0608j jVar) {
        show(jVar, "AbtestDialog");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo10224a(View view) {
        String str;
        try {
            Type e = C3339m.m12456e(this.f10057b);
            if (e == String.class) {
                str = (String) m12402a(String.class, m12400a((ViewGroup) this.f10056a, (Object) C3339m.m12454c(this.f10057b)));
            } else if (e instanceof Class) {
                str = C3408u.m12669a(m12402a((Class) e, m12400a((ViewGroup) this.f10056a, (Object) C3339m.m12454c(this.f10057b))));
            } else {
                str = null;
            }
            if (C3339m.m12450a(this.f10057b, str)) {
                this.f10059d.accept(Integer.valueOf(this.f10058c));
                dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m12403a(LinearLayout linearLayout, View view) {
        if (linearLayout.getVisibility() == 0) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: a */
    private static View m12400a(ViewGroup viewGroup, Object obj) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) != null && obj == viewGroup.getChildAt(i).getTag()) {
                return viewGroup.getChildAt(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    private <T> T m12402a(Class<T> cls, View view) {
        Field[] declaredFields;
        T t = null;
        if (view == null) {
            return null;
        }
        if (!f10055e.contains(cls)) {
            try {
                t = cls.newInstance();
            } catch (Exception unused) {
            }
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    try {
                        field.set(t, m12402a(field.getType(), m12400a((ViewGroup) view, (Object) field.getName())));
                    } catch (Exception unused2) {
                    }
                }
            }
            return t;
        }
        T obj = ((EditText) view.findViewById(R.id.e_l)).getText().toString();
        if (cls == Boolean.class || cls == Boolean.TYPE) {
            try {
                t = Boolean.valueOf(((CheckedTextView) view.findViewById(R.id.ng)).isChecked());
            } catch (Exception unused3) {
                t = Boolean.valueOf(false);
            }
        } else if (cls == Integer.class || cls == Integer.TYPE) {
            try {
                t = Integer.valueOf(Integer.parseInt(String.valueOf(obj)));
            } catch (Exception unused4) {
                t = Integer.valueOf(0);
            }
        } else if (cls == Long.class || cls == Long.TYPE) {
            try {
                t = Long.valueOf(Long.parseLong(obj));
            } catch (Exception unused5) {
                t = Long.valueOf(0);
            }
        } else if (cls == Float.class || cls == Float.TYPE) {
            try {
                t = Float.valueOf(Float.parseFloat(obj));
            } catch (Exception unused6) {
                t = Float.valueOf(0.0f);
            }
        } else if (cls == Double.class || cls == Double.TYPE) {
            try {
                t = Double.valueOf(Double.parseDouble(obj));
            } catch (Exception unused7) {
                t = Double.valueOf(0.0d);
            }
        } else if (cls == String.class) {
            t = obj;
        }
        return t;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.amk, null);
        this.f10056a = (LinearLayout) inflate.findViewById(R.id.a1q);
        inflate.findViewById(R.id.sp).setOnClickListener(new C3327a(this));
        inflate.findViewById(R.id.c8b).setOnClickListener(new C3328b(this));
        getDialog().requestWindowFeature(1);
        Type e = C3339m.m12456e(this.f10057b);
        if (e instanceof Class) {
            m12404a(C3339m.m12454c(this.f10057b), (Class) e, this.f10056a, 1);
        }
        return inflate;
    }

    /* renamed from: a */
    private void m12404a(String str, Class cls, LinearLayout linearLayout, int i) {
        Field[] declaredFields;
        if (f10055e.contains(cls)) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.amj, null);
            ((TextView) inflate.findViewById(R.id.bfl)).setText(str);
            if (cls == Boolean.class || cls == Boolean.TYPE) {
                inflate.findViewById(R.id.e_l).setVisibility(8);
                final CheckedTextView checkedTextView = (CheckedTextView) inflate.findViewById(R.id.ng);
                checkedTextView.setVisibility(0);
                checkedTextView.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        checkedTextView.toggle();
                        checkedTextView.setText(String.valueOf(checkedTextView.isChecked()));
                    }
                });
            } else {
                ((EditText) inflate.findViewById(R.id.e_l)).setHint(cls.getSimpleName());
            }
            inflate.setTag(str);
            linearLayout.addView(inflate);
        } else if (i <= 3) {
            TextView textView = new TextView(getContext());
            textView.setText(str);
            linearLayout.addView(textView);
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setTag(str);
            if (i > 1) {
                linearLayout2.setVisibility(8);
            }
            MarginLayoutParams marginLayoutParams = new MarginLayoutParams(-1, -2);
            marginLayoutParams.leftMargin = 100;
            linearLayout.addView(linearLayout2, marginLayoutParams);
            textView.setOnClickListener(new C3329c(linearLayout2));
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    m12404a(field.getName(), field.getType(), linearLayout2, i + 1);
                }
            }
        }
    }
}
