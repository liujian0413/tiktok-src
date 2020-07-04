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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct */
public final class BindWindowsStruct extends Message<BindWindowsStruct, Builder> {
    public static final DefaultValueProtoAdapter<BindWindowsStruct> ADAPTER = new ProtoAdapter_BindWindowsStruct();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String bind_desc;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String bind_title;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer interval;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 6)
    public final Integer login_platform;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 5)
    public final Boolean open_window;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer total_times;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<BindWindowsStruct, Builder> {
        public String bind_desc;
        public String bind_title;
        public Integer interval;
        public Integer login_platform;
        public Boolean open_window;
        public Integer total_times;

        public final BindWindowsStruct build() {
            BindWindowsStruct bindWindowsStruct = new BindWindowsStruct(this.bind_title, this.bind_desc, this.total_times, this.interval, this.open_window, this.login_platform, super.buildUnknownFields());
            return bindWindowsStruct;
        }

        public final Builder bind_desc(String str) {
            this.bind_desc = str;
            return this;
        }

        public final Builder bind_title(String str) {
            this.bind_title = str;
            return this;
        }

        public final Builder interval(Integer num) {
            this.interval = num;
            return this;
        }

        public final Builder login_platform(Integer num) {
            this.login_platform = num;
            return this;
        }

        public final Builder open_window(Boolean bool) {
            this.open_window = bool;
            return this;
        }

        public final Builder total_times(Integer num) {
            this.total_times = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.BindWindowsStruct$ProtoAdapter_BindWindowsStruct */
    static final class ProtoAdapter_BindWindowsStruct extends DefaultValueProtoAdapter<BindWindowsStruct> {
        public final BindWindowsStruct redact(BindWindowsStruct bindWindowsStruct) {
            return bindWindowsStruct;
        }

        public ProtoAdapter_BindWindowsStruct() {
            super(FieldEncoding.LENGTH_DELIMITED, BindWindowsStruct.class);
        }

        public final BindWindowsStruct decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (BindWindowsStruct) null);
        }

        public final int encodedSize(BindWindowsStruct bindWindowsStruct) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, bindWindowsStruct.bind_title) + ProtoAdapter.STRING.encodedSizeWithTag(2, bindWindowsStruct.bind_desc) + ProtoAdapter.INT32.encodedSizeWithTag(3, bindWindowsStruct.total_times) + ProtoAdapter.INT32.encodedSizeWithTag(4, bindWindowsStruct.interval) + ProtoAdapter.BOOL.encodedSizeWithTag(5, bindWindowsStruct.open_window) + ProtoAdapter.INT32.encodedSizeWithTag(6, bindWindowsStruct.login_platform) + bindWindowsStruct.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, BindWindowsStruct bindWindowsStruct) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bindWindowsStruct.bind_title);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bindWindowsStruct.bind_desc);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, bindWindowsStruct.total_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, bindWindowsStruct.interval);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, bindWindowsStruct.open_window);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 6, bindWindowsStruct.login_platform);
            protoWriter.writeBytes(bindWindowsStruct.unknownFields());
        }

        public final BindWindowsStruct decode(ProtoReader protoReader, BindWindowsStruct bindWindowsStruct) throws IOException {
            Builder builder;
            BindWindowsStruct bindWindowsStruct2 = (BindWindowsStruct) C10938a.m32097a().mo26425a(BindWindowsStruct.class, bindWindowsStruct);
            if (bindWindowsStruct2 != null) {
                builder = bindWindowsStruct2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.bind_title((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.bind_desc((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.total_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.interval((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.open_window((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.login_platform((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (bindWindowsStruct2 != null) {
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

    public final String getBindDesc() throws NullValueException {
        if (this.bind_desc != null) {
            return this.bind_desc;
        }
        throw new NullValueException();
    }

    public final String getBindTitle() throws NullValueException {
        if (this.bind_title != null) {
            return this.bind_title;
        }
        throw new NullValueException();
    }

    public final Integer getInterval() throws NullValueException {
        if (this.interval != null) {
            return this.interval;
        }
        throw new NullValueException();
    }

    public final Integer getLoginPlatform() throws NullValueException {
        if (this.login_platform != null) {
            return this.login_platform;
        }
        throw new NullValueException();
    }

    public final Boolean getOpenWindow() throws NullValueException {
        if (this.open_window != null) {
            return this.open_window;
        }
        throw new NullValueException();
    }

    public final Integer getTotalTimes() throws NullValueException {
        if (this.total_times != null) {
            return this.total_times;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.bind_title = this.bind_title;
        builder.bind_desc = this.bind_desc;
        builder.total_times = this.total_times;
        builder.interval = this.interval;
        builder.open_window = this.open_window;
        builder.login_platform = this.login_platform;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.hashCode;
        if (i6 != 0) {
            return i6;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i7 = 0;
        if (this.bind_title != null) {
            i = this.bind_title.hashCode();
        } else {
            i = 0;
        }
        int i8 = (hashCode + i) * 37;
        if (this.bind_desc != null) {
            i2 = this.bind_desc.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 37;
        if (this.total_times != null) {
            i3 = this.total_times.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.interval != null) {
            i4 = this.interval.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.open_window != null) {
            i5 = this.open_window.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.login_platform != null) {
            i7 = this.login_platform.hashCode();
        }
        int i13 = i12 + i7;
        this.hashCode = i13;
        return i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bind_title != null) {
            sb.append(", bind_title=");
            sb.append(this.bind_title);
        }
        if (this.bind_desc != null) {
            sb.append(", bind_desc=");
            sb.append(this.bind_desc);
        }
        if (this.total_times != null) {
            sb.append(", total_times=");
            sb.append(this.total_times);
        }
        if (this.interval != null) {
            sb.append(", interval=");
            sb.append(this.interval);
        }
        if (this.open_window != null) {
            sb.append(", open_window=");
            sb.append(this.open_window);
        }
        if (this.login_platform != null) {
            sb.append(", login_platform=");
            sb.append(this.login_platform);
        }
        StringBuilder replace = sb.replace(0, 2, "BindWindowsStruct{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BindWindowsStruct)) {
            return false;
        }
        BindWindowsStruct bindWindowsStruct = (BindWindowsStruct) obj;
        if (!unknownFields().equals(bindWindowsStruct.unknownFields()) || !Internal.equals(this.bind_title, bindWindowsStruct.bind_title) || !Internal.equals(this.bind_desc, bindWindowsStruct.bind_desc) || !Internal.equals(this.total_times, bindWindowsStruct.total_times) || !Internal.equals(this.interval, bindWindowsStruct.interval) || !Internal.equals(this.open_window, bindWindowsStruct.open_window) || !Internal.equals(this.login_platform, bindWindowsStruct.login_platform)) {
            return false;
        }
        return true;
    }

    public BindWindowsStruct(String str, String str2, Integer num, Integer num2, Boolean bool, Integer num3) {
        this(str, str2, num, num2, bool, num3, ByteString.EMPTY);
    }

    public BindWindowsStruct(String str, String str2, Integer num, Integer num2, Boolean bool, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bind_title = str;
        this.bind_desc = str2;
        this.total_times = num;
        this.interval = num2;
        this.open_window = bool;
        this.login_platform = num3;
    }
}
