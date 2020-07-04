package com.bytedance.lighten.core;

public enum ImagePiplinePriority {
    LOW,
    MEDIUM,
    HIGH;

    public static ImagePiplinePriority getHigherPriority(ImagePiplinePriority imagePiplinePriority, ImagePiplinePriority imagePiplinePriority2) {
        if (imagePiplinePriority == null) {
            return imagePiplinePriority2;
        }
        if (imagePiplinePriority2 != null && imagePiplinePriority.ordinal() <= imagePiplinePriority2.ordinal()) {
            return imagePiplinePriority2;
        }
        return imagePiplinePriority;
    }
}
