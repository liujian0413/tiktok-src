package com.ixigua.downloader.pojo;

import android.text.TextUtils;
import java.io.Serializable;

public class MetaData implements Serializable {
    public static final int VERSION_CODE = 1;
    private static final long serialVersionUID = -4900821753218174750L;
    private String data;
    private int versionCode;

    public String getData() {
        return this.data;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public BlockInfo parseData() {
        if (TextUtils.isEmpty(this.data) || this.versionCode != 1) {
            return null;
        }
        return BlockInfo.parse(this.data);
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }
}
