package com.p280ss.android.ugc.aweme.property;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View.OnLongClickListener;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.PropertyStore.C36952a;
import com.p280ss.android.ugc.aweme.property.PropertyStore.PropertyType;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView */
public class AVABRangeView extends SettingItemBase {

    /* renamed from: a */
    DmtEditText f96796a;

    /* renamed from: b */
    C36952a f96797b;

    /* renamed from: c */
    C36942e f96798c;

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$a */
    static class C36938a implements C36942e {

        /* renamed from: a */
        C36952a f96800a;

        public C36938a(C36952a aVar) {
            this.f96800a = aVar;
        }

        /* renamed from: a */
        public final void mo93334a(String str) throws IllegalArgumentException {
            float floatValue = Float.valueOf(str).floatValue();
            if (C36989t.m118999g(this.f96800a) == null || C36989t.m118999g(this.f96800a).mo93412a(Float.valueOf(floatValue))) {
                C36989t.m118988a(this.f96800a, floatValue);
                if (C36989t.m118998f(this.f96800a) != null) {
                    C36989t.m118998f(this.f96800a).mo93317a(Float.valueOf(floatValue));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$b */
    static class C36939b implements C36942e {

        /* renamed from: a */
        C36952a f96801a;

        public C36939b(C36952a aVar) {
            this.f96801a = aVar;
        }

        /* renamed from: a */
        public final void mo93334a(String str) throws NumberFormatException, IllegalArgumentException {
            int intValue = Integer.valueOf(str).intValue();
            if (C36989t.m118999g(this.f96801a) == null || C36989t.m118999g(this.f96801a).mo93412a(Integer.valueOf(intValue))) {
                C36989t.m118989a(this.f96801a, intValue);
                if (C36989t.m118998f(this.f96801a) != null) {
                    C36989t.m118998f(this.f96801a).mo93317a(Integer.valueOf(intValue));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$c */
    static class C36940c implements C36942e {

        /* renamed from: a */
        C36952a f96802a;

        public C36940c(C36952a aVar) {
            this.f96802a = aVar;
        }

        /* renamed from: a */
        public final void mo93334a(String str) throws IllegalArgumentException {
            long longValue = Long.valueOf(str).longValue();
            if (C36989t.m118999g(this.f96802a) == null || C36989t.m118999g(this.f96802a).mo93412a(Long.valueOf(longValue))) {
                C36989t.m118990a(this.f96802a, longValue);
                if (C36989t.m118998f(this.f96802a) != null) {
                    C36989t.m118998f(this.f96802a).mo93317a(Long.valueOf(longValue));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$d */
    static class C36941d implements C36942e {

        /* renamed from: a */
        C36952a f96803a;

        public C36941d(C36952a aVar) {
            this.f96803a = aVar;
        }

        /* renamed from: a */
        public final void mo93334a(String str) throws IllegalArgumentException {
            C36989t.m118991a(this.f96803a, str);
            if (C36989t.m118998f(this.f96803a) != null) {
                C36989t.m118998f(this.f96803a).mo93317a(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.property.AVABRangeView$e */
    interface C36942e {
        /* renamed from: a */
        void mo93334a(String str) throws NumberFormatException, IllegalArgumentException;
    }

    public int getRightLayoutId() {
        return R.layout.fu;
    }

    public AVABRangeView(Context context) {
        super(context);
    }

    public void setAVABProperty(Property property) {
        mo93328a(property, property.key());
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f29170g.setOnLongClickListener(onLongClickListener);
    }

    /* renamed from: a */
    public final void mo26011a(Context context) {
        super.mo26011a(context);
        this.f29174k.setSingleLine(true);
        this.f96796a = (DmtEditText) this.f29171h.getChildAt(0);
        this.f96796a.setTextColor(-16777216);
    }

    public AVABRangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo93328a(C36952a aVar, String str) {
        if (aVar == null) {
            throw new NullPointerException();
        } else if (aVar.type() == PropertyType.Float || aVar.type() == PropertyType.Integer || aVar.type() == PropertyType.Long || aVar.type() == PropertyType.String) {
            this.f96797b = aVar;
            if (aVar.type() == PropertyType.Float) {
                this.f96796a.setText(String.valueOf(C36989t.m118994b(aVar)));
                this.f96798c = new C36938a(aVar);
            } else if (aVar.type() == PropertyType.Integer) {
                this.f96796a.setText(String.valueOf(C36989t.m118995c(aVar)));
                this.f96798c = new C36939b(aVar);
            } else if (aVar.type() == PropertyType.Long) {
                this.f96796a.setText(String.valueOf(C36989t.m118996d(aVar)));
                this.f96798c = new C36940c(aVar);
            } else if (aVar.type() == PropertyType.String) {
                this.f96796a.setText(C36989t.m118997e(aVar));
                this.f96798c = new C36941d(aVar);
            }
            setStartText(str);
            this.f96796a.addTextChangedListener(new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    if (editable.toString().endsWith("\n")) {
                        try {
                            editable.delete(editable.length() - 1, editable.length());
                            AVABRangeView.this.f96798c.mo93334a(editable.toString());
                        } catch (NumberFormatException unused) {
                            C10761a.m31403c(AVABRangeView.this.getContext(), "参数格式错误").mo25750a();
                        } catch (IllegalArgumentException unused2) {
                            C10761a.m31403c(AVABRangeView.this.getContext(), "参数区间错误").mo25750a();
                        }
                    }
                }
            });
        } else {
            throw new IllegalArgumentException();
        }
    }

    public AVABRangeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
