package com.p280ss.android.mobilelib;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.EditText;
import com.bytedance.common.utility.C9738o;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.mobilelib.Validator */
public class Validator {
    private WeakReference<Context> mContextRef;
    private List<Rule> mRules = new LinkedList();

    /* renamed from: com.ss.android.mobilelib.Validator$AgreeRule */
    public static class AgreeRule implements Rule {
        private int mErrorRes;
        private WeakReference<CompoundButton> mToggleRef;

        /* renamed from: ok */
        public boolean mo53364ok() {
            if (this.mToggleRef.get() == null || !((CompoundButton) this.mToggleRef.get()).isChecked()) {
                return false;
            }
            return true;
        }

        public void handleError(Context context) {
            C9738o.m28710b(context, this.mErrorRes, 17);
        }

        public AgreeRule(CompoundButton compoundButton, int i) {
            this.mToggleRef = new WeakReference<>(compoundButton);
            this.mErrorRes = i;
        }
    }

    /* renamed from: com.ss.android.mobilelib.Validator$LengthEqualRule */
    public static class LengthEqualRule implements Rule {
        private WeakReference<EditText> mEditRef;
        private int mErrorRes;
        private int mLength;

        /* renamed from: ok */
        public boolean mo53364ok() {
            if (this.mEditRef.get() == null || ((EditText) this.mEditRef.get()).getText().toString().length() != this.mLength) {
                return false;
            }
            return true;
        }

        public void handleError(Context context) {
            C9738o.m28697a(context, context.getString(this.mErrorRes, new Object[]{Integer.valueOf(this.mLength)}));
        }

        public LengthEqualRule(EditText editText, int i, int i2) {
            this.mEditRef = new WeakReference<>(editText);
            this.mLength = i;
            this.mErrorRes = i2;
        }
    }

    /* renamed from: com.ss.android.mobilelib.Validator$NonEmptyRule */
    public static class NonEmptyRule implements Rule {
        private WeakReference<EditText> mEditRef;
        private int mErrorRes;

        /* renamed from: ok */
        public boolean mo53364ok() {
            if (this.mEditRef.get() == null || ((EditText) this.mEditRef.get()).getText().toString().length() <= 0) {
                return false;
            }
            return true;
        }

        public void handleError(Context context) {
            C9738o.m28710b(context, this.mErrorRes, 17);
        }

        public NonEmptyRule(EditText editText, int i) {
            this.mEditRef = new WeakReference<>(editText);
            this.mErrorRes = i;
        }
    }

    /* renamed from: com.ss.android.mobilelib.Validator$NotEqualRule */
    public static class NotEqualRule implements Rule {
        private WeakReference<EditText> mEditRef1;
        private WeakReference<EditText> mEditRef2;
        private int mErrorRes;

        /* renamed from: ok */
        public boolean mo53364ok() {
            if (this.mEditRef1.get() == null || this.mEditRef2.get() == null || ((EditText) this.mEditRef1.get()).getText().toString().equals(((EditText) this.mEditRef2.get()).getText().toString())) {
                return false;
            }
            return true;
        }

        public void handleError(Context context) {
            C9738o.m28697a(context, context.getString(this.mErrorRes));
        }

        public NotEqualRule(EditText editText, EditText editText2, int i) {
            this.mEditRef1 = new WeakReference<>(editText);
            this.mEditRef2 = new WeakReference<>(editText2);
            this.mErrorRes = i;
        }
    }

    /* renamed from: com.ss.android.mobilelib.Validator$Rule */
    public interface Rule {
        void handleError(Context context);

        /* renamed from: ok */
        boolean mo53364ok();
    }

    public boolean check() {
        if (this.mContextRef.get() == null) {
            return false;
        }
        for (Rule rule : this.mRules) {
            if (!rule.mo53364ok()) {
                rule.handleError((Context) this.mContextRef.get());
                return false;
            }
        }
        return true;
    }

    public static Validator with(Context context) {
        return new Validator(context);
    }

    public Validator rule(Rule rule) {
        this.mRules.add(rule);
        return this;
    }

    public Validator(Context context) {
        this.mContextRef = new WeakReference<>(context);
    }

    public Validator agree(CompoundButton compoundButton, int i) {
        return rule(new AgreeRule(compoundButton, i));
    }

    public Validator notEmpty(EditText editText, int i) {
        return rule(new NonEmptyRule(editText, i));
    }

    public Validator lengthEqual(EditText editText, int i, int i2) {
        return rule(new LengthEqualRule(editText, i, i2));
    }

    public Validator notEqual(EditText editText, EditText editText2, int i) {
        return rule(new NotEqualRule(editText, editText2, i));
    }
}
