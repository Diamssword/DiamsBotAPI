package com.diamssword.bot.api.actions.storage;

import com.google.gson.Gson;

public interface ISavable  <T extends ISavable<T>>{

	
	public String path();
	public T fromText(String json,Gson gson);
	public String toText(Gson json);
//	public T instanciate();
}
