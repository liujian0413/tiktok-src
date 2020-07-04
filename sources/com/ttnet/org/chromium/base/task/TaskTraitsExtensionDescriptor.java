package com.ttnet.org.chromium.base.task;

public interface TaskTraitsExtensionDescriptor<Extension> {
    Extension fromSerializedData(byte[] bArr);

    int getId();

    byte[] toSerializedData(Extension extension);
}
