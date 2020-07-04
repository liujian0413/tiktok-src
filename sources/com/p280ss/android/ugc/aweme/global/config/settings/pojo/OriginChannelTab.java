package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.OriginChannelTab */
public final class OriginChannelTab extends Message<OriginChannelTab, Builder> {
    public static final DefaultValueProtoAdapter<OriginChannelTab> ADAPTER = new ProtoAdapter_OriginChannelTab();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer channel_tab_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 3)
    public final String i18n_name;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 2)
    public final String name;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.OriginChannelTab$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<OriginChannelTab, Builder> {
        public Integer channel_tab_id;
        public String i18n_name;
        public String name;

        public final OriginChannelTab build() {
            if (this.channel_tab_id != null && this.name != null && this.i18n_name != null) {
                return new OriginChannelTab(this.channel_tab_id, this.name, this.i18n_name, super.buildUnknownFields());
            }
            throw C10939b.m32101a(this.channel_tab_id, "channel_tab_id", this.name, "name", this.i18n_name, "i18n_name");
        }

        public final Builder channel_tab_id(Integer num) {
            this.channel_tab_id = num;
            return this;
        }

        public final Builder i18n_name(String str) {
            this.i18n_name = str;
            return this;
        }

        public final Builder name(String str) {
            this.name = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.OriginChannelTab$ProtoAdapter_OriginChannelTab */
    static final class ProtoAdapter_OriginChannelTab extends DefaultValueProtoAdapter<OriginChannelTab> {
        public final OriginChannelTab redact(OriginChannelTab originChannelTab) {
            return originChannelTab;
        }

        public ProtoAdapter_OriginChannelTab() {
            super(FieldEncoding.LENGTH_DELIMITED, OriginChannelTab.class);
        }

        public final OriginChannelTab decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (OriginChannelTab) null);
        }

        public final int encodedSize(OriginChannelTab originChannelTab) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, originChannelTab.channel_tab_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, originChannelTab.name) + ProtoAdapter.STRING.encodedSizeWithTag(3, originChannelTab.i18n_name) + originChannelTab.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, OriginChannelTab originChannelTab) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, originChannelTab.channel_tab_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, originChannelTab.name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, originChannelTab.i18n_name);
            protoWriter.writeBytes(originChannelTab.unknownFields());
        }

        public final OriginChannelTab decode(ProtoReader protoReader, OriginChannelTab originChannelTab) throws IOException {
            Builder builder;
            OriginChannelTab originChannelTab2 = (OriginChannelTab) C10938a.m32097a().mo26425a(OriginChannelTab.class, originChannelTab);
            if (originChannelTab2 != null) {
                builder = originChannelTab2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.channel_tab_id((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.i18n_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (originChannelTab2 != null) {
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

    public final Integer getChannelTabId() {
        return this.channel_tab_id;
    }

    public final String getI18nName() {
        return this.i18n_name;
    }

    public final String getName() {
        return this.name;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.channel_tab_id = this.channel_tab_id;
        builder.name = this.name;
        builder.i18n_name = this.i18n_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((unknownFields().hashCode() * 37) + this.channel_tab_id.hashCode()) * 37) + this.name.hashCode()) * 37) + this.i18n_name.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", channel_tab_id=");
        sb.append(this.channel_tab_id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", i18n_name=");
        sb.append(this.i18n_name);
        StringBuilder replace = sb.replace(0, 2, "OriginChannelTab{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OriginChannelTab)) {
            return false;
        }
        OriginChannelTab originChannelTab = (OriginChannelTab) obj;
        if (!unknownFields().equals(originChannelTab.unknownFields()) || !this.channel_tab_id.equals(originChannelTab.channel_tab_id) || !this.name.equals(originChannelTab.name) || !this.i18n_name.equals(originChannelTab.i18n_name)) {
            return false;
        }
        return true;
    }

    public OriginChannelTab(Integer num, String str, String str2) {
        this(num, str, str2, ByteString.EMPTY);
    }

    public OriginChannelTab(Integer num, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.channel_tab_id = num;
        this.name = str;
        this.i18n_name = str2;
    }
}
