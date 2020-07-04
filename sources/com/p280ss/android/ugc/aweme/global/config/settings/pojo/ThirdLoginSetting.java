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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ThirdLoginSetting */
public final class ThirdLoginSetting extends Message<ThirdLoginSetting, Builder> {
    public static final DefaultValueProtoAdapter<ThirdLoginSetting> ADAPTER = new ProtoAdapter_ThirdLoginSetting();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String order;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer show_num;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ThirdLoginSetting$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ThirdLoginSetting, Builder> {
        public String order;
        public Integer show_num;

        public final ThirdLoginSetting build() {
            return new ThirdLoginSetting(this.show_num, this.order, super.buildUnknownFields());
        }

        public final Builder order(String str) {
            this.order = str;
            return this;
        }

        public final Builder show_num(Integer num) {
            this.show_num = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.ThirdLoginSetting$ProtoAdapter_ThirdLoginSetting */
    static final class ProtoAdapter_ThirdLoginSetting extends DefaultValueProtoAdapter<ThirdLoginSetting> {
        public final ThirdLoginSetting redact(ThirdLoginSetting thirdLoginSetting) {
            return thirdLoginSetting;
        }

        public ProtoAdapter_ThirdLoginSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, ThirdLoginSetting.class);
        }

        public final ThirdLoginSetting decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (ThirdLoginSetting) null);
        }

        public final int encodedSize(ThirdLoginSetting thirdLoginSetting) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, thirdLoginSetting.show_num) + ProtoAdapter.STRING.encodedSizeWithTag(2, thirdLoginSetting.order) + thirdLoginSetting.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, ThirdLoginSetting thirdLoginSetting) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, thirdLoginSetting.show_num);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, thirdLoginSetting.order);
            protoWriter.writeBytes(thirdLoginSetting.unknownFields());
        }

        public final ThirdLoginSetting decode(ProtoReader protoReader, ThirdLoginSetting thirdLoginSetting) throws IOException {
            Builder builder;
            ThirdLoginSetting thirdLoginSetting2 = (ThirdLoginSetting) C10938a.m32097a().mo26425a(ThirdLoginSetting.class, thirdLoginSetting);
            if (thirdLoginSetting2 != null) {
                builder = thirdLoginSetting2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.show_num((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.order((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (thirdLoginSetting2 != null) {
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

    public final String getOrder() throws NullValueException {
        if (this.order != null) {
            return this.order;
        }
        throw new NullValueException();
    }

    public final Integer getShowNum() throws NullValueException {
        if (this.show_num != null) {
            return this.show_num;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.show_num = this.show_num;
        builder.order = this.order;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i3 = 0;
        if (this.show_num != null) {
            i = this.show_num.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 37;
        if (this.order != null) {
            i3 = this.order.hashCode();
        }
        int i5 = i4 + i3;
        this.hashCode = i5;
        return i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.show_num != null) {
            sb.append(", show_num=");
            sb.append(this.show_num);
        }
        if (this.order != null) {
            sb.append(", order=");
            sb.append(this.order);
        }
        StringBuilder replace = sb.replace(0, 2, "ThirdLoginSetting{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ThirdLoginSetting)) {
            return false;
        }
        ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) obj;
        if (!unknownFields().equals(thirdLoginSetting.unknownFields()) || !Internal.equals(this.show_num, thirdLoginSetting.show_num) || !Internal.equals(this.order, thirdLoginSetting.order)) {
            return false;
        }
        return true;
    }

    public ThirdLoginSetting(Integer num, String str) {
        this(num, str, ByteString.EMPTY);
    }

    public ThirdLoginSetting(Integer num, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.show_num = num;
        this.order = str;
    }
}
