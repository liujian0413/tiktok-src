package com.p280ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p280ss.android.ugc.aweme.legacy.common.R$styleable;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout */
public class TagFlowLayout extends FlowLayout implements C43555a {

    /* renamed from: d */
    private C43554a f112772d;

    /* renamed from: e */
    private int f112773e;

    /* renamed from: f */
    private Set<Integer> f112774f;

    /* renamed from: g */
    private C43551a f112775g;

    /* renamed from: h */
    private C43553c f112776h;

    /* renamed from: i */
    private C43552b f112777i;

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout$a */
    public interface C43551a {
    }

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout$b */
    public interface C43552b {
    }

    /* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout$c */
    public interface C43553c {
    }

    public C43554a getAdapter() {
        return this.f112772d;
    }

    public Set<Integer> getSelectedList() {
        return new HashSet(this.f112774f);
    }

    /* renamed from: a */
    private void m138053a() {
        removeAllViews();
        C43554a aVar = this.f112772d;
        HashSet<Integer> hashSet = this.f112772d.f112781d;
        for (int i = 0; i < aVar.mo105479a(); i++) {
            View a = aVar.mo67958a(this, i, aVar.mo105480a(i));
            C43557c cVar = new C43557c(getContext());
            aVar.mo105481a(i, cVar);
            cVar.setAllowSelect(true);
            a.setDuplicateParentStateEnabled(true);
            if (a.getLayoutParams() != null) {
                cVar.setLayoutParams(a.getLayoutParams());
            } else {
                cVar.setLayoutParams(new MarginLayoutParams(-2, -2));
            }
            a.setLayoutParams(new LayoutParams(-1, -1));
            cVar.addView(a);
            addView(cVar);
            if (hashSet.contains(Integer.valueOf(i))) {
                m138054a(i, cVar);
            }
            aVar.mo105480a(i);
            a.setClickable(false);
            cVar.setOnClickListener(new C43556b(this, cVar, i));
        }
        this.f112774f.addAll(hashSet);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        StringBuilder sb = new StringBuilder();
        if (this.f112774f.size() > 0) {
            for (Integer intValue : this.f112774f) {
                sb.append(intValue.intValue());
                sb.append("|");
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        bundle.putString("key_choose_pos", sb.toString());
        return bundle;
    }

    public void setOnSelectListener(C43551a aVar) {
        this.f112775g = aVar;
    }

    public void setOnSelectStateChangeListener(C43552b bVar) {
        this.f112777i = bVar;
    }

    public void setOnTagClickListener(C43553c cVar) {
        this.f112776h = cVar;
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public void setAdapter(C43554a aVar) {
        this.f112772d = aVar;
        this.f112772d.f112780c = this;
        this.f112774f.clear();
        m138053a();
    }

    public void setMaxSelectCount(int i) {
        if (this.f112774f.size() > i) {
            this.f112774f.clear();
        }
        this.f112773e = i;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String parseInt : string.split("\\|")) {
                    int parseInt2 = Integer.parseInt(parseInt);
                    this.f112774f.add(Integer.valueOf(parseInt2));
                    C43557c cVar = (C43557c) getChildAt(parseInt2);
                    if (cVar != null) {
                        m138054a(parseInt2, cVar);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable("key_default"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* renamed from: a */
    private void m138054a(int i, C43557c cVar) {
        cVar.setChecked(true);
        cVar.getTagView();
    }

    /* renamed from: b */
    private void m138056b(int i, C43557c cVar) {
        cVar.setChecked(false);
        cVar.getTagView();
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C43557c cVar = (C43557c) getChildAt(i3);
            if (cVar.getVisibility() != 8 && cVar.getTagView().getVisibility() == 8) {
                cVar.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private boolean m138055a(C43557c cVar, int i) {
        if (!cVar.f112786a) {
            return false;
        }
        if (cVar.isChecked()) {
            m138056b(i, cVar);
            this.f112774f.remove(Integer.valueOf(i));
        } else if (this.f112773e == 1 && this.f112774f.size() == 1) {
            Integer num = (Integer) this.f112774f.iterator().next();
            m138056b(num.intValue(), (C43557c) getChildAt(num.intValue()));
            m138054a(i, cVar);
            this.f112774f.remove(num);
            this.f112774f.add(Integer.valueOf(i));
        } else if (this.f112773e > 0 && this.f112774f.size() >= this.f112773e) {
            return false;
        } else {
            m138054a(i, cVar);
            this.f112774f.add(Integer.valueOf(i));
            C43552b bVar = this.f112777i;
        }
        if (this.f112775g != null) {
            new HashSet(this.f112774f);
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo105469a(C43557c cVar, int i, View view) {
        m138055a(cVar, i);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f112773e = -1;
        this.f112774f = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TagFlowLayout);
        this.f112773e = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
    }
}
