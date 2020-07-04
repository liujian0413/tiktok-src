package com.bytedance.dataplatform;

import android.text.TextUtils;
import com.bytedance.dataplatform.p508b.C10038a;
import java.io.Serializable;
import java.lang.reflect.Type;

public class ExperimentEntity implements Serializable {
    private C10038a clientDataSource;
    private Object defaultValue;
    private String description;
    private String key;
    private String[] option;
    private Type type;

    public C10038a getClientDataSource() {
        return this.clientDataSource;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public String getDescription() {
        return this.description;
    }

    public String getKey() {
        return this.key;
    }

    public String[] getOption() {
        return this.option;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(this.key)) {
            return 0;
        }
        return this.key.hashCode();
    }

    public ExperimentEntity withClientDataSource(C10038a aVar) {
        this.clientDataSource = aVar;
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExperimentEntity) || !TextUtils.equals(this.key, ((ExperimentEntity) obj).key)) {
            return false;
        }
        return true;
    }

    public ExperimentEntity(String str, Type type2, Object obj, String str2, String... strArr) {
        this.key = str;
        this.description = str2;
        this.option = strArr;
        this.type = type2;
        this.defaultValue = obj;
    }
}
