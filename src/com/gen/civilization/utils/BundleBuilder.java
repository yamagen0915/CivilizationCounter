package com.gen.civilization.utils;

import java.io.Serializable;

import android.os.Bundle;

public class BundleBuilder {
	private Bundle bundle;

	public BundleBuilder() {
		bundle = new Bundle();
	}

	public BundleBuilder putString(String key, String value) {
		bundle.putString(key, value);
		return this;
	}

	public BundleBuilder putInt(String key, int value) {
		bundle.putInt(key, value);
		return this;
	}

	public BundleBuilder putBoolean(String key, boolean value) {
		bundle.putBoolean(key, value);
		return this;
	}

	public BundleBuilder putSerializable(String key, Serializable value) {
		bundle.putSerializable(key, value);
		return this;
	}

	public Bundle build() {
		return bundle;
	}

}
