package io.bigbearbro.eos4j.api.request.push_transaction.action;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.bigbearbro.eos4j.client.pack.Pack;
import io.bigbearbro.eos4j.client.pack.PackType;

/**
 * 转账action使用的data
 * @author wangyan
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestActionData extends BaseActionData {

	@Pack(PackType.name)
	@JsonProperty("gamer")
	private String gamer;

	@Pack(PackType.string)
	@JsonProperty("selected")
	private String selected;

    public String getGamer() {
        return gamer;
    }

    public void setGamer(String gamer) {
        this.gamer = gamer;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }
}
