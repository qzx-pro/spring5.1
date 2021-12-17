package com.qzx.selfEditor;

import java.beans.PropertyEditorSupport;

public class AddressEditor extends PropertyEditorSupport {

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] strings = text.split("_");
		Address address = new Address();
		address.setProvince(strings[0]);
		address.setCity(strings[1]);
		address.setDistrict(strings[2]);
		setValue(address);
	}
}
