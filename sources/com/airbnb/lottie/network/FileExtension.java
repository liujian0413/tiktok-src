package com.airbnb.lottie.network;

import com.airbnb.lottie.C1745d;

public enum FileExtension {
    Json(".json"),
    Zip(".zip");
    
    public final String extension;

    public final String toString() {
        return this.extension;
    }

    public final String tempExtension() {
        StringBuilder sb = new StringBuilder(".temp");
        sb.append(this.extension);
        return sb.toString();
    }

    public static FileExtension forFile(String str) {
        FileExtension[] values;
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        StringBuilder sb = new StringBuilder("Unable to find correct extension for ");
        sb.append(str);
        C1745d.m8323a(sb.toString());
        return Json;
    }

    private FileExtension(String str) {
        this.extension = str;
    }
}
