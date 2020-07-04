package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DeviceInfo */
public final class DeviceInfo extends Message<DeviceInfo, Builder> {
    public static final DefaultValueProtoAdapter<DeviceInfo> ADAPTER = new ProtoAdapter_DeviceInfo();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String brand;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String device;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String model;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DeviceInfo$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<DeviceInfo, Builder> {
        public String brand;
        public String device;
        public String model;

        public final DeviceInfo build() {
            return new DeviceInfo(this.brand, this.device, this.model, super.buildUnknownFields());
        }

        public final Builder brand(String str) {
            this.brand = str;
            return this;
        }

        public final Builder device(String str) {
            this.device = str;
            return this;
        }

        public final Builder model(String str) {
            this.model = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.DeviceInfo$ProtoAdapter_DeviceInfo */
    static final class ProtoAdapter_DeviceInfo extends DefaultValueProtoAdapter<DeviceInfo> {
        public final DeviceInfo redact(DeviceInfo deviceInfo) {
            return deviceInfo;
        }

        public ProtoAdapter_DeviceInfo() {
            super(FieldEncoding.LENGTH_DELIMITED, DeviceInfo.class);
        }

        public final DeviceInfo decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (DeviceInfo) null);
        }

        public final int encodedSize(DeviceInfo deviceInfo) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, deviceInfo.brand) + ProtoAdapter.STRING.encodedSizeWithTag(2, deviceInfo.device) + ProtoAdapter.STRING.encodedSizeWithTag(3, deviceInfo.model) + deviceInfo.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, DeviceInfo deviceInfo) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, deviceInfo.brand);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, deviceInfo.device);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, deviceInfo.model);
            protoWriter.writeBytes(deviceInfo.unknownFields());
        }

        public final DeviceInfo decode(ProtoReader protoReader, DeviceInfo deviceInfo) throws IOException {
            Builder builder;
            DeviceInfo deviceInfo2 = (DeviceInfo) C10938a.m32097a().mo26425a(DeviceInfo.class, deviceInfo);
            if (deviceInfo2 != null) {
                builder = deviceInfo2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.brand((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.device((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.model((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (deviceInfo2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getBrand() throws NullValueException {
        if (this.brand != null) {
            return this.brand;
        }
        throw new NullValueException();
    }

    public final String getDevice() throws NullValueException {
        if (this.device != null) {
            return this.device;
        }
        throw new NullValueException();
    }

    public final String getModel() throws NullValueException {
        if (this.model != null) {
            return this.model;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.brand = this.brand;
        builder.device = this.device;
        builder.model = this.model;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.brand != null) {
            i = this.brand.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.device != null) {
            i2 = this.device.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.model != null) {
            i4 = this.model.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.brand != null) {
            sb.append(", brand=");
            sb.append(this.brand);
        }
        if (this.device != null) {
            sb.append(", device=");
            sb.append(this.device);
        }
        if (this.model != null) {
            sb.append(", model=");
            sb.append(this.model);
        }
        StringBuilder replace = sb.replace(0, 2, "DeviceInfo{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo deviceInfo = (DeviceInfo) obj;
        if (!unknownFields().equals(deviceInfo.unknownFields()) || !Internal.equals(this.brand, deviceInfo.brand) || !Internal.equals(this.device, deviceInfo.device) || !Internal.equals(this.model, deviceInfo.model)) {
            return false;
        }
        return true;
    }

    public DeviceInfo(String str, String str2, String str3) {
        this(str, str2, str3, ByteString.EMPTY);
    }

    public DeviceInfo(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.brand = str;
        this.device = str2;
        this.model = str3;
    }
}
