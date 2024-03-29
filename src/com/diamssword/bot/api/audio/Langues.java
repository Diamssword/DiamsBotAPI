package com.diamssword.bot.api.audio;

public enum Langues {
	ca_es("Catalan"),
	zh_cn("Chinese (China)"),
	zh_hk("Chinese (Hong Kong)"),
	zh_tw("Chinese (Taiwan)"),
	da_dk("Danish"),
	nl_nl("Dutch"),
	en_au("English (Australia)"),
	en_ca("English (Canada)"),
	en_gb("English (Great Britain)"),
	en_in("English (India)"),
	en_us("English (United States)"),
	fi_fi("Finnish"),
	fr_ca("French (Canada)"),
	fr_fr("French (France)"),
	de_de("German"),
	it_it("Italian"),
	ja_jp("Japanese"),
	ko_kr("Korean"),
	nb_no("Norwegian"),
	pl_pl("Polish"),
	pt_br("Portuguese (Brazil)"),
	pt_pt("Portuguese (Portugal)"),
	ru_ru("Russian"),
	es_mx("Spanish (Mexico)"),
	es_es("Spanish (Spain)"),
	sv_se("Swedish (Sweden)");
	
	public String name;
	private Langues(String name)
	{
		this.name = name;
	}
}
