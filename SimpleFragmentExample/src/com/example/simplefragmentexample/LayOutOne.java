package com.example.simplefragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LayOutOne extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		 ViewGroup root = (ViewGroup) inflater.inflate(R.layout.layout_one, null);
		return root;
	}


}
